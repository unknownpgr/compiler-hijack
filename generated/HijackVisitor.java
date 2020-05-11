// Generated from Hijack.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HijackParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HijackVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HijackParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(HijackParser.SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(HijackParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable_definition}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition(HijackParser.Variable_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(HijackParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(HijackParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeblock}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(HijackParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(HijackParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code code_id}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_id(HijackParser.Code_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_operation}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operation(HijackParser.Unary_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary_operation}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operation(HijackParser.Binary_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_definition}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(HijackParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HijackParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(HijackParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(HijackParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#type_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(HijackParser.Type_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#type_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_float(HijackParser.Type_floatContext ctx);
}