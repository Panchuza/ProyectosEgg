package guia1;

import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = num.nextInt();
        System.out.println("El doble del numero ingresado es: " + (numero * 2)+ " el triple del numero ingresado es: " + (numero * 3) + " la raiz cuadrada del numero ingresado es: " + Math.sqrt(numero) );
    }
    
}
