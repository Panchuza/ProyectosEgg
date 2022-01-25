package guia1;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese una nota: ");
        int nota = num.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada no es correcta");
            System.out.println("Ingrese la nota nuevamente: ");
            nota = num.nextInt();
        }
    }

}
