package BooleanArithmetic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import Arithmetic.ArithmeticParser.InfixContext;

// Side note: if this werent a toy example, I would have separated the classes into different files

enum OperatorType {
    UNARY,
    OPERATOR
}

class MyListener extends BooleanArithmeticBaseListener {
    public Stack<String> operands = new Stack<String>();
    public Stack<Pair<OperatorType, String>> operators = new Stack<Pair<OperatorType, String>>();

    // @Override
    // public void enterInbracket(BooleanArithmeticParser.InbracketContext ctx) {

    // }
    // @Override
    // public void exitInbracket(BooleanArithmeticParser.InbracketContext ctx) {
    //     System.out.println(ctx.getText());
    // }

    @Override
    public void enterInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx) {
    }
    @Override
    public void exitInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx) {
        // System.out.println(ctx.getText());
    }

    @Override
    public void enterUnary(BooleanArithmeticParser.UnaryContext ctx) {
    }
    @Override
    public void exitUnary(BooleanArithmeticParser.UnaryContext ctx) {
        // System.out.println("unary: " + ctx.getText());
        operators.push(new Pair<OperatorType, String>(OperatorType.UNARY, ctx.getText()));
    }

    @Override
    public void enterOperator(BooleanArithmeticParser.OperatorContext ctx) {
    }
    @Override
    public void exitOperator(BooleanArithmeticParser.OperatorContext ctx) {
        // System.out.println("operator: " + ctx.getText());
        operators.push(new Pair<OperatorType, String>(OperatorType.OPERATOR, ctx.getText()));
    }

    @Override
    public void enterOperand(BooleanArithmeticParser.OperandContext ctx) {
    }
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

class MyVisitor extends BooleanArithmeticBaseVisitor<String> {
    public Stack<String> operands = new Stack<String>();
    public Stack<Pair<OperatorType, String>> operators = new Stack<Pair<OperatorType, String>>();

    @Override
    public String visitOperand(BooleanArithmeticParser.OperandContext ctx) {
        String operand = ctx.getText();
        // System.out.println("Operand: " + operand);
        // System.out.println(ctx.getRuleIndex());
        operands.push(operand);
        return operand;
    }

    @Override
    public String visitOperator(BooleanArithmeticParser.OperatorContext ctx) {
        String operator = ctx.getText();
        // System.out.println("Operator: " + operator);
        // System.out.println(ctx.getRuleIndex());
        operators.push(new Pair<OperatorType, String>(OperatorType.OPERATOR, operator));
        return operator;
    }

    @Override
    public String visitUnary(BooleanArithmeticParser.UnaryContext ctx) {
        String operator = ctx.getText();
        // System.out.println("Unary: " + operator);
        operators.push(new Pair<OperatorType, String>(OperatorType.UNARY, operator));
        return operator;
    }

    @Override
    public String visitInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx) {
        int childCount = ctx.getChildCount();

        // We now that if the current node has children, we need to parse those first
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (child.getChildCount() > 0) {
                visit(child);
            } else {
                System.out.println(operators.toString());
                System.out.println(operands.toString());
                System.out.println("==================================");
            }
        }

        // System.out.println(operands.toString());
        // System.out.println(operators.toString());
        return "";
    }
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

        String input = readFile(inputFile).get(0);
        CharStream line = CharStreams.fromString(input);
        BooleanArithmeticLexer lexer = new BooleanArithmeticLexer(line);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BooleanArithmeticParser parser = new BooleanArithmeticParser(tokens);
        ParseTree tree = parser.infix_expr();

        MyVisitor m = new MyVisitor();
        m.visit(tree);
    }
}