grammar TypeExpression;

@header{
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	
}

@members{
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
}
programa  : 'programa' decl+ cmd+ 'fimprog.'
			{
				program.setComandos(stack.pop());
				symbolTable.getSymbols().values().stream().forEach((id)->{if(id.isUsed() == false) { System.out.println("\u001B[33mWARNING: The variable " + id.getText() + " was declared and was not used\u001B[0m");}});
			}
		  ;
		  
decl	  : tipo lista_var PF
		  ;
		 
tipo	  : 'INTEGER' { currentType = DataType.INTEGER; }
          | 'REAL'    { currentType = DataType.REAL; }
          | 'TEXTO'    { currentType = DataType.TEXTO; }
          ;
         
lista_var : ID { symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); } 
           (VIRG 
           	ID { symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); }
           )*
   		  ;
   		  
cmd		  : cmdAttr | cmdRead | cmdWrite | cmdIf | cmdWhile | cmdDoWhile
		  ;
cmdDoWhile     : 'faca' {
					stack.push(new ArrayList<AbstractCommand>());
					BinaryExpression _relExpr = new BinaryExpression();				
					CmdDoWhile _cmdDoWhile = new CmdDoWhile();
					leftDT = null;	
				  }
			 	  cmd+
			 	  {
			 	  	_cmdDoWhile.setListaCmds(stack.pop());
			 	  }
			 	  'enquanto'
				  AP expr {
						_relExpr.setLeftSide(expression);
				  }
				  OPREL {
					_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
				  }
				  expr {
					_relExpr.setRightSide(expression);
					_cmdDoWhile.setExpr(_relExpr);
				
			      }				  			  
			 	  FP
			 	  PF {
			 	  	stack.peek().add(_cmdDoWhile);
			 	  }
			  ; 		
cmdWhile     : 'enquanto' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdWhile _cmdWhile = new CmdWhile();
				leftDT = null;
			} 
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			} 
			expr {
				_relExpr.setRightSide(expression);
				_cmdWhile.setExpr(_relExpr);
				
			} FP 'faca'  cmd+  
			{
				_cmdWhile.setListaCmds(stack.pop());
					
			}
			'fimenquanto' PF {
				stack.peek().add(_cmdWhile);
			}		 
		  ; 		  
cmdIf     : 'se' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdIf _cmdIf = new CmdIf();
				leftDT = null;
			} 
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			} 
			expr {
				_relExpr.setRightSide(expression);
				_cmdIf.setExpr(_relExpr);
				
			} FP 'entao'  cmd+  
			{
				_cmdIf.setListaTrue(stack.pop());
					
			}
			('senao' {
				stack.push(new ArrayList<AbstractCommand>());
			}
			cmd+)? 
			
			'fimse' PF {
				_cmdIf.setListaFalse(stack.pop());
				stack.peek().add(_cmdIf);
			}		 
		  ; 
		  
cmdRead   : 'leia' AP ID {
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
			 }
			 FP PF
		  ;		 
		  
cmdWrite  : 'escreva' AP (
	         ID {
	         	Identifier id = symbolTable.get(_input.LT(-1).getText());
	         	if (id == null){
	         		throw new RuntimeException("Undeclared Variable");	         		
	         	}
	         	CmdWrite _write = new CmdWrite(id);
	         	stack.peek().add(_write);
	         } 
	         | 
	         TEXT {
	         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
	         	stack.peek().add(_write);
	         	
	         }
             ) FP PF
          ;		      		  
   		  
cmdAttr   : ID {
				idAtribuido = _input.LT(-1).getText();
				if (!symbolTable.exists(_input.LT(-1).getText())){
					throw new RuntimeException("Semantic ERROR - Undeclared Identifier " + _input.LT(-1).getText());
				}
				leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
				rightDT = null;
			}
         	ATTR expr PF
				{
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
		  ;   		  
		  
expr	  : termo exprl*
          ;
          
          
termo     : fator termol*
          ;	          
fator     : NUMBER 
			{
				expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
				expression.expID = _input.LT(-1).getText();
				rightDT = DataType.INTEGER;
				if(leftDT == null) { leftDT = rightDT; }
				if (leftDT != rightDT){
					throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
				}
			}
		  |
		  REAL
			{
				expression = new NumberExpression(Double.parseDouble(_input.LT(-1).getText()));
				expression.expID = _input.LT(-1).getText();
				rightDT = DataType.REAL;
				if(leftDT == null) { leftDT = rightDT; }
				if (leftDT != rightDT){
					throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
				}
			}
		  |
			ID {
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
			
			| 
			  TEXT{
			  	expression = new TextExpression(_input.LT(-1).getText());
				expression.expID = _input.LT(-1).getText();
				rightDT = DataType.TEXTO;
				if(leftDT == null) { leftDT = rightDT; }
				if (leftDT != rightDT){
					throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
				}			  	
			  }
		  ;
		  
exprl     : (SUM | SUB) { 
				operator = _input.LT(-1).getText().charAt(0);
				BinaryExpression _exprADD = new BinaryExpression(operator);
				_exprADD.setLeftSide(expression);
				if (expression.evalText() != null){
					throw new RuntimeException("Semantic ERROR: It is not possible to do arithmetic operations with text.");
				}					
			} 
			termo
			{
				_exprADD.setRightSide(expression);
				expression = _exprADD;
			}
          ;	
termol     : (DIV | MUL) { 
				operator = _input.LT(-1).getText().charAt(0);
				BinaryExpression _exprADD = new BinaryExpression(operator);
				_exprADD.setLeftSide(expression);
				if (expression.evalText() != null){
					throw new RuntimeException("Semantic ERROR: It is not possible to do arithmetic operations with text.");
				}				
			} 
			fator
			{
				_exprADD.setRightSide(expression);
				expression = _exprADD;
			}
          ;	                   
		  
NUMBER	  : [0-9]+
		  ;
		  
REAL	:	[0-9]+ ('.' [0-9]+)?
		;		  
TEXT 	  : '"' ([a-z]|[A-Z]|[0-9]|' '|'\t'|'!'|'-')* '"'
		  ;		  
		  
ATTR	  : ':='
   		  ;		
   		  
SUM	      : '+'
		  ;
		  
SUB		  : '-'		     		    
          ;
DIV		  : '/'
		  ;
MUL		  : '*'
		  ;
          
OPREL     : '>' | '>=' | '<' | '<=' | '==' | '<>'
 		  ;          
   		  
ID		  : [a-z] ([a-z]|[A-Z]|[0-9])*
          ;
          
VIRG      : ','
          ;
          
PF        : '.'
          ;
          
AP	      : '('          
	      ;
	      
FP 		  : ')'
          ;	      
BLANK     : (' '| '\t' | '\n' | '\r') -> skip
          ;                                 		           		 		 