package BooleanArithmetic;

import java.util.Dictionary;
import java.util.Hashtable;

class MyVisitor extends BooleanArithmeticBaseVisitor<String> {
    private Dictionary<String, String> variables = new Hashtable<>();

    public String variables() {
        return variables.toString();
    }

    //region Visitor overrides
    @Override
    public String visitPrintUsingInfixExpr(BooleanArithmeticParser.PrintUsingInfixExprContext ctx) {
        System.out.println(visit(ctx.getChild(1)));
        return "";
    }
    @Override
    public String visitPrintUsingVar(BooleanArithmeticParser.PrintUsingVarContext ctx) {
        System.out.println(getVarValue(ctx.getChild(1).getText()));
        return "";
    }
    @Override
    public String visitPrintUsingConst(BooleanArithmeticParser.PrintUsingConstContext ctx) {
        System.out.println(ctx.getChild(1).getText());
        return "";
    }

    @Override
    public String visitVarAssignmentUsingConst(BooleanArithmeticParser.VarAssignmentUsingConstContext ctx) {
        // For input "a = 0101"
        // System.out.println(ctx.getText()); // a=0101
        // System.out.println(ctx.getChildCount()); // 3
        // for (int i = 0; i < ctx.getChildCount(); i++) {
        //     System.out.println(ctx.getChild(i)); // a, =, 0101 (in that order)
        // }

        String varName = ctx.getChild(0).getText(); // a
        String varValue = ctx.getChild(2).getText(); // 0101

        // Put updates any existing variable or create a new one
        variables.put(varName, varValue);
        return "";
    }
    @Override
    public String visitVarAssignmentUsingVar(BooleanArithmeticParser.VarAssignmentUsingVarContext ctx) {
        String varName = ctx.getChild(0).getText(); // a
        String varValue = getVarValue(ctx.getChild(2).getText()); // b
        
        variables.put(varName, varValue);
        return "";
    }
    @Override
    public String visitVarAssignmentUsingExpr(BooleanArithmeticParser.VarAssignmentUsingExprContext ctx) {
        String varName = ctx.getChild(0).getText(); // a
        String varValue = visit(ctx.getChild(2)); // a + b or a + 0101
        
        variables.put(varName, varValue);
        return "";
    }
    
    @Override
    public String visitBracketInfixExpr(BooleanArithmeticParser.BracketInfixExprContext ctx) {
        // The middle child (aka index 1) is the expression inside the brackets
        // The outer children are terminal nodes with text "(" and ")" respectively
        // These terminal nodes can simply be ignored
        return visit(ctx.getChild(1));
    }

    @Override
    public String visitVarInfixOperand(BooleanArithmeticParser.VarInfixOperandContext ctx) {
        return getVarValue(ctx.getText());
    }

    @Override
    public String visitConstInfixOperand(BooleanArithmeticParser.ConstInfixOperandContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitUnaryInfixExpr(BooleanArithmeticParser.UnaryInfixExprContext ctx) {
        return solveUnary(ctx);
    }

    @Override
    public String visitMultDivInfixExpr(BooleanArithmeticParser.MultDivInfixExprContext ctx) {
        return solveOperation(ctx);
    }

    @Override
    public String visitAddSubInfixExpr(BooleanArithmeticParser.AddSubInfixExprContext ctx) {        
        // for (int i = 0; i < ctx.getChildCount(); i++) {
        //     System.out.println(i + " : " + ctx.getChild(i).getClass());
        // }
        // System.out.println(ctx.getChildCount());

        String operand1 = visit(ctx.getChild(0));       // The first indexed child is always an operand. Notice the recursive call here
        String operator = ctx.getChild(1).getText();    // The second child is a terminal node, i.e. the operator
        String operand2 = visit(ctx.getChild(2));       // Same rule as with the first operand applies here

        // System.out.println(operand1 + operator + operand2);

        return performOperation(operand1, operator, operand2);
    }

    @Override
    public String visitShiftInfixExpr(BooleanArithmeticParser.ShiftInfixExprContext ctx) {
        return solveOperation(ctx);
    }

    @Override
    public String visitBAndInfixExpr(BooleanArithmeticParser.BAndInfixExprContext ctx) {
        return solveOperation(ctx);
    }

    @Override
    public String visitBOrInfixExpr(BooleanArithmeticParser.BOrInfixExprContext ctx) {
        return solveOperation(ctx);
    }

    @Override
    public String visitBXorInfixExpr(BooleanArithmeticParser.BXorInfixExprContext ctx) {
        return solveOperation(ctx);
    }
    //endregion

    //region Helper methods
    private String[] getUnary(BooleanArithmeticParser.Infix_exprContext ctx) {
        String operator = ctx.getChild(0).getText();
        String operand = visit(ctx.getChild(1));
        return new String[] {operator, operand};
    }
    private String performUnary(String operator, String operand) {
        switch (operator) {
            case "++":
                return BinaryOperations.addition(operand, "1");
            case "--":
                return BinaryOperations.subtraction(operand, "1");
            case "!":
                return BinaryOperations.bitwiseNot(operand);
            default:
                System.err.println("Unknown unary binary operator: " + operator);
                System.exit(1);
                return "";
        }
    }

    private String solveUnary(BooleanArithmeticParser.Infix_exprContext ctx) {
        String[] unary = getUnary(ctx);
        return performUnary(unary[0], unary[1]);
    }

    private String[] getOperation(BooleanArithmeticParser.Infix_exprContext ctx) {
        String operand1 = visit(ctx.getChild(0));
        String operator = ctx.getChild(1).getText();
        String operand2 = visit(ctx.getChild(2));
        return new String[] {operand1, operator, operand2};
    }
    private String performOperation(String operand1, String operator, String operand2) {
        switch (operator) {
            case "+":
                return BinaryOperations.addition(operand1, operand2);
            case "-":
                return BinaryOperations.subtraction(operand1, operand2);
            case "*":
                return BinaryOperations.multiplication(operand1, operand2);
            case "/":
                return BinaryOperations.division(operand1, operand2);
            case "%":
                return BinaryOperations.modulo(operand1, operand2);
            case "<<":
                return BinaryOperations.arithmeticLeftShift(operand1, operand2);
            case ">>":
                return BinaryOperations.arithmeticRightShift(operand1, operand2);
            case "&":
                return BinaryOperations.bitwiseAnd(operand1, operand2);
            case "|":
                return BinaryOperations.bitwiseOr(operand1, operand2);
            case "^":
                return BinaryOperations.bitwiseXor(operand1, operand2);
            default:
                System.err.println("Unknown binary operator: " + operator);
                System.exit(1);
                return "";
        }
    }

    private String solveOperation(BooleanArithmeticParser.Infix_exprContext ctx) {
        String[] operation = getOperation(ctx);
        return performOperation(operation[0], operation[1], operation[2]);
    }

    private boolean varExists(String varName) {
        return variables.get(varName) != null;
    }
    private String getVarValue(String varName) {
        if (!varExists(varName)) {
            System.err.println("Variable " + varName + " does not exist");
            System.exit(1);
        }
        return variables.get(varName);
    }
    //endregion
}