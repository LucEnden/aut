// Generated from ./src/BooleanArithmetic/BooleanArithmetic.g4 by ANTLR 4.13.2
package BooleanArithmetic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BooleanArithmeticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENBRACKET=1, CLOSEBRACKET=2, NOT=3, MLT=4, DIV=5, MOD=6, ADD=7, SUB=8, 
		LSHIFT=9, RSHIFT=10, BAND=11, BXOR=12, BOR=13, BIT=14, WS=15, COMMENT=16;
	public static final int
		RULE_infix_expr = 0, RULE_unary = 1, RULE_operator = 2, RULE_operand = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"infix_expr", "unary", "operator", "operand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<<'", 
			"'>>'", "'&'", "'^'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPENBRACKET", "CLOSEBRACKET", "NOT", "MLT", "DIV", "MOD", "ADD", 
			"SUB", "LSHIFT", "RSHIFT", "BAND", "BXOR", "BOR", "BIT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "BooleanArithmetic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BooleanArithmeticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Infix_exprContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(BooleanArithmeticParser.OPENBRACKET, 0); }
		public List<Infix_exprContext> infix_expr() {
			return getRuleContexts(Infix_exprContext.class);
		}
		public Infix_exprContext infix_expr(int i) {
			return getRuleContext(Infix_exprContext.class,i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(BooleanArithmeticParser.CLOSEBRACKET, 0); }
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Infix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterInfix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitInfix_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitInfix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_exprContext infix_expr() throws RecognitionException {
		return infix_expr(0);
	}

	private Infix_exprContext infix_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Infix_exprContext _localctx = new Infix_exprContext(_ctx, _parentState);
		Infix_exprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_infix_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
				{
				setState(9);
				match(OPENBRACKET);
				setState(10);
				infix_expr(0);
				setState(11);
				match(CLOSEBRACKET);
				}
				break;
			case NOT:
			case ADD:
			case SUB:
				{
				setState(13);
				unary();
				setState(14);
				infix_expr(3);
				}
				break;
			case BIT:
				{
				setState(16);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Infix_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
					setState(19);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(20);
					operator();
					setState(21);
					infix_expr(3);
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(BooleanArithmeticParser.NOT, 0); }
		public List<TerminalNode> ADD() { return getTokens(BooleanArithmeticParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(BooleanArithmeticParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(BooleanArithmeticParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(BooleanArithmeticParser.SUB, i);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(28);
				match(NOT);
				}
				break;
			case ADD:
				{
				setState(29);
				match(ADD);
				setState(30);
				match(ADD);
				}
				break;
			case SUB:
				{
				setState(31);
				match(SUB);
				setState(32);
				match(SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode MLT() { return getToken(BooleanArithmeticParser.MLT, 0); }
		public TerminalNode DIV() { return getToken(BooleanArithmeticParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BooleanArithmeticParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(BooleanArithmeticParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(BooleanArithmeticParser.SUB, 0); }
		public TerminalNode LSHIFT() { return getToken(BooleanArithmeticParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(BooleanArithmeticParser.RSHIFT, 0); }
		public TerminalNode BAND() { return getToken(BooleanArithmeticParser.BAND, 0); }
		public TerminalNode BXOR() { return getToken(BooleanArithmeticParser.BXOR, 0); }
		public TerminalNode BOR() { return getToken(BooleanArithmeticParser.BOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operator);
		int _la;
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MLT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
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
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
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
			case LSHIFT:
			case RSHIFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==LSHIFT || _la==RSHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BAND:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(BAND);
				}
				break;
			case BXOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(BXOR);
				}
				break;
			case BOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(BOR);
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
	public static class OperandContext extends ParserRuleContext {
		public List<TerminalNode> BIT() { return getTokens(BooleanArithmeticParser.BIT); }
		public TerminalNode BIT(int i) {
			return getToken(BooleanArithmeticParser.BIT, i);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(43);
					match(BIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return infix_expr_sempred((Infix_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_expr_sempred(Infix_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002*\b\u0002\u0001\u0003\u0004\u0003-\b\u0003\u000b\u0003\f\u0003"+
		".\u0001\u0003\u0000\u0001\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0003"+
		"\u0001\u0000\u0004\u0006\u0001\u0000\u0007\b\u0001\u0000\t\n7\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004)\u0001\u0000"+
		"\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b\t\u0006\u0000\uffff\uffff"+
		"\u0000\t\n\u0005\u0001\u0000\u0000\n\u000b\u0003\u0000\u0000\u0000\u000b"+
		"\f\u0005\u0002\u0000\u0000\f\u0012\u0001\u0000\u0000\u0000\r\u000e\u0003"+
		"\u0002\u0001\u0000\u000e\u000f\u0003\u0000\u0000\u0003\u000f\u0012\u0001"+
		"\u0000\u0000\u0000\u0010\u0012\u0003\u0006\u0003\u0000\u0011\b\u0001\u0000"+
		"\u0000\u0000\u0011\r\u0001\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000"+
		"\u0000\u0012\u0019\u0001\u0000\u0000\u0000\u0013\u0014\n\u0002\u0000\u0000"+
		"\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016\u0003\u0000\u0000\u0003"+
		"\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000"+
		"\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001c\"\u0005\u0003\u0000\u0000\u001d"+
		"\u001e\u0005\u0007\u0000\u0000\u001e\"\u0005\u0007\u0000\u0000\u001f "+
		"\u0005\b\u0000\u0000 \"\u0005\b\u0000\u0000!\u001c\u0001\u0000\u0000\u0000"+
		"!\u001d\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"\u0003"+
		"\u0001\u0000\u0000\u0000#*\u0007\u0000\u0000\u0000$*\u0007\u0001\u0000"+
		"\u0000%*\u0007\u0002\u0000\u0000&*\u0005\u000b\u0000\u0000\'*\u0005\f"+
		"\u0000\u0000(*\u0005\r\u0000\u0000)#\u0001\u0000\u0000\u0000)$\u0001\u0000"+
		"\u0000\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0005\u0001\u0000\u0000"+
		"\u0000+-\u0005\u000e\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0007"+
		"\u0001\u0000\u0000\u0000\u0005\u0011\u0019!).";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}