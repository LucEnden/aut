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
		WS=17, ASSIGNMENT=18, PRINTCMD=19, VARNAME=20, ALPHA=21;
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
			"WS", "ASSIGNMENT", "PRINTCMD", "VARNAME", "ALPHA", "SPACING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", null, null, 
			"'<<'", "'>>'", "'&'", "'^'", "'|'", null, null, "'='", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPENBRACKET", "CLOSEBRACKET", "NOT", "MLT", "DIV", "MOD", "ADD", 
			"SUB", "UADD", "USUB", "LSHIFT", "RSHIFT", "BAND", "BXOR", "BOR", "BINARY", 
			"WS", "ASSIGNMENT", "PRINTCMD", "VARNAME", "ALPHA"
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
		"\u0004\u0000\u0015j\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0004\u000fQ\b\u000f\u000b\u000f\f\u000fR\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0004\u0013c\b\u0013\u000b\u0013\f\u0013d\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0000\u0001\u0000\u0003\u0001\u0000"+
		"01\u0002\u0000AZaz\u0003\u0000\t\n\r\r  k\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000"+
		"\u0003/\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00073"+
		"\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000"+
		"\u0011=\u0001\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000\u0015C"+
		"\u0001\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019I\u0001\u0000"+
		"\u0000\u0000\u001bK\u0001\u0000\u0000\u0000\u001dM\u0001\u0000\u0000\u0000"+
		"\u001fP\u0001\u0000\u0000\u0000!T\u0001\u0000\u0000\u0000#X\u0001\u0000"+
		"\u0000\u0000%Z\u0001\u0000\u0000\u0000\'b\u0001\u0000\u0000\u0000)f\u0001"+
		"\u0000\u0000\u0000+h\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\u0002"+
		"\u0001\u0000\u0000\u0000/0\u0005)\u0000\u00000\u0004\u0001\u0000\u0000"+
		"\u000012\u0005!\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005*\u0000"+
		"\u00004\b\u0001\u0000\u0000\u000056\u0005/\u0000\u00006\n\u0001\u0000"+
		"\u0000\u000078\u0005%\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005+"+
		"\u0000\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005-\u0000\u0000<\u0010"+
		"\u0001\u0000\u0000\u0000=>\u0003\r\u0006\u0000>?\u0003\r\u0006\u0000?"+
		"\u0012\u0001\u0000\u0000\u0000@A\u0003\u000f\u0007\u0000AB\u0003\u000f"+
		"\u0007\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0005<\u0000\u0000DE\u0005"+
		"<\u0000\u0000E\u0016\u0001\u0000\u0000\u0000FG\u0005>\u0000\u0000GH\u0005"+
		">\u0000\u0000H\u0018\u0001\u0000\u0000\u0000IJ\u0005&\u0000\u0000J\u001a"+
		"\u0001\u0000\u0000\u0000KL\u0005^\u0000\u0000L\u001c\u0001\u0000\u0000"+
		"\u0000MN\u0005|\u0000\u0000N\u001e\u0001\u0000\u0000\u0000OQ\u0007\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S \u0001\u0000\u0000\u0000"+
		"TU\u0003+\u0015\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u0010\u0000\u0000"+
		"W\"\u0001\u0000\u0000\u0000XY\u0005=\u0000\u0000Y$\u0001\u0000\u0000\u0000"+
		"Z[\u0005p\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005"+
		"n\u0000\u0000^_\u0005t\u0000\u0000_&\u0001\u0000\u0000\u0000`c\u0003)"+
		"\u0014\u0000ac\u0005_\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e(\u0001\u0000\u0000\u0000fg\u0007\u0001\u0000\u0000"+
		"g*\u0001\u0000\u0000\u0000hi\u0007\u0002\u0000\u0000i,\u0001\u0000\u0000"+
		"\u0000\u0004\u0000Rbd\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}