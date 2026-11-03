package EXAMEN;

public class ej3_examT5 {
    

    /*          COMENTARIOS PROFESOR:
     * Ej3: el método completafila() no entiendo lo que haces en los if con el >4??,
     * creo que es para que no salga un número diferente al rango, pero dije que podía ser cualquier número,
     * por lo demás bastante bien.
     *
     *          CORRECCIÓN:
     *
     * En el examen, no entendí bien la forma de conseguir llegar a 24, seguramente por las prisas,
     * además desglosé mucho el problema y no fui capaz de hacerlo funcionar en conjunto de forma correcta.
     *
     * En esta ocasión lo he re-hecho de cero sin mirar el anterior y he simplificado mucho su funcionamiento,
     * ya que ahora saco el total y los ceros de cada línea, y voy dividiendo la diferencia hasta 24 entre
     * los ceros restantes y actualizando las condiciones hasta el final de la línea.
     */

     public static void main(String[] args) {

        int[][] matriz = new int[5][10];

        rellenaMatriz(matriz);

        mostrar(matriz);

        sustituyeCeros(matriz);

        mostrar(matriz);

    }


    /**
     * Rellena la matriz con números aleatorios de 0 a 4
     * @param arrayBi
     */
    static void rellenaMatriz(int[][] arrayBi)
    {
        for (int i = 0; i < arrayBi.length; i++)
        {
            for (int j = 0; j < arrayBi[0].length; j++)
            {
                arrayBi[i][j] = (int)(Math.random()*5);
            }
        }
    }

    /**
     * Modifica los ceros para igualar el total a 24
     * @param arrayBi
     */
    static void sustituyeCeros(int[][] arrayBi)
    {
        for (int i = 0; i < arrayBi.length; i++) // Implemento las acciones para cada fila:
        {
            int total = 0;
            int ceros = 0;

            for (int j = 0; j < arrayBi[0].length; j++) // Una primera pasada para sacar el total y contar ceros
            {
                // acumulo el total:
                total += arrayBi[i][j];

                // cuento ceros:
                if(arrayBi[i][j] == 0)
                {
                    ceros++;
                }
            }

            if(total != 24 && ceros>0) // En caso de que haya posiciones que cambiar:
            {
                int diferencia = 24-total; // Cantidad hasta llegar a 24

                // Vuelvo a recorrer la fila cambiando los ceros por la parte proporcional que me quede para llegar a 24:
                for (int j = 0; j < arrayBi[0].length; j++)
                {
                    // cambio ceros:
                    if(arrayBi[i][j] == 0)
                    {
                        int nuevoValor = (int)(diferencia/ceros); // divido la diferencia para calcular el valor a introducir

                        arrayBi[i][j] = nuevoValor;
                        // Actualizo las dos variables para la siguiente vuelta:
                        ceros--;
                        diferencia-=nuevoValor;
                    }
                }
            }
        }
    }


    /**
     * Imprime la matriz según el formato deseado
     * @param arrayBi
     */
    static void mostrar(int[][] arrayBi)
    {
        System.out.println("");
        // Dos FOR anidados imprimen las filas de la matriz y sus totales
        for (int i = 0; i < arrayBi.length; i++)
        {
            int totalFila = 0;
            System.out.print("Fila " + (i+1) + ":\t");

            for (int j = 0; j < arrayBi[0].length; j++)
            {
                totalFila += arrayBi[i][j];

                System.out.print(arrayBi[i][j] + "\t\t");
            }
            System.out.println("| == " + totalFila);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Otros dos FOR anidados recorren la matriz en diferente sentido
        // para imprimir los totales de las columnas:
        for (int i = 0; i < arrayBi[0].length; i++)
        {
            int totalColumna = 0;
            System.out.print("\t\t");

            for (int j = 0; j < arrayBi.length; j++)
            {
                totalColumna += arrayBi[j][i];
            }
            System.out.print(totalColumna + " ");
        }
        System.out.println("");
    }

}
