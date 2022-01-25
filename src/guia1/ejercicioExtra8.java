package guia1;

import java.util.Scanner;

public class ejercicioExtra8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 0, i = 0, j = 0, k = 0;
        do {
            System.out.println("Ingrese un numero: ");
            num = read.nextInt();
            if (num % 5 == 0) {
                break;
            }
            i = i + 1;
            if (num % 2 == 0) {
                j = j + 1;
            }
            if (num % 2 != 0) {
                k = k + 1;
            }
            if (num < 0 && num % 2 != 0) {
                i = i - 1;
                k = k - 1;
            } else if (num < 0 && num % 2 == 0) {
                i = i - 1;
                j = j - 1;
            }
        } while (num % 5 != 0);
        System.out.println("La cantidad de numeros leidos es: " + i);
        System.out.println("La cantidad de numero pares ingresados es: " + j);
        System.out.println("La cantidad de numero impares ingresados es: " + k);
    }

}
