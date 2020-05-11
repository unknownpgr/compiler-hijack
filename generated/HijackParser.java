// Generated from Hijack.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OP_UNI_1=9, 
		OP_BIN_1=10, OP_BIN_2=11, OP_BIN_3=12, OP_UNI_3=13, ID=14, INT=15, FLOAT=16, 
		WS=17, COMMENT_LINE=18, COMMENT_BLOCK=19;
	public static final int
		RULE_s = 0, RULE_code = 1, RULE_type_ = 2, RULE_id = 3, RULE_type_int = 4, 
		RULE_type_float = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "code", "type_", "id", "type_int", "type_float"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "';'", "'int'", "'float'", null, 
			null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "OP_UNI_1", "OP_BIN_1", 
			"OP_BIN_2", "OP_BIN_3", "OP_UNI_3", "ID", "INT", "FLOAT", "WS", "COMMENT_LINE", 
			"COMMENT_BLOCK"
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
	public String getGrammarFileName() { return "Hijack.g4"; }

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

	public static class SContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HijackParser.EOF, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << OP_UNI_1) | (1L << OP_UNI_3) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(12);
				code(0);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	 
		public CodeContext() { }
		public void copyFrom(CodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesesContext extends CodeContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ParenthesesContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Variable_definitionContext extends CodeContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Variable_definitionContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitVariable_definition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends CodeContext {
		public Type_intContext type_int() {
			return getRuleContext(Type_intContext.class,0);
		}
		public Type_floatContext type_float() {
			return getRuleContext(Type_floatContext.class,0);
		}
		public NumberContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_callContext extends CodeContext {
		public CodeContext func;
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public Function_callContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeblockContext extends CodeContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public CodeblockContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends CodeContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SkipContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Code_idContext extends CodeContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Code_idContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitCode_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_operationContext extends CodeContext {
		public Token operator;
		public CodeContext operand;
		public TerminalNode OP_UNI_1() { return getToken(HijackParser.OP_UNI_1, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode OP_UNI_3() { return getToken(HijackParser.OP_UNI_3, 0); }
		public Unary_operationContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitUnary_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary_operationContext extends CodeContext {
		public CodeContext ordL;
		public Token operator;
		public CodeContext ordR;
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode OP_BIN_1() { return getToken(HijackParser.OP_BIN_1, 0); }
		public TerminalNode OP_BIN_2() { return getToken(HijackParser.OP_BIN_2, 0); }
		public Binary_operationContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitBinary_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_definitionContext extends CodeContext {
		public Type_Context ret_type;
		public CodeContext body;
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Function_definitionContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends CodeContext {
		public CodeContext lhs;
		public CodeContext rhs;
		public TerminalNode OP_BIN_3() { return getToken(HijackParser.OP_BIN_3, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public AssignContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		return code(0);
	}

	private CodeContext code(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CodeContext _localctx = new CodeContext(_ctx, _parentState);
		CodeContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_code, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(21);
				match(T__0);
				setState(22);
				code(0);
				setState(23);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new CodeblockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(T__2);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << OP_UNI_1) | (1L << OP_UNI_3) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(26);
					code(0);
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new Variable_definitionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				type_();
				setState(34);
				id();
				}
				break;
			case 4:
				{
				_localctx = new Function_definitionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				((Function_definitionContext)_localctx).ret_type = type_();
				setState(37);
				match(T__0);
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(39);
						id();
						setState(44);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(40);
							match(T__4);
							setState(41);
							id();
							}
							}
							setState(46);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				}
				setState(51);
				match(T__1);
				setState(52);
				((Function_definitionContext)_localctx).body = code(10);
				}
				break;
			case 5:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(54);
					type_int();
					}
					break;
				case FLOAT:
					{
					setState(55);
					type_float();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				{
				_localctx = new Code_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				id();
				}
				break;
			case 7:
				{
				_localctx = new Unary_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				((Unary_operationContext)_localctx).operator = match(OP_UNI_1);
				setState(60);
				((Unary_operationContext)_localctx).operand = code(6);
				}
				break;
			case 8:
				{
				_localctx = new Unary_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				((Unary_operationContext)_localctx).operator = match(OP_UNI_3);
				setState(62);
				((Unary_operationContext)_localctx).operand = code(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Binary_operationContext(new CodeContext(_parentctx, _parentState));
						((Binary_operationContext)_localctx).ordL = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_code);
						setState(65);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(66);
						((Binary_operationContext)_localctx).operator = match(OP_BIN_1);
						setState(67);
						((Binary_operationContext)_localctx).ordR = code(6);
						}
						break;
					case 2:
						{
						_localctx = new Binary_operationContext(new CodeContext(_parentctx, _parentState));
						((Binary_operationContext)_localctx).ordL = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_code);
						setState(68);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(69);
						((Binary_operationContext)_localctx).operator = match(OP_BIN_2);
						setState(70);
						((Binary_operationContext)_localctx).ordR = code(5);
						}
						break;
					case 3:
						{
						_localctx = new AssignContext(new CodeContext(_parentctx, _parentState));
						((AssignContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_code);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						match(OP_BIN_3);
						setState(73);
						((AssignContext)_localctx).rhs = code(3);
						}
						break;
					case 4:
						{
						_localctx = new Function_callContext(new CodeContext(_parentctx, _parentState));
						((Function_callContext)_localctx).func = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_code);
						setState(74);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(75);
						match(T__0);
						setState(87);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
							{
							}
							break;
						case 2:
							{
							setState(85);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << OP_UNI_1) | (1L << OP_UNI_3) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
								{
								setState(77);
								code(0);
								setState(82);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==T__4) {
									{
									{
									setState(78);
									match(T__4);
									setState(79);
									code(0);
									}
									}
									setState(84);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
							}

							}
							break;
						}
						setState(89);
						match(T__1);
						}
						break;
					case 5:
						{
						_localctx = new SkipContext(new CodeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_code);
						setState(90);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(91);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Type_Context extends ParserRuleContext {
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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
		enterRule(_localctx, 6, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
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

	public static class Type_intContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HijackParser.INT, 0); }
		public Type_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_intContext type_int() throws RecognitionException {
		Type_intContext _localctx = new Type_intContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(INT);
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

	public static class Type_floatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(HijackParser.FLOAT, 0); }
		public Type_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_float; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HijackVisitor ) return ((HijackVisitor<? extends T>)visitor).visitType_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_floatContext type_float() throws RecognitionException {
		Type_floatContext _localctx = new Type_floatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FLOAT);
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
		case 1:
			return code_sempred((CodeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean code_sempred(CodeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\5\3\62\n\3\5\3"+
		"\64\n\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3S\n\3\f\3"+
		"\16\3V\13\3\5\3X\n\3\5\3Z\n\3\3\3\3\3\3\3\7\3_\n\3\f\3\16\3b\13\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\3\4\b\2\4\6\b\n\f\2\3\3\2\t\n\2z\2"+
		"\21\3\2\2\2\4A\3\2\2\2\6c\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16"+
		"\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22"+
		"\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\27\b\3\1\2\27"+
		"\30\7\3\2\2\30\31\5\4\3\2\31\32\7\4\2\2\32B\3\2\2\2\33\37\7\5\2\2\34\36"+
		"\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2"+
		"\2!\37\3\2\2\2\"B\7\6\2\2#$\5\6\4\2$%\5\b\5\2%B\3\2\2\2&\'\5\6\4\2\'\63"+
		"\7\3\2\2(\64\3\2\2\2).\5\b\5\2*+\7\7\2\2+-\5\b\5\2,*\3\2\2\2-\60\3\2\2"+
		"\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61)\3\2\2\2\61\62\3\2\2"+
		"\2\62\64\3\2\2\2\63(\3\2\2\2\63\61\3\2\2\2\64\65\3\2\2\2\65\66\7\4\2\2"+
		"\66\67\5\4\3\f\67B\3\2\2\28;\5\n\6\29;\5\f\7\2:8\3\2\2\2:9\3\2\2\2;B\3"+
		"\2\2\2<B\5\b\5\2=>\7\13\2\2>B\5\4\3\b?@\7\17\2\2@B\5\4\3\5A\26\3\2\2\2"+
		"A\33\3\2\2\2A#\3\2\2\2A&\3\2\2\2A:\3\2\2\2A<\3\2\2\2A=\3\2\2\2A?\3\2\2"+
		"\2B`\3\2\2\2CD\f\7\2\2DE\7\f\2\2E_\5\4\3\bFG\f\6\2\2GH\7\r\2\2H_\5\4\3"+
		"\7IJ\f\4\2\2JK\7\16\2\2K_\5\4\3\5LM\f\t\2\2MY\7\3\2\2NZ\3\2\2\2OT\5\4"+
		"\3\2PQ\7\7\2\2QS\5\4\3\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2"+
		"\2\2VT\3\2\2\2WO\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YN\3\2\2\2YW\3\2\2\2Z[\3\2"+
		"\2\2[_\7\4\2\2\\]\f\3\2\2]_\7\b\2\2^C\3\2\2\2^F\3\2\2\2^I\3\2\2\2^L\3"+
		"\2\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\5\3\2\2\2b`\3\2\2\2c"+
		"d\t\2\2\2d\7\3\2\2\2ef\7\20\2\2f\t\3\2\2\2gh\7\21\2\2h\13\3\2\2\2ij\7"+
		"\22\2\2j\r\3\2\2\2\16\21\37.\61\63:ATWY^`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}