package ast;

public abstract class AbstractCommand {

	public abstract String generateCode(String language);
	public abstract void run() throws NonBooleanEvaluationException;
}
