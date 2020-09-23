// Generated from BooleanExprParser.g4 by ANTLR 4.8

package antlrsource;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BooleanExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, TRUE=4, FALSE=5, GT=6, GE=7, LT=8, LE=9, EQ=10, LPARENTHESIS=11, 
		RPARENTHESIS=12, DECIMAL_NUMBER=13, IDENTIFIER=14, WS=15;
	public static final int
		RULE_parse = 0, RULE_basicBooleanExpression = 1, RULE_expression = 2, 
		RULE_comparator = 3, RULE_logicalOperator = 4, RULE_bool = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "basicBooleanExpression", "expression", "comparator", "logicalOperator", 
			"bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'True'", "'False'", null, null, null, null, 
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", 
			"LPARENTHESIS", "RPARENTHESIS", "DECIMAL_NUMBER", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BooleanExprParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BooleanExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public String str;
		public BasicBooleanExpressionContext basicBooleanExpression;
		public BasicBooleanExpressionContext basicBooleanExpression() {
			return getRuleContext(BasicBooleanExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BooleanExprParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		((ParseContext)_localctx).str = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((ParseContext)_localctx).basicBooleanExpression = basicBooleanExpression(0);
			((ParseContext)_localctx).str = ((ParseContext)_localctx).basicBooleanExpression.str;
			setState(14);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicBooleanExpressionContext extends ParserRuleContext {
		public String str;
		public BasicBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicBooleanExpression; }
	 
		public BasicBooleanExpressionContext() { }
		public void copyFrom(BasicBooleanExpressionContext ctx) {
			super.copyFrom(ctx);
			this.str = ctx.str;
		}
	}
	public static class ComparisonExpressionContext extends BasicBooleanExpressionContext {
		public ExpressionContext left;
		public ComparatorContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparisonExpressionContext(BasicBooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitComparisonExpression(this);
		}
	}
	public static class BooleanExpressionContext extends BasicBooleanExpressionContext {
		public BoolContext bool;
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BooleanExpressionContext(BasicBooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitBooleanExpression(this);
		}
	}
	public static class LogicalExpressionContext extends BasicBooleanExpressionContext {
		public BasicBooleanExpressionContext left;
		public LogicalOperatorContext op;
		public BasicBooleanExpressionContext right;
		public List<BasicBooleanExpressionContext> basicBooleanExpression() {
			return getRuleContexts(BasicBooleanExpressionContext.class);
		}
		public BasicBooleanExpressionContext basicBooleanExpression(int i) {
			return getRuleContext(BasicBooleanExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalExpressionContext(BasicBooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitLogicalExpression(this);
		}
	}

	public final BasicBooleanExpressionContext basicBooleanExpression() throws RecognitionException {
		return basicBooleanExpression(0);
	}

	private BasicBooleanExpressionContext basicBooleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasicBooleanExpressionContext _localctx = new BasicBooleanExpressionContext(_ctx, _parentState);
		BasicBooleanExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_basicBooleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				((ComparisonExpressionContext)_localctx).left = expression();
				setState(18);
				((ComparisonExpressionContext)_localctx).op = comparator();
				setState(19);
				((ComparisonExpressionContext)_localctx).right = expression();
				((ComparisonExpressionContext)_localctx).str = "("+(((ComparisonExpressionContext)_localctx).left!=null?_input.getText(((ComparisonExpressionContext)_localctx).left.start,((ComparisonExpressionContext)_localctx).left.stop):null) +" "+(((ComparisonExpressionContext)_localctx).op!=null?_input.getText(((ComparisonExpressionContext)_localctx).op.start,((ComparisonExpressionContext)_localctx).op.stop):null)+" "+(((ComparisonExpressionContext)_localctx).right!=null?_input.getText(((ComparisonExpressionContext)_localctx).right.start,((ComparisonExpressionContext)_localctx).right.stop):null)+")";
				}
				break;
			case 2:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				((BooleanExpressionContext)_localctx).bool = bool();
				((BooleanExpressionContext)_localctx).str = ((BooleanExpressionContext)_localctx).bool.str;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(new BasicBooleanExpressionContext(_parentctx, _parentState));
					((LogicalExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_basicBooleanExpression);
					setState(27);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(28);
					((LogicalExpressionContext)_localctx).op = logicalOperator();
					setState(29);
					((LogicalExpressionContext)_localctx).right = basicBooleanExpression(4);
					((LogicalExpressionContext)_localctx).str = ((LogicalExpressionContext)_localctx).left.str +" "+(((LogicalExpressionContext)_localctx).op!=null?_input.getText(((LogicalExpressionContext)_localctx).op.start,((LogicalExpressionContext)_localctx).op.stop):null)+" "+((LogicalExpressionContext)_localctx).right.str;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String str;
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.str = ctx.str;
		}
	}
	public static class DecimalExpressionContext extends ExpressionContext {
		public TerminalNode DECIMAL_NUMBER() { return getToken(BooleanExprParser.DECIMAL_NUMBER, 0); }
		public DecimalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitDecimalExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(BooleanExprParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public TerminalNode LPARENTHESIS() { return getToken(BooleanExprParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(BooleanExprParser.RPARENTHESIS, 0); }
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitParenthesisExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(BooleanExprParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitNotExpression(this);
		}
	}
	public static class UnaryboolExpressionContext extends ExpressionContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public UnaryboolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterUnaryboolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitUnaryboolExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPARENTHESIS:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(LPARENTHESIS);
				setState(38);
				expression();
				setState(39);
				match(RPARENTHESIS);
				}
				break;
			case NOT:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(NOT);
				setState(42);
				expression();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new UnaryboolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				bool();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(IDENTIFIER);
				}
				break;
			case DECIMAL_NUMBER:
				_localctx = new DecimalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(DECIMAL_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public String str;
		public TerminalNode GT() { return getToken(BooleanExprParser.GT, 0); }
		public TerminalNode GE() { return getToken(BooleanExprParser.GE, 0); }
		public TerminalNode LT() { return getToken(BooleanExprParser.LT, 0); }
		public TerminalNode LE() { return getToken(BooleanExprParser.LE, 0); }
		public TerminalNode EQ() { return getToken(BooleanExprParser.EQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitComparator(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public String str;
		public TerminalNode AND() { return getToken(BooleanExprParser.AND, 0); }
		public TerminalNode OR() { return getToken(BooleanExprParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public String str;
		public TerminalNode TRUE() { return getToken(BooleanExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BooleanExprParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprParserListener ) ((BooleanExprParserListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return basicBooleanExpression_sempred((BasicBooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean basicBooleanExpression_sempred(BasicBooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\219\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\2\3\4\b\2\4\6\b\n\f\2\5\3\2\b\f\3\2\3\4\3\2\6\7\28\2\16\3\2\2"+
		"\2\4\33\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16"+
		"\17\5\4\3\2\17\20\b\2\1\2\20\21\7\2\2\3\21\3\3\2\2\2\22\23\b\3\1\2\23"+
		"\24\5\6\4\2\24\25\5\b\5\2\25\26\5\6\4\2\26\27\b\3\1\2\27\34\3\2\2\2\30"+
		"\31\5\f\7\2\31\32\b\3\1\2\32\34\3\2\2\2\33\22\3\2\2\2\33\30\3\2\2\2\34"+
		"$\3\2\2\2\35\36\f\5\2\2\36\37\5\n\6\2\37 \5\4\3\6 !\b\3\1\2!#\3\2\2\2"+
		"\"\35\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2\2\'(\7"+
		"\r\2\2()\5\6\4\2)*\7\16\2\2*\61\3\2\2\2+,\7\5\2\2,\61\5\6\4\2-\61\5\f"+
		"\7\2.\61\7\20\2\2/\61\7\17\2\2\60\'\3\2\2\2\60+\3\2\2\2\60-\3\2\2\2\60"+
		".\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\63\t\2\2\2\63\t\3\2\2\2\64\65\t"+
		"\3\2\2\65\13\3\2\2\2\66\67\t\4\2\2\67\r\3\2\2\2\5\33$\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}