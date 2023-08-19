package expressions;

public class TextExpression extends AbstractExpression {

	private String text;
	
	public TextExpression(String text) {
		super();
		this.text = text;
	}

	public String evalText()
	{
		return text;
	}
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double evalDouble() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
