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
	 * Visit a parse tree produced by the {@code bracketinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketinfix_expr(BooleanArithmeticParser.Bracketinfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubinfix_expr(BooleanArithmeticParser.AddSubinfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bXorinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBXorinfix_expr(BooleanArithmeticParser.BXorinfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivinfix_expr(BooleanArithmeticParser.MultDivinfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bOrinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOrinfix_expr(BooleanArithmeticParser.BOrinfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryinfix_expr(BooleanArithmeticParser.Unaryinfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftinfix_expr(BooleanArithmeticParser.Shiftinfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bAndinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBAndinfix_expr(BooleanArithmeticParser.BAndinfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(BooleanArithmeticParser.OperandContext ctx);
}