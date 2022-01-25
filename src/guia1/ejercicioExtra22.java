package guia1;

import java.util.Scanner;

public class ejercicioExtra22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String[][] matriz = new String[20][20];
        int i = 0, n = 20;
        do {
            System.out.println("Ingrese una palabra: ");
            String palabra = read.next();
            int lg = palabra.length();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("La palabra ingresada debe tener entre 3 y 5 caracteres");
                palabra = read.next();
            }
            for (int h = 0; h < 20; h++) {
                for (int j = 0; j < 20; j++) {
                    matriz[h][j] = palabra.substring(lg, lg);
                }
            }
            i = i + 1;
        } while (i < 5);
        for (int h = 0; h < 20; h++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[h][j] + "]");
            }
            System.out.println("");
        }
    }
}
