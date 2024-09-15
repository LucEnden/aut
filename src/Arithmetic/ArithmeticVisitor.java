// Generated from ./src/Arithmetic/Arithmetic.g4 by ANTLR 4.13.2
package Arithmetic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_expr(ArithmeticParser.Infix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix(ArithmeticParser.InfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(ArithmeticParser.ConstContext ctx);
}