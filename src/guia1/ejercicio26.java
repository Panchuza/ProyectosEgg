package guia1;

import java.util.Scanner;

public class ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz: ");
        int n = leer.nextInt();
        int h = 0;
        int[][] matriz = new int[n][n];
        int[][] matriz2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese los datos de la matriz");
                int nro = leer.nextInt();
                matriz[i][j] = nro;
                matriz2[i][j] = nro;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = matriz[j][i];
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matriz[i][j] == 0) {
                    h++;
                }
                if (i != j && matriz[i][j] == -matriz2[i][j]) {
                    h++;
                }
            }
        }
        if (h == (n*n)) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }
}
