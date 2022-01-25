package guia1;

import java.util.Scanner;

public class ejercicioExtra14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean bandera = true;
        System.out.println("Ingrese dos numeros: ");
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            System.out.println("5-Salir");
            int n = read.nextInt();
            switch (n) {
                case 1:
                    System.out.println("La suma es: " + sumaFuncion(n1, n2));
                    break;
                case 2:
                    System.out.println("La resta es: " + restaFuncion(n1, n2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + multiplicacionFuncion(n1, n2));
                    break;
                case 4:
                    while (n1 < n2) {
                        System.out.println("El dividendo debe ser mayor al divisor, ingrese 2 numeros nuevamente: ");
                        n1 = read.nextInt();
                        n2 = read.nextInt();
                    }
                    System.out.println("La division es: " + divisionFuncion(n1, n2));
                    break;
                case 5:
                    System.out.println("¿Desea salir del sistema?(S/N)");
                    String opc = read.next();
                    switch (opc) {
                        case "S":
                            bandera = false;
                            break;
                        case "N":
                            bandera = true;
                            break;
                        default:
                            System.out.println("La opcion ingresada es invalida");
                            break;
                    }
            }

        } while (bandera != false);
    }

    public static int sumaFuncion(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int restaFuncion(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicacionFuncion(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static double divisionFuncion(double num1, double num2) {
        double division = num1 / num2;
        return division;
    }

}
