package Figuras;

public class Circulo{
        
	private int raioCirculo;

    public Circulo(int raio){
        this.raioCirculo = raio;
    }

    public void setRaioCirculo(int raioCirculo) {
        this.raioCirculo = raioCirculo;
    }

    public int getRaioCirculo() {
        return raioCirculo;
    }
    
    @Override
    public String toString() {
        return "O circulo criado tem raio de tamanho: " + raioCirculo;
    }
}
