package Excecoes;

public class CirculoException extends Exception{

	public CirculoException() {
		super("Impossível calcular a área ou perimetro do círculo");
	}
	
	public CirculoException(String message) { super(message); }
	
	public CirculoException(String message, Throwable cause) { super(message, cause); }
	
	public CirculoException(Throwable cause) { super(cause); }
	
}
