package org.iesvdm.ejercicios.ej2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PilaArray<T> {

    private T[] array;
    private int numObjetosInsertados = 0;

    public void inicio(int tamanioArray) {
        array = (T[]) new Object[tamanioArray];
    }

    public void contarElementosInsertados() {
        // Contamos con un bucle los elementos que no sean null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                numObjetosInsertados++;
            }
        }

        System.out.println("\nLa cantidad de objetos insertados es: " + numObjetosInsertados);

    }

    public void estaVacia() {
        if (array.length==0) {
            System.out.println("\nArray vacio -> " + true);
        } else {
            System.out.println("\nArray no vacio -> " + false);
        }
        System.out.println("Array: " + Arrays.toString(array));
    }

    public void extraer() {
        System.out.println("\nElemento a extraer: " + array[0]);
        array = Arrays.copyOfRange(array, 1, array.length);
        System.out.println("Pila: " + Arrays.toString(array));
    }

    public void primero() {System.out.println("\nPrimer Elemento: " + array[0]);}

    public void aniadir(T valor) {
        int value=array.length-1;
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i]!=null) {
                value--;
            } else if (value >= 0) {
                array[value]=valor;
            } else {
                System.out.println("No queda más espacio en el array.");
            }
        }
        System.out.println("\nAñadiendo elemento ...");
        System.out.println("Pila: " + Arrays.toString(array));
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i != array.length - 1) {
                result.append(", ");
            }
        }
        System.out.println("\nImprimiendo resultado como cadena ... ");
        return "Pila: " + result;
    }

}
