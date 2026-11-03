package BUCLES;

import java.util.Scanner;

public class NumCapicua {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long resto = 0;
        long volteado = 0;

        System.out.println("Introduzca un número entero positivo:");
        long numero = sc.nextLong();
        long numOperativo = numero;

        // Lo más sencillo es darle la vuelta y compararlo consigo mismo, así nos da igual el largo
        while (numOperativo > 0)
        {
            resto = numOperativo % 10;
            volteado = (volteado*10)+resto;

            // Actualiza condición:
            numOperativo = numOperativo/10;
        }
        // COMPARAMOS:
        if (numero == volteado)
        {
            System.out.println("El " + numero + " es capicúa.");
        }
        else
        {
            System.out.println("El " + numero + " no es capicúa.");
        }

        sc.close();
    }
}
