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
		T__0=1, T__1=2, T__2=3, POSTGRES_ENV_TK=4, MONGO_ENV_TK=5, PERFORM_TK=6, 
		SET_TK=7, UP_TK=8, DOWN_TK=9, DEPLOY_TK=10, TRUE_TK=11, FALSE_TK=12, DETACHED_TK=13, 
		BASEMNT_LIST=14, DIR_TK=15, RUNNING_TK=16, COMMAND_TK=17, REMOVE_TK=18, 
		ALL_TK=19, EXITED_TK=20, FLAG_TOKEN=21, IMAGE_TYPE_TK=22, CREATE_TK=23, 
		STATUS_TK=24, PORT_TK=25, ENVIRONMENT_TK=26, ID=27, CURLY_L_TK=28, CURLY_R_TK=29, 
		KEY_VAL_TK=30, COMMA_TK=31, STRING=32, NUMBER=33, SPACE=34, WS=35;
	public static final int
		RULE_init = 0, RULE_config = 1, RULE_command = 2, RULE_obj = 3, RULE_params = 4, 
		RULE_deploy_params = 5, RULE_deploy_regular_params = 6, RULE_deploy_keys = 7, 
		RULE_env_obj = 8, RULE_env_params = 9, RULE_env_keys = 10, RULE_env_values = 11, 
		RULE_deploy_values = 12, RULE_bst_params = 13, RULE_perform_params = 14, 
		RULE_perform_keys = 15, RULE_perform_values = 16, RULE_bst_keys = 17, 
		RULE_bst_values = 18, RULE_type_command = 19, RULE_flag_val = 20, RULE_image_type = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "config", "command", "obj", "params", "deploy_params", "deploy_regular_params", 
			"deploy_keys", "env_obj", "env_params", "env_keys", "env_values", "deploy_values", 
			"bst_params", "perform_params", "perform_keys", "perform_values", "bst_keys", 
			"bst_values", "type_command", "flag_val", "image_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'postgres'", "'mongo'", "'nginx'", null, null, "'perform '", "'set'", 
			"'up'", "'down'", "'deploy'", "'True'", "'False'", "'detached'", "'basement-list'", 
			"'directory'", "'running'", "'command'", "'remove'", "'all'", "'exited'", 
			"'flag'", "'image-type'", "'creation-time'", "'status'", "'port'", "'environment'", 
			null, "'{'", "'}'", "':'", "','", null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "POSTGRES_ENV_TK", "MONGO_ENV_TK", "PERFORM_TK", 
			"SET_TK", "UP_TK", "DOWN_TK", "DEPLOY_TK", "TRUE_TK", "FALSE_TK", "DETACHED_TK", 
			"BASEMNT_LIST", "DIR_TK", "RUNNING_TK", "COMMAND_TK", "REMOVE_TK", "ALL_TK", 
			"EXITED_TK", "FLAG_TOKEN", "IMAGE_TYPE_TK", "CREATE_TK", "STATUS_TK", 
			"PORT_TK", "ENVIRONMENT_TK", "ID", "CURLY_L_TK", "CURLY_R_TK", "KEY_VAL_TK", 
			"COMMA_TK", "STRING", "NUMBER", "SPACE", "WS"
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERFORM_TK) | (1L << SET_TK) | (1L << DEPLOY_TK) | (1L << BASEMNT_LIST) | (1L << REMOVE_TK))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PERFORM_TK:
				case SET_TK:
				case REMOVE_TK:
					{
					setState(44);
					command();
					}
					break;
				case DEPLOY_TK:
				case BASEMNT_LIST:
					{
					setState(45);
					config();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEPLOY_TK:
				{
				setState(51);
				match(DEPLOY_TK);
				setState(52);
				match(ID);
				setState(53);
				image_type();
				}
				break;
			case BASEMNT_LIST:
				{
				setState(54);
				match(BASEMNT_LIST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(57);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET_TK:
			case REMOVE_TK:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SET_TK:
					{
					setState(59);
					match(SET_TK);
					setState(60);
					type_command();
					}
					break;
				case REMOVE_TK:
					{
					setState(61);
					match(REMOVE_TK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(64);
				match(ID);
				}
				break;
			case PERFORM_TK:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(PERFORM_TK);
				setState(66);
				match(ID);
				setState(67);
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
			setState(70);
			match(CURLY_L_TK);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DETACHED_TK) | (1L << DIR_TK) | (1L << COMMAND_TK) | (1L << FLAG_TOKEN) | (1L << IMAGE_TYPE_TK) | (1L << CREATE_TK) | (1L << STATUS_TK) | (1L << PORT_TK) | (1L << ENVIRONMENT_TK))) != 0)) {
				{
				{
				setState(71);
				params();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_TK) {
					{
					{
					setState(72);
					match(COMMA_TK);
					setState(73);
					params();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETACHED_TK:
			case PORT_TK:
			case ENVIRONMENT_TK:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				deploy_params();
				}
				break;
			case FLAG_TOKEN:
			case IMAGE_TYPE_TK:
			case CREATE_TK:
			case STATUS_TK:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				bst_params();
				}
				break;
			case DIR_TK:
			case COMMAND_TK:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETACHED_TK:
			case PORT_TK:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				deploy_regular_params();
				}
				break;
			case ENVIRONMENT_TK:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ENVIRONMENT_TK);
				setState(93);
				match(KEY_VAL_TK);
				setState(94);
				env_obj();
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						match(COMMA_TK);
						setState(96);
						deploy_regular_params();
						}
						} 
					}
					setState(101);
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
			setState(104);
			deploy_keys();
			setState(105);
			match(KEY_VAL_TK);
			setState(106);
			deploy_values();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(COMMA_TK);
					setState(108);
					deploy_regular_params();
					}
					} 
				}
				setState(113);
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
		public TerminalNode DETACHED_TK() { return getToken(basementParser.DETACHED_TK, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==DETACHED_TK || _la==PORT_TK) ) {
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
			setState(116);
			match(CURLY_L_TK);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POSTGRES_ENV_TK || _la==MONGO_ENV_TK) {
				{
				{
				setState(117);
				env_params();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_TK) {
					{
					{
					setState(118);
					match(COMMA_TK);
					setState(119);
					env_params();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
			setState(132);
			env_keys();
			setState(133);
			match(KEY_VAL_TK);
			setState(134);
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
		public TerminalNode POSTGRES_ENV_TK() { return getToken(basementParser.POSTGRES_ENV_TK, 0); }
		public TerminalNode MONGO_ENV_TK() { return getToken(basementParser.MONGO_ENV_TK, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==POSTGRES_ENV_TK || _la==MONGO_ENV_TK) ) {
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
		enterRule(_localctx, 22, RULE_env_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		public TerminalNode TRUE_TK() { return getToken(basementParser.TRUE_TK, 0); }
		public TerminalNode FALSE_TK() { return getToken(basementParser.FALSE_TK, 0); }
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
		enterRule(_localctx, 24, RULE_deploy_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE_TK) | (1L << FALSE_TK) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_bst_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			bst_keys();
			setState(143);
			match(KEY_VAL_TK);
			setState(144);
			bst_values();
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(COMMA_TK);
					setState(146);
					bst_params();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 28, RULE_perform_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			perform_keys();
			setState(153);
			match(KEY_VAL_TK);
			setState(154);
			perform_values();
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
					perform_params();
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
		enterRule(_localctx, 30, RULE_perform_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		enterRule(_localctx, 32, RULE_perform_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		public TerminalNode STATUS_TK() { return getToken(basementParser.STATUS_TK, 0); }
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
		enterRule(_localctx, 34, RULE_bst_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLAG_TOKEN) | (1L << IMAGE_TYPE_TK) | (1L << CREATE_TK) | (1L << STATUS_TK))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_bst_values);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RUNNING_TK:
			case ALL_TK:
			case EXITED_TK:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				flag_val();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				image_type();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
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
		enterRule(_localctx, 38, RULE_type_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==UP_TK || _la==DOWN_TK) ) {
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
		enterRule(_localctx, 40, RULE_flag_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 42, RULE_image_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\4\3\4\3\4\5\4A\n"+
		"\4\3\4\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\7"+
		"\5R\n\5\f\5\16\5U\13\5\3\5\3\5\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7d\n\7\f\7\16\7g\13\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f"+
		"\b\16\bs\13\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\7\n\u0080"+
		"\n\n\f\n\16\n\u0083\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\7\20\u00a0\n\20\f\20\16\20\u00a3\13\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00af\n\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\n\4\2\17\17\33\33\3\2\6\7\4\2\r\16\"#\4\2\21\21\23\23"+
		"\3\2\27\32\3\2\n\13\4\2\22\22\25\26\3\2\3\5\2\u00b3\2\62\3\2\2\2\49\3"+
		"\2\2\2\6F\3\2\2\2\bH\3\2\2\2\n[\3\2\2\2\fh\3\2\2\2\16j\3\2\2\2\20t\3\2"+
		"\2\2\22v\3\2\2\2\24\u0086\3\2\2\2\26\u008a\3\2\2\2\30\u008c\3\2\2\2\32"+
		"\u008e\3\2\2\2\34\u0090\3\2\2\2\36\u009a\3\2\2\2 \u00a4\3\2\2\2\"\u00a6"+
		"\3\2\2\2$\u00a8\3\2\2\2&\u00ae\3\2\2\2(\u00b0\3\2\2\2*\u00b2\3\2\2\2,"+
		"\u00b4\3\2\2\2.\61\5\6\4\2/\61\5\4\3\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\62\3\2\2\2\65\66\7"+
		"\f\2\2\66\67\7\35\2\2\67:\5,\27\28:\7\20\2\29\65\3\2\2\298\3\2\2\2:;\3"+
		"\2\2\2;<\5\b\5\2<\5\3\2\2\2=>\7\t\2\2>A\5(\25\2?A\7\24\2\2@=\3\2\2\2@"+
		"?\3\2\2\2AB\3\2\2\2BG\7\35\2\2CD\7\b\2\2DE\7\35\2\2EG\5\b\5\2F@\3\2\2"+
		"\2FC\3\2\2\2G\7\3\2\2\2HS\7\36\2\2IN\5\n\6\2JK\7!\2\2KM\5\n\6\2LJ\3\2"+
		"\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QI\3\2\2\2RU\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\37\2\2W\t\3\2\2\2X\\"+
		"\5\f\7\2Y\\\5\34\17\2Z\\\5\36\20\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\13"+
		"\3\2\2\2]i\5\16\b\2^_\7\34\2\2_`\7 \2\2`e\5\22\n\2ab\7!\2\2bd\5\16\b\2"+
		"ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2h]\3\2\2\2"+
		"h^\3\2\2\2i\r\3\2\2\2jk\5\20\t\2kl\7 \2\2lq\5\32\16\2mn\7!\2\2np\5\16"+
		"\b\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\17\3\2\2\2sq\3\2\2\2tu\t"+
		"\2\2\2u\21\3\2\2\2v\u0081\7\36\2\2w|\5\24\13\2xy\7!\2\2y{\5\24\13\2zx"+
		"\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177w\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\37\2\2\u0085\23\3\2\2"+
		"\2\u0086\u0087\5\26\f\2\u0087\u0088\7 \2\2\u0088\u0089\5\30\r\2\u0089"+
		"\25\3\2\2\2\u008a\u008b\t\3\2\2\u008b\27\3\2\2\2\u008c\u008d\7\"\2\2\u008d"+
		"\31\3\2\2\2\u008e\u008f\t\4\2\2\u008f\33\3\2\2\2\u0090\u0091\5$\23\2\u0091"+
		"\u0092\7 \2\2\u0092\u0097\5&\24\2\u0093\u0094\7!\2\2\u0094\u0096\5\34"+
		"\17\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\35\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5 \21"+
		"\2\u009b\u009c\7 \2\2\u009c\u00a1\5\"\22\2\u009d\u009e\7!\2\2\u009e\u00a0"+
		"\5\36\20\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\37\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5"+
		"\t\5\2\2\u00a5!\3\2\2\2\u00a6\u00a7\7\"\2\2\u00a7#\3\2\2\2\u00a8\u00a9"+
		"\t\6\2\2\u00a9%\3\2\2\2\u00aa\u00af\5*\26\2\u00ab\u00af\5,\27\2\u00ac"+
		"\u00af\7#\2\2\u00ad\u00af\7\"\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\'\3\2\2\2\u00b0\u00b1"+
		"\t\7\2\2\u00b1)\3\2\2\2\u00b2\u00b3\t\b\2\2\u00b3+\3\2\2\2\u00b4\u00b5"+
		"\t\t\2\2\u00b5-\3\2\2\2\22\60\629@FNS[ehq|\u0081\u0097\u00a1\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}