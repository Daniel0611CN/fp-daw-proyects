package ARRAY;

public class Ej1ArrayBi {
    public static void main(String[] args) {
        
        // Declarar array 5x5
        int[][] arrayBi = new int[5][5];

        // Rellenar con datos
        rellenarArrayBi(arrayBi);

        // mostrar por filas
        EjemploBidimensional.imprimirMatriz(arrayBi);

        System.out.println("\n - - - - - - - - - - - - - \n");

        // mostrar por columnas
        mostrarColumnas(arrayBi);

    }

    /**
     * Llena el array bidimensional
     * @param arrayBi
     */
    static void rellenarArrayBi(int[][] arrayBi)
    {
        for (int f = 0; f < arrayBi.length; f++)
        {
            for (int c = 0; c < arrayBi[f].length; c++)
            {
                arrayBi[c][f] = 10 * c + f;
            }
        }
    }


    /**
     * Imprime por columnas
     * @param arrayBi
     */
    static void mostrarColumnas(int[][] arrayBi)
    {
        for (int c = 0; c < arrayBi[0].length; c++)
        {
            for (int f = 0; f < arrayBi.length; f++)
            {
                System.out.print(arrayBi[f][c] + " ");
            }
            System.out.println();
        }
    }


}
