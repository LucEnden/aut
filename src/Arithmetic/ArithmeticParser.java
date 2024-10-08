// Generated from ./src/Arithmetic/Arithmetic.g4 by ANTLR 4.13.2
package Arithmetic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArithmeticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENBRACKET=1, CLOSEBRACKET=2, MLT=3, DIV=4, ADD=5, SUB=6, EQU=7, REAL=8, 
		INT=9, WS=10;
	public static final int
		RULE_infix_expr = 0, RULE_infix = 1, RULE_const = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"infix_expr", "infix", "const"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPENBRACKET", "CLOSEBRACKET", "MLT", "DIV", "ADD", "SUB", "EQU", 
			"REAL", "INT", "WS"
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
	public String getGrammarFileName() { return "Arithmetic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Infix_exprContext extends ParserRuleContext {
		public List<ConstContext> const_() {
			return getRuleContexts(ConstContext.class);
		}
		public ConstContext const_(int i) {
			return getRuleContext(ConstContext.class,i);
		}
		public TerminalNode EQU() { return getToken(ArithmeticParser.EQU, 0); }
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public Infix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterInfix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitInfix_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitInfix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_exprContext infix_expr() throws RecognitionException {
		Infix_exprContext _localctx = new Infix_exprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_infix_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			const_();
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(7);
				infix();
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 894L) != 0) );
			setState(12);
			match(EQU);
			setState(13);
			const_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InfixContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(ArithmeticParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(ArithmeticParser.CLOSEBRACKET, 0); }
		public TerminalNode MLT() { return getToken(ArithmeticParser.MLT, 0); }
		public TerminalNode DIV() { return getToken(ArithmeticParser.DIV, 0); }
		public TerminalNode SUB() { return getToken(ArithmeticParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(ArithmeticParser.ADD, 0); }
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public InfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixContext infix() throws RecognitionException {
		InfixContext _localctx = new InfixContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_infix);
		int _la;
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
			case CLOSEBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				_la = _input.LA(1);
				if ( !(_la==OPENBRACKET || _la==CLOSEBRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MLT:
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				_la = _input.LA(1);
				if ( !(_la==MLT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case REAL:
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(18);
				const_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode REAL() { return getToken(ArithmeticParser.REAL, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static final String _serializedATN =
		"\u0004\u0001\n\u0018\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0004\u0000\t\b\u0000\u000b"+
		"\u0000\f\u0000\n\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0004\u0001"+
		"\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u0001\u0000\u0005\u0006\u0001"+
		"\u0000\b\t\u0018\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u0013\u0001"+
		"\u0000\u0000\u0000\u0004\u0015\u0001\u0000\u0000\u0000\u0006\b\u0003\u0004"+
		"\u0002\u0000\u0007\t\u0003\u0002\u0001\u0000\b\u0007\u0001\u0000\u0000"+
		"\u0000\t\n\u0001\u0000\u0000\u0000\n\b\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\r\u0005\u0007"+
		"\u0000\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u0001\u0001\u0000\u0000"+
		"\u0000\u000f\u0014\u0007\u0000\u0000\u0000\u0010\u0014\u0007\u0001\u0000"+
		"\u0000\u0011\u0014\u0007\u0002\u0000\u0000\u0012\u0014\u0003\u0004\u0002"+
		"\u0000\u0013\u000f\u0001\u0000\u0000\u0000\u0013\u0010\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0016\u0007\u0003\u0000"+
		"\u0000\u0016\u0005\u0001\u0000\u0000\u0000\u0002\n\u0013";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}