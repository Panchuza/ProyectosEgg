package guia1;
import java.util.Scanner;

public class ejercicio2{
    
    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Ingrese el primer numero y segundo: ");
    int n1 = num.nextInt();
    int n2 = num.nextInt();
        System.out.println("La suma es: "+ (n1+n2));
    }
}

