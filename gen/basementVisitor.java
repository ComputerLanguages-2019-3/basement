// Generated from /home/laura/IdeaProjects/basement_infra/grammar/basement.g4 by ANTLR 4.7.2
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
}