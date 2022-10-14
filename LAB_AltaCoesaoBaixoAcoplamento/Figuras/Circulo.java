package Figuras;

import Calculos.MedidasGeometricas;

public class Circulo{
        
	private int raio;
	MedidasGeometricas medidas = new MedidasGeometricas();

    public Circulo(int raio){
        this.raio = raio;
    }

    public void setRaioCirculo(int raioCirculo) {
        this.raio = raioCirculo;
    }

    public int getRaioCirculo() {
        return raio;
    }
    
    public int getArea() {
    	return 1;
    }
    
    public int getPerimetro() {
    	return 1;
    }
    
    @Override
    public String toString() {
        return "O circulo criado tem raio de tamanho: " + raio;
    }
   
}
