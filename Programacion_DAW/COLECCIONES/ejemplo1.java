package COLECCIONES;

import java.util.ArrayList;
import java.util.HashSet;

public class ejemplo1 {
    public static void main(String[] args) {
        

        ArrayList<Integer> lista = new ArrayList<>();

        // Relleno mi lista con 20 numeros aleatorios:
        for (int i = 0; i < 20; i++)
        {
            lista.add((int)(Math.random()*10)+1);
        }

        // muestro la lista:
        System.out.println("Lista de aleatorios: " + lista);



        // CREA UN CONJUNTO CON LOS ELEMENTOS DE LA LISTA SIN REPETIR:
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.addAll(lista);

        // muestro el conjunto_
        System.out.println("Conjunto de números de la lista: " + conjunto);


        // Se puede hacer en un solo paso:
        //HashSet<Integer> conjunto2 = new HashSet<>(lista);

        HashSet<Integer> conjuntoRepetidos = new HashSet<>();
        HashSet<Integer> conjunto1aparicion = new HashSet<>();

        for (int i = 0; i < lista.size(); i++)
        {
            int numeroLeido = lista.get(i);

            if(!conjuntoRepetidos.contains(numeroLeido) && !conjunto1aparicion.contains(numeroLeido))
            {
                conjunto1aparicion.add(numeroLeido);
            }
            else 
            {
                conjuntoRepetidos.add(numeroLeido);
                conjunto1aparicion.remove(numeroLeido);
            }
        }

        System.out.println("Conjunto Repetidos: " + conjuntoRepetidos);
        System.out.println("Conjunto 1 aparición: " + conjunto1aparicion);

    }
}
