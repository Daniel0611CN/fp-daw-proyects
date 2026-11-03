package ARRAY;

import java.util.Scanner;

public class Ej2ArrayBi {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    
        int[][] matriz = new int[4][4];

        rellenarMatriz(matriz);

        EjemploBidimensional.imprimirMatriz(matriz);

        boolean matrizMagica = esMagica(matriz);

        System.out.println("Es una matriz mágica: " + matrizMagica);
    }

    /**
     * Llena el array con numeros pedidos al usuario
     * @param arrayBi
     */
    static void rellenarMatriz(int[][] arrayBi)
    {
        for (int i = 0; i < arrayBi.length; i++)
        {
            for (int j = 0; j < arrayBi[i].length; j++)
            {
                System.out.println("Introduce un valor:");
                arrayBi[i][j] = sc.nextInt();
            }
        }
    }


    /**
     * Devuelve true si la matriz es mágica
     * @param arrayBi
     * @return matrizMagica
     */
    static boolean esMagica(int[][] arrayBid)
    {
        boolean matrizMagica = true;
        int valorMagico = 0;
        int sumaFila = 0;

        // recorro cada una de las filas
        for (int i = 0; i < arrayBid.length; i++)
        {
            // Compruebo que todas las sumas son iguales que la primera suma y devuelvo true o false
            if (valorMagico != sumaFila)
            {
                matrizMagica = false;
            }

            // Reseteo sumaFila:
            sumaFila = 0 ;

            // por cada fila recorro sus columnas
            for (int j = 0; j < arrayBid[i].length; j++)
            {
                sumaFila = sumaFila + arrayBid[i][j];

                // Este if guarda el valor de sumaFila en el momento
                // en el que he sumado la primera fila completa
                if (i == 0 && j == arrayBid[i].length-1)
                {
                    valorMagico = sumaFila;
                }
            }
        }

        // Bucle que calcula el sumatorio de las columnas:
        for (int j = 0; j < arrayBid[0].length; j++)
        {
            // reseteo la suma de la columna
            int sumaColumna = 0;

            for (int i = 0; i < arrayBid.length; i++)
            {
                sumaColumna = sumaColumna + arrayBid[i][j];
            }

            // Compruebo que todas las sumas son iguales que el valor guardado y devuelvo true o false
            if (valorMagico != sumaColumna)
            {
                matrizMagica = false;
            }

        }
        return matrizMagica;
    }


    
}
