package guia1;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese dos numeros :");
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        System.out.println("El mayor numero de los 2 ingresado es: " + Math.max(n1, n2));

    }
}
