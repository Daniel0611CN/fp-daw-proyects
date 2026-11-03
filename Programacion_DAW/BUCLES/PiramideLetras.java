package BUCLES;

import java.util.Scanner;

public class PiramideLetras {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char caracterInicio = 'A';
        String linea = "A";

        System.out.println("Introduce la altura de la Pirámide (máximo 25)");
        int altura = sc.nextInt();

        for (int aux = 0; aux<altura; aux++) // Este bucle dibuja el número de líneas
        {

            for(int aux2 = 1; aux2<=aux; aux2++) // Este bucle construye cada línea
            {
                System.out.println(linea);
                char nuevoCaracter = (char)((int)caracterInicio + aux2);
                linea = linea + nuevoCaracter;
            }

            System.out.println("*");

        }


        // for (int aux = 0; aux < altura; aux++)
        // {
        //     char nuevoCaracter = (char)((int)caracterInicio + aux);
        //     System.out.print(nuevoCaracter);
        // }

        sc.close();
    }
}


