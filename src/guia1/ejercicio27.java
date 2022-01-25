package guia1;

import java.util.Scanner;

public class ejercicio27 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int fila1 = 0, fila2 = 0, fila3 = 0, col1 = 0, col2 = 0, col3 = 0, diag = 0, diag2 = 0, x = 2;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero: ");
                int n = leer.nextInt();
                while (n < 1 || n > 9) {
                    System.out.println("El numero ingresado debe estar 1 y 9");
                    System.out.println("Ingrese un numero nuevamente: ");
                    n = leer.nextInt();
                }
                matriz[i][j] = n;
                if (i == j) {
                    diag = diag + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            col1 = matriz[i][0] + col1;
            col2 = matriz[i][1] + col2;
            col3 = matriz[i][2] + col3;
        }
        for (int j = 0; j < 3; j++) {
            fila1 = matriz[0][j] + fila1;
            fila2 = matriz[1][j] + fila2;
            fila3 = matriz[2][j] + fila3;
        }
        for (int i = 0; i < 3; i++) {
                diag2 = diag2 + matriz[i][x];
                x = x - 1;
        }
        System.out.println("suma " + fila1 + " suma2 " + fila2 + " suma3 " + fila3);
        System.out.println("suma " + col1 + " suma2 " + col2 + " suma3 " + col3);
        System.out.println("sumadiag " + diag + " suma diag2 " + diag2);
        if (fila1 == fila2 && fila2 == fila3 && fila3 == diag && diag == diag2 && diag2 == col1 && col1 == col2 && col2 == col3) {
            System.out.println("Cuadrado magico");
        } else {
            System.out.println("No es un cuadrado magico");
        }
    }

}
