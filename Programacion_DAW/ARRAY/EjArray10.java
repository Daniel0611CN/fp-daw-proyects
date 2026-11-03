package ARRAY;

import java.util.Arrays;

public class EjArray10 {
    public static void main(String[] args) {
        
        int[] numeros = new int[20];

        rellenarArray(numeros);

        System.out.println(Arrays.toString(numeros));

        int[] ordenado = ordenarPares(numeros);

        System.out.println(Arrays.toString(ordenado));

    }

    /**
     * Llena el array con numeros aleatorios
     * @param array
     */
    static void rellenarArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random()*101);
        }
    }

    /**
     *Coloca los numeros pares al principio del array
     * @param array
     */
    static int[] ordenarPares(int[] array)
    {
        int[] nuevo = new int[array.length];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random()*101);
        }
        return nuevo;
    }

}
