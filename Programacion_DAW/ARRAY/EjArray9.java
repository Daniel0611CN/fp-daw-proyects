package ARRAY;

import java.util.Scanner;

public class EjArray9 { // Par o Impar
    public static void main(String[] args) {
        
        int[] numeros = new int[8];

        pideNumeros(numeros);

        parOImpar(numeros);
    }

    // FUNCIONES:

    /**
     * Pide los 8 números y los mete en un array
     * @param array
     */
    static void pideNumeros(int[] array)
    {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        for(int aux=0; aux < array.length; aux++)
        {
            System.out.println("\nIntroduce un número:");
            numero = sc.nextInt();

            array[aux] = numero;
        }
        sc.close();  
    }

    /**
     * Imprime los valores del array con par o impar
     * @param array
     */
    static void parOImpar(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            boolean esPar = parOImpar(array[i]);

            String mensaje = (esPar) ? "Par" : "Impar";

            System.out.println(array[i] + ": " + mensaje);
        }
    }

    /**
     * Comprueba si un numero es par o impar
     * @param array
     * @return esPar
     */
    static boolean parOImpar(int numero)
    {
        boolean esPar = (numero % 2) == 0;

        return esPar;
    }



}
