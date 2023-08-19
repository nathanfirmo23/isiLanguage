package expressions;

import ast.NonBooleanEvaluationException;

public class BinaryExpression extends AbstractExpression{

	private char operator;
	private AbstractExpression leftSide;
	private AbstractExpression rightSide;
	
	public int eval() {
		switch(operator) {
		case '+':
			return leftSide.eval() + rightSide.eval();
		case '-':
			return leftSide.eval() - rightSide.eval();		
		case '/':
			return leftSide.eval() / rightSide.eval();
		case '*':
			return leftSide.eval() * rightSide.eval();		
		default:
			return 0;
		}
	}
	public double evalDouble() {
		switch(operator) {
		case '+':
			return leftSide.evalDouble() + rightSide.evalDouble();
		case '-':
			return leftSide.evalDouble() - rightSide.evalDouble();
		case '/':
			return leftSide.evalDouble() / rightSide.evalDouble();
		case '*':
			return leftSide.evalDouble() * rightSide.evalDouble();
		default:
			return 0;
		}
	}	
	
	@Override
	public String evalText() {
		// TODO Auto-generated method stub
		return null;
	}
	public BinaryExpression(char operator, AbstractExpression leftSide, AbstractExpression rightSide) {
		super();
		this.operator = operator;
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}

	public BinaryExpression(char operator) {
		super();
		this.operator = operator;
	}

	public BinaryExpression() {
		super();
	}
	
	public String toString() {
		return leftSide.toString() + operator + rightSide.toString();
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public AbstractExpression getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(AbstractExpression leftSide) {
		this.leftSide = leftSide;
	}

	public AbstractExpression getRightSide() {
		return rightSide;
	}

	public void setRightSide(AbstractExpression rightSide) {
		this.rightSide = rightSide;
	}
	@Override
    public boolean evaluate() throws NonBooleanEvaluationException {
        switch(operator) {
            case '>':
                return leftSide.eval() > rightSide.eval();
            case '<':
                return leftSide.eval() < rightSide.eval();
            case '=': 
                return leftSide.eval() == rightSide.eval();
            // ... (outros operadores)
            default:
                throw new NonBooleanEvaluationException("The expression does not evaluate to a boolean value.");
        }
    }
	
}
