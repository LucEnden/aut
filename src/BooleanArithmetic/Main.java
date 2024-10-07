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

    public static String ruleInputsDir = System.getProperty("user.dir") + "\\src\\BooleanArithmetic\\rule_inputs\\";
    public static String infixExprInput = ruleInputsDir + "infix_expr_input.txt";
    public static String infixExprTests = ruleInputsDir + "infix_expr_tests.txt";
    public static String printInput = ruleInputsDir + "print_input.txt";
    public static String printTests = ruleInputsDir + "print_tests.txt";
    public static String varAssignmentInput = ruleInputsDir + "varassigment_input.txt";
    public static String varAssignmentTests = ruleInputsDir + "varassigment_tests.txt";

    public static void main(String[] args) {
        /*
         * Uncomment the following line to enable logging of operations
         */
        // BinaryOperations.logOperations = true;
        
        List<String> input = readFile(varAssignmentTests);
        MyVisitor m = new MyVisitor();

        for (String i : input) {
            CharStream line = CharStreams.fromString(i);
            BooleanArithmeticLexer lexer = new BooleanArithmeticLexer(line);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BooleanArithmeticParser parser = new BooleanArithmeticParser(tokens);
            ParseTree tree = parser.start();
    
            // System.out.println(m.visit(tree));
            m.visit(tree);
        }

        // System.out.println(m.variables());
    }
}