package Figuras;

public class Circulo{
        
	private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    public void setRaioCirculo(int raioCirculo) {
        this.raio = raioCirculo;
    }

    public int getRaioCirculo() {
        return raio;
    }
    
    @Override
    public String toString() {
        return "O circulo criado tem raio de tamanho: " + raio;
    }
   
}
