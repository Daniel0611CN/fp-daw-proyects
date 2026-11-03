package COLECCIONES;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T> >{

    // ATRIBUTOS:
    private T[] lista;


    // CONSTRUCTOR:
    public Contenedor(T[] entrada)
    {
        lista = entrada;
    }
    

    // METODOS:
    public void insertarAlPrincipio(T nuevo)
    {
        T[] listaNueva = Arrays.copyOf(lista, lista.length+1);

        System.arraycopy(lista, 0, listaNueva, 1, lista.length);

        listaNueva[0] = nuevo;

        lista = listaNueva;
    }

    public void insertarAlFinal(T nuevo)
    {
        T[] listaNueva = Arrays.copyOf(lista, lista.length+1);

        listaNueva[listaNueva.length-1] = nuevo;

        lista = listaNueva;
    }

    public T extraerDelPrincipio()
    {
        T extraido = lista[0];

        T[] listaNueva = Arrays.copyOf(lista, lista.length-1);

        System.arraycopy(lista, 1, listaNueva, 0, lista.length-1);

        lista = listaNueva;

        return extraido;
    }

    public T extraerDelFinal()
    {
        T extraido = lista[lista.length-1];

        T[] listaNueva = Arrays.copyOf(lista, lista.length-1);

        lista = listaNueva;

        return extraido;
    }

    public void ordenar()
    {
        Arrays.sort(lista);
    }

    public String toString()
    {
        return Arrays.toString(lista);
    }
    
}
