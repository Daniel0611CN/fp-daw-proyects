package org.iesvdm.ejercicios.ej6;

import java.util.LinkedList;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>>  {

    private List<E> pila = new LinkedList<>();

    public ListaOrdenada() {
    }

    public List<E> getPila() {
        return pila;
    }

    public void setPila(List<E> pila) {
        this.pila = pila;
    }

    public void add(E o) {
        int i = 0;
        while (i < pila.size() && pila.get(i).compareTo(o) < 0) {
            i++;
        }
        pila.add(i, o);
        System.out.println("\nAñadiendo elemento ... " + o);
        System.out.println("Pila: " + pila);
    }

    public E get(int index) {
        System.out.println("\nObteniendo elemento de la posición " + index + " de la pila: " + pila.get(index));
        return pila.get(index);
    }

    public int size() {
        System.out.println("\nTamaño de la pila: " + pila.size());
        return pila.size();
    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        if (pila.isEmpty()) {
            System.out.println("\nLista vacía -> " + true);
            isEmpty = true;
        } else {
            System.out.println("\nLista no vacía -> " + false);
        }
        return isEmpty;
    }

    public boolean remove(E o) {
        boolean isRemoved = false;
        int aux = pila.size();
        pila.remove(o);
        System.out.println("\nEliminando elemento ... " + o);
        if (pila.size()<aux) {
            isRemoved = true;
        }
        System.out.println("Pila: " + pila);
        return isRemoved;
    }

    public int indexOf(E o) {
        System.out.println("\nLa posición del elemento " + o + " es: " + pila.indexOf(o));
        return pila.indexOf(o);
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "pila=" + pila +
                '}';
    }
}
