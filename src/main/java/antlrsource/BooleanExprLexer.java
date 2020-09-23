// Generated from BooleanExprLexer.g4 by ANTLR 4.8

package antlrsource;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BooleanExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, TRUE=4, FALSE=5, GT=6, GE=7, LT=8, LE=9, EQ=10, LPARENTHESIS=11, 
		RPARENTHESIS=12, DECIMAL_NUMBER=13, IDENTIFIER=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "LPARENTHESIS", 
			"RPARENTHESIS", "DECIMAL_NUMBER", "IDENTIFIER", "WS", "A", "B", "C", 
			"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public BooleanExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BooleanExprLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5:
			GT_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			GE_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			LT_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			LE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			EQ_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void GT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(" > ");
			break;
		}
	}
	private void GE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText(" >= ");
			break;
		}
	}
	private void LT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			setText(" < ");
			break;
		}
	}
	private void LE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			setText(" <= ");
			break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			setText(" == ");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00d5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\5\16\u0085\n\16\3\16"+
		"\6\16\u0088\n\16\r\16\16\16\u0089\3\16\3\16\6\16\u008e\n\16\r\16\16\16"+
		"\u008f\5\16\u0092\n\16\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099\13\17"+
		"\3\20\6\20\u009c\n\20\r\20\16\20\u009d\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\2\2+\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2"+
		"I\2K\2M\2O\2Q\2S\2\3\2 \3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16"+
		"\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJ"+
		"jj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\2\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3"+
		"U\3\2\2\2\5Y\3\2\2\2\7\\\3\2\2\2\t`\3\2\2\2\13e\3\2\2\2\rk\3\2\2\2\17"+
		"o\3\2\2\2\21s\3\2\2\2\23w\3\2\2\2\25{\3\2\2\2\27\177\3\2\2\2\31\u0081"+
		"\3\2\2\2\33\u0084\3\2\2\2\35\u0093\3\2\2\2\37\u009b\3\2\2\2!\u00a1\3\2"+
		"\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2+\u00ab"+
		"\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2"+
		"\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00bb\3\2\2\2=\u00bd"+
		"\3\2\2\2?\u00bf\3\2\2\2A\u00c1\3\2\2\2C\u00c3\3\2\2\2E\u00c5\3\2\2\2G"+
		"\u00c7\3\2\2\2I\u00c9\3\2\2\2K\u00cb\3\2\2\2M\u00cd\3\2\2\2O\u00cf\3\2"+
		"\2\2Q\u00d1\3\2\2\2S\u00d3\3\2\2\2UV\5!\21\2VW\5;\36\2WX\5\'\24\2X\4\3"+
		"\2\2\2YZ\5=\37\2Z[\5C\"\2[\6\3\2\2\2\\]\5;\36\2]^\5=\37\2^_\5G$\2_\b\3"+
		"\2\2\2`a\7V\2\2ab\7t\2\2bc\7w\2\2cd\7g\2\2d\n\3\2\2\2ef\7H\2\2fg\7c\2"+
		"\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\f\3\2\2\2kl\5-\27\2lm\5G$\2mn\b\7\2\2n"+
		"\16\3\2\2\2op\5-\27\2pq\5)\25\2qr\b\b\3\2r\20\3\2\2\2st\5\67\34\2tu\5"+
		"G$\2uv\b\t\4\2v\22\3\2\2\2wx\5\67\34\2xy\5)\25\2yz\b\n\5\2z\24\3\2\2\2"+
		"{|\5)\25\2|}\5A!\2}~\b\13\6\2~\26\3\2\2\2\177\u0080\7*\2\2\u0080\30\3"+
		"\2\2\2\u0081\u0082\7+\2\2\u0082\32\3\2\2\2\u0083\u0085\7/\2\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\t\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u0091\3\2\2\2\u008b\u008d\7\60\2\2\u008c\u008e\t\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\34\3\2\2\2\u0093\u0097\t\3\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2"+
		"\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\36"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\t\5\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\b\20\7\2\u00a0 \3\2\2\2\u00a1\u00a2\t\6\2\2\u00a2\"\3"+
		"\2\2\2\u00a3\u00a4\t\7\2\2\u00a4$\3\2\2\2\u00a5\u00a6\t\b\2\2\u00a6&\3"+
		"\2\2\2\u00a7\u00a8\t\t\2\2\u00a8(\3\2\2\2\u00a9\u00aa\t\n\2\2\u00aa*\3"+
		"\2\2\2\u00ab\u00ac\t\13\2\2\u00ac,\3\2\2\2\u00ad\u00ae\t\f\2\2\u00ae."+
		"\3\2\2\2\u00af\u00b0\t\r\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\t\16\2\2\u00b2"+
		"\62\3\2\2\2\u00b3\u00b4\t\17\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\t\20\2\2"+
		"\u00b6\66\3\2\2\2\u00b7\u00b8\t\21\2\2\u00b88\3\2\2\2\u00b9\u00ba\t\22"+
		"\2\2\u00ba:\3\2\2\2\u00bb\u00bc\t\23\2\2\u00bc<\3\2\2\2\u00bd\u00be\t"+
		"\24\2\2\u00be>\3\2\2\2\u00bf\u00c0\t\25\2\2\u00c0@\3\2\2\2\u00c1\u00c2"+
		"\t\26\2\2\u00c2B\3\2\2\2\u00c3\u00c4\t\27\2\2\u00c4D\3\2\2\2\u00c5\u00c6"+
		"\t\30\2\2\u00c6F\3\2\2\2\u00c7\u00c8\t\31\2\2\u00c8H\3\2\2\2\u00c9\u00ca"+
		"\t\32\2\2\u00caJ\3\2\2\2\u00cb\u00cc\t\33\2\2\u00ccL\3\2\2\2\u00cd\u00ce"+
		"\t\34\2\2\u00ceN\3\2\2\2\u00cf\u00d0\t\35\2\2\u00d0P\3\2\2\2\u00d1\u00d2"+
		"\t\36\2\2\u00d2R\3\2\2\2\u00d3\u00d4\t\37\2\2\u00d4T\3\2\2\2\t\2\u0084"+
		"\u0089\u008f\u0091\u0097\u009d\b\3\7\2\3\b\3\3\t\4\3\n\5\3\13\6\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}