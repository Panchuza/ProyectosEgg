package guia1;

import static java.lang.Math.random;
import java.util.Scanner;

public class ejercicio28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int[][] matriz2 = new int[3][3];
        boolean bandera = false;
        int posc = 0, posf = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (random() * 10);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el numero en la posicion [" + i + "," + j + "] de la matriz");
                int n = leer.nextInt();
                matriz2[i][j] = n;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
       for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (matriz[i][j]== matriz2[0][0]){
                    if ((matriz[i][j+1]== matriz2[0][1]) && (matriz[i][j+2]== matriz2[0][2])){
                        if ((matriz[i+1][j]== matriz2[1][0]) && (matriz[i+1][j+1]== matriz2[1][1]) && (matriz[i+1][j+2]== matriz2[1][2])){
                            if ((matriz[i+2][j]== matriz2[2][0]) && (matriz[i+2][j+1]== matriz2[2][1]) && (matriz[i+2][j+2]== matriz2[2][2])){
                                bandera= true;
                                posc=i;
                                posf=j;
                            }
                        }
                    }
                }
            }
        }

        if (bandera == true) {
            System.out.println("Se encontro la matriz de 3x3 dentro de la matriz de 10x10 con su posicion [0,0] iniciando en la posicion [" + posc + "," + posf + "]");
        } else {
            System.out.println("No se encontro la matriz de 3x3 dentro de la matriz de 10x10");
        }
    }

}
