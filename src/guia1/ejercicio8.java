package guia1;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1 = num.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }

}
