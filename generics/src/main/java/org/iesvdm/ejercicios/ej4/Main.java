package org.iesvdm.ejercicios.ej4;

import org.iesvdm.ejercicios.ej3.Matriz;

public class Main {

    public static void main(String[] args) {

        Matriz<Integer> matriz = new Matriz<>(4, 2);

        int value = 1;

        for (int i = 0; i < matriz.getnRows(); i++) {
            for (int j = 0; j < matriz.getnCols(); j++) {
                matriz.set(i, j, value);
                value++;
            }
        }

        matriz.imprimir();
        System.out.println("\nFila 1 Columna 2: " + matriz.get(0, 1));

    }

}
