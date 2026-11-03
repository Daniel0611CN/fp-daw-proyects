package BUCLES;

import java.util.Scanner;

public class Cifrado { // Añadir una cantidad fija a cada caracter 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // VARIABLES:
        int factorCifrado = 0;
        String texto = "";
        String palabra = "";
        String palabraCifrada = "";
        String fraseCifrada = "";
        char caracterRevisado = ' ';
        char caracterCifrado = ' ';
        int numeroCaracter = 0;

        System.out.println("Dime el factor de cifrado entre 1 y 9:"); // Numero entre 1 y 9
        factorCifrado = sc.nextInt();

        //limpiar Buffer:
        sc.nextLine();

        System.out.println("Introduce el texto a cifrar (EN MAYÚSCULAS):");
        texto = sc.nextLine().toUpperCase();

        String[] palabras = texto.split(" ");

        // PRIMER BUCLE QUE RECORRE CADA PALABRA DEL ARRAY (y otro dentro que me modifique)
        for (int numeroPalabra = 0; numeroPalabra < palabras.length; numeroPalabra++)
        {
            palabra = palabras[numeroPalabra];
            palabraCifrada = "";

            // SEGUNDO BUCLE QUE CONSTRUYE CADA PALABRA Y LE AÑADE EL FACTOR DE CIFRADO
            for (int contadorCaracter = 0; contadorCaracter<palabra.length(); contadorCaracter++)
            {
                caracterRevisado = palabra.charAt(contadorCaracter);
                numeroCaracter = (int)caracterRevisado + factorCifrado;

                if (numeroCaracter > 90)
                {
                    numeroCaracter = numeroCaracter-26;
                }
                caracterCifrado = (char)numeroCaracter;

                palabraCifrada = "" + palabraCifrada + caracterCifrado;
            }

            palabraCifrada = "" +  factorCifrado + palabraCifrada;
            fraseCifrada = fraseCifrada + palabraCifrada + " ";
        }

        System.out.println(fraseCifrada);

// CON WHILE:
            // System.out.print(factorCifrado);
            // // Bucle que cambia cada caracter:
            // while (contador <= texto.length()-1)
            // {
            //     caracterRevisado = texto.charAt(contador);
            //     numeroCaracter = (int)caracterRevisado + factorCifrado;

            //     if (numeroCaracter > 90)
            //     {
            //         numeroCaracter = numeroCaracter-26;
            //     }
            //     caracterCifrado = (char)numeroCaracter;

            //     System.out.print(caracterCifrado);
            //     contador++;
            // }
            // System.out.println("");

        sc.close();
    }
}
