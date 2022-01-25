package guia1;

import java.util.Scanner;

public class ejercicioExtra4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1 = read.nextInt();
        while (n1 < 1 || n1 > 10) {
            System.out.println("El numero ingresado debe estar entre 1 y 10");
            System.out.println("Ingrese un numero nuevamente: ");
            n1 = read.nextInt();
        }
        switch (n1){
                case 1: System.out.println("Su equivalente en romano es: I");
                break;
                case 2: System.out.println("Su equivalente en romano es: II");
                break;
                case 3: System.out.println("Su equivalente en romano es: III");
                break;
                case 4: System.out.println("Su equivalente en romano es: IV");
                break;
                case 5: System.out.println("Su equivalente en romano es: V");
                break;
                case 6: System.out.println("Su equivalente en romano es: VI");
                break;
                case 7: System.out.println("Su equivalente en romano es: VII");
                break;
                case 8: System.out.println("Su equivalente en romano es: VIII");
                break;
                case 9: System.out.println("Su equivalente en romano es: IX");
                break;
                default:
                    System.out.println("X");
                    break;
        }
    }

}
