package org.iesvdm.ejercicios.ej5;

import java.util.LinkedList;
import java.util.List;

public class Coleccion<T> implements ColeccionSimpleGenerica {

    private List<T> pila = new LinkedList<>();

    @Override
    public void estaVacia() {
        if (pila.isEmpty()) {
            System.out.println("\nLa lista esta vacia -> " + true);
        } else {
            System.out.println("\nLa lista no esta vacia -> " + false);
        }
    }

    @Override
    public void extraer() {
        System.out.println(pila.getFirst());
        pila.removeFirst();
        System.out.println("\nPila: " + pila);
    }

    @Override
    public void primero() {System.out.println("\nPila: " + pila.getFirst());}

    @Override
    public void aniadir(Object valor) {
        List<T> aux = new LinkedList<>();
        aux.add((T) valor);
        aux.addAll(pila);
        pila.clear();
        pila.addAll(aux);

        System.out.println("\nAñadiendo elemento ...");
        System.out.println("Pila: " + pila);
    }
}
