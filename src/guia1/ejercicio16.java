package guia1;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        while (i <= 20) {
            System.out.println("Ingrese el numero en la posicion " + i + " : ");
            int n = num.nextInt();
            if (n < 0) {
                System.out.println("El numero ingresado debe ser positivo");
                System.out.println("Ingrese el numero en la posicion " + i + " : ");
                n = num.nextInt();
            }
            suma = suma + n;
            i = i + 1;
            if (n == 0) {
                System.out.println("Se capturo el cero");
                break;
            }
        }
        System.out.println("La suma es: " + suma);
    }

}
