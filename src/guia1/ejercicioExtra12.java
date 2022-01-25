package guia1;

import java.util.Scanner;

public class ejercicioExtra12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera: ");
        int n = read.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + j);
            }
            System.out.println("");
        }
    }
}
