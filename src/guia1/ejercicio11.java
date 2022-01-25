package guia1;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String palabra = frase.nextLine();
        String R = palabra.substring(0, 1);
        if (R.equals("A") || R.equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
