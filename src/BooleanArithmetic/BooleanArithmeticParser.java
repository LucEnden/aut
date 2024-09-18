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
		UADD=9, USUB=10, LSHIFT=11, RSHIFT=12, BAND=13, BXOR=14, BOR=15, BINARY=16, 
		WS=17, COMMENT=18;
	public static final int
		RULE_infix_expr = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"infix_expr"
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
		public Infix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_expr; }
	 
		public Infix_exprContext() { }
		public void copyFrom(Infix_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivInfixExprContext extends Infix_exprContext {
		public List<Infix_exprContext> infix_expr() {
			return getRuleContexts(Infix_exprContext.class);
		}
		public Infix_exprContext infix_expr(int i) {
			return getRuleContext(Infix_exprContext.class,i);
		}
		public TerminalNode MLT() { return getToken(BooleanArithmeticParser.MLT, 0); }
		public TerminalNode DIV() { return getToken(BooleanArithmeticParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BooleanArithmeticParser.MOD, 0); }
		public MultDivInfixExprContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterMultDivInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitMultDivInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitMultDivInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketInfixExprContext extends Infix_exprContext {
		public TerminalNode OPENBRACKET() { return getToken(BooleanArithmeticParser.OPENBRACKET, 0); }
		public Infix_exprContext infix_expr() {
			return getRuleContext(Infix_exprContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(BooleanArithmeticParser.CLOSEBRACKET, 0); }
		public BracketInfixExprContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterBracketInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitBracketInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitBracketInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BAndInfixExprContext extends Infix_exprContext {
		public List<Infix_exprContext> infix_expr() {
			return getRuleContexts(Infix_exprContext.class);
		}
		public Infix_exprContext infix_expr(int i) {
			return getRuleContext(Infix_exprContext.class,i);
		}
		public TerminalNode BAND() { return getToken(BooleanArithmeticParser.BAND, 0); }
		public BAndInfixExprContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterBAndInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitBAndInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitBAndInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BOrInfixExprContext extends Infix_exprContext {
		public List<Infix_exprContext> infix_expr() {
			return getRuleContexts(Infix_exprContext.class);
		}
		public Infix_exprContext infix_expr(int i) {
			return getRuleContext(Infix_exprContext.class,i);
		}
		public TerminalNode BOR() { return getToken(BooleanArithmeticParser.BOR, 0); }
		public BOrInfixExprContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterBOrInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitBOrInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitBOrInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryInfixExprContext extends Infix_exprContext {
		public Infix_exprContext infix_expr() {
			return getRuleContext(Infix_exprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BooleanArithmeticParser.NOT, 0); }
		public TerminalNode UADD() { return getToken(BooleanArithmeticParser.UADD, 0); }
		public TerminalNode USUB() { return getToken(BooleanArithmeticParser.USUB, 0); }
		public UnaryInfixExprContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterUnaryInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitUnaryInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitUnaryInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftInfixExprContext extends Infix_exprContext {
		public List<Infix_exprContext> infix_expr() {
			return getRuleContexts(Infix_exprContext.class);
		}
		public Infix_exprContext infix_expr(int i) {
			return getRuleContext(Infix_exprContext.class,i);
		}
		public TerminalNode LSHIFT() { return getToken(BooleanArithmeticParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(BooleanArithmeticParser.RSHIFT, 0); }
		public ShiftInfixExprContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterShiftInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitShiftInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitShiftInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BXorInfixExprContext extends Infix_exprContext {
		public List<Infix_exprContext> infix_expr() {
			return getRuleContexts(Infix_exprContext.class);
		}
		public Infix_exprContext infix_expr(int i) {
			return getRuleContext(Infix_exprContext.class,i);
		}
		public TerminalNode BXOR() { return getToken(BooleanArithmeticParser.BXOR, 0); }
		public BXorInfixExprContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterBXorInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitBXorInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitBXorInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends Infix_exprContext {
		public TerminalNode BINARY() { return getToken(BooleanArithmeticParser.BINARY, 0); }
		public OperandContext(Infix_exprContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubInfixExprContext extends Infix_exprContext {
		public List<Infix_exprContext> infix_expr() {
			return getRuleContexts(Infix_exprContext.class);
		}
		public Infix_exprContext infix_expr(int i) {
			return getRuleContext(Infix_exprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(BooleanArithmeticParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(BooleanArithmeticParser.SUB, 0); }
		public AddSubInfixExprContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterAddSubInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitAddSubInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitAddSubInfixExpr(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
				{
				_localctx = new BracketInfixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3);
				match(OPENBRACKET);
				setState(4);
				infix_expr(0);
				setState(5);
				match(CLOSEBRACKET);
				}
				break;
			case NOT:
			case UADD:
			case USUB:
				{
				_localctx = new UnaryInfixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(7);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1544L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(8);
				infix_expr(8);
				}
				break;
			case BINARY:
				{
				_localctx = new OperandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9);
				match(BINARY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(12);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(13);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(14);
						infix_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(15);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(16);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(17);
						infix_expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ShiftInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(18);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(19);
						_la = _input.LA(1);
						if ( !(_la==LSHIFT || _la==RSHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(20);
						infix_expr(6);
						}
						break;
					case 4:
						{
						_localctx = new BAndInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(21);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(22);
						match(BAND);
						setState(23);
						infix_expr(5);
						}
						break;
					case 5:
						{
						_localctx = new BXorInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(24);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(25);
						match(BXOR);
						setState(26);
						infix_expr(4);
						}
						break;
					case 6:
						{
						_localctx = new BOrInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(27);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(28);
						match(BOR);
						setState(29);
						infix_expr(3);
						}
						break;
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		case 0:
			return infix_expr_sempred((Infix_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_expr_sempred(Infix_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012$\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u000b\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000"+
		"\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0004\u0002\u0000\u0003"+
		"\u0003\t\n\u0001\u0000\u0004\u0006\u0001\u0000\u0007\b\u0001\u0000\u000b"+
		"\f*\u0000\n\u0001\u0000\u0000\u0000\u0002\u0003\u0006\u0000\uffff\uffff"+
		"\u0000\u0003\u0004\u0005\u0001\u0000\u0000\u0004\u0005\u0003\u0000\u0000"+
		"\u0000\u0005\u0006\u0005\u0002\u0000\u0000\u0006\u000b\u0001\u0000\u0000"+
		"\u0000\u0007\b\u0007\u0000\u0000\u0000\b\u000b\u0003\u0000\u0000\b\t\u000b"+
		"\u0005\u0010\u0000\u0000\n\u0002\u0001\u0000\u0000\u0000\n\u0007\u0001"+
		"\u0000\u0000\u0000\n\t\u0001\u0000\u0000\u0000\u000b \u0001\u0000\u0000"+
		"\u0000\f\r\n\u0007\u0000\u0000\r\u000e\u0007\u0001\u0000\u0000\u000e\u001f"+
		"\u0003\u0000\u0000\b\u000f\u0010\n\u0006\u0000\u0000\u0010\u0011\u0007"+
		"\u0002\u0000\u0000\u0011\u001f\u0003\u0000\u0000\u0007\u0012\u0013\n\u0005"+
		"\u0000\u0000\u0013\u0014\u0007\u0003\u0000\u0000\u0014\u001f\u0003\u0000"+
		"\u0000\u0006\u0015\u0016\n\u0004\u0000\u0000\u0016\u0017\u0005\r\u0000"+
		"\u0000\u0017\u001f\u0003\u0000\u0000\u0005\u0018\u0019\n\u0003\u0000\u0000"+
		"\u0019\u001a\u0005\u000e\u0000\u0000\u001a\u001f\u0003\u0000\u0000\u0004"+
		"\u001b\u001c\n\u0002\u0000\u0000\u001c\u001d\u0005\u000f\u0000\u0000\u001d"+
		"\u001f\u0003\u0000\u0000\u0003\u001e\f\u0001\u0000\u0000\u0000\u001e\u000f"+
		"\u0001\u0000\u0000\u0000\u001e\u0012\u0001\u0000\u0000\u0000\u001e\u0015"+
		"\u0001\u0000\u0000\u0000\u001e\u0018\u0001\u0000\u0000\u0000\u001e\u001b"+
		"\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0001\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\u0003\n\u001e ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}