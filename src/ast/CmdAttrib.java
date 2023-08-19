package ast;

import expressions.AbstractExpression;
import symbols.Identifier;

public class CmdAttrib extends AbstractCommand {

	private Identifier id;
	private AbstractExpression expr;
	private String text;
	
	@Override
	public String generateCode(String language) {
		// TODO Auto-generated method stub
		String content = (expr != null) ? expr.toString() : text;
		return id.getText() + "=" + content + ";\n";
	}

	
	public CmdAttrib(Identifier id, AbstractExpression expr) {
		super();
		this.id = id;
		this.expr = expr;
	}
	public CmdAttrib(Identifier id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public CmdAttrib(Identifier id) {
		super();
		this.id = id;
	}

	public CmdAttrib() {
		super();
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public AbstractExpression getExpr() {
		return expr;
	}

	public void setExpr(AbstractExpression expr) {
		this.expr = expr;
	}

	@Override
	public void run() {
	    if (expr != null) {
	        id.setValue(expr.eval());
	    } else if (text != null) {
	        // Verifique o tipo de dado do identificador
	        switch (id.getType()) {
	            case INTEGER:
	                try {
	                    int intValue = Integer.parseInt(text);
	                    id.setValue(intValue);
	                } catch (NumberFormatException e) {
	                    throw new RuntimeException("O valor textual não pode ser convertido para INTEGER.");
	                }
	                break;
	            case REAL:
	                try {
	                    double doubleValue = Double.parseDouble(text);
	                    id.setDoubleValue(doubleValue);
	                } catch (NumberFormatException e) {
	                    throw new RuntimeException("O valor textual não pode ser convertido para REAL.");
	                }
	                break;
	            case TEXTO:
	                id.setValueText(text);
	                break;
	            default:
	                throw new RuntimeException("Tipo de dado desconhecido.");
	        }
	    }
	}



}
