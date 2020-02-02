// Generated from /home/laura/IdeaProjects/basement_infra/grammar/basement.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link basementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface basementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link basementParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(basementParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(basementParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(basementParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(basementParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(basementParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#deploy_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeploy_params(basementParser.Deploy_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#deploy_regular_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeploy_regular_params(basementParser.Deploy_regular_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#deploy_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeploy_keys(basementParser.Deploy_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#env_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnv_obj(basementParser.Env_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#env_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnv_params(basementParser.Env_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#env_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnv_keys(basementParser.Env_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#env_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnv_values(basementParser.Env_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#deploy_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeploy_values(basementParser.Deploy_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#bst_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBst_params(basementParser.Bst_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#perform_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_params(basementParser.Perform_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#perform_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_keys(basementParser.Perform_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#perform_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_values(basementParser.Perform_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#bst_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBst_keys(basementParser.Bst_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#bst_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBst_values(basementParser.Bst_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#type_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_command(basementParser.Type_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#flag_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlag_val(basementParser.Flag_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link basementParser#image_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_type(basementParser.Image_typeContext ctx);
}