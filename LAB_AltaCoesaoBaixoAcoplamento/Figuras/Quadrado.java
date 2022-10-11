package Figuras;

public class Quadrado {
    
	private int larguraQuadrado;

    public Quadrado(int largura){
        this.larguraQuadrado = largura;
    }

    public void setLarguraQuadrado(int larguraQuadrado) {
        this.larguraQuadrado = larguraQuadrado;
    }

    public int getLarguraQuadrado() {
        return larguraQuadrado;
    }

    @Override
    public String toString() {
        return "O quadrado criado tem lados de tamanho: " + larguraQuadrado; 
    }
    
}
