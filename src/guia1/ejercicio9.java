package guia1;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String frase = palabra.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Las frases son iguales");
        } else {
            System.out.println("Las frases son distintas");
        }

    }

}
