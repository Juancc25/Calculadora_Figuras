package Logica;

public abstract class Figura {
    protected double area;
    protected double perimetro;
    
    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    
    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();
}
