package ARRAY;

import java.util.Arrays;

public class ej12ArrayBi { // DIAGONALES
    
    public static void main(String[] args) {
        
        int[][] tabla = new int[9][9];

        rellenaArray(tabla);

        System.out.println("ARRAY RELLENO:");
        imprimirTabla(tabla);

        System.out.print("DIAGONAL ABAJO/IZQ A ARRIBA/DCHA:");
        imprimeDiagonal2(tabla);

        System.out.print("DIAGONAL ARRIBA/IZQ A ABAJO/DCHA:");
        imprimeDiagonal1(tabla);

        int[] extremos = minimoMaximoDiagonal2(tabla);
        System.out.println("MINIMO Y MAXIMO: " + Arrays.toString(extremos));

        int media = mediaDiagonal2(tabla);
        System.out.println("MEDIA: " + media);

    }

    /**
     * Rellena el array con aleatorios de 500 a 900
     * @param array
     */
    static void rellenaArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                array[i][j] = (int)(Math.random()*(900-500+1)+500);
            }    
        }
    }

    /**
     * Imprime el array de dos dimensiones como tabla
     * @param arrayBi
     * @return media
     */
    static void imprimirTabla(int[][] arrayBid)
    {
        System.out.println("\n");

        for (int i = 0; i < arrayBid.length; i++)
        {

            for (int j = 0; j < arrayBid[0].length; j++)
            {
                System.out.print(arrayBid[i][j] + "  |  ");
                
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }


    /**
     * Imprime la diagonal desde abajo/izquierda hasta arriba/derecha
     * @param array
     */
    static void imprimeDiagonal2(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[(array.length-1)-i][i] + " | ");
        }
        System.out.println("");
    }

    /**
     * Imprime la diagonal desde arriba/izquierda hasta abajo/derecha
     * @param array
     */
    static void imprimeDiagonal1(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i][i] + " | ");
        }
        System.out.println("");
    }

    /**
     * Captura el minimo y máximo en un array
     * @param array
     * @return minMax
     */
    static int[] minimoMaximoDiagonal2(int[][] array)
    {
        int[] minMax = new int[2];

        minMax[0] = array[array.length-1][0]; // Vuelco el primer valor a mi posicion minimo
        minMax[1] = array[array.length-1][0]; // Vuelco el primer valor a mi posicion maximo


        for (int i = 0; i < array.length; i++) // Un bucle para MINIMO
        {
            if(array[(array.length-1)-i][i] < minMax[0]) // comparo buscando el mínimo
            {
                minMax[0] = array[(array.length-1)-i][i];
            }
        }

        for (int i = 0; i < array.length; i++) // Un bucle para MAXIMO
        {
            if(array[(array.length-1)-i][i] > minMax[1]) // comparo buscando el máximo
            {
                minMax[1] = array[(array.length-1)-i][i];
            }
        }

        return minMax;
    }

    /**
     * Devuelve la media de los valores de la diagonal
     * desde abajo/izquierda hasta arriba/derecha
     * @param array
     * @return media
     */
    static int mediaDiagonal2(int[][] array)
    {
        int media = 0;

        for (int i = 0; i < array.length; i++)
        {
            media = media + array[(array.length-1)-i][i];
        }
        
        if(array.length != 0) // Controlo la division por cero
        {
            media = media/(array.length);
        }

        return media;
    }



}
