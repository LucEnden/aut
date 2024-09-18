package BooleanArithmetic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/*
class MyListener extends BooleanArithmeticBaseListener {
    public Stack<String> operands = new Stack<String>();
    public Stack<Pair<OperatorType, String>> operators = new Stack<Pair<OperatorType, String>>();

    @Override
    public void enterInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx) { }
    @Override
    public void exitInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx) {
        // System.out.println(ctx.getText());
    }

    @Override
    public void enterUnary(BooleanArithmeticParser.UnaryContext ctx) { }
    @Override
    public void exitUnary(BooleanArithmeticParser.UnaryContext ctx) {
        // System.out.println("unary: " + ctx.getText());
        operators.push(new Pair<OperatorType, String>(OperatorType.UNARY, ctx.getText()));
    }

    @Override
    public void enterOperator(BooleanArithmeticParser.OperatorContext ctx) { }
    @Override
    public void exitOperator(BooleanArithmeticParser.OperatorContext ctx) {
        // System.out.println("operator: " + ctx.getText());
        operators.push(new Pair<OperatorType, String>(OperatorType.OPERATOR, ctx.getText()));
    }

    @Override
    public void enterOperand(BooleanArithmeticParser.OperandContext ctx) { }
    @Override
    public void exitOperand(BooleanArithmeticParser.OperandContext ctx) {
        // System.out.println("operand: " + ctx.getText());
        operands.push(ctx.getText());
    }

    // <========================================>
    // Homework
    // <========================================>
    public void printNumberOfAdditions() {
        int count = 0;
        for (Pair<OperatorType, String> i : operators) {
            if (i.a == OperatorType.OPERATOR && i.b.equals("+")) {
                count++;
            }
        }
        System.out.println("Number of additions: " + count);
    }

    public void printLargestNumberPresent() {
        float max = 0;
        for (String i : operands) {
            float num = Float.parseFloat(i);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number present: " + max);
    }

    public String parseUnary(String operator, String operand) {
        // Operand is a binary string
        switch (operator) {
            case "++":
                return BinaryOperations.addBinary(operand, "1");
            case "--":
                return BinaryOperations.subtractBinary(operand, "1");
            case "!":
                return BinaryOperations.notBinary(operand);
            default:
                System.err.println("Unknown unary operator: " + operator);
                System.exit(1);
                return "";
        }
    }

    public String parseExpresion(String operand1, String operand2, String operator) {
        // Operands are binary strings
        switch (operator) {
            case "+":
                return BinaryOperations.addBinary(operand1, operand2);
            case "-":
                return BinaryOperations.subtractBinary(operand1, operand2);
            case "*":
                return BinaryOperations.multiplyBinary(operand1, operand2);
            case "/":
                return BinaryOperations.divideBinary(operand1, operand2);
            case "%":
                return BinaryOperations.moduloBinary(operand1, operand2);
            default:
                System.err.println("Unknown binary operator: " + operator);
                System.exit(1);
                return "";
        }
    }
}
*/

class MyVisitor extends BooleanArithmeticBaseVisitor<String> {
    //region Visitor overrides
    @Override
    public String visitBracketInfixExpr(BooleanArithmeticParser.BracketInfixExprContext ctx) {
        // The middle child (aka index 1) is the expression inside the brackets
        // The outer children are terminal nodes with text "(" and ")" respectively
        // These terminal nodes can simply be ignored
        return visit(ctx.getChild(1));
    }

    @Override
    public String visitOperand(BooleanArithmeticParser.OperandContext ctx) {
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
    //endregion
}

class Main {
    /*
     * Reads all lines from a file, unless they are empty or start with a '#'
     */
    private static List<String> readFile(String path) {
        List<String> lines = new ArrayList<String>();
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.length() > 0 && data.charAt(0) != '#') {
                    lines.add(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return lines;
    }

    public static String testFile = System.getProperty("user.dir") + "\\src\\BooleanArithmetic\\test.txt";
    public static String homeworkFile = System.getProperty("user.dir") + "\\src\\BooleanArithmetic\\homework.txt";
    public static String inputFile = System.getProperty("user.dir") + "\\src\\BooleanArithmetic\\input.txt";

    public static void main(String[] args) {
        /*
         * Uncomment the following line to enable logging of operations
         */
        // BinaryOperations.logOperations = true;

        // System.out.println("Homework stuff");
        // String homework = readFile(homeworkFile).get(0);
        // System.out.println(homework);
        // CharStream line = CharStreams.fromString(homework);
        // BooleanArithmeticLexer lexer = new BooleanArithmeticLexer(line);
        // CommonTokenStream tokens = new CommonTokenStream(lexer);
        // BooleanArithmeticParser parser = new BooleanArithmeticParser(tokens);
        // ParseTree tree = parser.infix_expr();
        // MyListener m = new MyListener();
        // ParseTreeWalker.DEFAULT.walk(m, tree);
        // m.printNumberOfAdditions();
        // m.printLargestNumberPresent();
        // System.out.println("No more homework!");

        // System.out.println("Test stuff");
        // List<String> inputs = readFile(testFile);
        // for (String i : inputs) {
        // CharStream line = CharStreams.fromString(i);
        // BooleanArithmeticLexer lexer = new BooleanArithmeticLexer(line);
        // CommonTokenStream tokens = new CommonTokenStream(lexer);
        // BooleanArithmeticParser parser = new BooleanArithmeticParser(tokens);
        // ParseTree tree = parser.infix_expr(); // The method being called == the
        // intented start rule of the grammar
        // MyListener m = new MyListener();
        // ParseTreeWalker.DEFAULT.walk(m, tree);
        // System.out.println("Compute stack: " + m.infixComputeStack.toString());;
        // break;
        // }
        // System.out.println("No more tests!");
        
        List<String> input = readFile(testFile);
        for (String i : input) {
            System.out.print(i + " = ");
            CharStream line = CharStreams.fromString(i);
            BooleanArithmeticLexer lexer = new BooleanArithmeticLexer(line);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BooleanArithmeticParser parser = new BooleanArithmeticParser(tokens);
            ParseTree tree = parser.infix_expr();
    
            MyVisitor m = new MyVisitor();
            System.out.println(m.visit(tree));
        }
    }
}