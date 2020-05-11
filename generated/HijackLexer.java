// Generated from Hijack.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HijackLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OP_UNI_1=9, 
		OP_BIN_1=10, OP_BIN_2=11, OP_BIN_3=12, OP_UNI_3=13, ID=14, INT=15, FLOAT=16, 
		WS=17, COMMENT_LINE=18, COMMENT_BLOCK=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "OP_UNI_1", 
			"OP_BIN_1", "OP_BIN_2", "OP_BIN_3", "OP_UNI_3", "ID", "INT", "FLOAT", 
			"WS", "COMMENT_LINE", "COMMENT_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "';'", "'int'", "'float'", null, 
			null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "OP_UNI_1", "OP_BIN_1", 
			"OP_BIN_2", "OP_BIN_3", "OP_UNI_3", "ID", "INT", "FLOAT", "WS", "COMMENT_LINE", 
			"COMMENT_BLOCK"
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


	public HijackLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hijack.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\5\17K\n\17\3\17\7\17N\n\17\f\17\16\17Q\13\17\3"+
		"\20\3\20\7\20U\n\20\f\20\16\20X\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21c\n\21\3\22\6\22f\n\22\r\22\16\22g\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\7\23p\n\23\f\23\16\23s\13\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\7\24{\n\24\f\24\16\24~\13\24\3\24\3\24\3\24\3\24\3\24\3|\2\25\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25\3\2\r\4\2##\u0080\u0080\6\2\'(,,\61\61``\5\2--//~~\4"+
		"\2--//\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2\60\60\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\2\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5"+
		"+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2"+
		"\2\219\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33G\3\2"+
		"\2\2\35J\3\2\2\2\37R\3\2\2\2!b\3\2\2\2#e\3\2\2\2%k\3\2\2\2\'v\3\2\2\2"+
		")*\7*\2\2*\4\3\2\2\2+,\7+\2\2,\6\3\2\2\2-.\7}\2\2.\b\3\2\2\2/\60\7\177"+
		"\2\2\60\n\3\2\2\2\61\62\7.\2\2\62\f\3\2\2\2\63\64\7=\2\2\64\16\3\2\2\2"+
		"\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\28\20\3\2\2\29:\7h\2\2:;\7n\2\2;<"+
		"\7q\2\2<=\7c\2\2=>\7v\2\2>\22\3\2\2\2?@\t\2\2\2@\24\3\2\2\2AB\t\3\2\2"+
		"B\26\3\2\2\2CD\t\4\2\2D\30\3\2\2\2EF\7?\2\2F\32\3\2\2\2GH\t\5\2\2H\34"+
		"\3\2\2\2IK\t\6\2\2JI\3\2\2\2KO\3\2\2\2LN\t\7\2\2ML\3\2\2\2NQ\3\2\2\2O"+
		"M\3\2\2\2OP\3\2\2\2P\36\3\2\2\2QO\3\2\2\2RV\t\b\2\2SU\t\t\2\2TS\3\2\2"+
		"\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W \3\2\2\2XV\3\2\2\2YZ\5\37\20\2Z[\t\n"+
		"\2\2[c\3\2\2\2\\]\5\37\20\2]^\t\n\2\2^_\5\37\20\2_c\3\2\2\2`a\t\n\2\2"+
		"ac\5\37\20\2bY\3\2\2\2b\\\3\2\2\2b`\3\2\2\2c\"\3\2\2\2df\t\13\2\2ed\3"+
		"\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\22\2\2j$\3\2\2\2kl"+
		"\7\61\2\2lm\7\61\2\2mq\3\2\2\2np\n\f\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\b\23\2\2u&\3\2\2\2vw\7\61\2\2wx\7,\2"+
		"\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3"+
		"\2\2\2~|\3\2\2\2\177\u0080\7,\2\2\u0080\u0081\7\61\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\b\24\2\2\u0083(\3\2\2\2\13\2JMOVbgq|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}