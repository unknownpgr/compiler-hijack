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
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, STRING=27, ID=28, INT=29, FLOAT=30, WS=31, COMMENT_LINE=32, 
		COMMENT_BLOCK=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "STRING", "ID", "INT", "FLOAT", "WS", "COMMENT_LINE", "COMMENT_BLOCK"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00d7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\6\34"+
		"\u008f\n\34\r\34\16\34\u0090\3\34\3\34\3\35\5\35\u0096\n\35\3\35\7\35"+
		"\u0099\n\35\f\35\16\35\u009c\13\35\3\36\3\36\3\36\7\36\u00a1\n\36\f\36"+
		"\16\36\u00a4\13\36\5\36\u00a6\n\36\3\37\3\37\3\37\7\37\u00ab\n\37\f\37"+
		"\16\37\u00ae\13\37\3\37\3\37\6\37\u00b2\n\37\r\37\16\37\u00b3\5\37\u00b6"+
		"\n\37\3 \6 \u00b9\n \r \16 \u00ba\3 \3 \3!\3!\3!\3!\7!\u00c3\n!\f!\16"+
		"!\u00c6\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00ce\n\"\f\"\16\"\u00d1\13\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\u00cf\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\n\4\2$$``\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\63;\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00e0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2"+
		"\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rV\3\2\2\2\17X\3\2\2\2\21Z\3\2\2"+
		"\2\23]\3\2\2\2\25`\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2"+
		"\2\2\37l\3\2\2\2!o\3\2\2\2#q\3\2\2\2%t\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+z"+
		"\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2\2\61\u0086\3\2\2\2\63\u0088\3\2\2\2"+
		"\65\u008a\3\2\2\2\67\u008c\3\2\2\29\u0095\3\2\2\2;\u00a5\3\2\2\2=\u00b5"+
		"\3\2\2\2?\u00b8\3\2\2\2A\u00be\3\2\2\2C\u00c9\3\2\2\2EF\7\61\2\2F\4\3"+
		"\2\2\2GH\7h\2\2HI\7n\2\2IJ\7q\2\2JK\7c\2\2KL\7v\2\2L\6\3\2\2\2MN\7=\2"+
		"\2N\b\3\2\2\2OP\7}\2\2P\n\3\2\2\2QR\7x\2\2RS\7q\2\2ST\7k\2\2TU\7f\2\2"+
		"U\f\3\2\2\2VW\7?\2\2W\16\3\2\2\2XY\7\177\2\2Y\20\3\2\2\2Z[\7k\2\2[\\\7"+
		"h\2\2\\\22\3\2\2\2]^\7>\2\2^_\7?\2\2_\24\3\2\2\2`a\7k\2\2ab\7p\2\2bc\7"+
		"v\2\2c\26\3\2\2\2de\7*\2\2e\30\3\2\2\2fg\7,\2\2g\32\3\2\2\2hi\7.\2\2i"+
		"\34\3\2\2\2jk\7\60\2\2k\36\3\2\2\2lm\7@\2\2mn\7?\2\2n \3\2\2\2op\7]\2"+
		"\2p\"\3\2\2\2qr\7?\2\2rs\7?\2\2s$\3\2\2\2tu\7>\2\2u&\3\2\2\2vw\7_\2\2"+
		"w(\3\2\2\2xy\7@\2\2y*\3\2\2\2z{\7d\2\2{|\7q\2\2|}\7q\2\2}~\7n\2\2~,\3"+
		"\2\2\2\177\u0080\7#\2\2\u0080.\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\60\3\2\2\2\u0086\u0087"+
		"\7+\2\2\u0087\62\3\2\2\2\u0088\u0089\7-\2\2\u0089\64\3\2\2\2\u008a\u008b"+
		"\7/\2\2\u008b\66\3\2\2\2\u008c\u008e\7$\2\2\u008d\u008f\t\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7$\2\2\u00938\3\2\2\2\u0094\u0096"+
		"\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u009a\3\2\2\2\u0097\u0099\t\4\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b:\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a6\7\62\2\2\u009e\u00a2"+
		"\t\5\2\2\u009f\u00a1\t\6\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6<\3\2\2\2\u00a7\u00a8"+
		"\5;\36\2\u00a8\u00ac\t\7\2\2\u00a9\u00ab\t\6\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b6\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\t\7\2\2\u00b0\u00b2\t\6\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00a7\3\2\2\2\u00b5\u00af\3\2\2\2\u00b6"+
		">\3\2\2\2\u00b7\u00b9\t\b\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\b \2\2\u00bd@\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0\7\61\2\2\u00c0"+
		"\u00c4\3\2\2\2\u00c1\u00c3\n\t\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\b!\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7\61\2\2"+
		"\u00ca\u00cb\7,\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\13\2\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d4\7\61"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\"\2\2\u00d6D\3\2\2\2\17\2\u0090"+
		"\u0095\u0098\u009a\u00a2\u00a5\u00ac\u00b3\u00b5\u00ba\u00c4\u00cf\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}