package expressions;

public abstract class AbstractExpression {
	
	public abstract int eval();	
	public abstract double evalDouble();
	public abstract String evalText();
	public String expID;
}
