// Generated from GrammarExpression.g4 by ANTLR 4.4

	import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarExpressionParser}.
 */
public interface GrammarExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarExpressionParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(@NotNull GrammarExpressionParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarExpressionParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(@NotNull GrammarExpressionParser.ExprlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarExpressionParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull GrammarExpressionParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarExpressionParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull GrammarExpressionParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarExpressionParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull GrammarExpressionParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarExpressionParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull GrammarExpressionParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull GrammarExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull GrammarExpressionParser.ExprContext ctx);
}