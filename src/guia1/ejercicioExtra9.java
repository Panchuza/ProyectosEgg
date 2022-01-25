package guia1;

import java.util.Scanner;

public class ejercicioExtra9 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        int dividendo = read.nextInt();
        int divisor = read.nextInt();
        int div, i = 0;
        while (divisor <= 1 || dividendo <= 1) {
            System.out.println("Los numeros deben ser mayores a 1");
            System.out.println("Ingrese dos numeros nuevamante: ");
            dividendo = read.nextInt();
            divisor = read.nextInt();

        }
        while (divisor > dividendo) {
            System.out.println("El dividendo debe ser mayor que el divisor");
            System.out.println("Ingrese dos numeros nuevamante: ");
            dividendo = read.nextInt();
            divisor = read.nextInt();
        }
        do {
           div = dividendo - divisor;
           dividendo = div;
           i = i + 1;
        }while(div>=divisor);
        System.out.println("El residuo es: "+div);
        System.out.println("El cociente es: "+i);
        
    }

}
