package BUCLES;

import java.util.Scanner;

public class EjBucles34 { // Numero formado por PARES y otro por IMPARES
    public static void main(String[] args) {
        
        long resto1 = 0;
        long resto2 = 0;
        String listaPares = "";
        String listaImpares = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        long num1 = sc.nextLong();
        long num1operativo = num1;

        System.out.println("Introduzca otro número:");
        long num2= sc.nextLong();
        long num2operativo = num2;

        while (num1operativo>0 && num2operativo>0) // Recorremos ambos números comprobando digitos pares:
        {
            resto1 = num1operativo % 10;
            resto2 = num2operativo % 10;
            
            /* Recorro los numeros sin darles la vuelta, así que para montarlo sumo por delante 
             * (contruyo el numero por el final) entonces tengo que montar antes el dígito del número 2 
             * y despueś el del num 1 para que estén luego en el orden correcto
            */    
            if (resto2 % 2 == 0)
            {
                listaPares = resto2 + "" + listaPares;  // Sumo por delante en el String correspondiente
            }
            else 
            {
                listaImpares = resto2 + "" + listaImpares;
            }

            if (resto1 % 2 == 0)
            {
                listaPares = resto1 + "" + listaPares; // Sumo por delante en el String correspondiente
            }
            else 
            {
                listaImpares = resto1 + "" + listaImpares;
            }

            // Actualiza condición:
           num1operativo = num1operativo/10;
           num2operativo = num2operativo/10;
        }
        System.out.println("El número formado por los dígitos pares: " + listaPares);
        System.out.println("El número formado por los dígitos impares: " + listaImpares);

        sc.close();
    }
}
