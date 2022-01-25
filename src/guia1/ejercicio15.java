package guia1;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float suma, resta, mult, div;
        System.out.println("Ingrese dos numeros: ");
        float n1 = num.nextFloat();
        float n2 = num.nextFloat();
        boolean bandera = true;
        do {
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Eligar opcion: ");
            int n = num.nextInt();
            switch (n) {
                case 1:
                    suma = n1 + n2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    resta = n1 - n2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    mult = n1 * n2;
                    System.out.println("La multiplicacion es: " + mult);
                    break;
                case 4:
                    div = n1 / n2;
                    System.out.println("La division es: " + div);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N)");
                    String opcion = num.next();
                    switch (opcion) {
                        case "S":
                            bandera = false;
                            break;
                        case "N":
                            bandera = true;
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
            }
        } while (bandera != false);
    }
}
