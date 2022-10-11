package Figuras;

public class Retangulo {

    private int alturaRetangulo;
	private int larguraRetangulo;

    public Retangulo(int altura, int largura){
        this.alturaRetangulo = altura;
        this.larguraRetangulo = largura;
    }

    public int getAlturaRetangulo() {
        return alturaRetangulo;
    }

    public void setAlturaRetangulo(int alturaRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
    }

    public int getLarguraRetangulo() {
        return larguraRetangulo;
    }

    public void setLarguraRetangulo(int larguraRetangulo) {
        this.larguraRetangulo = larguraRetangulo;
    }

    @Override
    public String toString() {
        return "O retangulo criado tem altura de tamanho: " + alturaRetangulo + 
        " e largura de tamanho: " + larguraRetangulo;
    }
    
}
