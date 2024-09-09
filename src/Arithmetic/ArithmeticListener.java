package Arithmetic;
// Generated from d:/Users/luc/Documents/GitHub/aut/src/Arithmetic/Arithmetic.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ArithmeticParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ArithmeticParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfix(ArithmeticParser.InfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfix(ArithmeticParser.InfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(ArithmeticParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(ArithmeticParser.ConstContext ctx);
}