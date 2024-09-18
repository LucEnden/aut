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
	 * Visit a parse tree produced by the {@code multDivInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivInfixExpr(BooleanArithmeticParser.MultDivInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketInfixExpr(BooleanArithmeticParser.BracketInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bAndInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBAndInfixExpr(BooleanArithmeticParser.BAndInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bOrInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOrInfixExpr(BooleanArithmeticParser.BOrInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInfixExpr(BooleanArithmeticParser.UnaryInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftInfixExpr(BooleanArithmeticParser.ShiftInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bXorInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBXorInfixExpr(BooleanArithmeticParser.BXorInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(BooleanArithmeticParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubInfixExpr(BooleanArithmeticParser.AddSubInfixExprContext ctx);
}