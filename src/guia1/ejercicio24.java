package guia1;

import java.util.Scanner;

public class ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        int n = leer.nextInt();
        int j = 0, k = 0, l = 0, m = 0, p = 0;
        int[] vector = new int[n];
    for (int i = 0; i < n ; i++ ){
        vector[i] = (int)(Math.random()*100000);
         if (((vector[i] / 10) < 100) && ((vector[i] / 10) >= 10)){
            j = j + 1;
        }
        if (((vector[i] / 10) < 1000) && ((vector[i] / 10) >= 100)){
            k = k + 1;
        }
        if (((vector[i] / 10) < 10000) && ((vector[i] / 10) >= 1000)){
            l = l + 1;
        }
         if ((vector[i] / 10) < 10){
            m = m + 1;
        }
        if (vector[i] < 10){
            p = p + 1;
        }
        System.out.println("["+vector[i]+"]");
    }
        System.out.println("La cantidad de numero con 1 digito: "+p);
        System.out.println("La cantidad de numero con 2 digito: "+m);
        System.out.println("La cantidad de numero con 3 digito: "+j);
        System.out.println("La cantidad de numero con 4 digito: "+k);
        System.out.println("La cantidad de numero con 5 digito: "+l);
    }
    
}
