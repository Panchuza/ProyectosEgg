package guia1;

import java.util.Scanner;

public class ejercicioExtra10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        boolean bandera = true;
        int n1 = (int) Math.floor(Math.random() * 9 + 1);
        int n2 = (int) Math.floor(Math.random() * 9 + 1);
        int mult = n1 * n2;
        System.out.println("" + mult);
        do {
            System.out.println("Adivine el resultado de la multiplicacion");
            num = read.nextInt();
            if (num != mult) {
                System.out.println("INCORRECTO");
            }
            if (num == mult) {
                bandera = false;
            }
        } while (bandera != false);
        System.out.println("¡Acertaste! CORRECTO");
    }

}
