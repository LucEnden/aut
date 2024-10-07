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
	 * Visit a parse tree produced by {@link BooleanArithmeticParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(BooleanArithmeticParser.StartContext ctx);
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
	 * Visit a parse tree produced by the {@code varInfixOperand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInfixOperand(BooleanArithmeticParser.VarInfixOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInfixExpr(BooleanArithmeticParser.UnaryInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constInfixOperand}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInfixOperand(BooleanArithmeticParser.ConstInfixOperandContext ctx);
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
	 * Visit a parse tree produced by the {@code addSubInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubInfixExpr(BooleanArithmeticParser.AddSubInfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssignmentUsingConst}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignmentUsingConst(BooleanArithmeticParser.VarAssignmentUsingConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssignmentUsingVar}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignmentUsingVar(BooleanArithmeticParser.VarAssignmentUsingVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssignmentUsingExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#varassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignmentUsingExpr(BooleanArithmeticParser.VarAssignmentUsingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printUsingConst}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintUsingConst(BooleanArithmeticParser.PrintUsingConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printUsingVar}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintUsingVar(BooleanArithmeticParser.PrintUsingVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printUsingInfixExpr}
	 * labeled alternative in {@link BooleanArithmeticParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintUsingInfixExpr(BooleanArithmeticParser.PrintUsingInfixExprContext ctx);
}