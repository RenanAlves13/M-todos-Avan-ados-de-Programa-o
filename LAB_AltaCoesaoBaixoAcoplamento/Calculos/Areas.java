package Calculos;

import Figuras.*;
import Excecoes.*;

public class Areas {
	
    public static int RetanguloA(Retangulo obj) throws RetanguloException{

        int area = obj.getAlturaRetangulo() * obj.getLarguraRetangulo();
        System.out.println("A area deste retangulo e: " + area);
        return area;

    }
    
    public static int QuadradoA(Quadrado obj) throws QuadradoException{

        int area = 2 * obj.getLarguraQuadrado();
        System.out.println("A area deste quadrado e: " + area);
        return area;

    }
    
    public static double CirculoA(Circulo obj) throws CirculoException{

        double area = 2 * 3.14 * obj.getRaioCirculo();
        System.out.println("A area deste circulo e: " + area);
        return area;
    }
    
    /*
    public static String todasAsAreas(Retangulo retangulo, Quadrado quadrado, Circulo circulo){

        int areaR = retangulo.getAlturaRetangulo() * retangulo.getLarguraRetangulo();
        int areaQ = 2 * quadrado.getLarguraQuadrado();
        double areaC = 2 * 3.14 * circulo.getRaioCirculo();

        return "Todas as areas sao: " +  areaR + " " + areaQ + " e " 
        + areaC + " retangulo, quadrado e circulo, respectivamente";
    }
    */
}
