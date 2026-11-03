package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class EjArray7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[100];

        rellenaAleatorio(numero);

        System.out.println("\nARRAY RELLENO DE 0 A 20:");
        System.out.println(Arrays.toString(numero));

        System.out.println("\nIntroduce el valor a sustituir:");
        int valorSustituido = sc.nextInt();

        System.out.println("\nIntroduce el nuevo valor:");
        int nuevoValor = sc.nextInt();

        int[] posicionCambiada = sustituyeValor(numero, valorSustituido, nuevoValor);

        imprimeConComillas(numero, posicionCambiada);

        sc.close();
   }

    // Rellenar array con aleatorios de 0-20
    static void rellenaAleatorio(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = (int) (Math.random()*21);
        }
    }

    static int[] sustituyeValor(int[] array, int valorBuscado, int nuevoValor)
    {
        int[] poscionCambiada = new int[100];

        for(int aux=0; aux < array.length; aux++)
        {
            if(array[aux] == valorBuscado)
            {
                array[aux] = nuevoValor;
                poscionCambiada[aux] = 1;
            }
        }
        return poscionCambiada;
    }

    static void imprimeConComillas(int[] array, int[] arrayPosiciones)
    {
        System.out.println("\nARRAY CON POSICIONES CAMBIADAS (marcadas con comillas)\n");
        System.out.print("[");

        for(int aux=0; aux < array.length; aux++)
        {
            if(arrayPosiciones[aux] == 1) // Poscion cambiada
            {
                System.out.print("\"" + array[aux] + "\" ");
            }
            else // caso base
            {
                System.out.print(array[aux] + " ");
            }
        }
        System.out.println("]");
    }

}
