package guia1;

import java.util.Scanner;

public class ejercicioExtra3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = read.nextLine();
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("La letra ingresada es una vocal");

        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
    }

}
