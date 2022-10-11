package Excecoes;

public class QuadradoException extends Exception{

	public QuadradoException() {
		super("Impossível calcular a área ou perimetro do quadrado");
	}

	public QuadradoException(String message) { super(message); }
	
	public QuadradoException(String message, Throwable cause) { super(message, cause); }
	
	public QuadradoException(Throwable cause) { super(cause); }
	
}
