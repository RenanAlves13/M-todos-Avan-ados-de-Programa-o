package Main;

import Figuras.FiguraGeometrica;

public class Main {
	public static void main(String args[]) {
		FiguraGeometrica figuras = new FiguraGeometrica();
		
		//Criando as formas geometricas
		figuras.criarCirculo(4);
		figuras.criarQuadrado(8);
		figuras.criarRetangulo(3, 6);
		
		//Imprimindo as descrições das figuras geometricas
		System.out.println(figuras.toString());

		// Imprimindo o to string
		try {
			System.out.println("");
			System.out.println(figuras.getRetangulo().toString());
			System.out.println(figuras.getQuadrado().toString());
			System.out.println(figuras.getCirculo().toString());
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Imprimindo a area de cada figura
		try {
			System.out.println("");
			System.out.println("Área do quadrado: " + figuras.areaQ());
			System.out.println("Área do círculo: " + figuras.areaC());
			System.out.println("Área do retângulo: " + figuras.areaR());
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Imprimindo o perimetro de cada figura
		try {
			System.out.println();
			System.out.println("Perimetro do quadrado: " + figuras.perimetroQ());
			System.out.println("Perimetro do círculo: " + figuras.perimetroC());
			System.out.println("Perimetro do retângulo: " + figuras.perimetroR());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
