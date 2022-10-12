package Logica;

public class Circulo extends Figura{
    int x[], y[], distancia = 0;;

    public Circulo(int[] X, int[] Y) {
        this.x = X;
        this.y = Y;
    }
    
    @Override
    public void calcularArea() {
        distancia = (int) Math.sqrt(Math.pow(x[1]-x[0],2) + Math.pow(y[1]-y[0], 2));
        area = (Math.PI*Math.pow(distancia,2));
    }

    @Override
    public void calcularPerimetro() {
        distancia = (int) Math.sqrt(Math.pow(x[1]-x[0],2) + Math.pow(y[1]-y[0], 2));
        perimetro = (Math.PI*2*distancia);
    }
    
}
