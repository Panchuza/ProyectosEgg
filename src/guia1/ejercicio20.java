
package guia1;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros: ");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int n3 = leer.nextInt();
        int n4 = leer.nextInt();
        while (((n1 < 0) || (n1 > 20)) || ((n2 < 0) || (n2 > 20)) || ((n3 < 0) || (n3 > 20)) || ((n4 < 0) || (n4 > 20))){
        System.out.println("El numero ingresado debe estar comprendido entre 1 y 20");
        if ((n1 < 0) || (n1 > 20)){
        n1 = leer.nextInt();
        }
        if ((n2 < 0) || (n2 > 20)){
        n2 = leer.nextInt();
        }
        if ((n3 < 0) || (n3 > 20)){
        n3 = leer.nextInt();
        }
        if ((n4 < 0) || (n4 > 20)){
        n4 = leer.nextInt();
        }
    }
        System.out.print(n1);
        for (int i = 0; i < n1; i++){
            System.out.print("*");
        }
        System.out.println("");
            System.out.print(n2);
        for (int i = 0; i < n2; i++){
            System.out.print("*");
        }
        System.out.println("");
            System.out.print(n3);
        for (int i = 0; i < n3; i++){
            System.out.print("*");
        }
        System.out.println("");
            System.out.print(n4);
        for (int i = 0; i < n4; i++){
            System.out.print("*");
        }
    }
    
}
