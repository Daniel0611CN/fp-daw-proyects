package org.iesvdm.ejercicios.ej1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Pila<T> {

    private final List<T> pila = new LinkedList<>();

    public void estaVacia() {
        if (pila.isEmpty()) {
            System.out.println("\nPila vacia -> " + true);
        } else {
            System.out.println("\nPila no vacia -> " + false);
        }
        System.out.println("Pila: " + pila);
    }

    public void extraer() {
        System.out.println("\nElemento a extraer: " + pila.getFirst());
        pila.removeFirst();
        System.out.println("Pila: " + pila);
    }

    public void primero() {System.out.println("\nPrimer Elemento: " + pila.getFirst());}

    public void aniadir(T valor) {

        List<T> aux = new LinkedList<>();
        aux.add(valor);
        aux.addAll(pila);
        pila.clear();
        pila.addAll(aux);

        System.out.println("\nAñadiendo elemento ...");
        System.out.println("Pila: " + pila);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pila.size(); i++) {
            result.append(pila.get(i));
            if (i!= pila.size() - 1) {
                result.append(", ");
            }
        }
        System.out.println("\nImprimiendo resultado como cadena ... ");
        return "Pila: " + result;
    }

}
