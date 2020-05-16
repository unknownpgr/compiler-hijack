// Generated from Hijack.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, OP_UNI_1=9, 
		OP_BIN_1=10, OP_BIN_2=11, OP_BIN_3=12, OP_UNI_3=13, ID=14, INT=15, FLOAT=16, 
		WS=17, COMMENT_LINE=18, COMMENT_BLOCK=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "OP_UNI_1", 
		"OP_BIN_1", "OP_BIN_2", "OP_BIN_3", "OP_UNI_3", "ID", "INT", "FLOAT", 
		"WS", "COMMENT_LINE", "COMMENT_BLOCK"
	};


	public HijackLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hijack.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\5\17K\n\17\3\17\7\17N\n\17\f\17\16\17Q\13\17\3"+
		"\20\3\20\3\20\7\20V\n\20\f\20\16\20Y\13\20\5\20[\n\20\3\21\3\21\3\21\7"+
		"\21`\n\21\f\21\16\21c\13\21\3\21\3\21\6\21g\n\21\r\21\16\21h\5\21k\n\21"+
		"\3\22\6\22n\n\22\r\22\16\22o\3\22\3\22\3\23\3\23\3\23\3\23\7\23x\n\23"+
		"\f\23\16\23{\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0083\n\24\f\24"+
		"\16\24\u0086\13\24\3\24\3\24\3\24\3\24\3\24\3\u0084\2\25\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25\3\2\r\4\2##\u0080\u0080\6\2\'(,,\61\61``\5\2--//~~\4\2--//\5"+
		"\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\""+
		"\4\2\f\f\17\17\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2\2"+
		"\7/\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2"+
		"\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35J\3"+
		"\2\2\2\37Z\3\2\2\2!j\3\2\2\2#m\3\2\2\2%s\3\2\2\2\'~\3\2\2\2)*\7k\2\2*"+
		"+\7p\2\2+,\7v\2\2,\4\3\2\2\2-.\7*\2\2.\6\3\2\2\2/\60\7h\2\2\60\61\7n\2"+
		"\2\61\62\7q\2\2\62\63\7c\2\2\63\64\7v\2\2\64\b\3\2\2\2\65\66\7+\2\2\66"+
		"\n\3\2\2\2\678\7=\2\28\f\3\2\2\29:\7}\2\2:\16\3\2\2\2;<\7.\2\2<\20\3\2"+
		"\2\2=>\7\177\2\2>\22\3\2\2\2?@\t\2\2\2@\24\3\2\2\2AB\t\3\2\2B\26\3\2\2"+
		"\2CD\t\4\2\2D\30\3\2\2\2EF\7?\2\2F\32\3\2\2\2GH\t\5\2\2H\34\3\2\2\2IK"+
		"\t\6\2\2JI\3\2\2\2KO\3\2\2\2LN\t\7\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2O"+
		"P\3\2\2\2P\36\3\2\2\2QO\3\2\2\2R[\7\62\2\2SW\t\b\2\2TV\t\t\2\2UT\3\2\2"+
		"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2ZS\3\2\2"+
		"\2[ \3\2\2\2\\]\5\37\20\2]a\t\n\2\2^`\t\t\2\2_^\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2bk\3\2\2\2ca\3\2\2\2df\t\n\2\2eg\t\t\2\2fe\3\2\2\2gh\3"+
		"\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2j\\\3\2\2\2jd\3\2\2\2k\"\3\2\2\2l"+
		"n\t\13\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\22\2"+
		"\2r$\3\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2vx\n\f\2\2wv\3\2\2\2x{\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\b\23\2\2}&\3\2\2\2~\177"+
		"\7\61\2\2\177\u0080\7,\2\2\u0080\u0084\3\2\2\2\u0081\u0083\13\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7,\2\2\u0088"+
		"\u0089\7\61\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\24\2\2\u008b(\3\2\2"+
		"\2\16\2JMOWZahjoy\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}