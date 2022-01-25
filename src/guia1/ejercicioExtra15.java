package guia1;

import java.util.Scanner;

public class ejercicioExtra15 {

    public static void main(String[] args) {
        nombreYEdades();

    }

    public static void nombreYEdades() {
        Scanner read = new Scanner(System.in);
        boolean bandera = true;
        do {

            System.out.println("Ingrese el nombre y la edad de la persona: ");
            String nombre = read.next();
            int edad = read.nextInt();
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            if (edad < 18) {
                System.out.println("La persona es menor");
            } else {
                System.out.println("La persona es mayor");
            }
            System.out.println("¿Desea continuar?");
            String opc = read.next();
            switch (opc) {
                case "Si":
                    bandera = true;
                    break;
                case "No":
                    bandera = false;
                    break;
            }
            break;

        } while (bandera != false);
    }

}
