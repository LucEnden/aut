// Generated from ./src/BooleanArithmetic/BooleanArithmetic.g4 by ANTLR 4.13.2
package BooleanArithmetic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BooleanArithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BooleanArithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanArithmeticParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(BooleanArithmeticParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanArithmeticParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(BooleanArithmeticParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanArithmeticParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(BooleanArithmeticParser.OperandContext ctx);
}