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
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, STRING=28, ID=29, INT=30, FLOAT=31, WS=32, 
		COMMENT_LINE=33, COMMENT_BLOCK=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'return'", "'float'", "';'", "'{'", "'void'", "'='", 
		"'}'", "'if'", "'<='", "'int'", "'('", "'*'", "','", "'.'", "'>='", "'['", 
		"'=='", "'<'", "']'", "'>'", "'bool'", "'!'", "'else'", "')'", "'+'", 
		"'-'", "STRING", "ID", "INT", "FLOAT", "WS", "COMMENT_LINE", "COMMENT_BLOCK"
	};
	public static final int
		RULE_start = 0, RULE_type = 1, RULE_def_var = 2, RULE_def_func = 3, RULE_def_struct = 4, 
		RULE_definition = 5, RULE_if_condition = 6, RULE_if_stat = 7, RULE_return_phrase = 8, 
		RULE_control = 9, RULE_exp = 10, RULE_def_var_assign = 11, RULE_special_rules = 12, 
		RULE_code = 13, RULE_codeblock = 14, RULE_id = 15, RULE_l_int = 16, RULE_l_float = 17, 
		RULE_l_string = 18;
	public static final String[] ruleNames = {
		"start", "type", "def_var", "def_func", "def_struct", "definition", "if_condition", 
		"if_stat", "return_phrase", "control", "exp", "def_var_assign", "special_rules", 
		"code", "codeblock", "id", "l_int", "l_float", "l_string"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__24) | (1L << T__21) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << STRING) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(38); code();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); match(EOF);
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
			setState(52);
			switch (_input.LA(1)) {
			case T__21:
				{
				_localctx = new Type_voidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47); match(T__21);
				}
				break;
			case T__16:
				{
				_localctx = new Type_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48); match(T__16);
				}
				break;
			case T__24:
				{
				_localctx = new Type_floatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49); match(T__24);
				}
				break;
			case T__5:
				{
				_localctx = new Type_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50); match(T__5);
				}
				break;
			case ID:
				{
				_localctx = new Type_customContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51); id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
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
					setState(54);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(55); match(T__10);
					setState(56); match(T__7);
					}
					} 
				}
				setState(61);
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
			setState(62); type(0);
			setState(63); id();
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
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
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
			setState(65); def_var();
			setState(66); match(T__15);
			setState(76);
			switch (_input.LA(1)) {
			case T__2:
				{
				}
				break;
			case T__24:
			case T__21:
			case T__16:
			case T__5:
			case ID:
				{
				setState(68); def_var();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(69); match(T__13);
					setState(70); def_var();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78); match(T__2);
			setState(79); codeblock();
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
			setState(81); id();
			setState(82); match(T__22);
			{
			setState(83); definition();
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84); match(T__23);
				setState(85); definition();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__23 );
			}
			setState(90); match(T__19);
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
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); def_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); def_func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); def_struct();
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
			setState(97); match(T__18);
			setState(98); match(T__15);
			setState(99); exp(0);
			setState(100); match(T__2);
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
			setState(102); if_condition();
			setState(103); codeblock();
			setState(106);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(104); match(T__3);
				setState(105); codeblock();
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

	public static class Return_phraseContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Return_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_phrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitReturn_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_phraseContext return_phrase() throws RecognitionException {
		Return_phraseContext _localctx = new Return_phraseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(T__25);
			setState(109); exp(0);
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
		public Return_phraseContext return_phrase() {
			return getRuleContext(Return_phraseContext.class,0);
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
		enterRule(_localctx, 18, RULE_control);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); if_stat();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); return_phrase();
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new Op_negateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(116); match(T__4);
				setState(117); exp(7);
				}
				break;
			case T__1:
			case T__0:
				{
				_localctx = new Op_signContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(119); exp(6);
				}
				break;
			case ID:
				{
				_localctx = new Exp_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120); id();
				}
				break;
			case INT:
			case FLOAT:
				{
				_localctx = new Exp_numContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(121); l_int();
					}
					break;
				case FLOAT:
					{
					setState(122); l_float();
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
				setState(125); l_string();
				}
				break;
			case T__15:
				{
				_localctx = new Op_bracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126); match(T__15);
				setState(127); exp(0);
				setState(128); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Op_referContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(132);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(133); match(T__12);
						setState(134); exp(10);
						}
						break;
					case 2:
						{
						_localctx = new Op_muldivContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(135);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(136);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(137); exp(6);
						}
						break;
					case 3:
						{
						_localctx = new Op_addsubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(138);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(139);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(140); exp(5);
						}
						break;
					case 4:
						{
						_localctx = new Op_compContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__6))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(143); exp(4);
						}
						break;
					case 5:
						{
						_localctx = new Op_assignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(144);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(145); match(T__20);
						setState(146); exp(3);
						}
						break;
					case 6:
						{
						_localctx = new Op_callContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(147);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(148); match(T__15);
						setState(158);
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
							setState(150); exp(0);
							setState(155);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__13) {
								{
								{
								setState(151); match(T__13);
								setState(152); exp(0);
								}
								}
								setState(157);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(160); match(T__2);
						}
						break;
					}
					} 
				}
				setState(165);
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
		enterRule(_localctx, 22, RULE_def_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); def_var();
			setState(167); match(T__20);
			setState(168); exp(0);
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
		enterRule(_localctx, 24, RULE_special_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); def_var_assign();
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
		enterRule(_localctx, 26, RULE_code);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174); exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175); special_rules();
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
		enterRule(_localctx, 28, RULE_codeblock);
		int _la;
		try {
			setState(193);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); match(T__22);
				setState(179); code();
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180); match(T__23);
					setState(182);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__24) | (1L << T__21) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__5) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << STRING) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
						{
						setState(181); code();
						}
					}

					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__23 );
				setState(188); match(T__19);
				}
				break;
			case T__25:
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
				setState(190); code();
				setState(191); match(T__23);
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
		enterRule(_localctx, 30, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(ID);
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
		enterRule(_localctx, 32, RULE_l_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(INT);
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
		enterRule(_localctx, 34, RULE_l_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(FLOAT);
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
		enterRule(_localctx, 36, RULE_l_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(STRING);
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
		case 10: return exp_sempred((ExpContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\67\n\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\5\5O\n\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\3\7\3\7\3\7\5\7b\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\13\3\13\5\13"+
		"t\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0085\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009c\n\f\f\f\16\f\u009f\13\f\5\f\u00a1"+
		"\n\f\3\f\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\5\17\u00b3\n\17\3\20\3\20\3\20\3\20\5\20\u00b9\n\20"+
		"\6\20\u00bb\n\20\r\20\16\20\u00bc\3\20\3\20\3\20\3\20\3\20\5\20\u00c4"+
		"\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\4\4\26\25\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\3\2\34\35\4\2\3\3\17\17\6\2\f"+
		"\f\22\22\24\25\27\27\u00db\2+\3\2\2\2\4\66\3\2\2\2\6@\3\2\2\2\bC\3\2\2"+
		"\2\nS\3\2\2\2\fa\3\2\2\2\16c\3\2\2\2\20h\3\2\2\2\22n\3\2\2\2\24s\3\2\2"+
		"\2\26\u0084\3\2\2\2\30\u00a8\3\2\2\2\32\u00ac\3\2\2\2\34\u00b2\3\2\2\2"+
		"\36\u00c3\3\2\2\2 \u00c5\3\2\2\2\"\u00c7\3\2\2\2$\u00c9\3\2\2\2&\u00cb"+
		"\3\2\2\2(*\5\34\17\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2"+
		"-+\3\2\2\2./\7\2\2\3/\3\3\2\2\2\60\61\b\3\1\2\61\67\7\b\2\2\62\67\7\r"+
		"\2\2\63\67\7\5\2\2\64\67\7\30\2\2\65\67\5 \21\2\66\60\3\2\2\2\66\62\3"+
		"\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67=\3\2\2\289\f\4\2\2"+
		"9:\7\23\2\2:<\7\26\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2"+
		"\2\2?=\3\2\2\2@A\5\4\3\2AB\5 \21\2B\7\3\2\2\2CD\5\6\4\2DN\7\16\2\2EO\3"+
		"\2\2\2FK\5\6\4\2GH\7\20\2\2HJ\5\6\4\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2NE\3\2\2\2NF\3\2\2\2OP\3\2\2\2PQ\7\33\2\2"+
		"QR\5\36\20\2R\t\3\2\2\2ST\5 \21\2TU\7\7\2\2UX\5\f\7\2VW\7\6\2\2WY\5\f"+
		"\7\2XV\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\n\2\2]\13"+
		"\3\2\2\2^b\5\6\4\2_b\5\b\5\2`b\5\n\6\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b"+
		"\r\3\2\2\2cd\7\13\2\2de\7\16\2\2ef\5\26\f\2fg\7\33\2\2g\17\3\2\2\2hi\5"+
		"\16\b\2il\5\36\20\2jk\7\32\2\2km\5\36\20\2lj\3\2\2\2lm\3\2\2\2m\21\3\2"+
		"\2\2no\7\4\2\2op\5\26\f\2p\23\3\2\2\2qt\5\20\t\2rt\5\22\n\2sq\3\2\2\2"+
		"sr\3\2\2\2t\25\3\2\2\2uv\b\f\1\2vw\7\31\2\2w\u0085\5\26\f\txy\t\2\2\2"+
		"y\u0085\5\26\f\bz\u0085\5 \21\2{~\5\"\22\2|~\5$\23\2}{\3\2\2\2}|\3\2\2"+
		"\2~\u0085\3\2\2\2\177\u0085\5&\24\2\u0080\u0081\7\16\2\2\u0081\u0082\5"+
		"\26\f\2\u0082\u0083\7\33\2\2\u0083\u0085\3\2\2\2\u0084u\3\2\2\2\u0084"+
		"x\3\2\2\2\u0084z\3\2\2\2\u0084}\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080"+
		"\3\2\2\2\u0085\u00a5\3\2\2\2\u0086\u0087\f\13\2\2\u0087\u0088\7\21\2\2"+
		"\u0088\u00a4\5\26\f\f\u0089\u008a\f\7\2\2\u008a\u008b\t\3\2\2\u008b\u00a4"+
		"\5\26\f\b\u008c\u008d\f\6\2\2\u008d\u008e\t\2\2\2\u008e\u00a4\5\26\f\7"+
		"\u008f\u0090\f\5\2\2\u0090\u0091\t\4\2\2\u0091\u00a4\5\26\f\6\u0092\u0093"+
		"\f\4\2\2\u0093\u0094\7\t\2\2\u0094\u00a4\5\26\f\5\u0095\u0096\f\n\2\2"+
		"\u0096\u00a0\7\16\2\2\u0097\u00a1\3\2\2\2\u0098\u009d\5\26\f\2\u0099\u009a"+
		"\7\20\2\2\u009a\u009c\5\26\f\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u0098\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\7\33\2\2\u00a3\u0086\3\2\2\2\u00a3\u0089\3\2\2\2\u00a3\u008c\3"+
		"\2\2\2\u00a3\u008f\3\2\2\2\u00a3\u0092\3\2\2\2\u00a3\u0095\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\27\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab"+
		"\5\26\f\2\u00ab\31\3\2\2\2\u00ac\u00ad\5\30\r\2\u00ad\33\3\2\2\2\u00ae"+
		"\u00b3\5\24\13\2\u00af\u00b3\5\f\7\2\u00b0\u00b3\5\26\f\2\u00b1\u00b3"+
		"\5\32\16\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00ba"+
		"\5\34\17\2\u00b6\u00b8\7\6\2\2\u00b7\u00b9\5\34\17\2\u00b8\u00b7\3\2\2"+
		"\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7\n\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\7"+
		"\6\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4"+
		"\37\3\2\2\2\u00c5\u00c6\7\37\2\2\u00c6!\3\2\2\2\u00c7\u00c8\7 \2\2\u00c8"+
		"#\3\2\2\2\u00c9\u00ca\7!\2\2\u00ca%\3\2\2\2\u00cb\u00cc\7\36\2\2\u00cc"+
		"\'\3\2\2\2\25+\66=KNZals}\u0084\u009d\u00a0\u00a3\u00a5\u00b2\u00b8\u00bc"+
		"\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}