package guia1;

import java.util.Scanner;

public class ejercicioExtra17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese la dimension del vector: ");
        int N = read.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el numero en la posicion: " + i);
            int nro = read.nextInt();
            vector[i] = nro;
            suma = suma + vector[i];
        }
        System.out.println("La suma de los elementos del vector es: " + suma);
    }

}
