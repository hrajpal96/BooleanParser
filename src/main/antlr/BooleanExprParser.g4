parser grammar BooleanExprParser;
@header {
package antlrsource;
}
options {
	tokenVocab = BooleanExprLexer;
}

parse
	returns[String str]
	@init {$str="";}: basicBooleanExpression {$str=$basicBooleanExpression.str;} EOF;

basicBooleanExpression
	returns[String str]:
	left = basicBooleanExpression op = logicalOperator right = basicBooleanExpression	{$str=$left.str +" "+$op.text+" "+$right.str;} # logicalExpression
	| left = expression op = comparator right = expression {$str="("+$left.text +" "+$op.text+" "+$right.text+")";}	# comparisonExpression
	| bool											{$str=$bool.str;}		# booleanExpression;

expression
	returns[String str]:
	LPARENTHESIS expression RPARENTHESIS				# parenthesisExpression
	| NOT expression									# notExpression
	| bool												# unaryboolExpression
	| IDENTIFIER										# identifierExpression
	| DECIMAL_NUMBER									# decimalExpression
	;

comparator
	returns[String str]: GT | GE | LT | LE | EQ;

logicalOperator
	returns[String str]: AND | OR;

bool
	returns[String str]: TRUE | FALSE;

