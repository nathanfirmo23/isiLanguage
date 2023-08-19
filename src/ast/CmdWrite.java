package ast;

import javax.swing.JOptionPane;

import symbols.DataType;
import symbols.Identifier;

public class CmdWrite extends AbstractCommand{
	
	private Identifier id;
	private String text;
	
	public CmdWrite() {
		super();
	}
	
	public CmdWrite(Identifier id) {
		super();
		this.id = id;
	}
	

	public CmdWrite(String text) {
		super();
		this.text = text;
	}
	public String strScanf()
	{
		if(id.getType() == DataType.INTEGER) {
			return "\"%d\","+id.getText();
		}
		else if(id.getType() == DataType.REAL) {
			return "\"%lf\","+id.getText();
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
			codRetorno = "System.out.println(" + (id!=null?id.getText():text) + ");\n";
		}
		else if(language.equalsIgnoreCase("C"))
		{
			if(id != null)
			{
				codRetorno = "printf(" + strScanf() + ");\n";
			}
			else
			{
				codRetorno = "printf(" + text + ");\n";
			}
			
		}		
		return codRetorno;
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, (id!=null? id.getValue():text));
	}

}
