package Calculos;

import Figuras.*;

public class Perimetros{
    //Main ter try catch para caso tenha erro
    public static int RetanguloP(Retangulo obj){

        int perimetro = (2 * obj.getAlturaRetangulo()) + (2 * obj.getLarguraRetangulo());
        System.out.println("O perimetro do retangulo e: " + perimetro);
        return perimetro;
    }
    public static int QuadradoP(Quadrado obj){

        int perimetro = 4 * obj.getLarguraQuadrado();
        System.out.println("O perimetro do quadrado e: " + perimetro);
        return perimetro;

    }
    public static int CirculoP(Circulo obj){

        int perimetro = (int) (3.14 * obj.getRaioCirculo());
        System.out.println("O perimetro do circulo e: " + perimetro);
        return perimetro;

    }
}
