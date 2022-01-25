package guia1;

import java.util.Scanner;

public class ejercicioExtra16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = read.nextInt();
        System.out.println("" + nroPrimo(n));
    }

    public static boolean nroPrimo(int nro) {
        boolean bandera;
        int j = 0;
        for (int i = 1; i <= nro; i++) {
            if (nro % i == 0) {
                j = j + 1;
            }
        }
        if (j == 2) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

}
