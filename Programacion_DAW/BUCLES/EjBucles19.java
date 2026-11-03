package BUCLES;

import java.util.Scanner;

public class EjBucles19 { // Piramide
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura:");
        int altura = sc.nextInt();

        // CON DOS BUCLES

         for (int alturaActual = 1; alturaActual <= altura; alturaActual++)
         {
             for (int blancos = 1; blancos <= altura-alturaActual; blancos++)
             {
                 System.out.print(" ");
             }
             for (int asterisco = 1; asterisco <= (alturaActual*2)-1; asterisco++)
             {
                 System.out.print("*");
             }
             System.out.println("");
         }

        // CON TRES BUCLES

        for (int alturaActual = 1; alturaActual <= altura; alturaActual++)
        {
            for (int blancos = 1; blancos <= altura-alturaActual; blancos++)
            {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= alturaActual; asterisco++)
            {
                System.out.print("*");
            }
            for (int piramide2 = 1; piramide2 <= alturaActual-1; piramide2++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }


        sc.close();
    }
}
