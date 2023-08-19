package ast;

import javax.swing.JOptionPane;

import symbols.DataType;
import symbols.Identifier;

public class CmdRead extends AbstractCommand{
	
	private Identifier id;
	
	public CmdRead(Identifier id) {
		super();
		this.id = id;
	}
	public CmdRead() {
		super();
	}

	public String strScanner()
	{
		if(id.getType() == DataType.INTEGER) {
			return "nextInt();";
		}
		else if(id.getType() == DataType.REAL) {
			return "nextDouble();";
		}
		else {
			return "nextLine();";
		}
	}
	public String strScanf()
	{
		if(id.getType() == DataType.INTEGER) {
			return "\"%d\",&"+id.getText();
		}
		else if(id.getType() == DataType.REAL) {
			return "\"%lf\",&"+id.getText();
		}
		else {
			return "\"%s\","+id.getText();
		}
	}	
	@Override
	public String generateCode(String language) {
		// TODO Auto-generated method stub
		String codRetorno = "";
		if(language.equalsIgnoreCase("Java"))
		{
			codRetorno = id.getText() + "= _key." + strScanner() + "\n";
		}
		else if(language.equalsIgnoreCase("C"))
		{
			
			codRetorno = "scanf(" + strScanf() +");\n";
		}
		return codRetorno;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		id.setValue(Integer.parseInt(JOptionPane.showInputDialog("Type Your Input")));
	}

}
