package ast;

import java.util.List;

import expressions.AbstractExpression;

public class CmdWhile extends AbstractCommand{

	private AbstractExpression expr;
	private List<AbstractCommand> listaCmds;
	
	public CmdWhile() {
		super();
	}

	public CmdWhile(AbstractExpression expr) {
		super();
		this.expr = expr;
	}

	public AbstractExpression getExpr() {
		return expr;
	}

	public void setExpr(AbstractExpression expr) {
		this.expr = expr;
	}

	public List<AbstractCommand> getListaCmds() {
		return listaCmds;
	}

	public void setListaCmds(List<AbstractCommand> listaCmds) {
		this.listaCmds = listaCmds;
	}

	@Override
	public String generateCode(String language) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		for (AbstractCommand cmd: listaCmds) {
			str.append(cmd.generateCode(language));
		}
		return "while (" + expr.toString()+ ") {\n "+ str.toString() + "}\n";
	}
	
	@Override
	public void run() {
	    try {
			while (expr.evaluate()) {  // Assume que a expressão retorna 1 para verdadeiro e 0 para falso.
			    for (AbstractCommand cmd : listaCmds) {
			        try {
						cmd.run();
					} catch (NonBooleanEvaluationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    }
			}
		} catch (NonBooleanEvaluationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
