package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class EjArray6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[15];

        // System.out.println("Introduce los 15 valores numéricos del array:");
        // for(int i=0; i<15; i++)
        // {
        //     numero[i] = sc.nextInt();
        // }

        rellenaAleatorio(numero);

        System.out.println(Arrays.toString(numero));

        rotarXVeces(numero, 5);

        System.out.println(Arrays.toString(numero));

        sc.close();
    }

    // Rellenar array con aleatorios de 0-100
    static void rellenaAleatorio(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = (int) (Math.random()*101);
        }
    }

    // Rotar una posción los valores del Array
    static void rotarArray(int[] array)
    {
        int[] copia = Arrays.copyOfRange(array, 0, array.length);

        for(int aux=0; aux < array.length; aux++)
        {
            if(aux < array.length-1) // caso base
            {
                array[aux+1] = copia[aux];
            }
            else // caso de la ultima posición
            {
                array[0] = copia[aux];
            }
        }
    }

    // Rotar muchas veces:
    static void rotarXVeces(int[] array, int numeroRotaciones)
    {
        for(int aux=0; aux < numeroRotaciones; aux++)
        {
            rotarArray(array);
        }
    }


}
