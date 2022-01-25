package guia1;

import java.util.Scanner;

public class ejercicioExtra20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] vector = new double[3];
        double prom = 0;
        int desap = 0, aprob = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota del Primer trabajo práctico evaluativo del alumno " + (i+1));
            double nota1 = read.nextDouble();
            System.out.println("Ingrese la nota del Segundo trabajo práctico evaluativo del alumno " + (i+1));
            double nota2 = read.nextDouble();
            System.out.println("Ingrese la nota del Primer Integrador del alumno " + (i+1));
            double nota3 = read.nextDouble();
            System.out.println("Ingrese la nota del Segundo Integrador del alumno " + (i+1));
            double nota4 = read.nextDouble();
            while ((nota1 < 1 || nota1 > 10) || (nota2 < 1 || nota2 > 10) || (nota3 < 1 || nota3 > 10) || (nota4 < 1 || nota4 > 10)) {
                System.out.println("Las notas ingresadas deberan estar entre 1 y 10");
                System.out.println("Ingrese las notas nuevamente");
                nota1 = read.nextDouble();
                nota2 = read.nextDouble();
                nota3 = read.nextDouble();
                nota4 = read.nextDouble();
            }
            prom = ((nota1 * 0.1) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.5));
            vector[i] = prom;
            if (vector[i] <= 7) {
                desap++;
            } else {
                aprob++;
            }
        }
        System.out.println("La cantidad de aprobados son: " + aprob);
        System.out.println("La cantidad de desaprobados son: " + desap);
    }

}
