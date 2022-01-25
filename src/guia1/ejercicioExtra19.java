package guia1;

import java.util.Scanner;

public class ejercicioExtra19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        int N = read.nextInt();
        int[] vector = new int[N];
        vector = llenadoMatriz(vector,N);
        mostradoMatriz(vector, N);
    }

    public static int[] llenadoMatriz(int vect[], int nro) {
        for (int i = 0; i < nro; i++) {
            vect[i] = (int) (Math.random() * 100);
        }
        return vect;
    }
    public static void mostradoMatriz(int v[], int num){
        for (int i = 0; i < num; i++) {
            System.out.println("[" + v[i] + "]");
        }
    }

}
