package compiler;

import java.util.ArrayList;
import java.util.List;

import generated.HijackBaseVisitor;
import generated.HijackParser.AssignContext;
import generated.HijackParser.Binary_operationContext;
import generated.HijackParser.CodeContext;
import generated.HijackParser.Code_idContext;
import generated.HijackParser.CodeblockContext;
import generated.HijackParser.Function_callContext;
import generated.HijackParser.Function_definitionContext;
import generated.HijackParser.IdContext;
import generated.HijackParser.NumberContext;
import generated.HijackParser.ParenthesesContext;
import generated.HijackParser.SContext;
import generated.HijackParser.SkipContext;
import generated.HijackParser.Type_Context;
import generated.HijackParser.Type_floatContext;
import generated.HijackParser.Type_intContext;
import generated.HijackParser.Unary_operationContext;
import generated.HijackParser.Variable_definitionContext;

public class Visitor extends HijackBaseVisitor<String> {
	/**
	 * visitChildren : just visit children. visit = visit children and return value
	 */

	private String functionDef = "";
	private int functionIndex = 0;

	@Override
	public String visitS(SContext ctx) {
		String s = "";
		for (CodeContext cc : ctx.code()) {
			s += visit(cc) + ";\n";
		}
		return functionDef + "\n\n" + s;
	}

	public String defineFunction(ArrayList<String> params, String returnType, String body) {
		String functionName = "GENERATED_FUNCTION_" + functionIndex;
		functionIndex++;
		functionDef += functionName;
		functionDef += "\n\treturn type=" + returnType;
		functionDef += "\n\tparameter=<";
		for (int i = 0; i < params.size(); i++) {
			functionDef += params.get(i);
			if (i < params.size() - 1)
				functionDef += ",";
		}
		functionDef += ">";
		functionDef += "\nbody:\n" + body + "\n\n";
		return functionName;
	}

	@Override
	public String visitParentheses(ParenthesesContext ctx) {
		return visit(ctx.code());
	}

	@Override
	public String visitCodeblock(CodeblockContext ctx) {
		String body = "";
		ArrayList<String> p = new ArrayList<String>();
		for (CodeContext cc : ctx.code()) {
			body += visit(cc) + ";\n";
		}
		body = "{\n" + body + "}";
		return defineFunction(p, "void", body);
	}

	@Override
	public String visitVariable_definition(Variable_definitionContext ctx) {
		return visit(ctx.type_()) + " " + visit(ctx.id());
	}

	@Override
	public String visitNumber(NumberContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitFunction_call(Function_callContext ctx) {
		String params = "";
		List<CodeContext> list = ctx.code();
		int len = list.size();
		for (int i = 1; i < len; i++) {
			params += visit(list.get(i));
			if (i < len - 1)
				params += ",";
		}
		return "[" + visit(ctx.func) + "(" + params + ")]";
	}

	@Override
	public String visitSkip(SkipContext ctx) {
		return visit(ctx.code());
	}

	@Override
	public String visitCode_id(Code_idContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitUnary_operation(Unary_operationContext ctx) {
		return "(" + ctx.operator.getText() + ctx.operand.getText() + ")";
	}

	@Override
	public String visitBinary_operation(Binary_operationContext ctx) {
		return "(" + visit(ctx.ordL) + ctx.operator.getText() + visit(ctx.ordR) + ")";
	}

	@Override
	public String visitFunction_definition(Function_definitionContext ctx) {
		ArrayList<String> parameters = new ArrayList<String>();
		for (IdContext ic : ctx.id()) {
			parameters.add(visit(ic));
		}
		return defineFunction(parameters, visit(ctx.ret_type), visit(ctx.body));
	}

	@Override
	public String visitAssign(AssignContext ctx) {
		return visit(ctx.lhs) + ":=" + visit(ctx.rhs);
	}

	@Override
	public String visitType_(Type_Context ctx) {
		return ctx.getText();
	}

	@Override
	public String visitId(IdContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitType_int(Type_intContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitType_float(Type_floatContext ctx) {
		return ctx.getText();
	}
}
