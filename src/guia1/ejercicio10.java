package guia1;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String palabra = frase.nextLine();
        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
