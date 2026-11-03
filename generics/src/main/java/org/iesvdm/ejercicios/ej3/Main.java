package org.iesvdm.ejercicios.ej3;

import java.util.Scanner;

public class Main {

    public static <T> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // MENÚ:

        System.out.println("\nIntroduce las filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.println("Introduce las columnas de la matriz: ");
        int columnas = sc.nextInt();

        message();
        int opcion = sc.nextInt();

        Matriz<T> m = new Matriz<>(columnas, filas);

        System.out.println("\nIntroduce el tipo de matriz: \n1. Cadena\n2. Enteros\n3. Decimales");
        int opcionTipo = sc.nextInt();

        while (opcion != 5) {
            switch (opcion) {

                case 1:
                    System.out.println("\nIntroduce la fila en la que quieres introducir el valor: ");
                    int filaSet = sc.nextInt();
                    System.out.println("Introduce la columna en la que quieres introducir el valor: ");
                    int columnaSet = sc.nextInt();
                    T value;
                    System.out.println("Introduce el valor: ");
                    if (opcionTipo == 1) {
                        value = (T) sc.next();
                        m.set(filaSet, columnaSet, value);
                    } else if (opcionTipo == 2) {
                        Integer var1 = sc.nextInt();
                        value = (T) var1;
                        m.set(filaSet, columnaSet, value);
                    } else if (opcionTipo == 3) {
                        Double var2 = sc.nextDouble();
                        value = (T) var2;
                        m.set(filaSet, columnaSet, value);
                    }
                    message();
                    opcion = sc.nextInt();
                    break;

                case 2:
                    System.out.println("\nIntroduce la fila: ");
                    int filaGet = sc.nextInt();
                    System.out.println("Introduce la columna: ");
                    int columnaGet = sc.nextInt();
                    m.get(filaGet, columnaGet);
                    message();
                    opcion = sc.nextInt();
                    break;

                case 3:
                    m.columnas();
                    message();
                    opcion = sc.nextInt();
                    break;

                case 4:
                    m.filas();
                    message();
                    opcion = sc.nextInt();
                    break;
            }
        }

        m.toString();
        m.imprimir();

        sc.close();
    }

    static void message() {
        System.out.println("\nIntroduce una opción: \n1. Introducir valor\n2. Obtener valor\n3. Número Columnas\n4. Número Filas\n5. Imprimir y Salir");
    }

}
