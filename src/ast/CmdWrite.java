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
	    // Verifica se o identificador não é nulo
	    if(id != null) {
	        String message;
	        // Se o tipo for TEXTO, pegue o valueText
	        if(id.getType() == DataType.TEXTO) {
	            message = id.getValueText();
	        } else {
	            message = String.valueOf(id.getValue()); // Caso contrário, pegue o valor (isso pode ser estendido para outros tipos se necessário)
	        }
	        JOptionPane.showMessageDialog(null, message);
	    } else {
	        JOptionPane.showMessageDialog(null, text); // Se o identificador for nulo, exiba o texto diretamente
	    }
	}


}
