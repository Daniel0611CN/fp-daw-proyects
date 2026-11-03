package BUCLES;

import java.util.Scanner;

// Sacar los pares sin dar la vuelta y metiendolos en un String (concatenando por delante)

public class EjBucles32_2 { 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long resto = 0;
        long suma = 0;
        String listaPares = "";

        System.out.println("Introduzca un número entero positivo:");
        long numero = sc.nextLong();
        long numeroOperativo = numero; //Vuelco en otra variable para mantener el valor original

        while (numeroOperativo > 0) // Recorremos el número comprobando digitos pares e imprimiendo:
        {
            resto = numeroOperativo % 10;

            if (resto % 2 == 0)
            {
                listaPares = resto + " " + listaPares; // Sumo por delante al String y así no hay que darle la vuelta
                suma = suma + resto;
            }
            // Actualiza condición:
           numeroOperativo = numeroOperativo/10;
        }
        System.out.println("Dígitos pares: " + listaPares);
        System.out.println("Suma de los dígitos pares: " + suma);

        sc.close();
    }
}
