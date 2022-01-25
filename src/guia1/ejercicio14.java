package guia1;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int suma = 0;
        System.out.println("Ingrese un numero limite: ");
        int numLimite = num.nextInt();
        while (suma <= numLimite){
            System.out.println("Ingrese un numero: ");
            int n1 = num.nextInt();
            suma = suma + n1;
        }
    }
    
}
