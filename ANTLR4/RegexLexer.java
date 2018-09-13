// Generated from Regex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OCTAL=1, HEX=2, TAB=3, LF=4, CR=5, OTH_ESC=6, DEFINED_CH=7, BOUNDARY=8, 
		ANDAND=9, AND=10, COLON=11, COMMA=12, SEMI=13, LPAREN=14, RPAREN=15, LBRACE=16, 
		RBRACE=17, LBRACK=18, RBRACK=19, LT=20, GT=21, EQUAL=22, QUESTION=23, 
		STAR=24, SLASH=25, PLUS=26, MINUS=27, OR=28, DOLLAR=29, DOT=30, TLIDE=31, 
		ESC=32, CARET=33, EXCLA=34, WS=35, ALPHABET=36, NUMBER=37, OTHER_SYMBOL=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"HEX_DIGIT", "OCTAL", "HEX", "TAB", "LF", "CR", "OTH_ESC", "DEFINED_CH", 
		"BOUNDARY", "ANDAND", "AND", "COLON", "COMMA", "SEMI", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "LT", "GT", "EQUAL", "QUESTION", 
		"STAR", "SLASH", "PLUS", "MINUS", "OR", "DOLLAR", "DOT", "TLIDE", "ESC", 
		"CARET", "EXCLA", "WS", "ALPHABET", "NUMBER", "OTHER_SYMBOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\\t'", "'\\n'", "'\\r'", null, null, null, "'&&'", 
		"'&'", "':'", "','", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"'<'", "'>'", "'='", "'?'", "'*'", "'/'", "'+'", "'-'", "'|'", "'$'", 
		"'.'", "'~'", "'\\'", "'^'", "'!'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OCTAL", "HEX", "TAB", "LF", "CR", "OTH_ESC", "DEFINED_CH", "BOUNDARY", 
		"ANDAND", "AND", "COLON", "COMMA", "SEMI", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "LT", "GT", "EQUAL", "QUESTION", "STAR", 
		"SLASH", "PLUS", "MINUS", "OR", "DOLLAR", "DOT", "TLIDE", "ESC", "CARET", 
		"EXCLA", "WS", "ALPHABET", "NUMBER", "OTHER_SYMBOL"
	};
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


	public RegexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Regex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3X\n\3\3\3\5\3[\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\2\2)\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25"+
		"\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31"+
		"\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(\3\2\13\5\2\62;CHch"+
		"\3\2\62\65\3\2\629\4\2ccgh\n\2FFJJUUXYffjjuuxy\7\2CDII\\\\cd||\4\2C\\"+
		"c|\3\2\62;\t\2$%\')\61\61>>@@BBab\2\u00be\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7l\3\2\2\2\tn\3\2\2\2\13q\3\2\2\2\rt\3\2"+
		"\2\2\17w\3\2\2\2\21z\3\2\2\2\23}\3\2\2\2\25\u0080\3\2\2\2\27\u0083\3\2"+
		"\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2"+
		"\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095"+
		"\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2/\u009b\3\2\2\2\61\u009d\3\2\2\2"+
		"\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00a5\3\2\2\2;\u00a7"+
		"\3\2\2\2=\u00a9\3\2\2\2?\u00ab\3\2\2\2A\u00ad\3\2\2\2C\u00af\3\2\2\2E"+
		"\u00b1\3\2\2\2G\u00b3\3\2\2\2I\u00b5\3\2\2\2K\u00b7\3\2\2\2M\u00b9\3\2"+
		"\2\2O\u00bb\3\2\2\2QR\t\2\2\2R\4\3\2\2\2ST\7^\2\2TU\7\62\2\2UW\3\2\2\2"+
		"VX\t\3\2\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\t\4\2\2ZY\3\2\2\2Z[\3\2\2\2"+
		"[\\\3\2\2\2\\]\t\4\2\2]\6\3\2\2\2^_\7^\2\2_`\7z\2\2`a\3\2\2\2ab\5\3\2"+
		"\2bc\5\3\2\2cm\3\2\2\2de\7^\2\2ef\7w\2\2fg\3\2\2\2gh\5\3\2\2hi\5\3\2\2"+
		"ij\5\3\2\2jk\5\3\2\2km\3\2\2\2l^\3\2\2\2ld\3\2\2\2m\b\3\2\2\2no\7^\2\2"+
		"op\7v\2\2p\n\3\2\2\2qr\7^\2\2rs\7p\2\2s\f\3\2\2\2tu\7^\2\2uv\7t\2\2v\16"+
		"\3\2\2\2wx\7^\2\2xy\t\5\2\2y\20\3\2\2\2z{\7^\2\2{|\t\6\2\2|\22\3\2\2\2"+
		"}~\7^\2\2~\177\t\7\2\2\177\24\3\2\2\2\u0080\u0081\7(\2\2\u0081\u0082\7"+
		"(\2\2\u0082\26\3\2\2\2\u0083\u0084\7(\2\2\u0084\30\3\2\2\2\u0085\u0086"+
		"\7<\2\2\u0086\32\3\2\2\2\u0087\u0088\7.\2\2\u0088\34\3\2\2\2\u0089\u008a"+
		"\7=\2\2\u008a\36\3\2\2\2\u008b\u008c\7*\2\2\u008c \3\2\2\2\u008d\u008e"+
		"\7+\2\2\u008e\"\3\2\2\2\u008f\u0090\7}\2\2\u0090$\3\2\2\2\u0091\u0092"+
		"\7\177\2\2\u0092&\3\2\2\2\u0093\u0094\7]\2\2\u0094(\3\2\2\2\u0095\u0096"+
		"\7_\2\2\u0096*\3\2\2\2\u0097\u0098\7>\2\2\u0098,\3\2\2\2\u0099\u009a\7"+
		"@\2\2\u009a.\3\2\2\2\u009b\u009c\7?\2\2\u009c\60\3\2\2\2\u009d\u009e\7"+
		"A\2\2\u009e\62\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\64\3\2\2\2\u00a1\u00a2"+
		"\7\61\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7-\2\2\u00a48\3\2\2\2\u00a5\u00a6"+
		"\7/\2\2\u00a6:\3\2\2\2\u00a7\u00a8\7~\2\2\u00a8<\3\2\2\2\u00a9\u00aa\7"+
		"&\2\2\u00aa>\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac@\3\2\2\2\u00ad\u00ae\7"+
		"\u0080\2\2\u00aeB\3\2\2\2\u00af\u00b0\7^\2\2\u00b0D\3\2\2\2\u00b1\u00b2"+
		"\7`\2\2\u00b2F\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4H\3\2\2\2\u00b5\u00b6\7"+
		"\"\2\2\u00b6J\3\2\2\2\u00b7\u00b8\t\b\2\2\u00b8L\3\2\2\2\u00b9\u00ba\t"+
		"\t\2\2\u00baN\3\2\2\2\u00bb\u00bc\t\n\2\2\u00bcP\3\2\2\2\6\2WZl\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}