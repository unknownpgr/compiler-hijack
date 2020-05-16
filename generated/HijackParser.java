// Generated from Hijack.g4 by ANTLR 4.4
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HijackParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, STRING=27, ID=28, INT=29, FLOAT=30, WS=31, COMMENT_LINE=32, 
		COMMENT_BLOCK=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'float'", "';'", "'{'", "'void'", "'='", "'}'", "'if'", 
		"'<='", "'int'", "'('", "'*'", "','", "'.'", "'>='", "'['", "'=='", "'<'", 
		"']'", "'>'", "'bool'", "'!'", "'else'", "')'", "'+'", "'-'", "STRING", 
		"ID", "INT", "FLOAT", "WS", "COMMENT_LINE", "COMMENT_BLOCK"
	};
	public static final int
		RULE_start = 0, RULE_type = 1, RULE_def_var = 2, RULE_def_func = 3, RULE_def_struct = 4, 
		RULE_definition = 5, RULE_if_condition = 6, RULE_if_stat = 7, RULE_control = 8, 
		RULE_exp = 9, RULE_def_var_assign = 10, RULE_special_rules = 11, RULE_code = 12, 
		RULE_codeblock = 13, RULE_id = 14, RULE_l_int = 15, RULE_l_float = 16, 
		RULE_l_string = 17;
	public static final String[] ruleNames = {
		"start", "type", "def_var", "def_func", "def_struct", "definition", "if_condition", 
		"if_stat", "control", "exp", "def_var_assign", "special_rules", "code", 
		"codeblock", "id", "l_int", "l_float", "l_string"
	};

	@Override
	public String getGrammarFileName() { return "Hijack.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HijackParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public TerminalNode EOF() { return getToken(HijackParser.EOF, 0); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__21) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << STRING) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(36); code();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); match(EOF);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_floatContext extends TypeContext {
		public Type_floatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_float(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_boolContext extends TypeContext {
		public Type_boolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_customContext extends TypeContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Type_customContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_custom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_arrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_arrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_voidContext extends TypeContext {
		public Type_voidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_void(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_intContext extends TypeContext {
		public Type_intContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			switch (_input.LA(1)) {
			case T__21:
				{
				_localctx = new Type_voidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45); match(T__21);
				}
				break;
			case T__16:
				{
				_localctx = new Type_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46); match(T__16);
				}
				break;
			case T__24:
				{
				_localctx = new Type_floatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47); match(T__24);
				}
				break;
			case T__5:
				{
				_localctx = new Type_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48); match(T__5);
				}
				break;
			case ID:
				{
				_localctx = new Type_customContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49); id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_arrayContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(52);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(53); match(T__10);
					setState(54); match(T__7);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Def_varContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Def_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitDef_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_varContext def_var() throws RecognitionException {
		Def_varContext _localctx = new Def_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); type(0);
			setState(61); id();
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

	public static class Def_funcContext extends ParserRuleContext {
		public Def_varContext def_var(int i) {
			return getRuleContext(Def_varContext.class,i);
		}
		public List<Def_varContext> def_var() {
			return getRuleContexts(Def_varContext.class);
		}
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitDef_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); def_var();
			setState(64); match(T__15);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__21) | (1L << T__16) | (1L << T__5) | (1L << ID))) != 0)) {
				{
				{
				setState(65); def_var();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); match(T__2);
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

	public static class Def_structContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public Def_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_struct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitDef_struct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_structContext def_struct() throws RecognitionException {
		Def_structContext _localctx = new Def_structContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_def_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); id();
			setState(74); match(T__22);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75); definition();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__21) | (1L << T__16) | (1L << T__5) | (1L << ID))) != 0) );
			setState(80); match(T__19);
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

	public static class DefinitionContext extends ParserRuleContext {
		public Def_structContext def_struct() {
			return getRuleContext(Def_structContext.class,0);
		}
		public Def_varContext def_var() {
			return getRuleContext(Def_varContext.class,0);
		}
		public Def_funcContext def_func() {
			return getRuleContext(Def_funcContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); def_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); def_func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); def_struct();
				}
				break;
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

	public static class If_conditionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(T__18);
			setState(88); match(T__15);
			setState(89); exp(0);
			setState(90); match(T__2);
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

	public static class If_statContext extends ParserRuleContext {
		public CodeblockContext codeblock(int i) {
			return getRuleContext(CodeblockContext.class,i);
		}
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public List<CodeblockContext> codeblock() {
			return getRuleContexts(CodeblockContext.class);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); if_condition();
			setState(93); codeblock();
			setState(96);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(94); match(T__3);
				setState(95); codeblock();
				}
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

	public static class ControlContext extends ParserRuleContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); if_stat();
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Op_bracketContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_bracketContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_bracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_negateContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_negateContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_negate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exp_idContext extends ExpContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Exp_idContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitExp_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exp_stringContext extends ExpContext {
		public L_stringContext l_string() {
			return getRuleContext(L_stringContext.class,0);
		}
		public Exp_stringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitExp_string(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exp_numContext extends ExpContext {
		public L_floatContext l_float() {
			return getRuleContext(L_floatContext.class,0);
		}
		public L_intContext l_int() {
			return getRuleContext(L_intContext.class,0);
		}
		public Exp_numContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitExp_num(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_compContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_compContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_comp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_callContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_callContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_signContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_signContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_sign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_muldivContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_muldivContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_muldiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_addsubContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_addsubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_addsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_referContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_referContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_refer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_assignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_assignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitOp_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new Op_negateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101); match(T__4);
				setState(102); exp(7);
				}
				break;
			case T__1:
			case T__0:
				{
				_localctx = new Op_signContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(104); exp(6);
				}
				break;
			case ID:
				{
				_localctx = new Exp_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105); id();
				}
				break;
			case INT:
			case FLOAT:
				{
				_localctx = new Exp_numContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(106); l_int();
					}
					break;
				case FLOAT:
					{
					setState(107); l_float();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case STRING:
				{
				_localctx = new Exp_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110); l_string();
				}
				break;
			case T__15:
				{
				_localctx = new Op_bracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111); match(T__15);
				setState(112); exp(0);
				setState(113); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Op_referContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118); match(T__12);
						setState(119); exp(10);
						}
						break;
					case 2:
						{
						_localctx = new Op_muldivContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(122); exp(6);
						}
						break;
					case 3:
						{
						_localctx = new Op_addsubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(123);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(124);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(125); exp(5);
						}
						break;
					case 4:
						{
						_localctx = new Op_compContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(126);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(127);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__6))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(128); exp(4);
						}
						break;
					case 5:
						{
						_localctx = new Op_assignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(129);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(130); match(T__20);
						setState(131); exp(3);
						}
						break;
					case 6:
						{
						_localctx = new Op_callContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(132);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(133); match(T__15);
						setState(142);
						switch (_input.LA(1)) {
						case T__2:
							{
							}
							break;
						case T__15:
						case T__4:
						case T__1:
						case T__0:
						case STRING:
						case ID:
						case INT:
						case FLOAT:
							{
							setState(135); exp(0);
							{
							setState(136); match(T__13);
							setState(138); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(137); exp(0);
								}
								}
								setState(140); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << STRING) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0) );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(144); match(T__2);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Def_var_assignContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Def_varContext def_var() {
			return getRuleContext(Def_varContext.class,0);
		}
		public Def_var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_var_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitDef_var_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_var_assignContext def_var_assign() throws RecognitionException {
		Def_var_assignContext _localctx = new Def_var_assignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_def_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); def_var();
			setState(151); match(T__20);
			setState(152); exp(0);
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

	public static class Special_rulesContext extends ParserRuleContext {
		public Def_var_assignContext def_var_assign() {
			return getRuleContext(Def_var_assignContext.class,0);
		}
		public Special_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_rules; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitSpecial_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_rulesContext special_rules() throws RecognitionException {
		Special_rulesContext _localctx = new Special_rulesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_special_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); def_var_assign();
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

	public static class CodeContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public Special_rulesContext special_rules() {
			return getRuleContext(Special_rulesContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_code);
		try {
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156); control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158); exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); special_rules();
				}
				break;
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

	public static class CodeblockContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codeblock);
		int _la;
		try {
			setState(177);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); match(T__22);
				setState(163); code();
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164); match(T__23);
					setState(166);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__21) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << STRING) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
						{
						setState(165); code();
						}
					}

					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__23 );
				setState(172); match(T__19);
				}
				break;
			case T__24:
			case T__21:
			case T__18:
			case T__16:
			case T__15:
			case T__5:
			case T__4:
			case T__1:
			case T__0:
			case STRING:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); code();
				setState(175); match(T__23);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HijackParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(ID);
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

	public static class L_intContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HijackParser.INT, 0); }
		public L_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitL_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_intContext l_int() throws RecognitionException {
		L_intContext _localctx = new L_intContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_l_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(INT);
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

	public static class L_floatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(HijackParser.FLOAT, 0); }
		public L_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_float; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitL_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_floatContext l_float() throws RecognitionException {
		L_floatContext _localctx = new L_floatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_l_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(FLOAT);
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

	public static class L_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HijackParser.STRING, 0); }
		public L_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitL_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_stringContext l_string() throws RecognitionException {
		L_stringContext _localctx = new L_stringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_l_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return type_sempred((TypeContext)_localctx, predIndex);
		case 9: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 9);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		case 6: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\65\n\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\7\5E\n\5\f\5\16\5H\13\5\3\5\3\5\3\6\3\6\3\6\6\6O\n\6\r\6\16\6P\3\6"+
		"\3\6\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tc\n\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13o\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13v\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u008d"+
		"\n\13\r\13\16\13\u008e\5\13\u0091\n\13\3\13\7\13\u0094\n\13\f\13\16\13"+
		"\u0097\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00a3\n"+
		"\16\3\17\3\17\3\17\3\17\5\17\u00a9\n\17\6\17\u00ab\n\17\r\17\16\17\u00ac"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\2\4\4\24\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\5\3\2\33\34\4\2\3\3\16\16\6\2\13\13\21\21\23\24\26\26\u00ca\2)\3\2"+
		"\2\2\4\64\3\2\2\2\6>\3\2\2\2\bA\3\2\2\2\nK\3\2\2\2\fW\3\2\2\2\16Y\3\2"+
		"\2\2\20^\3\2\2\2\22d\3\2\2\2\24u\3\2\2\2\26\u0098\3\2\2\2\30\u009c\3\2"+
		"\2\2\32\u00a2\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5\3\2\2\2 \u00b7\3\2\2\2"+
		"\"\u00b9\3\2\2\2$\u00bb\3\2\2\2&(\5\32\16\2\'&\3\2\2\2(+\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2./\b\3\1\2/\65"+
		"\7\7\2\2\60\65\7\f\2\2\61\65\7\4\2\2\62\65\7\27\2\2\63\65\5\36\20\2\64"+
		".\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65;"+
		"\3\2\2\2\66\67\f\4\2\2\678\7\22\2\28:\7\25\2\29\66\3\2\2\2:=\3\2\2\2;"+
		"9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=;\3\2\2\2>?\5\4\3\2?@\5\36\20\2@\7\3\2"+
		"\2\2AB\5\6\4\2BF\7\r\2\2CE\5\6\4\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\32\2\2J\t\3\2\2\2KL\5\36\20\2LN\7\6\2\2M"+
		"O\5\f\7\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\t\2\2"+
		"S\13\3\2\2\2TX\5\6\4\2UX\5\b\5\2VX\5\n\6\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2"+
		"\2X\r\3\2\2\2YZ\7\n\2\2Z[\7\r\2\2[\\\5\24\13\2\\]\7\32\2\2]\17\3\2\2\2"+
		"^_\5\16\b\2_b\5\34\17\2`a\7\31\2\2ac\5\34\17\2b`\3\2\2\2bc\3\2\2\2c\21"+
		"\3\2\2\2de\5\20\t\2e\23\3\2\2\2fg\b\13\1\2gh\7\30\2\2hv\5\24\13\tij\t"+
		"\2\2\2jv\5\24\13\bkv\5\36\20\2lo\5 \21\2mo\5\"\22\2nl\3\2\2\2nm\3\2\2"+
		"\2ov\3\2\2\2pv\5$\23\2qr\7\r\2\2rs\5\24\13\2st\7\32\2\2tv\3\2\2\2uf\3"+
		"\2\2\2ui\3\2\2\2uk\3\2\2\2un\3\2\2\2up\3\2\2\2uq\3\2\2\2v\u0095\3\2\2"+
		"\2wx\f\13\2\2xy\7\20\2\2y\u0094\5\24\13\fz{\f\7\2\2{|\t\3\2\2|\u0094\5"+
		"\24\13\b}~\f\6\2\2~\177\t\2\2\2\177\u0094\5\24\13\7\u0080\u0081\f\5\2"+
		"\2\u0081\u0082\t\4\2\2\u0082\u0094\5\24\13\6\u0083\u0084\f\4\2\2\u0084"+
		"\u0085\7\b\2\2\u0085\u0094\5\24\13\5\u0086\u0087\f\n\2\2\u0087\u0090\7"+
		"\r\2\2\u0088\u0091\3\2\2\2\u0089\u008a\5\24\13\2\u008a\u008c\7\17\2\2"+
		"\u008b\u008d\5\24\13\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0088\3\2\2\2\u0090"+
		"\u0089\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\32\2\2\u0093w\3\2\2\2"+
		"\u0093z\3\2\2\2\u0093}\3\2\2\2\u0093\u0080\3\2\2\2\u0093\u0083\3\2\2\2"+
		"\u0093\u0086\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\25\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\6\4\2\u0099"+
		"\u009a\7\b\2\2\u009a\u009b\5\24\13\2\u009b\27\3\2\2\2\u009c\u009d\5\26"+
		"\f\2\u009d\31\3\2\2\2\u009e\u00a3\5\22\n\2\u009f\u00a3\5\f\7\2\u00a0\u00a3"+
		"\5\24\13\2\u00a1\u00a3\5\30\r\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\33\3\2\2\2\u00a4\u00a5"+
		"\7\6\2\2\u00a5\u00aa\5\32\16\2\u00a6\u00a8\7\5\2\2\u00a7\u00a9\5\32\16"+
		"\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\7\t\2\2\u00af\u00b4\3\2\2\2\u00b0\u00b1\5\32"+
		"\16\2\u00b1\u00b2\7\5\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\36\2\2\u00b6\37\3\2\2\2"+
		"\u00b7\u00b8\7\37\2\2\u00b8!\3\2\2\2\u00b9\u00ba\7 \2\2\u00ba#\3\2\2\2"+
		"\u00bb\u00bc\7\35\2\2\u00bc%\3\2\2\2\23)\64;FPWbnu\u008e\u0090\u0093\u0095"+
		"\u00a2\u00a8\u00ac\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}