// Generated from /home/santiago/IdeaProjects/UNAL/SLInterpreter/grammar/SL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, COMMENT=9, 
		LINE_COMMENT=10, WS=11, VAR=12, ELSE=13, PIZQ=14, PDER=15, ROP=16, SMCOLON=17, 
		MULOP=18, SUMOP=19, DOUBLE=20, ID=21;
	public static final int
		RULE_commands = 0, RULE_command = 1, RULE_conditional = 2, RULE_conditionals = 3, 
		RULE_repeat = 4, RULE_printexpr = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"commands", "command", "conditional", "conditionals", "repeat", "printexpr", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'if'", "'then'", "'endif'", "'repeat'", "'times'", "'endrepeat'", 
			"'print'", null, null, null, "'var'", "'else'", "'('", "')'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "COMMENT", "LINE_COMMENT", 
			"WS", "VAR", "ELSE", "PIZQ", "PDER", "ROP", "SMCOLON", "MULOP", "SUMOP", 
			"DOUBLE", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SLParser.EOF, 0); }
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case T__7:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				command();
				setState(15);
				commands();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(EOF);
				}
				break;
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public PrintexprContext printexpr() {
			return getRuleContext(PrintexprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SLParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(SLParser.SMCOLON, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				conditionals();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				repeat();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				printexpr();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				match(VAR);
				setState(25);
				match(ID);
				setState(26);
				match(T__0);
				setState(27);
				expr(0);
				setState(28);
				match(SMCOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ROP() { return getToken(SLParser.ROP, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__1);
			setState(33);
			expr(0);
			setState(34);
			match(ROP);
			setState(35);
			expr(0);
			setState(36);
			match(T__2);
			setState(37);
			commands();
			setState(38);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalsContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SLParser.ELSE, 0); }
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public ConditionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitConditionals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditionals);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				conditional();
				setState(41);
				match(ELSE);
				setState(42);
				conditionals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				conditional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__4);
			setState(48);
			expr(0);
			setState(49);
			match(T__5);
			setState(50);
			commands();
			setState(51);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(SLParser.SMCOLON, 0); }
		public PrintexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitPrintexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintexprContext printexpr() throws RecognitionException {
		PrintexprContext _localctx = new PrintexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__7);
			setState(54);
			expr(0);
			setState(55);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(SLParser.DOUBLE, 0); }
		public TerminalNode PIZQ() { return getToken(SLParser.PIZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PDER() { return getToken(SLParser.PDER, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode MULOP() { return getToken(SLParser.MULOP, 0); }
		public TerminalNode SUMOP() { return getToken(SLParser.SUMOP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLVisitor ) return ((SLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				setState(58);
				match(DOUBLE);
				}
				break;
			case PIZQ:
				{
				setState(59);
				match(PIZQ);
				setState(60);
				expr(0);
				setState(61);
				match(PDER);
				}
				break;
			case ID:
				{
				setState(63);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(67);
						match(MULOP);
						setState(68);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(70);
						match(SUMOP);
						setState(71);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015N\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0014\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003.\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006A\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006I\b\u0006\n\u0006\f\u0006L\t\u0006\u0001"+
		"\u0006\u0000\u0001\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000P"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000"+
		"\u0004 \u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b/\u0001"+
		"\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0003\u0000\u0000\u0000"+
		"\u0010\u0014\u0001\u0000\u0000\u0000\u0011\u0014\u0005\u0000\u0000\u0001"+
		"\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u000e\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u001f\u0003\u0006\u0003\u0000"+
		"\u0016\u001f\u0003\b\u0004\u0000\u0017\u001f\u0003\n\u0005\u0000\u0018"+
		"\u0019\u0005\f\u0000\u0000\u0019\u001a\u0005\u0015\u0000\u0000\u001a\u001b"+
		"\u0005\u0001\u0000\u0000\u001b\u001c\u0003\f\u0006\u0000\u001c\u001d\u0005"+
		"\u0011\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u0015\u0001"+
		"\u0000\u0000\u0000\u001e\u0016\u0001\u0000\u0000\u0000\u001e\u0017\u0001"+
		"\u0000\u0000\u0000\u001e\u0018\u0001\u0000\u0000\u0000\u001f\u0003\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0002\u0000\u0000!\"\u0003\f\u0006\u0000\""+
		"#\u0005\u0010\u0000\u0000#$\u0003\f\u0006\u0000$%\u0005\u0003\u0000\u0000"+
		"%&\u0003\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000\'\u0005\u0001\u0000"+
		"\u0000\u0000()\u0003\u0004\u0002\u0000)*\u0005\r\u0000\u0000*+\u0003\u0006"+
		"\u0003\u0000+.\u0001\u0000\u0000\u0000,.\u0003\u0004\u0002\u0000-(\u0001"+
		"\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0007\u0001\u0000\u0000"+
		"\u0000/0\u0005\u0005\u0000\u000001\u0003\f\u0006\u000012\u0005\u0006\u0000"+
		"\u000023\u0003\u0000\u0000\u000034\u0005\u0007\u0000\u00004\t\u0001\u0000"+
		"\u0000\u000056\u0005\b\u0000\u000067\u0003\f\u0006\u000078\u0005\u0011"+
		"\u0000\u00008\u000b\u0001\u0000\u0000\u00009:\u0006\u0006\uffff\uffff"+
		"\u0000:A\u0005\u0014\u0000\u0000;<\u0005\u000e\u0000\u0000<=\u0003\f\u0006"+
		"\u0000=>\u0005\u000f\u0000\u0000>A\u0001\u0000\u0000\u0000?A\u0005\u0015"+
		"\u0000\u0000@9\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000AJ\u0001\u0000\u0000\u0000BC\n\u0005\u0000\u0000CD\u0005"+
		"\u0012\u0000\u0000DI\u0003\f\u0006\u0006EF\n\u0004\u0000\u0000FG\u0005"+
		"\u0013\u0000\u0000GI\u0003\f\u0006\u0005HB\u0001\u0000\u0000\u0000HE\u0001"+
		"\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000K\r\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000\u0006\u0013\u001e-@HJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}