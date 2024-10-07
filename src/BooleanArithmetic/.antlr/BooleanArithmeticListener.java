// Generated from d:/Users/luc/Documents/GitHub/aut/src/BooleanArithmetic/BooleanArithmetic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanArithmeticParser}.
 */
public interface BooleanArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BooleanArithmeticParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(BooleanArithmeticParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanArithmeticParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(BooleanArithmeticParser.StartContext ctx);
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
	 * Enter a parse tree produced by the {@code varInfixOperand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterVarInfixOperand(BooleanArithmeticParser.VarInfixOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varInfixOperand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitVarInfixOperand(BooleanArithmeticParser.VarInfixOperandContext ctx);
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
	 * Enter a parse tree produced by the {@code constInfixOperand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstInfixOperand(BooleanArithmeticParser.ConstInfixOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constInfixOperand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstInfixOperand(BooleanArithmeticParser.ConstInfixOperandContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code varAssignmentUsingConst}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignmentUsingConst(BooleanArithmeticParser.VarAssignmentUsingConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignmentUsingConst}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignmentUsingConst(BooleanArithmeticParser.VarAssignmentUsingConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignmentUsingVar}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignmentUsingVar(BooleanArithmeticParser.VarAssignmentUsingVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignmentUsingVar}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignmentUsingVar(BooleanArithmeticParser.VarAssignmentUsingVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignmentUsingExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignmentUsingExpr(BooleanArithmeticParser.VarAssignmentUsingExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignmentUsingExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignmentUsingExpr(BooleanArithmeticParser.VarAssignmentUsingExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printUsingConst}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintUsingConst(BooleanArithmeticParser.PrintUsingConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printUsingConst}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintUsingConst(BooleanArithmeticParser.PrintUsingConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printUsingVar}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintUsingVar(BooleanArithmeticParser.PrintUsingVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printUsingVar}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintUsingVar(BooleanArithmeticParser.PrintUsingVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printUsingInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintUsingInfixExpr(BooleanArithmeticParser.PrintUsingInfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printUsingInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintUsingInfixExpr(BooleanArithmeticParser.PrintUsingInfixExprContext ctx);
}