// Generated from Test.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(TestParser.SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(TestParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable_definition}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition(TestParser.Variable_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(TestParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(TestParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeblock}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(TestParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(TestParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code code_id}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_id(TestParser.Code_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_operation}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operation(TestParser.Unary_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary_operation}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operation(TestParser.Binary_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_definition}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(TestParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link TestParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TestParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(TestParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TestParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#type_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(TestParser.Type_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#type_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_float(TestParser.Type_floatContext ctx);
}