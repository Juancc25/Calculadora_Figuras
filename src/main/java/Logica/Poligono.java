package Logica;

public class Poligono extends Figura{
    int x[], y[], a=0, b=0;
    double distancia[];

    public Poligono(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void calcularArea() {
        for(int i=0;i<x.length-1;i++){
            a += x[x.length-i-1]*y[y.length-i-2];
            b += x[i]*y[i+1];
        }
        if(a>b){
            area = (a-b)/2;
        }else{
            area = (b-a)/2;
        }
    }

    @Override
    public void calcularPerimetro() {
        distancia = new double[x.length];
        for(int i=0;i<x.length;i++){
            distancia[i] = Math.sqrt(Math.pow(x[1]-x[0],2) + Math.pow(y[1]-y[0], 2));
            perimetro += distancia[i];
        }
    }
}
