package ARRAY;

public class EjArray4 {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        rellenaAleatorio(numero);

        rellenaConExponente(numero, cuadrado, 2);

        rellenaConExponente(numero, cubo, 3);

        pintarValores(numero, cuadrado, cubo);

    }

    // FUNCIONES:

    // Rellenar array con aleatorios de 0-100
    static void rellenaAleatorio(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = (int) (Math.random()*101);
        }
    }

    // Rellena Array calculando la potencia de la posicion del primer array
    static void rellenaConExponente(int[] array, int[] array2, int exponente)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array2[aux] = (int)Math.pow(array[aux], exponente);
        }
    }

    // Función para pintarlo como columnas
    static void pintarValores(int[] array1, int[] array2, int[] array3)
    {
        for(int aux=0; aux < array1.length; aux++)
        {
            System.out.println(array1[aux] + "\t" + array2[aux] + "\t" + array3[aux]);
        }
    }
}