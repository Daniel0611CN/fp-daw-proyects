package ARRAY;

public class ej13ArrayBi {

    public static void main(String[] args) {

        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] alturas = new int[4][10];

        rellenarAlturas(alturas);

        imprimirTabla(alturas, pais);

    }

    /**
     * Rellena el array con numeros aleatorios
     * @param arrayBi
     */
    static void rellenarAlturas(int[][] arrayBi)
    {
        for (int i = 0; i < arrayBi.length; i++)
        {
            for (int j = 0; j < arrayBi[0].length; j++)
            {
                arrayBi[i][j] = (int)(Math.random()*71+140);
            }
        }
    }

    /**
     * Calcula el valor medio de una fila
     * @param arrayBi
     * @return media
     */
    static int calculaMediaPais(int[][] arrayBi, int pais)
    {
        int media = 0;

        for (int i = 0; i < arrayBi[0].length; i++)
        {
            media = media + arrayBi[pais][i];
        }
        
        if(media/arrayBi[0].length > 0) // controlo la division por cero
        {
            media = (int)(media/arrayBi[0].length);
        }

        return media;
    }

    /**
     * Calcula el valor minimo de una fila
     * @param arrayBi
     * @return minimo
     */
    static int calculaMinimoPais(int[][] arrayBi, int pais)
    {
        int minimo = arrayBi[pais][0];

        for (int i = 0; i < arrayBi[0].length; i++)
        {

            if(arrayBi[pais][i]<minimo)
            {
                minimo = arrayBi[pais][i];
            }
        }

        return minimo;
    }

    /**
     * Calcula el valor maximo de una fila
     * @param arrayBi
     * @return maximo
     */
    static int calculaMaximoPais(int[][] arrayBi, int pais)
    {
        int maximo = arrayBi[pais][0];

        for (int i = 0; i < arrayBi[0].length; i++)
        {

            if(arrayBi[pais][i]>maximo)
            {
                maximo = arrayBi[pais][i];
            }
        }
        return maximo;
    }

    /**
     * Imprime la tabla de alturas por pais
     * @param arrayBi
     * @return media
     */
    static void imprimirTabla(int[][] arrayBid, String[] pais)
    {
            System.out.println("\n \t \t \t \t \t \t \t \t \t \t \t \t  MED \t MIN \t MAX");

        for (int i = 0; i < arrayBid.length; i++)
        {

            if(pais[i].equals("Australia"))
            {
                System.out.print(pais[i] + "\t");
            }
            else 
            {
                System.out.print(pais[i] + "\t\t");
            }


            for (int j = 0; j < arrayBid[0].length; j++)
            {
                System.out.print(arrayBid[i][j] + "  |  ");
                
            }

            int media = calculaMediaPais(arrayBid, i);
            System.out.print("  | " + media);

            int minimo = calculaMinimoPais(arrayBid, i);
            System.out.print("  | " + minimo);

            int maximo = calculaMaximoPais(arrayBid, i);
            System.out.println("  | " + maximo);

        }
        System.out.println("\n");
    }


}
