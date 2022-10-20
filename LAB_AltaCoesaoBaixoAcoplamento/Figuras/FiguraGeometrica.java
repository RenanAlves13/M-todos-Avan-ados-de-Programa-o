package Figuras;

import Calculos.Areas;
import Calculos.Perimetros;
import Excecoes.CirculoException;
import Excecoes.QuadradoException;
import Excecoes.RetanguloException;

public class FiguraGeometrica {
	
	private Quadrado quadrado;
	private Retangulo retangulo;
	private Circulo circulo;
	private Areas area = new Areas();
	private Perimetros perimetro = new Perimetros();
	
	public FiguraGeometrica(int altura, int largura, int lado, int raio){
		this.retangulo = new Retangulo(altura, largura);
		this.quadrado = new Quadrado(lado);
		this.circulo = new Circulo(raio);
	}
	
	public FiguraGeometrica() {}
	
	public void criarCirculo(int raio){
		this.circulo = new Circulo(raio);
    }
	
	public void criarQuadrado(int largura) {
    	this.quadrado = new Quadrado(largura);
    }
	
	public void criarRetangulo(int altura, int largura) {
    	this.retangulo = new Retangulo(altura, largura);
    }
	
	public Circulo getCirculo() {
		return this.circulo;
	}
	
	public Quadrado getQuadrado() {
		return this.quadrado;
	}
	
	public Retangulo getRetangulo() {
		return this.retangulo;
	}
	
	//Calcula perimetro de cada figura
	public int perimetroR() throws RetanguloException{
		if(retangulo == null)
			throw new RetanguloException("Não existe um retângulo na sua coleção");
		else
			return perimetro.retanguloP(retangulo.getAlturaRetangulo(), retangulo.getLarguraRetangulo());
	}
	
	public int perimetroQ() throws QuadradoException{
		if(quadrado == null)
			throw new QuadradoException("Não existe um quadrado na sua coleção");
		else
			return perimetro.QuadradoP(quadrado.getLarguraQuadrado());
	}
	
	public double perimetroC() throws CirculoException{
		if(circulo == null)
			throw new CirculoException("Não existe um circulo na sua coleção");
		else
			return perimetro.CirculoP(circulo.getRaioCirculo());
	}

	//Calcula area de cada Figura
	public int areaR() throws RetanguloException{
		if(retangulo == null)
			throw new RetanguloException("Não existe um retângulo na sua coleção.");
		else
			return area.retanguloA(retangulo.getAlturaRetangulo(), retangulo.getLarguraRetangulo());
	}
	
	public int areaQ() throws QuadradoException{
		if(quadrado == null)
			throw new QuadradoException("Não existe um quadrado na sua coleção.");
		else
			return area.quadradoA(quadrado.getLarguraQuadrado());
	}
	
	public double areaC() throws CirculoException{
		if(circulo == null)
			throw new CirculoException("Não existe um circulo na sua coleção.");
		else
			return area.circuloA(circulo.getRaioCirculo());
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%n%s%n", circulo.toString(), quadrado.toString(), retangulo.toString());
	}
}
