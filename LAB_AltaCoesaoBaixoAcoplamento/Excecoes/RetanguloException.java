package Excecoes;

public class RetanguloException extends Exception{
		
	public RetanguloException() {
		super("Impossível calcular a área ou perimetro do retângulo");
	}
	
	public RetanguloException(String message) { super(message); }
	
}
