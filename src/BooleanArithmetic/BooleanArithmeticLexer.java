// Generated from ./src/BooleanArithmetic/BooleanArithmetic.g4 by ANTLR 4.13.2
package BooleanArithmetic;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BooleanArithmeticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENBRACKET=1, CLOSEBRACKET=2, NOT=3, MLT=4, DIV=5, MOD=6, ADD=7, SUB=8, 
		UADD=9, USUB=10, LSHIFT=11, RSHIFT=12, BAND=13, BXOR=14, BOR=15, BINARY=16, 
		WS=17, COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPENBRACKET", "CLOSEBRACKET", "NOT", "MLT", "DIV", "MOD", "ADD", "SUB", 
			"UADD", "USUB", "LSHIFT", "RSHIFT", "BAND", "BXOR", "BOR", "BINARY", 
			"WS", "COMMENT", "SPACING", "OPENCOMMENT", "CLOSECOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", null, null, 
			"'<<'", "'>>'", "'&'", "'^'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPENBRACKET", "CLOSEBRACKET", "NOT", "MLT", "DIV", "MOD", "ADD", 
			"SUB", "UADD", "USUB", "LSHIFT", "RSHIFT", "BAND", "BXOR", "BOR", "BINARY", 
			"WS", "COMMENT"
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


	public BooleanArithmeticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BooleanArithmetic.g4"; }

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
		"\u0004\u0000\u0012i\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0004\u000fO\b\u000f\u000b\u000f\f\u000fP\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011Y\b\u0011\n\u0011"+
		"\f\u0011\\\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0000\'\u0000)\u0000\u0001\u0000\u0002\u0001\u000001\u0003\u0000\t\n"+
		"\r\r  g\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001+\u0001"+
		"\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000"+
		"\u0000\u00071\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b"+
		"5\u0001\u0000\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000"+
		"\u0000\u0000\u0011;\u0001\u0000\u0000\u0000\u0013>\u0001\u0000\u0000\u0000"+
		"\u0015A\u0001\u0000\u0000\u0000\u0017D\u0001\u0000\u0000\u0000\u0019G"+
		"\u0001\u0000\u0000\u0000\u001bI\u0001\u0000\u0000\u0000\u001dK\u0001\u0000"+
		"\u0000\u0000\u001fN\u0001\u0000\u0000\u0000!R\u0001\u0000\u0000\u0000"+
		"#V\u0001\u0000\u0000\u0000%a\u0001\u0000\u0000\u0000\'c\u0001\u0000\u0000"+
		"\u0000)f\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0002\u0001\u0000"+
		"\u0000\u0000-.\u0005)\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005"+
		"!\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005*\u0000\u00002\b\u0001"+
		"\u0000\u0000\u000034\u0005/\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005"+
		"%\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005+\u0000\u00008\u000e\u0001"+
		"\u0000\u0000\u00009:\u0005-\u0000\u0000:\u0010\u0001\u0000\u0000\u0000"+
		";<\u0003\r\u0006\u0000<=\u0003\r\u0006\u0000=\u0012\u0001\u0000\u0000"+
		"\u0000>?\u0003\u000f\u0007\u0000?@\u0003\u000f\u0007\u0000@\u0014\u0001"+
		"\u0000\u0000\u0000AB\u0005<\u0000\u0000BC\u0005<\u0000\u0000C\u0016\u0001"+
		"\u0000\u0000\u0000DE\u0005>\u0000\u0000EF\u0005>\u0000\u0000F\u0018\u0001"+
		"\u0000\u0000\u0000GH\u0005&\u0000\u0000H\u001a\u0001\u0000\u0000\u0000"+
		"IJ\u0005^\u0000\u0000J\u001c\u0001\u0000\u0000\u0000KL\u0005|\u0000\u0000"+
		"L\u001e\u0001\u0000\u0000\u0000MO\u0007\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000Q \u0001\u0000\u0000\u0000RS\u0003%\u0012\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0006\u0010\u0000\u0000U\"\u0001\u0000\u0000\u0000"+
		"VZ\u0003\'\u0013\u0000WY\t\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0003)\u0014"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0006\u0011\u0000\u0000`$\u0001\u0000"+
		"\u0000\u0000ab\u0007\u0001\u0000\u0000b&\u0001\u0000\u0000\u0000cd\u0005"+
		"/\u0000\u0000de\u0005*\u0000\u0000e(\u0001\u0000\u0000\u0000fg\u0005*"+
		"\u0000\u0000gh\u0005/\u0000\u0000h*\u0001\u0000\u0000\u0000\u0003\u0000"+
		"PZ\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}