package guia1;

import static java.lang.String.valueOf;
import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String a,b,c;
        
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    a = valueOf(i);
                    b = valueOf(j);
                    c = valueOf(k);

                    if (a.equals("3") && b.equals("3") && c.equals("3")) {
                        a = "E";
                        b = "E";
                        c = "E";
                    } else if (a.equals("3") && b.equals("3")) {
                        b = "E";
                        a = "E";
                    } else if (a.equals("3") && c.equals("3")) {
                        c = "E";
                        a = "E";
                    } else if (b.equals("3") && c.equals("3")) {
                        c = "E";
                        b = "E";
                    } else if (a.equals("3")) {
                        a = "E";
                    } else if (b.equals("3")) {
                        b = "E";
                    } else if (c.equals("3")) {
                        c = "E";
                    }
                    System.out.println(a + "-" + b + "-" + c);
                }
            }
        }
    }
}
