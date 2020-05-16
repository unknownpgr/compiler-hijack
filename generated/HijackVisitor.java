// Generated from Hijack.g4 by ANTLR 4.4
package generated;
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link HijackParser#l_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_string(@NotNull HijackParser.L_stringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_bracket}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_bracket(@NotNull HijackParser.Op_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#l_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_int(@NotNull HijackParser.L_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(@NotNull HijackParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#l_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_float(@NotNull HijackParser.L_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#def_var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_var_assign(@NotNull HijackParser.Def_var_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_addsub}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_addsub(@NotNull HijackParser.Op_addsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link HijackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_void(@NotNull HijackParser.Type_voidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_refer}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_refer(@NotNull HijackParser.Op_referContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_id}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_id(@NotNull HijackParser.Exp_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_num}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_num(@NotNull HijackParser.Exp_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull HijackParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull HijackParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull HijackParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link HijackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(@NotNull HijackParser.Type_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(@NotNull HijackParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#def_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_struct(@NotNull HijackParser.Def_structContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#special_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_rules(@NotNull HijackParser.Special_rulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_bool}
	 * labeled alternative in {@link HijackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_bool(@NotNull HijackParser.Type_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_string}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_string(@NotNull HijackParser.Exp_stringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_call}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_call(@NotNull HijackParser.Op_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull HijackParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_muldiv}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_muldiv(@NotNull HijackParser.Op_muldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(@NotNull HijackParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_float}
	 * labeled alternative in {@link HijackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_float(@NotNull HijackParser.Type_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_custom}
	 * labeled alternative in {@link HijackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_custom(@NotNull HijackParser.Type_customContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_negate}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_negate(@NotNull HijackParser.Op_negateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_array}
	 * labeled alternative in {@link HijackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_array(@NotNull HijackParser.Type_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_comp}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_comp(@NotNull HijackParser.Op_compContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_sign}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_sign(@NotNull HijackParser.Op_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(@NotNull HijackParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#def_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_func(@NotNull HijackParser.Def_funcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_assign}
	 * labeled alternative in {@link HijackParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_assign(@NotNull HijackParser.Op_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HijackParser#def_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_var(@NotNull HijackParser.Def_varContext ctx);
}