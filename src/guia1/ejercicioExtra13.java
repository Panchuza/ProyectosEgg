package guia1;

import java.util.Scanner;

public class ejercicioExtra13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int m, edad, edades = 0, h = 0;
        float suma = 0, promedio =0;
        System.out.println("Ingrese la cantidad de familias: ");
        int n = read.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia n°: " + i);
            m = read.nextInt();
            h = h + m;
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese las edades de los niños: ");
                edad = read.nextInt();
                edades = edades + edad;
                promedio = edades / m;
                suma = edad + suma;
            }
            edades = 0;
            System.out.println("El promedio de edades de los niños de la familia n°: " + i + " es: " + promedio);
        }
        System.out.println("El promedio de las edades de los niños de todas las familias es: " + (suma / h));
    }

}
