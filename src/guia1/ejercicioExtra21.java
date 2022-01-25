package guia1;

import java.util.Scanner;

public class ejercicioExtra21 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas y columnas de la matriz: ");
        int n = read.nextInt();
        int m = read.nextInt();
        int suma = 0;
        int[][] matriz = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random()*100);
                suma = suma + matriz[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+matriz[i][j]+"]") ;
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es: "+suma);
    }

}
