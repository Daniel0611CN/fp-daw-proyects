package COLECCIONES;

import java.util.ArrayList;
import java.util.Collections;

public class Ej_2 {
    
    public static void main(String[] args) {
        
        // Creo el Arraylist vacio:
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        // Numero aleatorio que indica el tamaño del ArrayList
        int numInsercciones = (int)(Math.random()*11)+10;
        // Lo muestro:
        System.out.println("Tamaño aleatorio: " + numInsercciones);

        // Inserto los valores aleatorios:
        for (int i = 0; i < numInsercciones; i++)
        {
            listaDeNumeros.add((int)(Math.random()*101));
        }
        // Lo muestro una vez relleno:
        System.out.println(listaDeNumeros);


        // SUMA:
        System.out.println("Suma: " + suma(listaDeNumeros));

        // MEDIA:
        System.out.println("Media: " + media(listaDeNumeros));

        // MAXIMO:
        System.out.println("Máximo: " + maximo(listaDeNumeros));

        // MINIMO:
        System.out.println("Mínimo: " + minimo(listaDeNumeros));

    }

    // METODOS:

    public static int maximo(ArrayList<Integer> lista)
    {
        int maximo = (int) Collections.max(lista);

        return maximo;
    } 

    public static int minimo(ArrayList<Integer> lista)
    {
        int minimo = (int) Collections.min(lista);

        return minimo;
    }

    public static int suma(ArrayList<Integer> lista)
    {
        int suma = 0;

        for (Integer integer : lista)
        {
            suma+=integer;    
        }

        return suma;
    }

    public static double media(ArrayList<Integer> lista)
    {
        int total = suma(lista);

        double media = (double)total/lista.size();

        return media;
    } 
}
