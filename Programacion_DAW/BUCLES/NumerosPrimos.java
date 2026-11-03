package BUCLES;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Introduce un número para comprobar si es primo");
        int numero = sc.nextInt();

        for (int aux=numero; aux>0; aux--)
        {
            if (numero%aux==0)
            {
                contador++;
            }
        }
        if (contador<=2)
        {
            System.out.println(numero + " SÍ es primo");
        }
        else
        {
            System.out.println(numero + " NO es primo");
        }

        // La anterior forma es muy ineficiente porque da muchas vueltas al bucle para encotrar dos valores,
        // voy a dividir entre 2 y luego entre 3, y así con solo dos operaciones encuentro si no es primo.

        int divisor=2;

        while(contador<1 || divisor==numero-1)
        {
            if (numero%divisor==0)
            {
                contador++;
            }
            divisor++;
        }

        sc.close();
    }
}
