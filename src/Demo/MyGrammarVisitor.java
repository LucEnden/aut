package Demo;
// Generated from d:/Users/luc/Documents/GitHub/aut/src/Demo/MyGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#hello}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHello(MyGrammarParser.HelloContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#goodbye}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodbye(MyGrammarParser.GoodbyeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MyGrammarParser.NameContext ctx);
}