package guia1;

public class ejercicioExtra2 {

    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4, aux;
        System.out.println("Valor inicial de A: " + A + ", Valor inicial de B: " + B + ", Valor inicial de C: " + C + ", Valor inicial de D: " + D);
        aux = C;
        B = aux;
        C = A;
        A = D;
        D = B;
        System.out.println("Valor final de A: " + A + ", Valor final de B: " + B + ", Valor final de C: " + C + ", Valor final de D: " + D);
    }

}
