package guia1;

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        double euros = leer.nextFloat();
        System.out.println("¿A que moneda desea convertilo?");
        String moneda = leer.next();
        convertirDinero(euros, moneda);
    }

    public static void convertirDinero(double a, String b) {
        double libras = a * 0.86;
        double dolares = a * 1.28611;
        double yenes = a * 129.852;
        if (b.equals("libras")) {
            System.out.println("El cambio de divisas es: ");
            System.out.println(libras);
        }
        if (b.equals("dolares")) {
            System.out.println("El cambio de divisas es: ");
            System.out.println(dolares);
        }
        if (b.equals("yenes")) {
            System.out.println("El cambio de divisas es: ");
            System.out.println(yenes);
        }
    } 
}
