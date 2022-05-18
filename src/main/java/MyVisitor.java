import java.util.HashMap;

public class MyVisitor<T> extends SLBaseVisitor<T> {

    HashMap<String,Object> table = new HashMap<>();




    @Override public T visitCommand(SLParser.CommandContext ctx) {
        if (ctx.printexpr() != null) {
            Double ans = (Double) visitExpr(ctx.printexpr().expr());
            System.out.println(ans);
        }else {
            return visitChildren(ctx);
        }
        return null;
    }

    @Override public T visitRepeat(SLParser.RepeatContext ctx) {
        int times = (int)(double)(Double)visitExpr(ctx.expr());
        for(int i=0 ; i<times ; i++){
            visitCommands(ctx.commands());
        }
        return null;
    }

    @Override public T visitConditional(SLParser.ConditionalContext ctx) {
        String op = ctx.ROP().getText();
        Double num1 = (Double) visitExpr(ctx.expr(0));
        Double num2 = (Double) visitExpr(ctx.expr(1));
        Boolean ans = false;

        switch (op) {
            case "<":
                ans = num1 < num2;
                break;
            case "<=":
                ans = num1 <= num2;
                break;
            case ">":
                ans = num1 > num2;
                break;
            case ">=":
                ans = num1 >= num2;
                break;
            case "==":
                ans = Math.abs(num1 - num2) < 0.000000001;
                break;
            case "!=":
                ans = Math.abs(num1 - num2) > 0.000000001;
                break;
        }
        if (ans) {
            visitCommands(ctx.commands());
        }
        return (T)ans;
    }

    @Override public T visitExpr(SLParser.ExprContext ctx) {
        if (ctx.DOUBLE() != null) {
            Double num = Double.parseDouble(ctx.DOUBLE().getText());
            return (T) num;
        } else if (ctx.PIZQ() != null) {
            return visitExpr(ctx.expr(0));
        } else if (ctx.ID() != null) {
            String name = ctx.ID().getText();
            Object value;
            if ((value = table.get(name)) == null) {
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n", line, col);
                System.exit(-1);
                return null;
            } else {
                return (T) value;
            }
        } else {
            String op = (ctx.MULOP() != null ? ctx.MULOP().getText() : ctx.SUMOP().getText());
            Double num1 = (Double) visitExpr(ctx.expr(0));
            Double num2 = (Double) visitExpr(ctx.expr(1));
            Double ans = null;

            switch (op) {
                case "+":
                    ans = num1 + num2;
                    break;
                case "-":
                    ans = num1 - num2;
                    break;
                case "*":
                    ans = num1 * num2;
                    break;
                case "/":
                    ans = num1 / num2;
                    break;
            }
            return (T) ans;
        }
    }

    @Override public T visitConditionals(SLParser.ConditionalsContext ctx) {
        boolean conditionSatisfied =(Boolean) visitConditional(ctx.conditional());
        if(ctx.ELSE() != null && !conditionSatisfied){
            visitCommands(ctx.commands());
        }
        return null;
    }

    @Override public T visitDeclaration(SLParser.DeclarationContext ctx) {
        String name = ctx.ID().getText();
        if (table.get(name) != null) {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" ya fue declarada.\n", line, col);
            System.exit(-1);
        } else {
            table.put(name, visitExpr(ctx.expr()));
        }
        return null;
    }


}

