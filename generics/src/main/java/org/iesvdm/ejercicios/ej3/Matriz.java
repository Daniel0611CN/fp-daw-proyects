package org.iesvdm.ejercicios.ej3;

import java.util.Arrays;

public class Matriz<T> {

    private int nRows;
    private int nCols;
    private T[][] matriz;

    public Matriz(int nRows, int nCols) {
        this.nCols = nCols;
        this.nRows = nRows;
        this.matriz = (T[][]) new Object[nRows][nCols];
    }

    public T[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(T[][] matriz) {
        this.matriz = matriz;
    }

    public int getnCols() {
        return nCols;
    }

    public void setnCols(int nCols) {
        this.nCols = nCols;
    }

    public int getnRows() {
        return nRows;
    }

    public void setnRows(int nRows) {
        this.nRows = nRows;
    }

    public void set(int i, int j, T c) {
        matriz[i][j] = c;
        System.out.println("\nSe ha introducido el valor " + c + " en la posición " + i + " - " + j + " de la matriz.");
    }

    public String get(int i, int j) {
        return "\nEl valor en esa posición de la matriz es " + matriz[i][j];
    }

    public void columnas() {
        System.out.println("\nNúmero de columnas: " + nCols);
    }

    public void filas() {
        System.out.println("\nNúmero de columnas: " + nRows);
    }

    public boolean imprimir() {
        System.out.println("\nImprimiendo matriz ... \n----------------------------");
        for (T[] ts : matriz) {
            for (T t : ts) {
                System.out.print(t + "  ");
            }
            System.out.println();  // Nueva línea después de cada fila
        }
        System.out.println("----------------------------");
        return false;
    }

    @Override
    public String toString() {
        return "Matriz{" +
                "matriz=" + Arrays.toString(matriz) +
                ", nRows=" + nRows +
                ", nCols=" + nCols +
                '}';
    }
}
