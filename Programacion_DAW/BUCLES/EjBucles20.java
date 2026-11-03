package BUCLES;

import java.util.Scanner;

public class EjBucles20 { // Piramide vacia de altura n
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura:");
        int altura = sc.nextInt();

        String relleno = "+";

        for (int alturaActual = 1; alturaActual <= altura; alturaActual++)
        {
            for (int blancos = 1; blancos <= altura-alturaActual; blancos++)
            {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= (alturaActual*2)-1; asterisco++)
            {
                if (asterisco == 1 || asterisco == (alturaActual*2)-1 || altura == alturaActual)
                {
                    relleno = "*";
                }
                else
                {
                    relleno = " ";
                }
                System.out.print(relleno);
            }

            System.out.println("");
        }


        sc.close();
    }
}
