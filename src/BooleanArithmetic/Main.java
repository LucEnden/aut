package BooleanArithmetic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// Side note: if this werent a toy example, I would have separated the classes into different files

enum InfixComputeStackItemType {
    OPERATOR,
    OPERAND
}
class InfixComputeStackItem {
    InfixComputeStackItemType itemType;
    String itemValue;

    public InfixComputeStackItem(InfixComputeStackItemType itemType, String itemValue) {
        this.itemType = itemType;
        this.itemValue = itemValue;
    }

    @Override public String toString() {
        return "(" + itemType + ", " + itemValue + ")";
    }
}

class MyListener extends BooleanArithmeticBaseListener {
    private float result = 0;
    private Stack<InfixComputeStackItem> infixComputeStack = new Stack<InfixComputeStackItem>();

    public void printNumberOfAdditions() {
        int count = 0;
        for (InfixComputeStackItem i : infixComputeStack) {
            if (i.itemType == InfixComputeStackItemType.OPERATOR && i.itemValue.equals("+")) {
                count++;
            }
        }
        System.out.println("Number of additions: " + count);
    }
    public void printLargestNumberPresent() {
        int max = 0;
        for (InfixComputeStackItem i : infixComputeStack) {
            if (i.itemType == InfixComputeStackItemType.OPERAND) {
                // All numbers are in binary
                int num = Integer.parseInt(i.itemValue, 2);
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println("Largest number present: " + max);
    }

    @Override public void enterInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx) { }
    @Override public void exitInfix_expr(BooleanArithmeticParser.Infix_exprContext ctx) { }

	@Override public void enterUnary(BooleanArithmeticParser.UnaryContext ctx) { }
	@Override public void exitUnary(BooleanArithmeticParser.UnaryContext ctx) { }

	@Override public void enterOperator(BooleanArithmeticParser.OperatorContext ctx) { }
	@Override public void exitOperator(BooleanArithmeticParser.OperatorContext ctx) {
        // System.out.println("operator: " + ctx.getText());
        infixComputeStack.push(new InfixComputeStackItem(
            InfixComputeStackItemType.OPERATOR,
            ctx.getText()
        ));
    }

    @Override public void enterOperand(BooleanArithmeticParser.OperandContext ctx) {

    }
    @Override public void exitOperand(BooleanArithmeticParser.OperandContext ctx) {
        // System.out.println("operand: " + ctx.getText());
        infixComputeStack.push(new InfixComputeStackItem(
            InfixComputeStackItemType.OPERAND,
            ctx.getText()
        ));
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

    public static final String testFile = "D:\\Users\\luc\\repos\\aut\\src\\BooleanArithmetic\\test.txt";
    public static final String homeworkFile = "D:\\Users\\luc\\repos\\aut\\src\\BooleanArithmetic\\homework.txt";

    public static void main(String[] args) {
        System.out.println("Homework stuff");
        String homework = readFile(homeworkFile).get(0);
        System.out.println(homework);
        
        CharStream line = CharStreams.fromString(homework);
        BooleanArithmeticLexer lexer = new BooleanArithmeticLexer(line);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BooleanArithmeticParser parser = new BooleanArithmeticParser(tokens);
        ParseTree tree = parser.infix_expr();

        MyListener m = new MyListener();
        ParseTreeWalker.DEFAULT.walk(m, tree);
        m.printNumberOfAdditions();
        m.printLargestNumberPresent();

        // List<String> inputs = readFile(testFile);
        // for (String i : inputs) {
        //     CharStream line = CharStreams.fromString(i);
        //     BooleanArithmeticLexer lexer = new BooleanArithmeticLexer(line);
    
        //     CommonTokenStream tokens = new CommonTokenStream(lexer);
    
        //     BooleanArithmeticParser parser = new BooleanArithmeticParser(tokens);
    
        //     ParseTree tree = parser.infix_expr(); // The method being called == the intented start rule of the grammar
    
        //     MyListener m = new MyListener();
        //     ParseTreeWalker.DEFAULT.walk(m, tree);
        // }
    }
}