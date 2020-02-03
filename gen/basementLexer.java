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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, POSTGRES_ENV_TK=8, 
		MONGO_ENV_TK=9, MYSQL_ENV_TK=10, PERFORM_TK=11, SET_TK=12, UP_TK=13, DOWN_TK=14, 
		DEPLOY_TK=15, TRUE_TK=16, FALSE_TK=17, DETACHED_TK=18, BASEMNT_LIST=19, 
		DIR_TK=20, RUNNING_TK=21, COMMAND_TK=22, REMOVE_TK=23, ALL_TK=24, EXITED_TK=25, 
		FLAG_TOKEN=26, IMAGE_TYPE_TK=27, CREATE_TK=28, STATUS_TK=29, PORT_TK=30, 
		ENVIRONMENT_TK=31, ID=32, CURLY_L_TK=33, CURLY_R_TK=34, KEY_VAL_TK=35, 
		COMMA_TK=36, STRING=37, NUMBER=38, SPACE=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "POSTGRES_ENV_TK", 
			"MONGO_ENV_TK", "MYSQL_ENV_TK", "PERFORM_TK", "SET_TK", "UP_TK", "DOWN_TK", 
			"DEPLOY_TK", "TRUE_TK", "FALSE_TK", "DETACHED_TK", "BASEMNT_LIST", "DIR_TK", 
			"RUNNING_TK", "COMMAND_TK", "REMOVE_TK", "ALL_TK", "EXITED_TK", "FLAG_TOKEN", 
			"IMAGE_TYPE_TK", "CREATE_TK", "STATUS_TK", "PORT_TK", "ENVIRONMENT_TK", 
			"ID", "CURLY_L_TK", "CURLY_R_TK", "KEY_VAL_TK", "COMMA_TK", "STRING", 
			"NUMBER", "SPACE", "WS", "ESC", "UNICODE", "HEX", "SAFECODEPOINT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'postgres'", "'mongo'", "'nginx'", "'django'", "'rabbitmq'", "'mysql'", 
			"'timescale/timescaledb:latest-pg11'", null, null, null, "'perform '", 
			"'set'", "'up'", "'down'", "'deploy'", "'True'", "'False'", "'detached'", 
			"'basement-list'", "'directory'", "'running'", "'command'", "'remove'", 
			"'all'", "'exited'", "'flag'", "'image-type'", "'creation-time'", "'status'", 
			"'port'", "'environment'", null, "'{'", "'}'", "':'", "','", null, null, 
			"' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "POSTGRES_ENV_TK", "MONGO_ENV_TK", 
			"MYSQL_ENV_TK", "PERFORM_TK", "SET_TK", "UP_TK", "DOWN_TK", "DEPLOY_TK", 
			"TRUE_TK", "FALSE_TK", "DETACHED_TK", "BASEMNT_LIST", "DIR_TK", "RUNNING_TK", 
			"COMMAND_TK", "REMOVE_TK", "ALL_TK", "EXITED_TK", "FLAG_TOKEN", "IMAGE_TYPE_TK", 
			"CREATE_TK", "STATUS_TK", "PORT_TK", "ENVIRONMENT_TK", "ID", "CURLY_L_TK", 
			"CURLY_R_TK", "KEY_VAL_TK", "COMMA_TK", "STRING", "NUMBER", "SPACE", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0213\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d2"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0130\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\6!\u01d3\n!\r!\16!\u01d4"+
		"\3!\6!\u01d8\n!\r!\16!\u01d9\3!\6!\u01dd\n!\r!\16!\u01de\5!\u01e1\n!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\7&\u01ee\n&\f&\16&\u01f1\13&\3&\3&\3"+
		"\'\6\'\u01f6\n\'\r\'\16\'\u01f7\3(\3(\3(\3(\3)\6)\u01ff\n)\r)\16)\u0200"+
		"\3)\3)\3*\3*\3*\5*\u0208\n*\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\2\2.\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2\3\2\b\4\2C\\c|\3\2\62;\4\2\13\f\17\17\n\2"+
		"$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\2\u021e\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3[\3\2\2\2\5d\3\2\2\2\7j\3\2\2"+
		"\2\tp\3\2\2\2\13w\3\2\2\2\r\u0080\3\2\2\2\17\u0086\3\2\2\2\21\u00d1\3"+
		"\2\2\2\23\u00d3\3\2\2\2\25\u012f\3\2\2\2\27\u0131\3\2\2\2\31\u013a\3\2"+
		"\2\2\33\u013e\3\2\2\2\35\u0141\3\2\2\2\37\u0146\3\2\2\2!\u014d\3\2\2\2"+
		"#\u0152\3\2\2\2%\u0158\3\2\2\2\'\u0161\3\2\2\2)\u016f\3\2\2\2+\u0179\3"+
		"\2\2\2-\u0181\3\2\2\2/\u0189\3\2\2\2\61\u0190\3\2\2\2\63\u0194\3\2\2\2"+
		"\65\u019b\3\2\2\2\67\u01a0\3\2\2\29\u01ab\3\2\2\2;\u01b9\3\2\2\2=\u01c0"+
		"\3\2\2\2?\u01c5\3\2\2\2A\u01e0\3\2\2\2C\u01e2\3\2\2\2E\u01e4\3\2\2\2G"+
		"\u01e6\3\2\2\2I\u01e8\3\2\2\2K\u01ea\3\2\2\2M\u01f5\3\2\2\2O\u01f9\3\2"+
		"\2\2Q\u01fe\3\2\2\2S\u0204\3\2\2\2U\u0209\3\2\2\2W\u020f\3\2\2\2Y\u0211"+
		"\3\2\2\2[\\\7r\2\2\\]\7q\2\2]^\7u\2\2^_\7v\2\2_`\7i\2\2`a\7t\2\2ab\7g"+
		"\2\2bc\7u\2\2c\4\3\2\2\2de\7o\2\2ef\7q\2\2fg\7p\2\2gh\7i\2\2hi\7q\2\2"+
		"i\6\3\2\2\2jk\7p\2\2kl\7i\2\2lm\7k\2\2mn\7p\2\2no\7z\2\2o\b\3\2\2\2pq"+
		"\7f\2\2qr\7l\2\2rs\7c\2\2st\7p\2\2tu\7i\2\2uv\7q\2\2v\n\3\2\2\2wx\7t\2"+
		"\2xy\7c\2\2yz\7d\2\2z{\7d\2\2{|\7k\2\2|}\7v\2\2}~\7o\2\2~\177\7s\2\2\177"+
		"\f\3\2\2\2\u0080\u0081\7o\2\2\u0081\u0082\7{\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7s\2\2\u0084\u0085\7n\2\2\u0085\16\3\2\2\2\u0086\u0087\7v\2\2\u0087"+
		"\u0088\7k\2\2\u0088\u0089\7o\2\2\u0089\u008a\7g\2\2\u008a\u008b\7u\2\2"+
		"\u008b\u008c\7e\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7v\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7o\2\2\u0093\u0094\7g\2\2\u0094\u0095\7u\2\2\u0095\u0096\7e\2\2"+
		"\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7f\2\2\u009a\u009b\7d\2\2\u009b\u009c\7<\2\2\u009c\u009d\7n\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\u00a2\7v\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5"+
		"\7i\2\2\u00a5\u00a6\7\63\2\2\u00a6\u00a7\7\63\2\2\u00a7\20\3\2\2\2\u00a8"+
		"\u00a9\7R\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7U\2\2\u00ab\u00ac\7V\2\2"+
		"\u00ac\u00ad\7I\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af\7G\2\2\u00af\u00b0"+
		"\7U\2\2\u00b0\u00b1\7a\2\2\u00b1\u00b2\7W\2\2\u00b2\u00b3\7U\2\2\u00b3"+
		"\u00b4\7G\2\2\u00b4\u00d2\7T\2\2\u00b5\u00b6\7R\2\2\u00b6\u00b7\7Q\2\2"+
		"\u00b7\u00b8\7U\2\2\u00b8\u00b9\7V\2\2\u00b9\u00ba\7I\2\2\u00ba\u00bb"+
		"\7T\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd\7U\2\2\u00bd\u00be\7a\2\2\u00be"+
		"\u00bf\7R\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c1\7U\2\2\u00c1\u00c2\7U\2\2"+
		"\u00c2\u00c3\7Y\2\2\u00c3\u00c4\7Q\2\2\u00c4\u00c5\7T\2\2\u00c5\u00d2"+
		"\7F\2\2\u00c6\u00c7\7R\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00c9\7U\2\2\u00c9"+
		"\u00ca\7V\2\2\u00ca\u00cb\7I\2\2\u00cb\u00cc\7T\2\2\u00cc\u00cd\7G\2\2"+
		"\u00cd\u00ce\7U\2\2\u00ce\u00cf\7a\2\2\u00cf\u00d0\7F\2\2\u00d0\u00d2"+
		"\7D\2\2\u00d1\u00a8\3\2\2\2\u00d1\u00b5\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d2"+
		"\22\3\2\2\2\u00d3\u00d4\7O\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7P\2\2\u00d6"+
		"\u00d7\7I\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00d9\7a\2\2\u00d9\u00da\7V\2\2"+
		"\u00da\u00db\7M\2\2\u00db\24\3\2\2\2\u00dc\u00dd\7O\2\2\u00dd\u00de\7"+
		"[\2\2\u00de\u00df\7U\2\2\u00df\u00e0\7S\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2"+
		"\7a\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4\7Q\2\2\u00e4\u00e5\7Q\2\2\u00e5"+
		"\u00e6\7V\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7R\2\2\u00e8\u00e9\7C\2\2"+
		"\u00e9\u00ea\7U\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7Y\2\2\u00ec\u00ed"+
		"\7Q\2\2\u00ed\u00ee\7T\2\2\u00ee\u0130\7F\2\2\u00ef\u00f0\7O\2\2\u00f0"+
		"\u00f1\7[\2\2\u00f1\u00f2\7U\2\2\u00f2\u00f3\7S\2\2\u00f3\u00f4\7N\2\2"+
		"\u00f4\u00f5\7a\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7\7C\2\2\u00f7\u00f8"+
		"\7V\2\2\u00f8\u00f9\7C\2\2\u00f9\u00fa\7D\2\2\u00fa\u00fb\7C\2\2\u00fb"+
		"\u00fc\7U\2\2\u00fc\u0130\7G\2\2\u00fd\u00fe\7O\2\2\u00fe\u00ff\7[\2\2"+
		"\u00ff\u0100\7U\2\2\u0100\u0101\7S\2\2\u0101\u0102\7N\2\2\u0102\u0103"+
		"\7a\2\2\u0103\u0104\7W\2\2\u0104\u0105\7U\2\2\u0105\u0106\7G\2\2\u0106"+
		"\u0130\7T\2\2\u0107\u0108\7O\2\2\u0108\u0109\7[\2\2\u0109\u010a\7U\2\2"+
		"\u010a\u010b\7S\2\2\u010b\u010c\7N\2\2\u010c\u010d\7a\2\2\u010d\u010e"+
		"\7R\2\2\u010e\u010f\7C\2\2\u010f\u0110\7U\2\2\u0110\u0111\7U\2\2\u0111"+
		"\u0112\7Y\2\2\u0112\u0113\7Q\2\2\u0113\u0114\7T\2\2\u0114\u0130\7F\2\2"+
		"\u0115\u0116\7O\2\2\u0116\u0117\7[\2\2\u0117\u0118\7U\2\2\u0118\u0119"+
		"\7S\2\2\u0119\u011a\7N\2\2\u011a\u011b\7a\2\2\u011b\u011c\7C\2\2\u011c"+
		"\u011d\7N\2\2\u011d\u011e\7N\2\2\u011e\u011f\7Q\2\2\u011f\u0120\7Y\2\2"+
		"\u0120\u0121\7a\2\2\u0121\u0122\7G\2\2\u0122\u0123\7O\2\2\u0123\u0124"+
		"\7R\2\2\u0124\u0125\7V\2\2\u0125\u0126\7[\2\2\u0126\u0127\7a\2\2\u0127"+
		"\u0128\7R\2\2\u0128\u0129\7C\2\2\u0129\u012a\7U\2\2\u012a\u012b\7U\2\2"+
		"\u012b\u012c\7Y\2\2\u012c\u012d\7Q\2\2\u012d\u012e\7T\2\2\u012e\u0130"+
		"\7F\2\2\u012f\u00dc\3\2\2\2\u012f\u00ef\3\2\2\2\u012f\u00fd\3\2\2\2\u012f"+
		"\u0107\3\2\2\2\u012f\u0115\3\2\2\2\u0130\26\3\2\2\2\u0131\u0132\7r\2\2"+
		"\u0132\u0133\7g\2\2\u0133\u0134\7t\2\2\u0134\u0135\7h\2\2\u0135\u0136"+
		"\7q\2\2\u0136\u0137\7t\2\2\u0137\u0138\7o\2\2\u0138\u0139\7\"\2\2\u0139"+
		"\30\3\2\2\2\u013a\u013b\7u\2\2\u013b\u013c\7g\2\2\u013c\u013d\7v\2\2\u013d"+
		"\32\3\2\2\2\u013e\u013f\7w\2\2\u013f\u0140\7r\2\2\u0140\34\3\2\2\2\u0141"+
		"\u0142\7f\2\2\u0142\u0143\7q\2\2\u0143\u0144\7y\2\2\u0144\u0145\7p\2\2"+
		"\u0145\36\3\2\2\2\u0146\u0147\7f\2\2\u0147\u0148\7g\2\2\u0148\u0149\7"+
		"r\2\2\u0149\u014a\7n\2\2\u014a\u014b\7q\2\2\u014b\u014c\7{\2\2\u014c "+
		"\3\2\2\2\u014d\u014e\7V\2\2\u014e\u014f\7t\2\2\u014f\u0150\7w\2\2\u0150"+
		"\u0151\7g\2\2\u0151\"\3\2\2\2\u0152\u0153\7H\2\2\u0153\u0154\7c\2\2\u0154"+
		"\u0155\7n\2\2\u0155\u0156\7u\2\2\u0156\u0157\7g\2\2\u0157$\3\2\2\2\u0158"+
		"\u0159\7f\2\2\u0159\u015a\7g\2\2\u015a\u015b\7v\2\2\u015b\u015c\7c\2\2"+
		"\u015c\u015d\7e\2\2\u015d\u015e\7j\2\2\u015e\u015f\7g\2\2\u015f\u0160"+
		"\7f\2\2\u0160&\3\2\2\2\u0161\u0162\7d\2\2\u0162\u0163\7c\2\2\u0163\u0164"+
		"\7u\2\2\u0164\u0165\7g\2\2\u0165\u0166\7o\2\2\u0166\u0167\7g\2\2\u0167"+
		"\u0168\7p\2\2\u0168\u0169\7v\2\2\u0169\u016a\7/\2\2\u016a\u016b\7n\2\2"+
		"\u016b\u016c\7k\2\2\u016c\u016d\7u\2\2\u016d\u016e\7v\2\2\u016e(\3\2\2"+
		"\2\u016f\u0170\7f\2\2\u0170\u0171\7k\2\2\u0171\u0172\7t\2\2\u0172\u0173"+
		"\7g\2\2\u0173\u0174\7e\2\2\u0174\u0175\7v\2\2\u0175\u0176\7q\2\2\u0176"+
		"\u0177\7t\2\2\u0177\u0178\7{\2\2\u0178*\3\2\2\2\u0179\u017a\7t\2\2\u017a"+
		"\u017b\7w\2\2\u017b\u017c\7p\2\2\u017c\u017d\7p\2\2\u017d\u017e\7k\2\2"+
		"\u017e\u017f\7p\2\2\u017f\u0180\7i\2\2\u0180,\3\2\2\2\u0181\u0182\7e\2"+
		"\2\u0182\u0183\7q\2\2\u0183\u0184\7o\2\2\u0184\u0185\7o\2\2\u0185\u0186"+
		"\7c\2\2\u0186\u0187\7p\2\2\u0187\u0188\7f\2\2\u0188.\3\2\2\2\u0189\u018a"+
		"\7t\2\2\u018a\u018b\7g\2\2\u018b\u018c\7o\2\2\u018c\u018d\7q\2\2\u018d"+
		"\u018e\7x\2\2\u018e\u018f\7g\2\2\u018f\60\3\2\2\2\u0190\u0191\7c\2\2\u0191"+
		"\u0192\7n\2\2\u0192\u0193\7n\2\2\u0193\62\3\2\2\2\u0194\u0195\7g\2\2\u0195"+
		"\u0196\7z\2\2\u0196\u0197\7k\2\2\u0197\u0198\7v\2\2\u0198\u0199\7g\2\2"+
		"\u0199\u019a\7f\2\2\u019a\64\3\2\2\2\u019b\u019c\7h\2\2\u019c\u019d\7"+
		"n\2\2\u019d\u019e\7c\2\2\u019e\u019f\7i\2\2\u019f\66\3\2\2\2\u01a0\u01a1"+
		"\7k\2\2\u01a1\u01a2\7o\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7i\2\2\u01a4"+
		"\u01a5\7g\2\2\u01a5\u01a6\7/\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7{\2\2"+
		"\u01a8\u01a9\7r\2\2\u01a9\u01aa\7g\2\2\u01aa8\3\2\2\2\u01ab\u01ac\7e\2"+
		"\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7c\2\2\u01af\u01b0"+
		"\7v\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7p\2\2\u01b3"+
		"\u01b4\7/\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7o\2\2"+
		"\u01b7\u01b8\7g\2\2\u01b8:\3\2\2\2\u01b9\u01ba\7u\2\2\u01ba\u01bb\7v\2"+
		"\2\u01bb\u01bc\7c\2\2\u01bc\u01bd\7v\2\2\u01bd\u01be\7w\2\2\u01be\u01bf"+
		"\7u\2\2\u01bf<\3\2\2\2\u01c0\u01c1\7r\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3"+
		"\7t\2\2\u01c3\u01c4\7v\2\2\u01c4>\3\2\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7"+
		"\7p\2\2\u01c7\u01c8\7x\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7t\2\2\u01ca"+
		"\u01cb\7q\2\2\u01cb\u01cc\7p\2\2\u01cc\u01cd\7o\2\2\u01cd\u01ce\7g\2\2"+
		"\u01ce\u01cf\7p\2\2\u01cf\u01d0\7v\2\2\u01d0@\3\2\2\2\u01d1\u01d3\t\2"+
		"\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01e1\3\2\2\2\u01d6\u01d8\t\2\2\2\u01d7\u01d6\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01dd\3\2\2\2\u01db\u01dd\7/\2\2\u01dc\u01d7\3\2\2\2\u01dc\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01d2\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e1B\3\2\2\2"+
		"\u01e2\u01e3\7}\2\2\u01e3D\3\2\2\2\u01e4\u01e5\7\177\2\2\u01e5F\3\2\2"+
		"\2\u01e6\u01e7\7<\2\2\u01e7H\3\2\2\2\u01e8\u01e9\7.\2\2\u01e9J\3\2\2\2"+
		"\u01ea\u01ef\7$\2\2\u01eb\u01ee\5S*\2\u01ec\u01ee\5Y-\2\u01ed\u01eb\3"+
		"\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7$"+
		"\2\2\u01f3L\3\2\2\2\u01f4\u01f6\t\3\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8N\3\2\2\2\u01f9"+
		"\u01fa\7\"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\b(\2\2\u01fcP\3\2\2\2\u01fd"+
		"\u01ff\t\4\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\b)\2\2\u0203"+
		"R\3\2\2\2\u0204\u0207\7^\2\2\u0205\u0208\t\5\2\2\u0206\u0208\5U+\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208T\3\2\2\2\u0209\u020a\7w\2\2\u020a"+
		"\u020b\5W,\2\u020b\u020c\5W,\2\u020c\u020d\5W,\2\u020d\u020e\5W,\2\u020e"+
		"V\3\2\2\2\u020f\u0210\t\6\2\2\u0210X\3\2\2\2\u0211\u0212\n\7\2\2\u0212"+
		"Z\3\2\2\2\17\2\u00d1\u012f\u01d4\u01d9\u01dc\u01de\u01e0\u01ed\u01ef\u01f7"+
		"\u0200\u0207\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}