package Principal;

import Logica.Circulo;
import Logica.Figura;
import Logica.Poligono;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, cont=0, cantLados=0, coordX[], coordY[];
        
        System.out.println("Calculadora de Figuras");
        System.out.println("\nSeleccione la figura");
        System.out.println("1. Poligono");
        System.out.println("2. Circulo");
        opc = sc.nextInt();
        
        Figura f;
        switch(opc){
            case 1 -> {
                do{
                    try{
                        System.out.println("\nIngrese la cantidad de lados del polígono (Mayor o igual a 3): ");
                        cantLados = sc.nextInt();
                    }catch(InputMismatchException ime){
                        System.out.println("¡Cuidado! Solo puedes insertar números. ");
                        sc.next();
                    }
                }while(cantLados < 3);
                
                coordX = new int[cantLados + 1];
                coordY = new int[cantLados + 1];
                do{
                    try{
                        System.out.println("\nIngrese las coordenadas en X: ");
                        coordX[cont] = sc.nextInt();
                        System.out.println("Ingrese las coordenadas en Y: ");
                        coordY[cont] = sc.nextInt();
                        cont++;
                    }catch (InputMismatchException ime){
                        System.out.println("\n¡Cuidado! Solo puedes insertar números. ");
                        sc.next();
                    }
                }while(cont<cantLados);
                coordX[cont] = coordX[0];
                coordY[cont] = coordY[0];
                
                f = new Poligono(coordX, coordY);
                mostrar(f);
            }
            case 2 -> {
                coordX = new int[2];
                coordY = new int[2];
                do{
                    try{
                        System.out.println("\nIngrese la coordenada en X: ");
                        coordX[cont] = sc.nextInt();
                        System.out.println("Ingrese la coordenada en Y: ");
                        coordY[cont] = sc.nextInt();
                        cont++;
                    }catch (InputMismatchException ime){
                        System.out.println("\n¡Cuidado! Solo puedes insertar números. ");
                        sc.next();
                    }
                }while(cont<2);
                
                f = new Circulo(coordX, coordY);
                mostrar(f);
            }
            default -> System.out.println("Opcion no valida");
        }
    }
    
    public static void mostrar(Figura f) {
        f.calcularArea();
        f.calcularPerimetro();
        System.out.println("\nArea = " + f.getArea());
        System.out.println("Perimetro = " + f.getPerimetro());
    }
}
