package Excecoes;

public class CirculoException extends Exception{

	public CirculoException() {
		super("Impossível calcular a área ou perimetro do círculo");
	}
	
	public CirculoException(String message) { super(message); }
	
}
