package BUCLES;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del rectángulo:");
        int altura = sc.nextInt();

        System.out.println("Introduce la anchura del rectángulo:");
        int anchura = sc.nextInt();

        for (int aux2 = 1; aux2 <= altura; aux2++)
        {
            for (int aux = 1; aux <= anchura; aux++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}
