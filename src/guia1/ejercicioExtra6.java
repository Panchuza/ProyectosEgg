package guia1;

import java.util.Scanner;

public class ejercicioExtra6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la poblacion de la muestra: ");
        double prom1 = 0, prom2 = 0;
        int j = 0;
        int N = read.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la altura: ");
            double altura = read.nextFloat();
            if (altura <= 1.60) {
                prom1 = prom1 + altura;
                j = j + 1;
            }

            prom2 = prom2 + altura;
        }
        System.out.println("El promedio de estaturas de personas que se encuentran por debajo de 1.60m es: " + (prom1 / j));
        System.out.println("El promedio de estaturas de personas en general es: " + (prom2 / N));
    }
}

