package Figuras;

public class FiguraGeometrica {
	
	private Quadrado quadrado;
	private Retangulo retangulo;
	private Circulo circulo;

	public Circulo criarCirculo(int raio){
		return new Circulo(raio);
    }
	
	public Quadrado criarQuadrado(int largura) {
    	return new Quadrado(largura);
    }
	
	public Retangulo criarRetangulo(int altura, int largura) {
    	return new Retangulo(altura, largura);
    }
	
	@Override
	public String toString() {
		return "";
	}
	
}
