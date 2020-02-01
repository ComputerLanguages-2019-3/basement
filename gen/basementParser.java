// Generated from /home/laura/IdeaProjects/basement_infra/grammar/basement.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class basementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PERFORM_TK=8, 
		DEPLOY_TK=9, BASEMNT_LIST=10, DIR_TK=11, RUNNING_TK=12, COMMAND_TK=13, 
		REMOVE_TK=14, SET_TK=15, DOWN_TK=16, UP_TK=17, ALL_TK=18, EXITED_TK=19, 
		FLAG_TOKEN=20, IMAGE_TYPE_TK=21, CREATE_TK=22, PORT_TK=23, ENVIRONMENT_TK=24, 
		CURLY_L_TK=25, CURLY_R_TK=26, KEY_VAL_TK=27, COMMA_TK=28, ID=29, NUMBER=30, 
		STRING=31, SPACE=32, WS=33;
	public static final int
		RULE_init = 0, RULE_config = 1, RULE_command = 2, RULE_obj = 3, RULE_params = 4, 
		RULE_deploy_params = 5, RULE_deploy_regular_params = 6, RULE_deploy_keys = 7, 
		RULE_env_obj = 8, RULE_env_params = 9, RULE_env_keys = 10, RULE_postgres_env = 11, 
		RULE_mongo_env = 12, RULE_env_values = 13, RULE_deploy_values = 14, RULE_bst_params = 15, 
		RULE_perform_params = 16, RULE_perform_keys = 17, RULE_perform_values = 18, 
		RULE_bst_keys = 19, RULE_bst_values = 20, RULE_type_command = 21, RULE_flag_val = 22, 
		RULE_image_type = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "config", "command", "obj", "params", "deploy_params", "deploy_regular_params", 
			"deploy_keys", "env_obj", "env_params", "env_keys", "postgres_env", "mongo_env", 
			"env_values", "deploy_values", "bst_params", "perform_params", "perform_keys", 
			"perform_values", "bst_keys", "bst_values", "type_command", "flag_val", 
			"image_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'POSTGRES_USER'", "'POSTGRES_PASSWORD'", "'POSTGRES_DB'", "'MONGO_DB'", 
			"'postgres'", "'mongo'", "'nginx'", "'perform '", "'deploy'", "'basement-list'", 
			"'directory'", "'running'", "'command'", "'remove'", "'set-'", "'down'", 
			"'up'", "'all'", "'exited'", "'flag'", "'image-type'", "'creation-time'", 
			"'port'", "'env'", "'{'", "'}'", "':'", "','", null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "PERFORM_TK", "DEPLOY_TK", 
			"BASEMNT_LIST", "DIR_TK", "RUNNING_TK", "COMMAND_TK", "REMOVE_TK", "SET_TK", 
			"DOWN_TK", "UP_TK", "ALL_TK", "EXITED_TK", "FLAG_TOKEN", "IMAGE_TYPE_TK", 
			"CREATE_TK", "PORT_TK", "ENVIRONMENT_TK", "CURLY_L_TK", "CURLY_R_TK", 
			"KEY_VAL_TK", "COMMA_TK", "ID", "NUMBER", "STRING", "SPACE", "WS"
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
	public String getGrammarFileName() { return "basement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public basementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<ConfigContext> config() {
			return getRuleContexts(ConfigContext.class);
		}
		public ConfigContext config(int i) {
			return getRuleContext(ConfigContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERFORM_TK) | (1L << DEPLOY_TK) | (1L << BASEMNT_LIST) | (1L << REMOVE_TK) | (1L << SET_TK))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PERFORM_TK:
				case REMOVE_TK:
				case SET_TK:
					{
					setState(48);
					command();
					}
					break;
				case DEPLOY_TK:
				case BASEMNT_LIST:
					{
					setState(49);
					config();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConfigContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode DEPLOY_TK() { return getToken(basementParser.DEPLOY_TK, 0); }
		public TerminalNode ID() { return getToken(basementParser.ID, 0); }
		public Image_typeContext image_type() {
			return getRuleContext(Image_typeContext.class,0);
		}
		public TerminalNode BASEMNT_LIST() { return getToken(basementParser.BASEMNT_LIST, 0); }
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEPLOY_TK:
				{
				setState(55);
				match(DEPLOY_TK);
				setState(56);
				match(ID);
				setState(57);
				image_type();
				}
				break;
			case BASEMNT_LIST:
				{
				setState(58);
				match(BASEMNT_LIST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(61);
			obj();
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(basementParser.ID, 0); }
		public TerminalNode SET_TK() { return getToken(basementParser.SET_TK, 0); }
		public Type_commandContext type_command() {
			return getRuleContext(Type_commandContext.class,0);
		}
		public TerminalNode REMOVE_TK() { return getToken(basementParser.REMOVE_TK, 0); }
		public TerminalNode PERFORM_TK() { return getToken(basementParser.PERFORM_TK, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REMOVE_TK:
			case SET_TK:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SET_TK:
					{
					setState(63);
					match(SET_TK);
					setState(64);
					type_command();
					}
					break;
				case REMOVE_TK:
					{
					setState(65);
					match(REMOVE_TK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68);
				match(ID);
				}
				break;
			case PERFORM_TK:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(PERFORM_TK);
				setState(70);
				match(ID);
				setState(71);
				obj();
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

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode CURLY_L_TK() { return getToken(basementParser.CURLY_L_TK, 0); }
		public TerminalNode CURLY_R_TK() { return getToken(basementParser.CURLY_R_TK, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<TerminalNode> COMMA_TK() { return getTokens(basementParser.COMMA_TK); }
		public TerminalNode COMMA_TK(int i) {
			return getToken(basementParser.COMMA_TK, i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(CURLY_L_TK);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIR_TK) | (1L << COMMAND_TK) | (1L << FLAG_TOKEN) | (1L << IMAGE_TYPE_TK) | (1L << CREATE_TK) | (1L << PORT_TK) | (1L << ENVIRONMENT_TK))) != 0)) {
				{
				{
				setState(75);
				params();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_TK) {
					{
					{
					setState(76);
					match(COMMA_TK);
					setState(77);
					params();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(CURLY_R_TK);
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

	public static class ParamsContext extends ParserRuleContext {
		public Deploy_paramsContext deploy_params() {
			return getRuleContext(Deploy_paramsContext.class,0);
		}
		public Bst_paramsContext bst_params() {
			return getRuleContext(Bst_paramsContext.class,0);
		}
		public Perform_paramsContext perform_params() {
			return getRuleContext(Perform_paramsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PORT_TK:
			case ENVIRONMENT_TK:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				deploy_params();
				}
				break;
			case FLAG_TOKEN:
			case IMAGE_TYPE_TK:
			case CREATE_TK:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				bst_params();
				}
				break;
			case DIR_TK:
			case COMMAND_TK:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				perform_params();
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

	public static class Deploy_paramsContext extends ParserRuleContext {
		public List<Deploy_regular_paramsContext> deploy_regular_params() {
			return getRuleContexts(Deploy_regular_paramsContext.class);
		}
		public Deploy_regular_paramsContext deploy_regular_params(int i) {
			return getRuleContext(Deploy_regular_paramsContext.class,i);
		}
		public TerminalNode ENVIRONMENT_TK() { return getToken(basementParser.ENVIRONMENT_TK, 0); }
		public TerminalNode KEY_VAL_TK() { return getToken(basementParser.KEY_VAL_TK, 0); }
		public Env_objContext env_obj() {
			return getRuleContext(Env_objContext.class,0);
		}
		public List<TerminalNode> COMMA_TK() { return getTokens(basementParser.COMMA_TK); }
		public TerminalNode COMMA_TK(int i) {
			return getToken(basementParser.COMMA_TK, i);
		}
		public Deploy_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deploy_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterDeploy_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitDeploy_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitDeploy_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deploy_paramsContext deploy_params() throws RecognitionException {
		Deploy_paramsContext _localctx = new Deploy_paramsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deploy_params);
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PORT_TK:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				deploy_regular_params();
				}
				break;
			case ENVIRONMENT_TK:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(ENVIRONMENT_TK);
				setState(97);
				match(KEY_VAL_TK);
				setState(98);
				env_obj();
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(99);
						match(COMMA_TK);
						setState(100);
						deploy_regular_params();
						}
						} 
					}
					setState(105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
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

	public static class Deploy_regular_paramsContext extends ParserRuleContext {
		public Deploy_keysContext deploy_keys() {
			return getRuleContext(Deploy_keysContext.class,0);
		}
		public TerminalNode KEY_VAL_TK() { return getToken(basementParser.KEY_VAL_TK, 0); }
		public Deploy_valuesContext deploy_values() {
			return getRuleContext(Deploy_valuesContext.class,0);
		}
		public List<TerminalNode> COMMA_TK() { return getTokens(basementParser.COMMA_TK); }
		public TerminalNode COMMA_TK(int i) {
			return getToken(basementParser.COMMA_TK, i);
		}
		public List<Deploy_regular_paramsContext> deploy_regular_params() {
			return getRuleContexts(Deploy_regular_paramsContext.class);
		}
		public Deploy_regular_paramsContext deploy_regular_params(int i) {
			return getRuleContext(Deploy_regular_paramsContext.class,i);
		}
		public Deploy_regular_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deploy_regular_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterDeploy_regular_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitDeploy_regular_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitDeploy_regular_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deploy_regular_paramsContext deploy_regular_params() throws RecognitionException {
		Deploy_regular_paramsContext _localctx = new Deploy_regular_paramsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deploy_regular_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			deploy_keys();
			setState(109);
			match(KEY_VAL_TK);
			setState(110);
			deploy_values();
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(COMMA_TK);
					setState(112);
					deploy_regular_params();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Deploy_keysContext extends ParserRuleContext {
		public TerminalNode PORT_TK() { return getToken(basementParser.PORT_TK, 0); }
		public Deploy_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deploy_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterDeploy_keys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitDeploy_keys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitDeploy_keys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deploy_keysContext deploy_keys() throws RecognitionException {
		Deploy_keysContext _localctx = new Deploy_keysContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deploy_keys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(PORT_TK);
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

	public static class Env_objContext extends ParserRuleContext {
		public TerminalNode CURLY_L_TK() { return getToken(basementParser.CURLY_L_TK, 0); }
		public TerminalNode CURLY_R_TK() { return getToken(basementParser.CURLY_R_TK, 0); }
		public List<Env_paramsContext> env_params() {
			return getRuleContexts(Env_paramsContext.class);
		}
		public Env_paramsContext env_params(int i) {
			return getRuleContext(Env_paramsContext.class,i);
		}
		public List<TerminalNode> COMMA_TK() { return getTokens(basementParser.COMMA_TK); }
		public TerminalNode COMMA_TK(int i) {
			return getToken(basementParser.COMMA_TK, i);
		}
		public Env_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_env_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterEnv_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitEnv_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitEnv_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Env_objContext env_obj() throws RecognitionException {
		Env_objContext _localctx = new Env_objContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_env_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CURLY_L_TK);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(121);
				env_params();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_TK) {
					{
					{
					setState(122);
					match(COMMA_TK);
					setState(123);
					env_params();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(CURLY_R_TK);
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

	public static class Env_paramsContext extends ParserRuleContext {
		public Env_keysContext env_keys() {
			return getRuleContext(Env_keysContext.class,0);
		}
		public TerminalNode KEY_VAL_TK() { return getToken(basementParser.KEY_VAL_TK, 0); }
		public Env_valuesContext env_values() {
			return getRuleContext(Env_valuesContext.class,0);
		}
		public Env_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_env_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterEnv_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitEnv_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitEnv_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Env_paramsContext env_params() throws RecognitionException {
		Env_paramsContext _localctx = new Env_paramsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_env_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			env_keys();
			setState(137);
			match(KEY_VAL_TK);
			setState(138);
			env_values();
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

	public static class Env_keysContext extends ParserRuleContext {
		public Postgres_envContext postgres_env() {
			return getRuleContext(Postgres_envContext.class,0);
		}
		public Mongo_envContext mongo_env() {
			return getRuleContext(Mongo_envContext.class,0);
		}
		public Env_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_env_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterEnv_keys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitEnv_keys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitEnv_keys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Env_keysContext env_keys() throws RecognitionException {
		Env_keysContext _localctx = new Env_keysContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_env_keys);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				postgres_env();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				mongo_env();
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

	public static class Postgres_envContext extends ParserRuleContext {
		public Postgres_envContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postgres_env; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterPostgres_env(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitPostgres_env(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitPostgres_env(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postgres_envContext postgres_env() throws RecognitionException {
		Postgres_envContext _localctx = new Postgres_envContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_postgres_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
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

	public static class Mongo_envContext extends ParserRuleContext {
		public Mongo_envContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mongo_env; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterMongo_env(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitMongo_env(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitMongo_env(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mongo_envContext mongo_env() throws RecognitionException {
		Mongo_envContext _localctx = new Mongo_envContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mongo_env);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			match(T__3);
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

	public static class Env_valuesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(basementParser.STRING, 0); }
		public Env_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_env_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterEnv_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitEnv_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitEnv_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Env_valuesContext env_values() throws RecognitionException {
		Env_valuesContext _localctx = new Env_valuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_env_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(STRING);
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

	public static class Deploy_valuesContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(basementParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(basementParser.STRING, 0); }
		public Deploy_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deploy_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterDeploy_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitDeploy_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitDeploy_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deploy_valuesContext deploy_values() throws RecognitionException {
		Deploy_valuesContext _localctx = new Deploy_valuesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deploy_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
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

	public static class Bst_paramsContext extends ParserRuleContext {
		public Bst_keysContext bst_keys() {
			return getRuleContext(Bst_keysContext.class,0);
		}
		public TerminalNode KEY_VAL_TK() { return getToken(basementParser.KEY_VAL_TK, 0); }
		public Bst_valuesContext bst_values() {
			return getRuleContext(Bst_valuesContext.class,0);
		}
		public List<TerminalNode> COMMA_TK() { return getTokens(basementParser.COMMA_TK); }
		public TerminalNode COMMA_TK(int i) {
			return getToken(basementParser.COMMA_TK, i);
		}
		public List<Bst_paramsContext> bst_params() {
			return getRuleContexts(Bst_paramsContext.class);
		}
		public Bst_paramsContext bst_params(int i) {
			return getRuleContext(Bst_paramsContext.class,i);
		}
		public Bst_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bst_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterBst_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitBst_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitBst_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bst_paramsContext bst_params() throws RecognitionException {
		Bst_paramsContext _localctx = new Bst_paramsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bst_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			bst_keys();
			setState(153);
			match(KEY_VAL_TK);
			setState(154);
			bst_values();
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					match(COMMA_TK);
					setState(156);
					bst_params();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Perform_paramsContext extends ParserRuleContext {
		public Perform_keysContext perform_keys() {
			return getRuleContext(Perform_keysContext.class,0);
		}
		public TerminalNode KEY_VAL_TK() { return getToken(basementParser.KEY_VAL_TK, 0); }
		public Perform_valuesContext perform_values() {
			return getRuleContext(Perform_valuesContext.class,0);
		}
		public List<TerminalNode> COMMA_TK() { return getTokens(basementParser.COMMA_TK); }
		public TerminalNode COMMA_TK(int i) {
			return getToken(basementParser.COMMA_TK, i);
		}
		public List<Perform_paramsContext> perform_params() {
			return getRuleContexts(Perform_paramsContext.class);
		}
		public Perform_paramsContext perform_params(int i) {
			return getRuleContext(Perform_paramsContext.class,i);
		}
		public Perform_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterPerform_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitPerform_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitPerform_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perform_paramsContext perform_params() throws RecognitionException {
		Perform_paramsContext _localctx = new Perform_paramsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_perform_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			perform_keys();
			setState(163);
			match(KEY_VAL_TK);
			setState(164);
			perform_values();
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(COMMA_TK);
					setState(166);
					perform_params();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Perform_keysContext extends ParserRuleContext {
		public TerminalNode DIR_TK() { return getToken(basementParser.DIR_TK, 0); }
		public TerminalNode COMMAND_TK() { return getToken(basementParser.COMMAND_TK, 0); }
		public Perform_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterPerform_keys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitPerform_keys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitPerform_keys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perform_keysContext perform_keys() throws RecognitionException {
		Perform_keysContext _localctx = new Perform_keysContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_perform_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==DIR_TK || _la==COMMAND_TK) ) {
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

	public static class Perform_valuesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(basementParser.STRING, 0); }
		public Perform_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterPerform_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitPerform_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitPerform_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perform_valuesContext perform_values() throws RecognitionException {
		Perform_valuesContext _localctx = new Perform_valuesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_perform_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(STRING);
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

	public static class Bst_keysContext extends ParserRuleContext {
		public TerminalNode FLAG_TOKEN() { return getToken(basementParser.FLAG_TOKEN, 0); }
		public TerminalNode IMAGE_TYPE_TK() { return getToken(basementParser.IMAGE_TYPE_TK, 0); }
		public TerminalNode CREATE_TK() { return getToken(basementParser.CREATE_TK, 0); }
		public Bst_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bst_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterBst_keys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitBst_keys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitBst_keys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bst_keysContext bst_keys() throws RecognitionException {
		Bst_keysContext _localctx = new Bst_keysContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bst_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLAG_TOKEN) | (1L << IMAGE_TYPE_TK) | (1L << CREATE_TK))) != 0)) ) {
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

	public static class Bst_valuesContext extends ParserRuleContext {
		public Flag_valContext flag_val() {
			return getRuleContext(Flag_valContext.class,0);
		}
		public Image_typeContext image_type() {
			return getRuleContext(Image_typeContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(basementParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(basementParser.STRING, 0); }
		public Bst_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bst_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterBst_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitBst_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitBst_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bst_valuesContext bst_values() throws RecognitionException {
		Bst_valuesContext _localctx = new Bst_valuesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bst_values);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RUNNING_TK:
			case ALL_TK:
			case EXITED_TK:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				flag_val();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				image_type();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(STRING);
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

	public static class Type_commandContext extends ParserRuleContext {
		public TerminalNode DOWN_TK() { return getToken(basementParser.DOWN_TK, 0); }
		public TerminalNode UP_TK() { return getToken(basementParser.UP_TK, 0); }
		public Type_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterType_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitType_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitType_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_commandContext type_command() throws RecognitionException {
		Type_commandContext _localctx = new Type_commandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==DOWN_TK || _la==UP_TK) ) {
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

	public static class Flag_valContext extends ParserRuleContext {
		public TerminalNode RUNNING_TK() { return getToken(basementParser.RUNNING_TK, 0); }
		public TerminalNode ALL_TK() { return getToken(basementParser.ALL_TK, 0); }
		public TerminalNode EXITED_TK() { return getToken(basementParser.EXITED_TK, 0); }
		public Flag_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterFlag_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitFlag_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitFlag_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flag_valContext flag_val() throws RecognitionException {
		Flag_valContext _localctx = new Flag_valContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_flag_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RUNNING_TK) | (1L << ALL_TK) | (1L << EXITED_TK))) != 0)) ) {
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

	public static class Image_typeContext extends ParserRuleContext {
		public Image_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).enterImage_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof basementListener ) ((basementListener)listener).exitImage_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof basementVisitor ) return ((basementVisitor<? extends T>)visitor).visitImage_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image_typeContext image_type() throws RecognitionException {
		Image_typeContext _localctx = new Image_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_image_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\7\5Q\n\5"+
		"\f\5\16\5T\13\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\3\6\3\6\3\6\5\6`\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\5\7m\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\7\bt\n\b\f\b\16\bw\13\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n"+
		"\16\n\u0082\13\n\7\n\u0084\n\n\f\n\16\n\u0087\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\5\f\u0091\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00a0\n\21\f\21\16\21\u00a3\13\21\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u00aa\n\22\f\22\16\22\u00ad\13\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00b9\n\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\t\3\2\3\5\3\2 !\4\2\r\r\17\17\3\2\26\30\3\2\22\23\4\2\16\16"+
		"\24\25\3\2\7\t\2\u00bc\2\66\3\2\2\2\4=\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\n"+
		"_\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2\24\u008a\3\2"+
		"\2\2\26\u0090\3\2\2\2\30\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u0096\3\2\2"+
		"\2\36\u0098\3\2\2\2 \u009a\3\2\2\2\"\u00a4\3\2\2\2$\u00ae\3\2\2\2&\u00b0"+
		"\3\2\2\2(\u00b2\3\2\2\2*\u00b8\3\2\2\2,\u00ba\3\2\2\2.\u00bc\3\2\2\2\60"+
		"\u00be\3\2\2\2\62\65\5\6\4\2\63\65\5\4\3\2\64\62\3\2\2\2\64\63\3\2\2\2"+
		"\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\3\3\2\2\28\66\3\2\2\29:\7"+
		"\13\2\2:;\7\37\2\2;>\5\60\31\2<>\7\f\2\2=9\3\2\2\2=<\3\2\2\2>?\3\2\2\2"+
		"?@\5\b\5\2@\5\3\2\2\2AB\7\21\2\2BE\5,\27\2CE\7\20\2\2DA\3\2\2\2DC\3\2"+
		"\2\2EF\3\2\2\2FK\7\37\2\2GH\7\n\2\2HI\7\37\2\2IK\5\b\5\2JD\3\2\2\2JG\3"+
		"\2\2\2K\7\3\2\2\2LW\7\33\2\2MR\5\n\6\2NO\7\36\2\2OQ\5\n\6\2PN\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2\2VY\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\34\2\2[\t\3\2\2\2\\`\5\f"+
		"\7\2]`\5 \21\2^`\5\"\22\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\13\3\2\2\2a"+
		"m\5\16\b\2bc\7\32\2\2cd\7\35\2\2di\5\22\n\2ef\7\36\2\2fh\5\16\b\2ge\3"+
		"\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2la\3\2\2\2lb\3"+
		"\2\2\2m\r\3\2\2\2no\5\20\t\2op\7\35\2\2pu\5\36\20\2qr\7\36\2\2rt\5\16"+
		"\b\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wu\3\2\2\2xy\7"+
		"\31\2\2y\21\3\2\2\2z\u0085\7\33\2\2{\u0080\5\24\13\2|}\7\36\2\2}\177\5"+
		"\24\13\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083{\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7\34\2\2\u0089\23\3\2\2\2\u008a\u008b\5\26"+
		"\f\2\u008b\u008c\7\35\2\2\u008c\u008d\5\34\17\2\u008d\25\3\2\2\2\u008e"+
		"\u0091\5\30\r\2\u008f\u0091\5\32\16\2\u0090\u008e\3\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\27\3\2\2\2\u0092\u0093\t\2\2\2\u0093\31\3\2\2\2\u0094\u0095"+
		"\7\6\2\2\u0095\33\3\2\2\2\u0096\u0097\7!\2\2\u0097\35\3\2\2\2\u0098\u0099"+
		"\t\3\2\2\u0099\37\3\2\2\2\u009a\u009b\5(\25\2\u009b\u009c\7\35\2\2\u009c"+
		"\u00a1\5*\26\2\u009d\u009e\7\36\2\2\u009e\u00a0\5 \21\2\u009f\u009d\3"+
		"\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"!\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\35\2\2"+
		"\u00a6\u00ab\5&\24\2\u00a7\u00a8\7\36\2\2\u00a8\u00aa\5\"\22\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"#\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\t\4\2\2\u00af%\3\2\2\2\u00b0"+
		"\u00b1\7!\2\2\u00b1\'\3\2\2\2\u00b2\u00b3\t\5\2\2\u00b3)\3\2\2\2\u00b4"+
		"\u00b9\5.\30\2\u00b5\u00b9\5\60\31\2\u00b6\u00b9\7 \2\2\u00b7\u00b9\7"+
		"!\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9+\3\2\2\2\u00ba\u00bb\t\6\2\2\u00bb-\3\2\2\2\u00bc"+
		"\u00bd\t\7\2\2\u00bd/\3\2\2\2\u00be\u00bf\t\b\2\2\u00bf\61\3\2\2\2\23"+
		"\64\66=DJRW_ilu\u0080\u0085\u0090\u00a1\u00ab\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}