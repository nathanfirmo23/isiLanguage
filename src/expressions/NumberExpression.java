package expressions;

public class NumberExpression extends AbstractExpression{
	
	private int numberValue;
	private double doubleValue;
	private String text;
	
	public NumberExpression(int numberValue) {
		super();
		this.numberValue = numberValue;
	}
	
	public NumberExpression(double doubleValue) {
		super();
		this.doubleValue = doubleValue;
	}
	public int getNumberValue() {
		return numberValue;
	}


	public void setNumberValue(int numberValue) {
		this.numberValue = numberValue;
	}
	

	public double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public NumberExpression() {
		super();
	}


	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return numberValue;
	}
	
	public String toString(){
		/*if(doubleValue != 0.0) {
			return String.valueOf(doubleValue);
		}
		else {
			return String.valueOf(numberValue);
		}*/
		
		return expID;
	}

	@Override
	public double evalDouble() {
		// TODO Auto-generated method stub
		return doubleValue;
	}

	@Override
	public String evalText() {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
