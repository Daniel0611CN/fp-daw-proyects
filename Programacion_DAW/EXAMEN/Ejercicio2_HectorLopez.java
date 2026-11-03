package EXAMEN;

import java.util.Scanner;

public class Ejercicio2_HectorLopez {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int altura = 0;

        System.out.println("Introduce una altura:");
        altura = sc.nextInt();

        // Limpio Buffer despues de leer nº para leer luego texto
        sc.nextLine();

        System.out.println("Introduce una cadena de texto:");
        String texto = sc.nextLine();
        int largoTexto = texto.length();

        // PRIMER BUCLE CREA LA PARTE ARRIBA
        for (int aux = 1; aux <= altura; aux++)
        {
            if (aux%2==0)// ALTURA PAR
            {                              // Añado 4 por la suma de los caracteres añadidos a la cadena introducida (XXXX)
                for (int anc = 1; anc <= largoTexto+4; anc++) 
                {
                    System.out.print("H");
                }
            }
            else // ALTURA IMPAR
            {
                for (int anc = 1; anc <= largoTexto+4; anc++)
                {
                    System.out.print("A");
                }
            }
            System.out.println("");
        }
        
        // FILA CENTRAL
        System.out.println("XX" + "\u001B[32m" + texto + "\u001B[0m" + "XX");


        // REPITO EL BUCLE ANTERIOR
        for (int aux = 1; aux <= altura; aux++)
        {
            if (aux%2==0)
            {
                for (int anc = 1; anc <= largoTexto+4; anc++)
                {
                    System.out.print("H");
                }
            }
            else
            {
                for (int anc = 1; anc <= largoTexto+4; anc++)
                {
                    System.out.print("A");
                }
            }
            System.out.println("");
        }

        sc.close();
    }   
}
