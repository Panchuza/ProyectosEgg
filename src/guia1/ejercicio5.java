package guia1;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Ingrese una temperatura en °C: ");
    float temperatura = num.nextFloat();
    float farenheit = 32 + (9*(temperatura/5));
    System.out.println("La temperatura correspondiente en F es: "+ farenheit);
    }
    
}
