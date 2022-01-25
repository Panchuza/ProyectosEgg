package guia1;

import java.util.Scanner;

public class ejercicio23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int h = 0;
        int j = 0;
        System.out.println("Ingrese la dimension del vector :");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("Ingrese un numero a buscar: ");
        int numBus = leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (numBus == vector[i]) {
                j = j + 1;
                h = i;
            }
        }
        if (j == 1) {
            System.out.println("El numero se encuentra en la posicion: " + h);
        } else if (j > 1) {
            System.out.println("El numero se encuentra en la posicion: " + h);
            System.out.println("El numero se encuentra repetido");
        } else {
            System.out.println("El numero buscado no se encuentra");
        }
        

    }

}
