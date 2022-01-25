package guia1;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
    Scanner palabra = new Scanner(System.in);
    System.out.println("Ingrese una frase o palabra: ");
    String frase = palabra.nextLine();
    System.out.println("La frase en mayusculas es: "+ frase.toUpperCase());
    System.out.println("La frase en minisculas es: "+ frase.toLowerCase());
    }
    
}
