// Generated from ./src/BooleanArithmetic/BooleanArithmetic.g4 by ANTLR 4.13.2
package BooleanArithmetic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanArithmeticParser}.
 */
public interface BooleanArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code bracketinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterBracketinfix_expr(BooleanArithmeticParser.Bracketinfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitBracketinfix_expr(BooleanArithmeticParser.Bracketinfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubinfix_expr(BooleanArithmeticParser.AddSubinfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubinfix_expr(BooleanArithmeticParser.AddSubinfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bXorinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterBXorinfix_expr(BooleanArithmeticParser.BXorinfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bXorinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitBXorinfix_expr(BooleanArithmeticParser.BXorinfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivinfix_expr(BooleanArithmeticParser.MultDivinfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivinfix_expr(BooleanArithmeticParser.MultDivinfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bOrinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterBOrinfix_expr(BooleanArithmeticParser.BOrinfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bOrinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitBOrinfix_expr(BooleanArithmeticParser.BOrinfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryinfix_expr(BooleanArithmeticParser.Unaryinfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryinfix_expr(BooleanArithmeticParser.Unaryinfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterShiftinfix_expr(BooleanArithmeticParser.Shiftinfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitShiftinfix_expr(BooleanArithmeticParser.Shiftinfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bAndinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterBAndinfix_expr(BooleanArithmeticParser.BAndinfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bAndinfix_expr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitBAndinfix_expr(BooleanArithmeticParser.BAndinfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterOperand(BooleanArithmeticParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitOperand(BooleanArithmeticParser.OperandContext ctx);
}