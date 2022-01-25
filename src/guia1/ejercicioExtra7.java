package guia1;

import java.util.Scanner;

public class ejercicioExtra7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i = 0, max = 0, min = 0, prom = 0;
        System.out.println("Ingrese la cantidad de numeros: ");
        int N = read.nextInt();
        while (N < 0) {
            System.out.println("El numero ingresado debe ser mayor a 0: ");
            N = read.nextInt();
        }
        while (i < N) {
            System.out.println("Ingrese un numero: ");
            int nro = read.nextInt();
            if (i == 0) {
                min = nro;
            } else if (nro < min){
                min = nro;
            }
            if (max < nro) {
                max = nro;
            }
            prom = prom + nro;
            i = i + 1;
        }
        System.out.println("El promedio de los numero ingresados es: " + (prom / N));
        System.out.println("El maximo de los numero ingresados es: " + max);
        System.out.println("El minimo de los numero ingresados es: " + min);
    }

}
