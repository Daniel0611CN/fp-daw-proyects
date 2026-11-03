package ARRAY;

public class Ej3ArrayBi {
    public static void main(String[] args) {
        
        int[][] tabla = new int[4][5];

        rellenarArrayBi(tabla);

        imprimirTabla(tabla);

    }

    /**
     * Llena el array con numeros aleatorios de 0 a 100
     * @param arrayBi
     */
    static void rellenarArrayBi(int[][] arrayBi)
    {
        for (int i = 0; i < arrayBi.length; i++)
        {
            for (int j = 0; j < arrayBi[i].length; j++)
            {
                arrayBi[i][j] = (int)(Math.random()*101);
            }
        }
    }

    static void imprimirTabla(int[][] arrayBid)
    {
        int total = 0;
            // arrayBid.length es igual al numero de filas
        // recorro cada una de las filas
        for (int i = 0; i < arrayBid.length; i++)
        {
            int sumaFila = 0 ;

            System.out.print("|\t");
            // por cada fila recorro sus columnas
            for (int j = 0; j < arrayBid[i].length; j++)
            {
                System.out.print(arrayBid[i][j] + "\t|\t");

                sumaFila = sumaFila + arrayBid[i][j];
            }
            System.out.println("\tΣ fila " + i + ":  " + sumaFila);

            total = total + sumaFila;
        }

        // Bucle que imprime el sumatorio de las columnas:
        for (int j = 0; j < arrayBid[0].length; j++)
        {
            int sumaColumna = 0;
            for (int i = 0; i < arrayBid.length; i++)
            {
                sumaColumna = sumaColumna + arrayBid[i][j];
            }
            System.out.print("  Σ " + j + ": " + sumaColumna + "\t");
        }
        System.out.println("\t\t total: " + total);
    }

}
