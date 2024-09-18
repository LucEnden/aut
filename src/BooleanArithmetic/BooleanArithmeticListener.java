// Generated from ./src/BooleanArithmetic/BooleanArithmetic.g4 by ANTLR 4.13.2
package BooleanArithmetic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanArithmeticParser}.
 */
public interface BooleanArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multDivInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivInfixExpr(BooleanArithmeticParser.MultDivInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivInfixExpr(BooleanArithmeticParser.MultDivInfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterBracketInfixExpr(BooleanArithmeticParser.BracketInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitBracketInfixExpr(BooleanArithmeticParser.BracketInfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bAndInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterBAndInfixExpr(BooleanArithmeticParser.BAndInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bAndInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitBAndInfixExpr(BooleanArithmeticParser.BAndInfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bOrInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterBOrInfixExpr(BooleanArithmeticParser.BOrInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bOrInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitBOrInfixExpr(BooleanArithmeticParser.BOrInfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryInfixExpr(BooleanArithmeticParser.UnaryInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryInfixExpr(BooleanArithmeticParser.UnaryInfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterShiftInfixExpr(BooleanArithmeticParser.ShiftInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitShiftInfixExpr(BooleanArithmeticParser.ShiftInfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bXorInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterBXorInfixExpr(BooleanArithmeticParser.BXorInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bXorInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitBXorInfixExpr(BooleanArithmeticParser.BXorInfixExprContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code addSubInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubInfixExpr(BooleanArithmeticParser.AddSubInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubInfixExpr(BooleanArithmeticParser.AddSubInfixExprContext ctx);
}