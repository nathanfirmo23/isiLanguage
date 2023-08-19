// Generated from TypeExpression.g4 by ANTLR 4.4

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, NUMBER=15, REAL=16, TEXT=17, 
		ATTR=18, SUM=19, SUB=20, DIV=21, MUL=22, OPREL=23, ID=24, VIRG=25, PF=26, 
		AP=27, FP=28, BLANK=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'se'", "'INTEGER'", "'senao'", "'TEXTO'", "'REAL'", "'programa'", 
		"'faca'", "'fimse'", "'escreva'", "'fimenquanto'", "'enquanto'", "'fimprog.'", 
		"'entao'", "'leia'", "NUMBER", "REAL", "TEXT", "':='", "'+'", "'-'", "'/'", 
		"'*'", "OPREL", "ID", "','", "'.'", "'('", "')'", "BLANK"
	};
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_tipo = 2, RULE_lista_var = 3, RULE_cmd = 4, 
		RULE_cmdDoWhile = 5, RULE_cmdWhile = 6, RULE_cmdIf = 7, RULE_cmdRead = 8, 
		RULE_cmdWrite = 9, RULE_cmdAttr = 10, RULE_expr = 11, RULE_termo = 12, 
		RULE_fator = 13, RULE_exprl = 14, RULE_termol = 15;
	public static final String[] ruleNames = {
		"programa", "decl", "tipo", "lista_var", "cmd", "cmdDoWhile", "cmdWhile", 
		"cmdIf", "cmdRead", "cmdWrite", "cmdAttr", "expr", "termo", "fator", "exprl", 
		"termol"
	};

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
	public static class ProgramaContext extends ParserRuleContext {
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
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
			setState(32); match(T__8);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33); decl();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__10) | (1L << T__9))) != 0) );
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); cmd();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__7) | (1L << T__5) | (1L << T__3) | (1L << T__0) | (1L << ID))) != 0) );
			setState(43); match(T__2);

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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
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
			setState(46); tipo();
			setState(47); lista_var();
			setState(48); match(PF);
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
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); match(T__12);
				 currentType = DataType.INTEGER; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); match(T__9);
				 currentType = DataType.REAL; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(54); match(T__10);
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

	public static class Lista_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TypeExpressionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TypeExpressionParser.ID, i);
		}
		public TerminalNode VIRG(int i) {
			return getToken(TypeExpressionParser.VIRG, i);
		}
		public List<TerminalNode> VIRG() { return getTokens(TypeExpressionParser.VIRG); }
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
			setState(58); match(ID);
			 symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(60); match(VIRG);
				setState(61); match(ID);
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

	public static class CmdContext extends ParserRuleContext {
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdAttrContext cmdAttr() {
			return getRuleContext(CmdAttrContext.class,0);
		}
		public CmdDoWhileContext cmdDoWhile() {
			return getRuleContext(CmdDoWhileContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
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
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); cmdAttr();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); cmdRead();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); cmdWrite();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(71); cmdIf();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(72); cmdWhile();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(73); cmdDoWhile();
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

	public static class CmdDoWhileContext extends ParserRuleContext {
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
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
			setState(76); match(T__7);

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
					setState(78); cmd();
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
						 	  
			setState(84); match(T__3);
			setState(85); match(AP);
			setState(86); expr();

									_relExpr.setLeftSide(expression);
							  
			setState(88); match(OPREL);

								_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
							  
			setState(90); expr();

								_relExpr.setRightSide(expression);
								_cmdDoWhile.setExpr(_relExpr);
							
						      
			setState(92); match(FP);
			setState(93); match(PF);

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

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
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
			setState(96); match(T__3);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdWhile _cmdWhile = new CmdWhile();
							leftDT = null;
						
			setState(98); match(AP);
			setState(99); expr();

							_relExpr.setLeftSide(expression);
						
			setState(101); match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(103); expr();

							_relExpr.setRightSide(expression);
							_cmdWhile.setExpr(_relExpr);
							
						
			setState(105); match(FP);
			setState(106); match(T__7);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107); cmd();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__7) | (1L << T__5) | (1L << T__3) | (1L << T__0) | (1L << ID))) != 0) );

							_cmdWhile.setListaCmds(stack.pop());
								
						
			setState(113); match(T__4);
			setState(114); match(PF);

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

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
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
			setState(117); match(T__13);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdIf _cmdIf = new CmdIf();
							leftDT = null;
						
			setState(119); match(AP);
			setState(120); expr();

							_relExpr.setLeftSide(expression);
						
			setState(122); match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(124); expr();

							_relExpr.setRightSide(expression);
							_cmdIf.setExpr(_relExpr);
							
						
			setState(126); match(FP);
			setState(127); match(T__1);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128); cmd();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__7) | (1L << T__5) | (1L << T__3) | (1L << T__0) | (1L << ID))) != 0) );

							_cmdIf.setListaTrue(stack.pop());
								
						
			setState(141);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(134); match(T__11);

								stack.push(new ArrayList<AbstractCommand>());
							
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136); cmd();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__7) | (1L << T__5) | (1L << T__3) | (1L << T__0) | (1L << ID))) != 0) );
				}
			}

			setState(143); match(T__6);
			setState(144); match(PF);

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

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
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
			setState(147); match(T__0);
			setState(148); match(AP);
			setState(149); match(ID);

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
						 
			setState(151); match(FP);
			setState(152); match(PF);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TypeExpressionParser.TEXT, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
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
			setState(154); match(T__5);
			setState(155); match(AP);
			setState(160);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(156); match(ID);

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
				setState(158); match(TEXT);

					         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
					         	stack.peek().add(_write);
					         	
					         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(162); match(FP);
			setState(163); match(PF);
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

	public static class CmdAttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(TypeExpressionParser.ATTR, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(165); match(ID);

							idAtribuido = _input.LT(-1).getText();
							if (!symbolTable.exists(_input.LT(-1).getText())){
								throw new RuntimeException("Semantic ERROR - Undeclared Identifier " + _input.LT(-1).getText());
							}
							leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
							rightDT = null;
						
			setState(167); match(ATTR);
			setState(168); expr();
			setState(169); match(PF);

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

	public static class ExprContext extends ParserRuleContext {
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
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
			setState(172); termo();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==SUB) {
				{
				{
				setState(173); exprl();
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

	public static class TermoContext extends ParserRuleContext {
		public List<TermolContext> termol() {
			return getRuleContexts(TermolContext.class);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
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
			setState(179); fator();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MUL) {
				{
				{
				setState(180); termol();
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TypeExpressionParser.TEXT, 0); }
		public TerminalNode REAL() { return getToken(TypeExpressionParser.REAL, 0); }
		public TerminalNode NUMBER() { return getToken(TypeExpressionParser.NUMBER, 0); }
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
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(NUMBER);

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
				setState(188); match(REAL);

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
				setState(190); match(ID);

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
				setState(192); match(TEXT);

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

	public static class ExprlContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(TypeExpressionParser.SUB, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode SUM() { return getToken(TypeExpressionParser.SUM, 0); }
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
			consume();
			 
							operator = _input.LT(-1).getText().charAt(0);
							BinaryExpression _exprADD = new BinaryExpression(operator);
							_exprADD.setLeftSide(expression);
							if (expression.evalText() != null){
								throw new RuntimeException("Semantic ERROR: It is not possible to do arithmetic operations with text.");
							}					
						
			setState(198); termo();

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
			consume();
			 
							operator = _input.LT(-1).getText().charAt(0);
							BinaryExpression _exprADD = new BinaryExpression(operator);
							_exprADD.setLeftSide(expression);
							if (expression.evalText() != null){
								throw new RuntimeException("Semantic ERROR: It is not possible to do arithmetic operations with text.");
							}				
						
			setState(203); fator();

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\6\2%\n\2\r\2\16\2&\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16"+
		"\5E\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\6\7R\n\7\r\7\16"+
		"\7S\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\bo\n\b\r\b\16\bp\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0084\n\t\r\t"+
		"\16\t\u0085\3\t\3\t\3\t\3\t\6\t\u008c\n\t\r\t\16\t\u008d\5\t\u0090\n\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a3\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\7\r\u00b1\n\r\f\r\16\r\u00b4\13\r\3\16\3\16\7\16\u00b8\n\16\f\16\16"+
		"\16\u00bb\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c5\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\25\26\3\2\27\30\u00d5\2\"\3\2"+
		"\2\2\4\60\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16b\3\2"+
		"\2\2\20w\3\2\2\2\22\u0095\3\2\2\2\24\u009c\3\2\2\2\26\u00a7\3\2\2\2\30"+
		"\u00ae\3\2\2\2\32\u00b5\3\2\2\2\34\u00c4\3\2\2\2\36\u00c6\3\2\2\2 \u00cb"+
		"\3\2\2\2\"$\7\b\2\2#%\5\4\3\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\')\3\2\2\2(*\5\n\6\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2"+
		"\2-.\7\16\2\2./\b\2\1\2/\3\3\2\2\2\60\61\5\6\4\2\61\62\5\b\5\2\62\63\7"+
		"\34\2\2\63\5\3\2\2\2\64\65\7\4\2\2\65;\b\4\1\2\66\67\7\7\2\2\67;\b\4\1"+
		"\289\7\6\2\29;\b\4\1\2:\64\3\2\2\2:\66\3\2\2\2:8\3\2\2\2;\7\3\2\2\2<="+
		"\7\32\2\2=C\b\5\1\2>?\7\33\2\2?@\7\32\2\2@B\b\5\1\2A>\3\2\2\2BE\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EC\3\2\2\2FM\5\26\f\2GM\5\22\n\2HM\5"+
		"\24\13\2IM\5\20\t\2JM\5\16\b\2KM\5\f\7\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2"+
		"LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13\3\2\2\2NO\7\t\2\2OQ\b\7\1\2PR\5\n\6"+
		"\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\b\7\1\2VW\7\r\2"+
		"\2WX\7\35\2\2XY\5\30\r\2YZ\b\7\1\2Z[\7\31\2\2[\\\b\7\1\2\\]\5\30\r\2]"+
		"^\b\7\1\2^_\7\36\2\2_`\7\34\2\2`a\b\7\1\2a\r\3\2\2\2bc\7\r\2\2cd\b\b\1"+
		"\2de\7\35\2\2ef\5\30\r\2fg\b\b\1\2gh\7\31\2\2hi\b\b\1\2ij\5\30\r\2jk\b"+
		"\b\1\2kl\7\36\2\2ln\7\t\2\2mo\5\n\6\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq"+
		"\3\2\2\2qr\3\2\2\2rs\b\b\1\2st\7\f\2\2tu\7\34\2\2uv\b\b\1\2v\17\3\2\2"+
		"\2wx\7\3\2\2xy\b\t\1\2yz\7\35\2\2z{\5\30\r\2{|\b\t\1\2|}\7\31\2\2}~\b"+
		"\t\1\2~\177\5\30\r\2\177\u0080\b\t\1\2\u0080\u0081\7\36\2\2\u0081\u0083"+
		"\7\17\2\2\u0082\u0084\5\n\6\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008f"+
		"\b\t\1\2\u0088\u0089\7\5\2\2\u0089\u008b\b\t\1\2\u008a\u008c\5\n\6\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\n\2\2\u0092\u0093\7\34\2\2\u0093\u0094\b"+
		"\t\1\2\u0094\21\3\2\2\2\u0095\u0096\7\20\2\2\u0096\u0097\7\35\2\2\u0097"+
		"\u0098\7\32\2\2\u0098\u0099\b\n\1\2\u0099\u009a\7\36\2\2\u009a\u009b\7"+
		"\34\2\2\u009b\23\3\2\2\2\u009c\u009d\7\13\2\2\u009d\u00a2\7\35\2\2\u009e"+
		"\u009f\7\32\2\2\u009f\u00a3\b\13\1\2\u00a0\u00a1\7\23\2\2\u00a1\u00a3"+
		"\b\13\1\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a5\7\36\2\2\u00a5\u00a6\7\34\2\2\u00a6\25\3\2\2\2\u00a7\u00a8"+
		"\7\32\2\2\u00a8\u00a9\b\f\1\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\5\30\r"+
		"\2\u00ab\u00ac\7\34\2\2\u00ac\u00ad\b\f\1\2\u00ad\27\3\2\2\2\u00ae\u00b2"+
		"\5\32\16\2\u00af\u00b1\5\36\20\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b9\5\34\17\2\u00b6\u00b8\5 \21\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\33"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\21\2\2\u00bd\u00c5\b\17\1\2"+
		"\u00be\u00bf\7\22\2\2\u00bf\u00c5\b\17\1\2\u00c0\u00c1\7\32\2\2\u00c1"+
		"\u00c5\b\17\1\2\u00c2\u00c3\7\23\2\2\u00c3\u00c5\b\17\1\2\u00c4\u00bc"+
		"\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\35\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7\u00c8\b\20\1\2\u00c8\u00c9\5\32"+
		"\16\2\u00c9\u00ca\b\20\1\2\u00ca\37\3\2\2\2\u00cb\u00cc\t\3\2\2\u00cc"+
		"\u00cd\b\21\1\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\b\21\1\2\u00cf!\3\2"+
		"\2\2\20&+:CLSp\u0085\u008d\u008f\u00a2\u00b2\u00b9\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}