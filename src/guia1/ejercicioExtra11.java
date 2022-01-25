package guia1;

import java.util.Scanner;

public class ejercicioExtra11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i = 1, num;
        System.out.println("Ingrese un numero: ");
        int n = read.nextInt();
        while (n > 9) {
            n = n/10;
            i = i + 1;
        }
        System.out.println("Los digitos son: "+i);
    }

}
