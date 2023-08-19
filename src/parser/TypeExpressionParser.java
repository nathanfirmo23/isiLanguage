// Generated from TypeExpression.g4 by ANTLR 4.13.0
package parser;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TypeExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NUMBER=15, REAL=16, TEXT=17, 
		ATTR=18, SUM=19, SUB=20, DIV=21, MUL=22, OPREL=23, ID=24, VIRG=25, PF=26, 
		AP=27, FP=28, BLANK=29;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_tipo = 2, RULE_lista_var = 3, RULE_cmd = 4, 
		RULE_cmdDoWhile = 5, RULE_cmdWhile = 6, RULE_cmdIf = 7, RULE_cmdRead = 8, 
		RULE_cmdWrite = 9, RULE_cmdAttr = 10, RULE_expr = 11, RULE_termo = 12, 
		RULE_fator = 13, RULE_exprl = 14, RULE_termol = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decl", "tipo", "lista_var", "cmd", "cmdDoWhile", "cmdWhile", 
			"cmdIf", "cmdRead", "cmdWrite", "cmdAttr", "expr", "termo", "fator", 
			"exprl", "termol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'INTEGER'", "'REAL'", "'TEXTO'", "'faca'", 
			"'enquanto'", "'fimenquanto'", "'se'", "'entao'", "'senao'", "'fimse'", 
			"'leia'", "'escreva'", null, null, null, "':='", "'+'", "'-'", "'/'", 
			"'*'", null, null, "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUMBER", "REAL", "TEXT", "ATTR", "SUM", "SUB", "DIV", 
			"MUL", "OPREL", "ID", "VIRG", "PF", "AP", "FP", "BLANK"
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
	public String getGrammarFileName() { return "TypeExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private SymbolTable symbolTable = new SymbolTable();
		private DataType currentType;
		private AbstractExpression expression;
		private char operator;
		private DataType leftDT;
		private DataType rightDT;
		private String   idAtribuido;
		private String   text;
		private Program  program = new Program();
		private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
		
		public void init(){
			program.setSymbolTable(symbolTable);
			stack.push(new ArrayList<AbstractCommand>());
		}
			
		public void exibirID(){
			symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void generateObjectCode(String language){
			program.generateTarget(language);
		}
		
		public void runInterpreter(){
			program.run();
		}

	public TypeExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				decl();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0) );
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				cmd();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16802496L) != 0) );
			setState(43);
			match(T__1);

							program.setComandos(stack.pop());
							symbolTable.getSymbols().values().stream().forEach((id)->{if(id.isUsed() == false) { System.out.println("\u001B[33mWARNING: The variable " + id.getText() + " was declared and was not used\u001B[0m");}});
						
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			tipo();
			setState(47);
			lista_var();
			setState(48);
			match(PF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__2);
				 currentType = DataType.INTEGER; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__3);
				 currentType = DataType.REAL; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__4);
				 currentType = DataType.TEXTO; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TypeExpressionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TypeExpressionParser.ID, i);
		}
		public List<TerminalNode> VIRG() { return getTokens(TypeExpressionParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(TypeExpressionParser.VIRG, i);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterLista_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitLista_var(this);
		}
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			 symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(60);
				match(VIRG);
				setState(61);
				match(ID);
				 symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdAttrContext cmdAttr() {
			return getRuleContext(CmdAttrContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdDoWhileContext cmdDoWhile() {
			return getRuleContext(CmdDoWhileContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				cmdAttr();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				cmdRead();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				cmdWrite();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				cmdIf();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				cmdWhile();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				cmdDoWhile();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdDoWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdDoWhile(this);
		}
	}

	public final CmdDoWhileContext cmdDoWhile() throws RecognitionException {
		CmdDoWhileContext _localctx = new CmdDoWhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdDoWhile);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__5);

								stack.push(new ArrayList<AbstractCommand>());
								BinaryExpression _relExpr = new BinaryExpression();				
								CmdDoWhile _cmdDoWhile = new CmdDoWhile();
								leftDT = null;	
							  
			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78);
					cmd();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

						 	  	_cmdDoWhile.setListaCmds(stack.pop());
						 	  
			setState(84);
			match(T__6);
			setState(85);
			match(AP);
			setState(86);
			expr();

									_relExpr.setLeftSide(expression);
							  
			setState(88);
			match(OPREL);

								_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
							  
			setState(90);
			expr();

								_relExpr.setRightSide(expression);
								_cmdDoWhile.setExpr(_relExpr);
							
						      
			setState(92);
			match(FP);
			setState(93);
			match(PF);

						 	  	stack.peek().add(_cmdDoWhile);
						 	  
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__6);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdWhile _cmdWhile = new CmdWhile();
							leftDT = null;
						
			setState(98);
			match(AP);
			setState(99);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(101);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(103);
			expr();

							_relExpr.setRightSide(expression);
							_cmdWhile.setExpr(_relExpr);
							
						
			setState(105);
			match(FP);
			setState(106);
			match(T__5);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				cmd();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16802496L) != 0) );

							_cmdWhile.setListaCmds(stack.pop());
								
						
			setState(113);
			match(T__7);
			setState(114);
			match(PF);

							stack.peek().add(_cmdWhile);
						
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdIf _cmdIf = new CmdIf();
							leftDT = null;
						
			setState(119);
			match(AP);
			setState(120);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(122);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(124);
			expr();

							_relExpr.setRightSide(expression);
							_cmdIf.setExpr(_relExpr);
							
						
			setState(126);
			match(FP);
			setState(127);
			match(T__9);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				cmd();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16802496L) != 0) );

							_cmdIf.setListaTrue(stack.pop());
								
						
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(134);
				match(T__10);

								stack.push(new ArrayList<AbstractCommand>());
							
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					cmd();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16802496L) != 0) );
				}
			}

			setState(143);
			match(T__11);
			setState(144);
			match(PF);

							_cmdIf.setListaFalse(stack.pop());
							stack.peek().add(_cmdIf);
						
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__12);
			setState(148);
			match(AP);
			setState(149);
			match(ID);

							Identifier id = symbolTable.get(_input.LT(-1).getText());
							if (id == null){
								throw new RuntimeException("Undeclared Variable");
							}
							id.setUsed(true);
							Random random = new Random();
							if(id.getType() == DataType.REAL)
							{
								id.setDoubleValue(Math.round(random.nextDouble() * 1000.0) / 1000.0);
							}
							else if(id.getType() == DataType.INTEGER)
							{
								id.setValue(random.nextInt(1000));
							}
							else
							{
								id.setValueText("Texto generico");
							}				
							CmdRead _read = new CmdRead(id);
							stack.peek().add(_read);
						 
			setState(151);
			match(FP);
			setState(152);
			match(PF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TypeExpressionParser.TEXT, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__13);
			setState(155);
			match(AP);
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(156);
				match(ID);

					         	Identifier id = symbolTable.get(_input.LT(-1).getText());
					         	if (id == null){
					         		throw new RuntimeException("Undeclared Variable");	         		
					         	}
					         	CmdWrite _write = new CmdWrite(id);
					         	stack.peek().add(_write);
					         
				}
				break;
			case TEXT:
				{
				setState(158);
				match(TEXT);

					         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
					         	stack.peek().add(_write);
					         	
					         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(162);
			match(FP);
			setState(163);
			match(PF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(TypeExpressionParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public CmdAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdAttr(this);
		}
	}

	public final CmdAttrContext cmdAttr() throws RecognitionException {
		CmdAttrContext _localctx = new CmdAttrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);

							idAtribuido = _input.LT(-1).getText();
							if (!symbolTable.exists(_input.LT(-1).getText())){
								throw new RuntimeException("Semantic ERROR - Undeclared Identifier " + _input.LT(-1).getText());
							}
							leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
							rightDT = null;
						
			setState(167);
			match(ATTR);
			setState(168);
			expr();
			setState(169);
			match(PF);

								// logica para atribuir o valor da expressao no identificador
								Identifier id = symbolTable.get(idAtribuido);
								CmdAttrib _attr;
								 
								_attr = new CmdAttrib(id, expression);
								if(id.getType() == DataType.REAL)
								{
									id.setDoubleValue(expression.evalDouble());
								}
								else if(id.getType() == DataType.INTEGER)
								{
									id.setValue(expression.eval());
								}
								else
								{
									id.setValueText(expression.evalText());
								}
								id.setUsed(true);
								symbolTable.add(idAtribuido, id);
								
								//System.out.println("EVAL ("+expression+") = "+expression.eval());
								
								
								stack.peek().add(_attr);
								expression = null;					
							
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
		}
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			termo();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==SUB) {
				{
				{
				setState(173);
				exprl();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public List<TermolContext> termol() {
			return getRuleContexts(TermolContext.class);
		}
		public TermolContext termol(int i) {
			return getRuleContext(TermolContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			fator();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MUL) {
				{
				{
				setState(180);
				termol();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TypeExpressionParser.NUMBER, 0); }
		public TerminalNode REAL() { return getToken(TypeExpressionParser.REAL, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TypeExpressionParser.TEXT, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fator);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(NUMBER);

								expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
								expression.expID = _input.LT(-1).getText();
								rightDT = DataType.INTEGER;
								if(leftDT == null) { leftDT = rightDT; }
								if (leftDT != rightDT){
									throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
								}
							
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(REAL);

								expression = new NumberExpression(Double.parseDouble(_input.LT(-1).getText()));
								expression.expID = _input.LT(-1).getText();
								rightDT = DataType.REAL;
								if(leftDT == null) { leftDT = rightDT; }
								if (leftDT != rightDT){
									throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
								}
							
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(ID);

								if (!symbolTable.exists(_input.LT(-1).getText())){
									throw new RuntimeException("Semantic ERROR - Undeclared Identifier: "+_input.LT(-1).getText());
								}
								rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
								if(leftDT == null) { leftDT = rightDT; }
								if (leftDT != rightDT){
									
									throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
								}					
								
								Identifier id = symbolTable.get(_input.LT(-1).getText());
								if (id.getValue() != null){
									expression = new NumberExpression(id.getValue());
									expression.expID = _input.LT(-1).getText();
								}
								else if (id.getDoubleValue() != null){
									expression = new NumberExpression(id.getDoubleValue());
									expression.expID = _input.LT(-1).getText();
								}
								else if (id.getValueText() != null){
									expression = new TextExpression(id.getValueText());
									expression.expID = _input.LT(-1).getText();
								}
								else{
									throw new RuntimeException("Semantic ERROR - Unassigned variable " + _input.LT(-1).getText());
								}
							
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(TEXT);

							  	expression = new TextExpression(_input.LT(-1).getText());
								expression.expID = _input.LT(-1).getText();
								rightDT = DataType.TEXTO;
								if(leftDT == null) { leftDT = rightDT; }
								if (leftDT != rightDT){
									throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
								}			  	
							  
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode SUM() { return getToken(TypeExpressionParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(TypeExpressionParser.SUB, 0); }
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==SUM || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 
							operator = _input.LT(-1).getText().charAt(0);
							BinaryExpression _exprADD = new BinaryExpression(operator);
							_exprADD.setLeftSide(expression);
							if (expression.evalText() != null){
								throw new RuntimeException("Semantic ERROR: It is not possible to do arithmetic operations with text.");
							}					
						
			setState(198);
			termo();

							_exprADD.setRightSide(expression);
							expression = _exprADD;
						
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermolContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(TypeExpressionParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(TypeExpressionParser.MUL, 0); }
		public TermolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterTermol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitTermol(this);
		}
	}

	public final TermolContext termol() throws RecognitionException {
		TermolContext _localctx = new TermolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==DIV || _la==MUL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 
							operator = _input.LT(-1).getText().charAt(0);
							BinaryExpression _exprADD = new BinaryExpression(operator);
							_exprADD.setLeftSide(expression);
							if (expression.evalText() != null){
								throw new RuntimeException("Semantic ERROR: It is not possible to do arithmetic operations with text.");
							}				
						
			setState(203);
			fator();

							_exprADD.setRightSide(expression);
							expression = _exprADD;
						
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004K\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005P\b\u0005\u000b"+
		"\u0005\f\u0005Q\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006m\b\u0006\u000b\u0006\f\u0006"+
		"n\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007"+
		"\u0082\b\u0007\u000b\u0007\f\u0007\u0083\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u008a\b\u0007\u000b\u0007\f\u0007\u008b"+
		"\u0003\u0007\u008e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a1\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00af\b\u000b\n\u000b\f\u000b\u00b2\t\u000b\u0001"+
		"\f\u0001\f\u0005\f\u00b6\b\f\n\f\f\f\u00b9\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c3\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e\u0000\u0002\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0016\u00d3"+
		"\u0000 \u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u00048"+
		"\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\bJ\u0001\u0000"+
		"\u0000\u0000\nL\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000e"+
		"u\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000\u0000\u0000\u0012\u009a"+
		"\u0001\u0000\u0000\u0000\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00ac"+
		"\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000\u0000\u0000\u001a\u00c2"+
		"\u0001\u0000\u0000\u0000\u001c\u00c4\u0001\u0000\u0000\u0000\u001e\u00c9"+
		"\u0001\u0000\u0000\u0000 \"\u0005\u0001\u0000\u0000!#\u0003\u0002\u0001"+
		"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&(\u0003"+
		"\b\u0004\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'"+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+,\u0005\u0002\u0000\u0000,-\u0006\u0000\uffff\uffff\u0000-\u0001"+
		"\u0001\u0000\u0000\u0000./\u0003\u0004\u0002\u0000/0\u0003\u0006\u0003"+
		"\u000001\u0005\u001a\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0005"+
		"\u0003\u0000\u000039\u0006\u0002\uffff\uffff\u000045\u0005\u0004\u0000"+
		"\u000059\u0006\u0002\uffff\uffff\u000067\u0005\u0005\u0000\u000079\u0006"+
		"\u0002\uffff\uffff\u000082\u0001\u0000\u0000\u000084\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u00009\u0005\u0001\u0000\u0000\u0000:;\u0005"+
		"\u0018\u0000\u0000;A\u0006\u0003\uffff\uffff\u0000<=\u0005\u0019\u0000"+
		"\u0000=>\u0005\u0018\u0000\u0000>@\u0006\u0003\uffff\uffff\u0000?<\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DK\u0003\u0014\n\u0000EK\u0003\u0010\b\u0000FK\u0003\u0012"+
		"\t\u0000GK\u0003\u000e\u0007\u0000HK\u0003\f\u0006\u0000IK\u0003\n\u0005"+
		"\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000"+
		"\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u0006\u0000\u0000"+
		"MO\u0006\u0005\uffff\uffff\u0000NP\u0003\b\u0004\u0000ON\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0006\u0005\uffff\uffff\u0000"+
		"TU\u0005\u0007\u0000\u0000UV\u0005\u001b\u0000\u0000VW\u0003\u0016\u000b"+
		"\u0000WX\u0006\u0005\uffff\uffff\u0000XY\u0005\u0017\u0000\u0000YZ\u0006"+
		"\u0005\uffff\uffff\u0000Z[\u0003\u0016\u000b\u0000[\\\u0006\u0005\uffff"+
		"\uffff\u0000\\]\u0005\u001c\u0000\u0000]^\u0005\u001a\u0000\u0000^_\u0006"+
		"\u0005\uffff\uffff\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0005\u0007"+
		"\u0000\u0000ab\u0006\u0006\uffff\uffff\u0000bc\u0005\u001b\u0000\u0000"+
		"cd\u0003\u0016\u000b\u0000de\u0006\u0006\uffff\uffff\u0000ef\u0005\u0017"+
		"\u0000\u0000fg\u0006\u0006\uffff\uffff\u0000gh\u0003\u0016\u000b\u0000"+
		"hi\u0006\u0006\uffff\uffff\u0000ij\u0005\u001c\u0000\u0000jl\u0005\u0006"+
		"\u0000\u0000km\u0003\b\u0004\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0006\u0006\uffff\uffff\u0000qr\u0005\b\u0000\u0000"+
		"rs\u0005\u001a\u0000\u0000st\u0006\u0006\uffff\uffff\u0000t\r\u0001\u0000"+
		"\u0000\u0000uv\u0005\t\u0000\u0000vw\u0006\u0007\uffff\uffff\u0000wx\u0005"+
		"\u001b\u0000\u0000xy\u0003\u0016\u000b\u0000yz\u0006\u0007\uffff\uffff"+
		"\u0000z{\u0005\u0017\u0000\u0000{|\u0006\u0007\uffff\uffff\u0000|}\u0003"+
		"\u0016\u000b\u0000}~\u0006\u0007\uffff\uffff\u0000~\u007f\u0005\u001c"+
		"\u0000\u0000\u007f\u0081\u0005\n\u0000\u0000\u0080\u0082\u0003\b\u0004"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u008d\u0006\u0007\uffff"+
		"\uffff\u0000\u0086\u0087\u0005\u000b\u0000\u0000\u0087\u0089\u0006\u0007"+
		"\uffff\uffff\u0000\u0088\u008a\u0003\b\u0004\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\f\u0000"+
		"\u0000\u0090\u0091\u0005\u001a\u0000\u0000\u0091\u0092\u0006\u0007\uffff"+
		"\uffff\u0000\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0094\u0005\r\u0000"+
		"\u0000\u0094\u0095\u0005\u001b\u0000\u0000\u0095\u0096\u0005\u0018\u0000"+
		"\u0000\u0096\u0097\u0006\b\uffff\uffff\u0000\u0097\u0098\u0005\u001c\u0000"+
		"\u0000\u0098\u0099\u0005\u001a\u0000\u0000\u0099\u0011\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u000e\u0000\u0000\u009b\u00a0\u0005\u001b\u0000"+
		"\u0000\u009c\u009d\u0005\u0018\u0000\u0000\u009d\u00a1\u0006\t\uffff\uffff"+
		"\u0000\u009e\u009f\u0005\u0011\u0000\u0000\u009f\u00a1\u0006\t\uffff\uffff"+
		"\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u001c\u0000"+
		"\u0000\u00a3\u00a4\u0005\u001a\u0000\u0000\u00a4\u0013\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u00a7\u0006\n\uffff\uffff"+
		"\u0000\u00a7\u00a8\u0005\u0012\u0000\u0000\u00a8\u00a9\u0003\u0016\u000b"+
		"\u0000\u00a9\u00aa\u0005\u001a\u0000\u0000\u00aa\u00ab\u0006\n\uffff\uffff"+
		"\u0000\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac\u00b0\u0003\u0018\f\u0000"+
		"\u00ad\u00af\u0003\u001c\u000e\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b7\u0003\u001a\r\u0000\u00b4"+
		"\u00b6\u0003\u001e\u000f\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u0019\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u000f\u0000\u0000\u00bb"+
		"\u00c3\u0006\r\uffff\uffff\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd"+
		"\u00c3\u0006\r\uffff\uffff\u0000\u00be\u00bf\u0005\u0018\u0000\u0000\u00bf"+
		"\u00c3\u0006\r\uffff\uffff\u0000\u00c0\u00c1\u0005\u0011\u0000\u0000\u00c1"+
		"\u00c3\u0006\r\uffff\uffff\u0000\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0007\u0000\u0000\u0000\u00c5\u00c6\u0006\u000e\uffff\uffff\u0000"+
		"\u00c6\u00c7\u0003\u0018\f\u0000\u00c7\u00c8\u0006\u000e\uffff\uffff\u0000"+
		"\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007\u0001\u0000\u0000"+
		"\u00ca\u00cb\u0006\u000f\uffff\uffff\u0000\u00cb\u00cc\u0003\u001a\r\u0000"+
		"\u00cc\u00cd\u0006\u000f\uffff\uffff\u0000\u00cd\u001f\u0001\u0000\u0000"+
		"\u0000\u000e$)8AJQn\u0083\u008b\u008d\u00a0\u00b0\u00b7\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}