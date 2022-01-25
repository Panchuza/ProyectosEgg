package guia1;

import java.util.Scanner;

public class ejercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia = 0, minutos, horas = 0;
        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = leer.nextInt();
        if (minutos < 1440) {
            dia = 0;
        }
        while (minutos >= 1440) {
            minutos = minutos - 1440;
            dia = dia + 1;
        }
        horas = minutos / 60;
        System.out.println("Su equivalente es: " + dia + " dia, " + horas + " horas");
    }

}
