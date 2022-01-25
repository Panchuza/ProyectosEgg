package guia1;

import java.util.Scanner;

public class ejercicioExtra18 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean bandera = true;
        int i = 0;
        System.out.println("Ingrese la dimension de los vectores: ");
        int N = read.nextInt();
        int[] vector = new int[N];
        int[] vector2 = new int[N];
        for (i = 0; i < N; i++) {
            System.out.println("Ingrese el numero en la posicion " + i);
            int nro = read.nextInt();
            vector[i] = nro;
        }
        System.out.println("---------------");
        for (i = 0; i < N; i++) {
            System.out.println("Ingrese el numero en la posicion " + i);
            int nro = read.nextInt();
            vector2[i] = nro;
        }

        for (i = 0; i < N; i++) {
            if (vector[i] == vector2[i]) {
                bandera = true;
                break;
            } else {
                bandera = false;
                break;
            }
        }

        if (bandera != true) {
            System.out.println("Los vectores son distintos");
        } else {
            System.out.println("Los vectores son iguales");
        }
        for (i = 0; i < N; i++) {
            System.out.println("[" + vector[i] + "]" + "     " + "[" + vector2[i] + "]");
        }
        System.out.println("");
    }

}
