package Calculos;

public class Areas {
	
    public int retanguloA(int altura, int largura){

        int area = altura * largura;
        return area;
    }
    
    public int quadradoA(int largura){

        int area = 2 * largura;
        return area;
    }
    
    public double circuloA(int raio){

        double area = 2 * 3.14 * raio;
        return area;
    }
}