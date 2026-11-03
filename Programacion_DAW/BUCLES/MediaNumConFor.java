package BUCLES;

import java.util.Scanner;

public class MediaNumConFor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int acumulador = 0;
        double resultado = 0;
        int repeticiones = 10;

        System.out.println("Vamos a hallar la media de una serie de números: ");


        for (int aux = 1; aux <= repeticiones; aux++)
        {
            System.out.println("Dame un número");
            num = sc.nextInt();

            acumulador += num;
        }

        resultado = acumulador/repeticiones;
        System.out.println("La media es " + resultado);

        sc.close();
    }
}
