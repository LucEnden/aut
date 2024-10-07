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
		WS=17, ASSIGNMENT=18, PRINTCMD=19, VARNAME=20, ALPHA=21;
	public static final int
		RULE_start = 0, RULE_infix_expr = 1, RULE_varassignment = 2, RULE_print = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "infix_expr", "varassignment", "print"
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
	public static class StartContext extends ParserRuleContext {
		public List<Infix_exprContext> infix_expr() {
			return getRuleContexts(Infix_exprContext.class);
		}
		public Infix_exprContext infix_expr(int i) {
			return getRuleContext(Infix_exprContext.class,i);
		}
		public List<VarassignmentContext> varassignment() {
			return getRuleContexts(VarassignmentContext.class);
		}
		public VarassignmentContext varassignment(int i) {
			return getRuleContext(VarassignmentContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(11);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(8);
					infix_expr(0);
					}
					break;
				case 2:
					{
					setState(9);
					varassignment();
					}
					break;
				case 3:
					{
					setState(10);
					print();
					}
					break;
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1639946L) != 0) );
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
	public static class VarInfixOperandContext extends Infix_exprContext {
		public TerminalNode VARNAME() { return getToken(BooleanArithmeticParser.VARNAME, 0); }
		public VarInfixOperandContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterVarInfixOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitVarInfixOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitVarInfixOperand(this);
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
	public static class ConstInfixOperandContext extends Infix_exprContext {
		public TerminalNode BINARY() { return getToken(BooleanArithmeticParser.BINARY, 0); }
		public ConstInfixOperandContext(Infix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterConstInfixOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitConstInfixOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitConstInfixOperand(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_infix_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
				{
				_localctx = new BracketInfixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(16);
				match(OPENBRACKET);
				setState(17);
				infix_expr(0);
				setState(18);
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
				setState(20);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1544L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(21);
				infix_expr(9);
				}
				break;
			case BINARY:
				{
				_localctx = new ConstInfixOperandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(BINARY);
				}
				break;
			case VARNAME:
				{
				_localctx = new VarInfixOperandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(26);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(27);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(28);
						infix_expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(29);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(30);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(31);
						infix_expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ShiftInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(32);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(33);
						_la = _input.LA(1);
						if ( !(_la==LSHIFT || _la==RSHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(34);
						infix_expr(7);
						}
						break;
					case 4:
						{
						_localctx = new BAndInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(35);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(36);
						match(BAND);
						setState(37);
						infix_expr(6);
						}
						break;
					case 5:
						{
						_localctx = new BXorInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(38);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(39);
						match(BXOR);
						setState(40);
						infix_expr(5);
						}
						break;
					case 6:
						{
						_localctx = new BOrInfixExprContext(new Infix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix_expr);
						setState(41);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(42);
						match(BOR);
						setState(43);
						infix_expr(4);
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class VarassignmentContext extends ParserRuleContext {
		public VarassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varassignment; }
	 
		public VarassignmentContext() { }
		public void copyFrom(VarassignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignmentUsingVarContext extends VarassignmentContext {
		public List<TerminalNode> VARNAME() { return getTokens(BooleanArithmeticParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(BooleanArithmeticParser.VARNAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(BooleanArithmeticParser.ASSIGNMENT, 0); }
		public VarAssignmentUsingVarContext(VarassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterVarAssignmentUsingVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitVarAssignmentUsingVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitVarAssignmentUsingVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignmentUsingConstContext extends VarassignmentContext {
		public TerminalNode VARNAME() { return getToken(BooleanArithmeticParser.VARNAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(BooleanArithmeticParser.ASSIGNMENT, 0); }
		public TerminalNode BINARY() { return getToken(BooleanArithmeticParser.BINARY, 0); }
		public VarAssignmentUsingConstContext(VarassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterVarAssignmentUsingConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitVarAssignmentUsingConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitVarAssignmentUsingConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignmentUsingExprContext extends VarassignmentContext {
		public TerminalNode VARNAME() { return getToken(BooleanArithmeticParser.VARNAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(BooleanArithmeticParser.ASSIGNMENT, 0); }
		public Infix_exprContext infix_expr() {
			return getRuleContext(Infix_exprContext.class,0);
		}
		public VarAssignmentUsingExprContext(VarassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterVarAssignmentUsingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitVarAssignmentUsingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitVarAssignmentUsingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarassignmentContext varassignment() throws RecognitionException {
		VarassignmentContext _localctx = new VarassignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varassignment);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarAssignmentUsingConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(VARNAME);
				setState(50);
				match(ASSIGNMENT);
				setState(51);
				match(BINARY);
				}
				break;
			case 2:
				_localctx = new VarAssignmentUsingVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(VARNAME);
				setState(53);
				match(ASSIGNMENT);
				setState(54);
				match(VARNAME);
				}
				break;
			case 3:
				_localctx = new VarAssignmentUsingExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(VARNAME);
				setState(56);
				match(ASSIGNMENT);
				setState(57);
				infix_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintUsingInfixExprContext extends PrintContext {
		public TerminalNode PRINTCMD() { return getToken(BooleanArithmeticParser.PRINTCMD, 0); }
		public Infix_exprContext infix_expr() {
			return getRuleContext(Infix_exprContext.class,0);
		}
		public PrintUsingInfixExprContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterPrintUsingInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitPrintUsingInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitPrintUsingInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintUsingVarContext extends PrintContext {
		public TerminalNode PRINTCMD() { return getToken(BooleanArithmeticParser.PRINTCMD, 0); }
		public TerminalNode VARNAME() { return getToken(BooleanArithmeticParser.VARNAME, 0); }
		public PrintUsingVarContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterPrintUsingVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitPrintUsingVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitPrintUsingVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintUsingConstContext extends PrintContext {
		public TerminalNode PRINTCMD() { return getToken(BooleanArithmeticParser.PRINTCMD, 0); }
		public TerminalNode BINARY() { return getToken(BooleanArithmeticParser.BINARY, 0); }
		public PrintUsingConstContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).enterPrintUsingConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanArithmeticListener ) ((BooleanArithmeticListener)listener).exitPrintUsingConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanArithmeticVisitor ) return ((BooleanArithmeticVisitor<? extends T>)visitor).visitPrintUsingConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PrintUsingConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(PRINTCMD);
				setState(61);
				match(BINARY);
				}
				break;
			case 2:
				_localctx = new PrintUsingVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(PRINTCMD);
				setState(63);
				match(VARNAME);
				}
				break;
			case 3:
				_localctx = new PrintUsingInfixExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(PRINTCMD);
				setState(65);
				infix_expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return infix_expr_sempred((Infix_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_expr_sempred(Infix_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015E\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u0001"+
		"0\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002;\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003C\b\u0003\u0001\u0003\u0000\u0001\u0002\u0004\u0000\u0002"+
		"\u0004\u0006\u0000\u0004\u0002\u0000\u0003\u0003\t\n\u0001\u0000\u0004"+
		"\u0006\u0001\u0000\u0007\b\u0001\u0000\u000b\fP\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000"+
		"\u0000\u0006B\u0001\u0000\u0000\u0000\b\f\u0003\u0002\u0001\u0000\t\f"+
		"\u0003\u0004\u0002\u0000\n\f\u0003\u0006\u0003\u0000\u000b\b\u0001\u0000"+
		"\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\n\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0006\u0001\uffff\uffff\u0000\u0010\u0011\u0005\u0001\u0000\u0000\u0011"+
		"\u0012\u0003\u0002\u0001\u0000\u0012\u0013\u0005\u0002\u0000\u0000\u0013"+
		"\u0019\u0001\u0000\u0000\u0000\u0014\u0015\u0007\u0000\u0000\u0000\u0015"+
		"\u0019\u0003\u0002\u0001\t\u0016\u0019\u0005\u0010\u0000\u0000\u0017\u0019"+
		"\u0005\u0014\u0000\u0000\u0018\u000f\u0001\u0000\u0000\u0000\u0018\u0014"+
		"\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0017"+
		"\u0001\u0000\u0000\u0000\u0019.\u0001\u0000\u0000\u0000\u001a\u001b\n"+
		"\b\u0000\u0000\u001b\u001c\u0007\u0001\u0000\u0000\u001c-\u0003\u0002"+
		"\u0001\t\u001d\u001e\n\u0007\u0000\u0000\u001e\u001f\u0007\u0002\u0000"+
		"\u0000\u001f-\u0003\u0002\u0001\b !\n\u0006\u0000\u0000!\"\u0007\u0003"+
		"\u0000\u0000\"-\u0003\u0002\u0001\u0007#$\n\u0005\u0000\u0000$%\u0005"+
		"\r\u0000\u0000%-\u0003\u0002\u0001\u0006&\'\n\u0004\u0000\u0000\'(\u0005"+
		"\u000e\u0000\u0000(-\u0003\u0002\u0001\u0005)*\n\u0003\u0000\u0000*+\u0005"+
		"\u000f\u0000\u0000+-\u0003\u0002\u0001\u0004,\u001a\u0001\u0000\u0000"+
		"\u0000,\u001d\u0001\u0000\u0000\u0000, \u0001\u0000\u0000\u0000,#\u0001"+
		"\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/\u0003\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005"+
		"\u0014\u0000\u000023\u0005\u0012\u0000\u00003;\u0005\u0010\u0000\u0000"+
		"45\u0005\u0014\u0000\u000056\u0005\u0012\u0000\u00006;\u0005\u0014\u0000"+
		"\u000078\u0005\u0014\u0000\u000089\u0005\u0012\u0000\u00009;\u0003\u0002"+
		"\u0001\u0000:1\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000\u0000:7\u0001"+
		"\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0005\u0013\u0000"+
		"\u0000=C\u0005\u0010\u0000\u0000>?\u0005\u0013\u0000\u0000?C\u0005\u0014"+
		"\u0000\u0000@A\u0005\u0013\u0000\u0000AC\u0003\u0002\u0001\u0000B<\u0001"+
		"\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"C\u0007\u0001\u0000\u0000\u0000\u0007\u000b\r\u0018,.:B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}