// Generated from /home/laura/IdeaProjects/basement_infra/grammar/basement.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link basementParser}.
 */
public interface basementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link basementParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(basementParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(basementParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(basementParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(basementParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(basementParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(basementParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(basementParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(basementParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(basementParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(basementParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#deploy_params}.
	 * @param ctx the parse tree
	 */
	void enterDeploy_params(basementParser.Deploy_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#deploy_params}.
	 * @param ctx the parse tree
	 */
	void exitDeploy_params(basementParser.Deploy_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#deploy_regular_params}.
	 * @param ctx the parse tree
	 */
	void enterDeploy_regular_params(basementParser.Deploy_regular_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#deploy_regular_params}.
	 * @param ctx the parse tree
	 */
	void exitDeploy_regular_params(basementParser.Deploy_regular_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#deploy_keys}.
	 * @param ctx the parse tree
	 */
	void enterDeploy_keys(basementParser.Deploy_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#deploy_keys}.
	 * @param ctx the parse tree
	 */
	void exitDeploy_keys(basementParser.Deploy_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#env_obj}.
	 * @param ctx the parse tree
	 */
	void enterEnv_obj(basementParser.Env_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#env_obj}.
	 * @param ctx the parse tree
	 */
	void exitEnv_obj(basementParser.Env_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#env_params}.
	 * @param ctx the parse tree
	 */
	void enterEnv_params(basementParser.Env_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#env_params}.
	 * @param ctx the parse tree
	 */
	void exitEnv_params(basementParser.Env_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#env_keys}.
	 * @param ctx the parse tree
	 */
	void enterEnv_keys(basementParser.Env_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#env_keys}.
	 * @param ctx the parse tree
	 */
	void exitEnv_keys(basementParser.Env_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#postgres_env}.
	 * @param ctx the parse tree
	 */
	void enterPostgres_env(basementParser.Postgres_envContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#postgres_env}.
	 * @param ctx the parse tree
	 */
	void exitPostgres_env(basementParser.Postgres_envContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#mongo_env}.
	 * @param ctx the parse tree
	 */
	void enterMongo_env(basementParser.Mongo_envContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#mongo_env}.
	 * @param ctx the parse tree
	 */
	void exitMongo_env(basementParser.Mongo_envContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#env_values}.
	 * @param ctx the parse tree
	 */
	void enterEnv_values(basementParser.Env_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#env_values}.
	 * @param ctx the parse tree
	 */
	void exitEnv_values(basementParser.Env_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#deploy_values}.
	 * @param ctx the parse tree
	 */
	void enterDeploy_values(basementParser.Deploy_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#deploy_values}.
	 * @param ctx the parse tree
	 */
	void exitDeploy_values(basementParser.Deploy_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#bst_params}.
	 * @param ctx the parse tree
	 */
	void enterBst_params(basementParser.Bst_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#bst_params}.
	 * @param ctx the parse tree
	 */
	void exitBst_params(basementParser.Bst_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#perform_params}.
	 * @param ctx the parse tree
	 */
	void enterPerform_params(basementParser.Perform_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#perform_params}.
	 * @param ctx the parse tree
	 */
	void exitPerform_params(basementParser.Perform_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#perform_keys}.
	 * @param ctx the parse tree
	 */
	void enterPerform_keys(basementParser.Perform_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#perform_keys}.
	 * @param ctx the parse tree
	 */
	void exitPerform_keys(basementParser.Perform_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#perform_values}.
	 * @param ctx the parse tree
	 */
	void enterPerform_values(basementParser.Perform_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#perform_values}.
	 * @param ctx the parse tree
	 */
	void exitPerform_values(basementParser.Perform_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#bst_keys}.
	 * @param ctx the parse tree
	 */
	void enterBst_keys(basementParser.Bst_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#bst_keys}.
	 * @param ctx the parse tree
	 */
	void exitBst_keys(basementParser.Bst_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#bst_values}.
	 * @param ctx the parse tree
	 */
	void enterBst_values(basementParser.Bst_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#bst_values}.
	 * @param ctx the parse tree
	 */
	void exitBst_values(basementParser.Bst_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#type_command}.
	 * @param ctx the parse tree
	 */
	void enterType_command(basementParser.Type_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#type_command}.
	 * @param ctx the parse tree
	 */
	void exitType_command(basementParser.Type_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#flag_val}.
	 * @param ctx the parse tree
	 */
	void enterFlag_val(basementParser.Flag_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#flag_val}.
	 * @param ctx the parse tree
	 */
	void exitFlag_val(basementParser.Flag_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link basementParser#image_type}.
	 * @param ctx the parse tree
	 */
	void enterImage_type(basementParser.Image_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link basementParser#image_type}.
	 * @param ctx the parse tree
	 */
	void exitImage_type(basementParser.Image_typeContext ctx);
}