package BUCLES;

import java.util.Scanner;

public class EjBucles32 { // Calcular digitos pares de un número y sumarlos:
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long resto = 0;
        long volteado = 0;
        long suma = 0;

        System.out.println("Introduzca un número entero positivo:");
        long numero = sc.nextLong();
        System.out.print("Dígitos pares: ");

        // Primero le damos la vuelta al número para poder sacar los dígitos en orden:
        while (numero > 0)
        {
            resto = numero % 10;
            volteado = volteado*10 + resto;
            // Actualiza condicion:
            numero = numero/10;
        }
        while (volteado > 0) // Recorremos el número volteado comprobando digitos pares e imprimiendo:
        {
            resto = volteado % 10;
            if (resto % 2 == 0)
            {
                System.out.print(resto + " ");
                suma = suma + resto;
            }
            // Actualiza condición:
            volteado = volteado/10;
        }
        System.out.println("");
        System.out.println("Suma de los dígitos pares: " + suma);

        sc.close();
    }
}
