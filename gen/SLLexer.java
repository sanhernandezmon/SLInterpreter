// Generated from /home/santiago/IdeaProjects/UNAL/SLInterpreter/grammar/SL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, COMMENT=9, 
		LINE_COMMENT=10, WS=11, VAR=12, ELSE=13, PIZQ=14, PDER=15, ROP=16, SMCOLON=17, 
		MULOP=18, SUMOP=19, DOUBLE=20, ID=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "COMMENT", 
			"LINE_COMMENT", "WS", "VAR", "ELSE", "PIZQ", "PDER", "ROP", "SMCOLON", 
			"MULOP", "SUMOP", "DOUBLE", "ID"
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


	public SLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u00ad\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b^\b\b\n\b\f\ba\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tl\b\t\n\t\f\to\t\t\u0001\t\u0001"+
		"\t\u0001\n\u0004\nt\b\n\u000b\n\f\nu\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0091\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u009a"+
		"\b\u0013\u000b\u0013\f\u0013\u009b\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u00a1\b\u0013\u000b\u0013\f\u0013\u00a2\u0003\u0013\u00a5"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u00a9\b\u0014\n\u0014\f\u0014"+
		"\u00ac\t\u0014\u0001_\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015\u0001\u0000\b\u0002\u0000\n\n\r\r\u0003\u0000\t"+
		"\n\r\r  \u0002\u0000**//\u0002\u0000++--\u0001\u000009\u0001\u0000..\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u00b8\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003"+
		".\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00076\u0001"+
		"\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000bC\u0001\u0000\u0000"+
		"\u0000\rI\u0001\u0000\u0000\u0000\u000fS\u0001\u0000\u0000\u0000\u0011"+
		"Y\u0001\u0000\u0000\u0000\u0013g\u0001\u0000\u0000\u0000\u0015s\u0001"+
		"\u0000\u0000\u0000\u0017y\u0001\u0000\u0000\u0000\u0019}\u0001\u0000\u0000"+
		"\u0000\u001b\u0082\u0001\u0000\u0000\u0000\u001d\u0084\u0001\u0000\u0000"+
		"\u0000\u001f\u0090\u0001\u0000\u0000\u0000!\u0092\u0001\u0000\u0000\u0000"+
		"#\u0094\u0001\u0000\u0000\u0000%\u0096\u0001\u0000\u0000\u0000\'\u0099"+
		"\u0001\u0000\u0000\u0000)\u00a6\u0001\u0000\u0000\u0000+,\u0005a\u0000"+
		"\u0000,-\u0005s\u0000\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005i\u0000"+
		"\u0000/0\u0005f\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005t\u0000"+
		"\u000023\u0005h\u0000\u000034\u0005e\u0000\u000045\u0005n\u0000\u0000"+
		"5\u0006\u0001\u0000\u0000\u000067\u0005e\u0000\u000078\u0005n\u0000\u0000"+
		"89\u0005d\u0000\u00009:\u0005i\u0000\u0000:;\u0005f\u0000\u0000;\b\u0001"+
		"\u0000\u0000\u0000<=\u0005r\u0000\u0000=>\u0005e\u0000\u0000>?\u0005p"+
		"\u0000\u0000?@\u0005e\u0000\u0000@A\u0005a\u0000\u0000AB\u0005t\u0000"+
		"\u0000B\n\u0001\u0000\u0000\u0000CD\u0005t\u0000\u0000DE\u0005i\u0000"+
		"\u0000EF\u0005m\u0000\u0000FG\u0005e\u0000\u0000GH\u0005s\u0000\u0000"+
		"H\f\u0001\u0000\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005n\u0000\u0000"+
		"KL\u0005d\u0000\u0000LM\u0005r\u0000\u0000MN\u0005e\u0000\u0000NO\u0005"+
		"p\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005t\u0000"+
		"\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005p\u0000\u0000TU\u0005r\u0000"+
		"\u0000UV\u0005i\u0000\u0000VW\u0005n\u0000\u0000WX\u0005t\u0000\u0000"+
		"X\u0010\u0001\u0000\u0000\u0000YZ\u0005/\u0000\u0000Z[\u0005*\u0000\u0000"+
		"[_\u0001\u0000\u0000\u0000\\^\t\u0000\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005"+
		"*\u0000\u0000cd\u0005/\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0006\b"+
		"\u0000\u0000f\u0012\u0001\u0000\u0000\u0000gh\u0005/\u0000\u0000hi\u0005"+
		"/\u0000\u0000im\u0001\u0000\u0000\u0000jl\b\u0000\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000pq\u0006\t\u0000\u0000q\u0014\u0001\u0000\u0000\u0000rt\u0007\u0001"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0006\n\u0000\u0000x\u0016\u0001\u0000\u0000\u0000yz\u0005v\u0000\u0000"+
		"z{\u0005a\u0000\u0000{|\u0005r\u0000\u0000|\u0018\u0001\u0000\u0000\u0000"+
		"}~\u0005e\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005s\u0000"+
		"\u0000\u0080\u0081\u0005e\u0000\u0000\u0081\u001a\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005(\u0000\u0000\u0083\u001c\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005)\u0000\u0000\u0085\u001e\u0001\u0000\u0000\u0000\u0086\u0091"+
		"\u0005<\u0000\u0000\u0087\u0088\u0005<\u0000\u0000\u0088\u0091\u0005="+
		"\u0000\u0000\u0089\u008a\u0005>\u0000\u0000\u008a\u0091\u0005=\u0000\u0000"+
		"\u008b\u0091\u0005>\u0000\u0000\u008c\u008d\u0005=\u0000\u0000\u008d\u0091"+
		"\u0005=\u0000\u0000\u008e\u008f\u0005!\u0000\u0000\u008f\u0091\u0005="+
		"\u0000\u0000\u0090\u0086\u0001\u0000\u0000\u0000\u0090\u0087\u0001\u0000"+
		"\u0000\u0000\u0090\u0089\u0001\u0000\u0000\u0000\u0090\u008b\u0001\u0000"+
		"\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091 \u0001\u0000\u0000\u0000\u0092\u0093\u0005;\u0000\u0000"+
		"\u0093\"\u0001\u0000\u0000\u0000\u0094\u0095\u0007\u0002\u0000\u0000\u0095"+
		"$\u0001\u0000\u0000\u0000\u0096\u0097\u0007\u0003\u0000\u0000\u0097&\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0007\u0004\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a4\u0001"+
		"\u0000\u0000\u0000\u009d\u00a5\u0001\u0000\u0000\u0000\u009e\u00a0\u0007"+
		"\u0005\u0000\u0000\u009f\u00a1\u0007\u0004\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a4\u009d\u0001\u0000\u0000\u0000\u00a4\u009e\u0001"+
		"\u0000\u0000\u0000\u00a5(\u0001\u0000\u0000\u0000\u00a6\u00aa\u0007\u0006"+
		"\u0000\u0000\u00a7\u00a9\u0007\u0007\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab*\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\t\u0000_mu\u0090\u009b\u00a2"+
		"\u00a4\u00aa\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}