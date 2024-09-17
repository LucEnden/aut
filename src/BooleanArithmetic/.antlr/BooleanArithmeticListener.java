// Generated from d:/Users/luc/repos/aut/src/BooleanArithmetic/BooleanArithmetic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanArithmeticParser}.
 */
public interface BooleanArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void enterInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanArithmeticParser#infix_expr}.
	 * @param ctx the parse tree
	 */
	void exitInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanArithmeticParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(BooleanArithmeticParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanArithmeticParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(BooleanArithmeticParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanArithmeticParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(BooleanArithmeticParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanArithmeticParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(BooleanArithmeticParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanArithmeticParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(BooleanArithmeticParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanArithmeticParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(BooleanArithmeticParser.OperandContext ctx);
}