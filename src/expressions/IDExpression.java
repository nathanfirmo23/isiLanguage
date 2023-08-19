package expressions;

public class IDExpression extends AbstractExpression{
	private String id;
	private int    value;
	private double doubleValue;
	public String text;
	
	public int eval() {
		return this.value;
	}
	
	public double evalDouble() {
		return this.doubleValue;
	}
	
	public String evalText() {
		return this.text;
	}	
	public String toString() {
		return this.id;
	}

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
}
