package Calculos;

public class Perimetros{

	
    public int retanguloP(int altura, int largura){

        int perimetro = (2 * altura) + (2 * largura);
        return perimetro;
    }
    
    public int QuadradoP(int largura){

        int perimetro = 4 * largura;
        return perimetro;

    }
    
    public double CirculoP(int raio){

        double perimetro = (3.14 * raio);
        return perimetro;
    }
    
}
