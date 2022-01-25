package guia1;

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String frase;
        int corr = 0, incorr = 0, lg;
        boolean bandera = true;

        do {
            System.out.println("Ingrese una palabra");
            frase = word.nextLine();
            lg = frase.length();
            if (frase.equals("&&&&&")) {
                bandera = false;
                break;
            }
            if ((lg <= 5 && ("X".equals(frase.substring(0, 1)))) && ("O".equals(frase.substring(lg - 1, lg)))) {
                corr++;
            } else {
                incorr++;
                System.out.println("La palabra debe tener como maximo 5 caracteres");
            }
            if (frase.equals("&&&&&")) {
                bandera = false;
            }
        } while (bandera != false);
        System.out.println("La cantidad de cadenas incorrectas es: " + incorr);
        System.out.println("La cantidad de cadenas correctas es: " + corr);
    }

}
