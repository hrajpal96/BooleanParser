// Generated from BooleanExprParser.g4 by ANTLR 4.8

package antlrsource;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanExprParser}.
 */
public interface BooleanExprParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(BooleanExprParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(BooleanExprParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(BooleanExprParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(BooleanExprParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(BooleanExprParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(BooleanExprParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(BooleanExprParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(BooleanExprParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(BooleanExprParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(BooleanExprParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(BooleanExprParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(BooleanExprParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryboolExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryboolExpression(BooleanExprParser.UnaryboolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryboolExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryboolExpression(BooleanExprParser.UnaryboolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(BooleanExprParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(BooleanExprParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpression(BooleanExprParser.DecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpression(BooleanExprParser.DecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(BooleanExprParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(BooleanExprParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(BooleanExprParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(BooleanExprParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(BooleanExprParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(BooleanExprParser.BoolContext ctx);
}