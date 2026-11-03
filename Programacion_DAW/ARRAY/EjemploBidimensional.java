package ARRAY;

import java.util.Arrays;


public class EjemploBidimensional {
    public static void main(String[] args) {
        
        int filas = 3;
        int columnas = 4;

        // declarar array bidimensional
        int[][] matriz;
        matriz = new int[filas][columnas];

        // insertar valor pos: fila 1 / columna 3
        matriz[1][3] = 10;

        System.out.println(Arrays.deepToString(matriz));

        imprimirMatriz(matriz);

    }

    static void imprimirMatriz(int[][] arrayBid)
    {
        for (int i = 0; i < arrayBid.length; i++)
        {
            // arrayBid.length es igual al numero de filas
            // recorro cada una de las filas
            System.out.print("Fila " + i + ": \t|");
            
            // por cada fila recorro sus columnas
            int[] fila = arrayBid[i];
            for (int j = 0; j < fila.length; j++)   // es lo mismo que arrayBid[i].length
            {
                String output = "" + fila[j];

                if(fila[j] < 10)
                {
                    output += " "; 
                }

                System.out.print(output + " |");
            }
            System.out.println("");
        }
    }

}
