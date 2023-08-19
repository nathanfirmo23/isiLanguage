package ast;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import symbols.DataType;
import symbols.Identifier;
import symbols.SymbolTable;

public class Program {

	private String filename;
	private List<AbstractCommand> comandos;
	private SymbolTable symbolTable;
	ArrayList<String> listaInteiros = new ArrayList<>();
	ArrayList<String> listaReals = new ArrayList<>();
	ArrayList<String> listaTexts = new ArrayList<>();

	public Program() {
		this.filename = "MainClass.java";
		this.comandos = new ArrayList<AbstractCommand>();
	}

	public void generateTarget(String language) {
		try {
			if(language.equalsIgnoreCase("Java"))
			{
				FileWriter fw = new FileWriter(filename);
				PrintWriter pw = new PrintWriter(fw);
				StringBuilder strBuilder = new StringBuilder();
				strBuilder.append("import java.util.Scanner;\n");
				strBuilder.append("public class MainClass{\n");
				strBuilder.append("	public static void main(String args[]){\n");
				strBuilder.append("	Scanner _key = new Scanner(System.in);\n");			
				for(Identifier symbol: symbolTable.getAll()) {
					if(symbol.getType() == DataType.INTEGER) listaInteiros.add(symbol.getText());
					if(symbol.getType() == DataType.REAL) listaReals.add(symbol.getText());
					if(symbol.getType() == DataType.TEXTO) listaTexts.add(symbol.getText());
					//strBuilder.append(symbol.generateJavaCode()+"\n");
				}
				StringJoiner joiner;
				if (!listaInteiros.isEmpty()) 
				{
			        joiner = new StringJoiner(",");
			        for (String inteiro : listaInteiros) {
			            joiner.add(inteiro);
			        }        
			        strBuilder.append("int " + joiner.toString() +";\n");				
				}
				if (!listaReals.isEmpty()) 
				{
			        joiner = new StringJoiner(",");
			        for (String real : listaReals) {
			            joiner.add(real);
			        }        
			        strBuilder.append("double " + joiner.toString() +";\n");				
				}
				if (!listaTexts.isEmpty()) 
				{
			        joiner = new StringJoiner(",");
			        for (String text : listaTexts) {
			            joiner.add(text);
			        }        
			        strBuilder.append("String " + joiner.toString() +";\n");				
				}			
				comandos.stream().forEach(c -> {
					System.out.print(c.generateCode(language));
					strBuilder.append(c.generateCode(language));
				});
				strBuilder.append("	}");
				strBuilder.append("}");
				pw.println(strBuilder.toString());
				pw.close();
				fw.close();				
			}
			if(language.equalsIgnoreCase("C"))
			{
				filename = "input.c";
				FileWriter fw = new FileWriter(filename);
				PrintWriter pw = new PrintWriter(fw);
				StringBuilder strBuilder = new StringBuilder();
				strBuilder.append("#include <stdio.h>\n");
				strBuilder.append("int main() {\n");	
				for(Identifier symbol: symbolTable.getAll()) {
					if(symbol.getType() == DataType.INTEGER) listaInteiros.add(symbol.getText());
					if(symbol.getType() == DataType.REAL) listaReals.add(symbol.getText());
					if(symbol.getType() == DataType.TEXTO) listaTexts.add(symbol.getText());
					//strBuilder.append(symbol.generateJavaCode()+"\n");
				}
				StringJoiner joiner;
				if (!listaInteiros.isEmpty()) 
				{
			        joiner = new StringJoiner(",");
			        for (String inteiro : listaInteiros) {
			            joiner.add(inteiro);
			        }        
			        strBuilder.append("int " + joiner.toString() +";\n");				
				}
				if (!listaReals.isEmpty()) 
				{
			        joiner = new StringJoiner(",");
			        for (String real : listaReals) {
			            joiner.add(real);
			        }        
			        strBuilder.append("double " + joiner.toString() +";\n");				
				}
				if (!listaTexts.isEmpty()) 
				{
			        joiner = new StringJoiner(",");
			        for (String text : listaTexts) {
			            joiner.add(text);
			        }        
			        strBuilder.append("String " + joiner.toString() +";\n");				
				}			
				comandos.stream().forEach(c -> {
					System.out.print(c.generateCode(language));
					strBuilder.append(c.generateCode(language));
				});
				strBuilder.append("return 0;");
				strBuilder.append("}");
				pw.println(strBuilder.toString());
				pw.close();
				fw.close();				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<AbstractCommand> getComandos() {
		return comandos;
	}

	public void setComandos(List<AbstractCommand> comandos) {
		this.comandos = comandos;
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	public void setSymbolTable(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	public void run() {
		RuntimeEntity runtime = new RuntimeEntity();
		runtime.updateContent(symbolTable.getSymbols().values());
		comandos.stream().forEach(c -> {
			c.run();
			runtime.updateContent(symbolTable.getSymbols().values());
		});
	}
}
