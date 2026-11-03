package org.iesvdm.ejercicios.ej5;

import java.util.Scanner;

public class Main {

    public static <T> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Coleccion<T> c = new Coleccion<>();

        message();
        int opcion = sc.nextInt();

        T value;

        System.out.println("\nIntroduce el valor de la coleccion: \n1. Cadena \n2. Enteros\n3. Decimales");
        int opcion2 = sc.nextInt();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("\nIntroduce el valor que quieres añadir: ");
                    if (opcion2 == 1) {
                        value = (T) sc.next();
                        c.aniadir(value);
                    } else if (opcion2 == 2) {
                        Integer var1 = sc.nextInt();
                        value = (T) var1;
                        c.aniadir(value);
                    } else {
                        Double var2 = sc.nextDouble();
                        value = (T) var2;
                        c.aniadir(value);
                    }
                    message();
                    opcion = sc.nextInt();
                    break;
                case 2:
                    c.primero();
                    message();
                    opcion = sc.nextInt();
                    break;
                case 3:
                    c.extraer();
                    message();
                    opcion = sc.nextInt();
                    break;
                case 4:
                    c.estaVacia();
                    message();
                    opcion = sc.nextInt();
                    break;
            }
        }

        System.out.println("Hasta Pronto!");

        sc.close();

    }

    static void message() {
        System.out.println("\nIntroduce una opción: \n1. Añadir elemento\n2. Primer elemento\n3. Extraer Elemento\n4. Comprobar si esta Vacia\n5. Salir");
    }

}
