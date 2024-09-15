import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
// import java.util.*;
import Demo.MyGrammarBaseListener;
import Demo.MyGrammarLexer;
import Demo.MyGrammarParser;

// To investigate the contents of the ctx and other objects (in todo comments), im gonna use reflections
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

		// TODO: print the lexer's vocabulary and the actual list of tokens 
        System.out.println("lexer vocabulary: " + lexer.getVocabulary());
        tokens.fill(); // fill the token stream
        System.out.println("tokens: " + tokens.getTokens());
		
        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.myStart();
		
		MyListener m = new MyListener();
		ParseTreeWalker.DEFAULT.walk(m, tree);
    }
}

class MyListener extends MyGrammarBaseListener
{
	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		// TODO: investigate contents of 'ctx'
		System.err.println("enterMyStart()");

        Field[] fields = ctx.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field: " + field.getName());
        }
        Method[] methods = ctx.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method: " + method.getName());
        }
	}
	
	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		// TODO: investigate contents of 'ctx'
		System.err.println("exitMyStart()");
	}
	
	@Override public void visitTerminal(TerminalNode node) 
	{ 
		System.err.println("terminal-node: '" + node.getText() + "'");
		// TODO: print line+column, token's type, etc.
        System.out.println("Line: " + node.getSymbol().getLine());
        System.out.println("Column: " + node.getSymbol().getCharPositionInLine());
        System.out.println("Token Type: " + node.getSymbol().getType());
	}
	// TODO: override other methods of 'MyGrammarBaseListener'
    
}

// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }