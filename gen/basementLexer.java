// Generated from /home/laura/IdeaProjects/basement_infra/grammar/basement.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class basementLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, NUMBER=16, REMOVE_TK=17, 
		SET_TK=18, PERFORM_TK=19, DEPLOY_TK=20, BASEMNT_LIST=21, STRING=22, CURLY_L_TK=23, 
		CURLY_R_TK=24, KEY_VAL_TK=25, FLAG_TOKEN=26, IMAGE_TYPE_TK=27, CREATE_TK=28, 
		COMMA_TK=29, SPACE=30, PORT_TK=31, ENVIRONMENT_TK=32, LINK_TK=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ID", "NUMBER", "REMOVE_TK", 
			"SET_TK", "PERFORM_TK", "DEPLOY_TK", "BASEMNT_LIST", "STRING", "CURLY_L_TK", 
			"CURLY_R_TK", "KEY_VAL_TK", "FLAG_TOKEN", "IMAGE_TYPE_TK", "CREATE_TK", 
			"COMMA_TK", "SPACE", "PORT_TK", "ENVIRONMENT_TK", "LINK_TK", "WS", "ESC", 
			"UNICODE", "HEX", "SAFECODEPOINT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'POSTGRES_USER'", "'POSTGRES_PASSWORD'", "'POSTGRES_DB'", "'MONGO_DB'", 
			"'directory'", "'command'", "'down '", "'up '", "'running'", "'all'", 
			"'exited'", "'postgres'", "'mongo'", "'nginx'", null, null, "'remove '", 
			"'set-'", "'perform '", "'deploy '", "'basement-list'", null, "'{'", 
			"'}'", "':'", "'flag '", "'image-type'", "'creation-time'", "','", "' '", 
			"'port '", "'env '", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NUMBER", "REMOVE_TK", "SET_TK", "PERFORM_TK", 
			"DEPLOY_TK", "BASEMNT_LIST", "STRING", "CURLY_L_TK", "CURLY_R_TK", "KEY_VAL_TK", 
			"FLAG_TOKEN", "IMAGE_TYPE_TK", "CREATE_TK", "COMMA_TK", "SPACE", "PORT_TK", 
			"ENVIRONMENT_TK", "LINK_TK", "WS"
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


	public basementLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "basement.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00ca"+
		"\n\20\r\20\16\20\u00cb\3\20\7\20\u00cf\n\20\f\20\16\20\u00d2\13\20\3\21"+
		"\6\21\u00d5\n\21\r\21\16\21\u00d6\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0108"+
		"\n\27\f\27\16\27\u010b\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3#\6#\u0148\n#\r#\16#\u0149\3#\3#\3$\3$\3$\5$\u0151\n"+
		"$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K\2M\2\3\2\b\3\2"+
		"C|\3\2\62;\4\2\13\f\17\17\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$"+
		"$^^\2\u015f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\3O\3\2\2\2\5]\3\2\2\2\7o\3\2\2\2\t{\3\2\2\2\13\u0084\3\2\2\2\r\u008e"+
		"\3\2\2\2\17\u0096\3\2\2\2\21\u009c\3\2\2\2\23\u00a0\3\2\2\2\25\u00a8\3"+
		"\2\2\2\27\u00ac\3\2\2\2\31\u00b3\3\2\2\2\33\u00bc\3\2\2\2\35\u00c2\3\2"+
		"\2\2\37\u00d0\3\2\2\2!\u00d4\3\2\2\2#\u00d8\3\2\2\2%\u00e0\3\2\2\2\'\u00e5"+
		"\3\2\2\2)\u00ee\3\2\2\2+\u00f6\3\2\2\2-\u0104\3\2\2\2/\u010e\3\2\2\2\61"+
		"\u0110\3\2\2\2\63\u0112\3\2\2\2\65\u0114\3\2\2\2\67\u011a\3\2\2\29\u0125"+
		"\3\2\2\2;\u0133\3\2\2\2=\u0135\3\2\2\2?\u0139\3\2\2\2A\u013f\3\2\2\2C"+
		"\u0144\3\2\2\2E\u0147\3\2\2\2G\u014d\3\2\2\2I\u0152\3\2\2\2K\u0158\3\2"+
		"\2\2M\u015a\3\2\2\2OP\7R\2\2PQ\7Q\2\2QR\7U\2\2RS\7V\2\2ST\7I\2\2TU\7T"+
		"\2\2UV\7G\2\2VW\7U\2\2WX\7a\2\2XY\7W\2\2YZ\7U\2\2Z[\7G\2\2[\\\7T\2\2\\"+
		"\4\3\2\2\2]^\7R\2\2^_\7Q\2\2_`\7U\2\2`a\7V\2\2ab\7I\2\2bc\7T\2\2cd\7G"+
		"\2\2de\7U\2\2ef\7a\2\2fg\7R\2\2gh\7C\2\2hi\7U\2\2ij\7U\2\2jk\7Y\2\2kl"+
		"\7Q\2\2lm\7T\2\2mn\7F\2\2n\6\3\2\2\2op\7R\2\2pq\7Q\2\2qr\7U\2\2rs\7V\2"+
		"\2st\7I\2\2tu\7T\2\2uv\7G\2\2vw\7U\2\2wx\7a\2\2xy\7F\2\2yz\7D\2\2z\b\3"+
		"\2\2\2{|\7O\2\2|}\7Q\2\2}~\7P\2\2~\177\7I\2\2\177\u0080\7Q\2\2\u0080\u0081"+
		"\7a\2\2\u0081\u0082\7F\2\2\u0082\u0083\7D\2\2\u0083\n\3\2\2\2\u0084\u0085"+
		"\7f\2\2\u0085\u0086\7k\2\2\u0086\u0087\7t\2\2\u0087\u0088\7g\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7v\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2"+
		"\u008c\u008d\7{\2\2\u008d\f\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090\7q"+
		"\2\2\u0090\u0091\7o\2\2\u0091\u0092\7o\2\2\u0092\u0093\7c\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7f\2\2\u0095\16\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7y\2\2\u0099\u009a\7p\2\2\u009a\u009b\7\"\2\2\u009b"+
		"\20\3\2\2\2\u009c\u009d\7w\2\2\u009d\u009e\7r\2\2\u009e\u009f\7\"\2\2"+
		"\u009f\22\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7"+
		"p\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7i\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab"+
		"\7n\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7z\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7f\2\2\u00b2"+
		"\30\3\2\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7i\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\u00bb\7u\2\2\u00bb\32\3\2\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7"+
		"q\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7q\2\2\u00c1\34"+
		"\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7i\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7z\2\2\u00c7\36\3\2\2\2\u00c8\u00ca\t\2\2\2"+
		"\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\7/\2\2\u00ce\u00c9\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1 \3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\t\3\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\"\3\2\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7o\2\2\u00db"+
		"\u00dc\7q\2\2\u00dc\u00dd\7x\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7\"\2"+
		"\2\u00df$\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7"+
		"v\2\2\u00e3\u00e4\7/\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\u00ec\7o\2\2\u00ec\u00ed\7\"\2\2\u00ed(\3\2\2\2\u00ee"+
		"\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7n\2\2"+
		"\u00f2\u00f3\7q\2\2\u00f3\u00f4\7{\2\2\u00f4\u00f5\7\"\2\2\u00f5*\3\2"+
		"\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7o\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd"+
		"\u00fe\7v\2\2\u00fe\u00ff\7/\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7k\2\2"+
		"\u0101\u0102\7u\2\2\u0102\u0103\7v\2\2\u0103,\3\2\2\2\u0104\u0109\7$\2"+
		"\2\u0105\u0108\5G$\2\u0106\u0108\5M\'\2\u0107\u0105\3\2\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7$\2\2\u010d.\3\2\2\2\u010e"+
		"\u010f\7}\2\2\u010f\60\3\2\2\2\u0110\u0111\7\177\2\2\u0111\62\3\2\2\2"+
		"\u0112\u0113\7<\2\2\u0113\64\3\2\2\2\u0114\u0115\7h\2\2\u0115\u0116\7"+
		"n\2\2\u0116\u0117\7c\2\2\u0117\u0118\7i\2\2\u0118\u0119\7\"\2\2\u0119"+
		"\66\3\2\2\2\u011a\u011b\7k\2\2\u011b\u011c\7o\2\2\u011c\u011d\7c\2\2\u011d"+
		"\u011e\7i\2\2\u011e\u011f\7g\2\2\u011f\u0120\7/\2\2\u0120\u0121\7v\2\2"+
		"\u0121\u0122\7{\2\2\u0122\u0123\7r\2\2\u0123\u0124\7g\2\2\u01248\3\2\2"+
		"\2\u0125\u0126\7e\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7v\2\2\u012a\u012b\7k\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7p\2\2\u012d\u012e\7/\2\2\u012e\u012f\7v\2\2\u012f\u0130\7k\2\2"+
		"\u0130\u0131\7o\2\2\u0131\u0132\7g\2\2\u0132:\3\2\2\2\u0133\u0134\7.\2"+
		"\2\u0134<\3\2\2\2\u0135\u0136\7\"\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\b\37\2\2\u0138>\3\2\2\2\u0139\u013a\7r\2\2\u013a\u013b\7q\2\2\u013b\u013c"+
		"\7t\2\2\u013c\u013d\7v\2\2\u013d\u013e\7\"\2\2\u013e@\3\2\2\2\u013f\u0140"+
		"\7g\2\2\u0140\u0141\7p\2\2\u0141\u0142\7x\2\2\u0142\u0143\7\"\2\2\u0143"+
		"B\3\2\2\2\u0144\u0145\7/\2\2\u0145D\3\2\2\2\u0146\u0148\t\4\2\2\u0147"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b#\2\2\u014cF\3\2\2\2\u014d\u0150"+
		"\7^\2\2\u014e\u0151\t\5\2\2\u014f\u0151\5I%\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151H\3\2\2\2\u0152\u0153\7w\2\2\u0153\u0154\5K&\2\u0154"+
		"\u0155\5K&\2\u0155\u0156\5K&\2\u0156\u0157\5K&\2\u0157J\3\2\2\2\u0158"+
		"\u0159\t\6\2\2\u0159L\3\2\2\2\u015a\u015b\n\7\2\2\u015bN\3\2\2\2\13\2"+
		"\u00cb\u00ce\u00d0\u00d6\u0107\u0109\u0149\u0150\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}