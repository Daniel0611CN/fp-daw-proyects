package COLECCIONES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sorteo<T extends Comparable<T> > {


    // ATRIBUTOS:
    private HashSet<T> bolsa;


    // CONSTRUCTOR:
    public Sorteo()
    {
        bolsa = new HashSet<T>();
    }

    // METODOS:
    public boolean add(T elemento)
    {
        boolean insertado = false;

        if(!bolsa.contains(elemento))
        {
            bolsa.add(elemento);
            insertado = true;
        }

        return insertado;
    }

    public Set<T> premiados(int numPremiados)
    {
        ArrayList<T> ordenados = new ArrayList<>(bolsa);
 
        // Voy a ordenar los elementos:
        Collections.sort(ordenados);

        // Desordeno de forma aleatoria:
        Collections.shuffle(ordenados);

        // Voy a devolver los X primeros:
        Set<T> premiados = new HashSet<>();


        for (int i = 0; i < numPremiados; i++) 
        {
            premiados.add(ordenados.get(i));
        }

        return premiados;
    }
}
