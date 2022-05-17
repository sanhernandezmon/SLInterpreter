import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws IOException {
        SLLexer lexer = new SLLexer(CharStreams.fromFileName("input/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SLParser parser = new SLParser(tokens);
        ParseTree tree = parser.commands();

        MyVisitor loader = new MyVisitor();
        loader.visit(tree);
    }

}
