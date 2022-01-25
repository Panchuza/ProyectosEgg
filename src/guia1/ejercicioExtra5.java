package guia1;

import java.util.Scanner;

public class ejercicioExtra5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean bandera = true;
        double total = 0;
        while (bandera != false) {
            System.out.println("Ingrese el tipo de socio: ");
            String socio = read.nextLine();
            System.out.println("Ingrese el costo del tratamiento: ");
            float costo = read.nextFloat();
            switch (socio) {
                case "A":
                    total = costo - (costo / 2);
                    bandera = false;
                    System.out.println("El valor total a pagar es: " + total + " de acuerdo al socio de tipo " + socio);
                    break;
                case "B":
                    total = costo - (costo * 0.35);
                    bandera = false;
                    System.out.println("El valor total a pagar es: " + total + " de acuerdo al socio de tipo " + socio);
                    break;
                case "C":
                    total = costo;
                    bandera = false;
                    System.out.println("El valor total a pagar es: " + total + " de acuerdo al socio de tipo " + socio);
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    socio = read.nextLine();
                    bandera = true;
                    break;
            }
        }
    }

}
