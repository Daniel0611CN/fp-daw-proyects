package ARRAY;

import java.util.Arrays;

public class EjArray11 {
    public static void main(String[] args) {
        
        // crear array inicial:
        int[] numeros = new int[10];

        // Rellenar con aleatorios de 0 a 15
        llenarAleatorio0_15(numeros);

        // Mostrar con indice en forma de tabla:
        imprimeIndice(numeros);

        // Buscar los primos
        int[] primos = sacaPrimos(numeros);
        System.out.println("Array de primos: " + Arrays.toString(primos));

        // Buscar no primos
        int[] noPrimos = sacaNoPrimos(numeros);
        System.out.println("Array de NO primos: " + Arrays.toString(noPrimos));

        // Unir primos con no primos
        numeros = unirArrays(primos, noPrimos);

        // mostrar array final
        imprimeIndice(numeros);

    }

    /**
     * Llena el array con mnumeros aleatorios de 0 a 15
     * @param array
     */
    static void llenarAleatorio0_15(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = (int)(Math.random()*16);
        }
    }

    /**
     * Imprimir con indice en forma de tabla
     * @param array
     */
    static void imprimeIndice(int[] array)
    {
        System.out.print("\nIndice: \t");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        
        System.out.print("Valor:\t\t");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t"); 
        }
        System.out.println("\n");
    }

    /**
     * Busca los numeros primos del array
     * @param array
     * @return primos
     */
    public static  int[] sacaPrimos(int[] array)
    {
        int[] primos = new int[0];

        for (int i = 0; i < array.length; i++)
        {
            if(FUNCIONES.UtilesParaNumeros.esPrimo(array[i]) == true)
            {
                primos = UtilesArrayHector.insertarAlFinal(primos, array[i]);
            }
        }
        return primos;
    }

    /**
     * Busca los numeros primos del array
     * @param array
     * @return noPrimos
     */
    public static int[] sacaNoPrimos(int[] array)
    {
        int[] noPrimos = new int[0];

        for (int i = 0; i < array.length; i++)
        {
            if(FUNCIONES.UtilesParaNumeros.esPrimo(array[i]) == false)
            {
                noPrimos = UtilesArrayHector.insertarAlFinal(noPrimos, array[i]);
            }
        }
        return noPrimos;
    }

    /**
     * Une dos arrays uno seguido del otro
     * @param array1,array2
     * @return nuevo
     */
    static int[] unirArrays(int[] array1, int[] array2)
    {
        for (int i = 0; i < array2.length; i++)
        {
            array1 = UtilesArrayHector.insertarAlFinal(array1, array2[i]);
        }
        return array1;
    }


}
