// Generated from d:/Users/luc/Documents/GitHub/aut/src/AssignmentB/AssignmentB.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssignmentBParser}.
 */
public interface AssignmentBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssignmentBParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterInfix_expr(AssignmentBParser.Infix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentBParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitInfix_expr(AssignmentBParser.Infix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentBParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(AssignmentBParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentBParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(AssignmentBParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentBParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(AssignmentBParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentBParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(AssignmentBParser.ConstContext ctx);
}