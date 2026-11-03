package org.iesvdm.ejercicios.ej7;

import org.iesvdm.ejercicios.ej6.ListaOrdenada;

import java.util.List;
import java.util.Scanner;

public class Main {

    // LO ÚNICO QUE AQUÍ, COMO HE UTILIZADO LA CLASE DEL EJERCICIO ANTERIOR, SE ORDENAN AUTOMÁTICAMENTE LAS LISTAS;

    public static <E extends Comparable<E>> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaOrdenada<E> l = new ListaOrdenada<>();
        ListaOrdenada<E> l2 = new ListaOrdenada<>();

        message();
        int opcion = sc.nextInt();

        E value;

        System.out.println("\nIntroduce que fila quieres manejar: \n1. Pila 1\n2. Pila 2");
        int opcionPila = sc.nextInt();

        while(opcion!=4) {
            if (opcionPila==1) {
                switch (opcion) {
                    case 1:
                        System.out.println("\nIntroduce un valor: ");
                        Integer valor = sc.nextInt();
                        value = (E) valor;
                        l.add(value);
                        message();
                        opcion = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("\nIntroduce un valor: ");
                        E delete;
                        Integer t1 = sc.nextInt();
                        delete = (E) t1;
                        l.remove(delete);
                        message();
                        opcion = sc.nextInt();
                        break;
                    case 3:
                        opcionPila = 2;
                        message();
                        opcion = sc.nextInt();
                        break;
                }
            } else if (opcionPila == 2) {
                switch (opcion) {
                    case 1:
                        System.out.println("\nIntroduce un valor: ");
                        Integer valor = sc.nextInt();
                        value = (E) valor;
                        l2.add(value);
                        message();
                        opcion = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("\nIntroduce un valor: ");
                        E delete;
                        Integer t1 = sc.nextInt();
                        delete = (E) t1;
                        l2.remove(delete);
                        message();
                        opcion = sc.nextInt();
                        break;
                    case 3:
                        opcionPila = 1;
                        message();
                        opcion = sc.nextInt();
                        break;
                }
            }

        }

        Clase<E> clase = new Clase<>();

        System.out.println("\n¿Que operación aritmética quieres realizar?\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
        int opcionOperacion = sc.nextInt();

        while (opcionOperacion!=5) {
            if (opcionOperacion==1) {
                clase.suma(l.getPila(), l2.getPila());
                clase.toString();
                System.out.println("\n¿Que operación aritmética quieres realizar?\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
                opcionOperacion = sc.nextInt();
            } else if (opcionOperacion==2) {
                clase.resta(l.getPila(), l2.getPila());
                clase.toString();
                System.out.println("\n¿Que operación aritmética quieres realizar?\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
                opcionOperacion = sc.nextInt();
            } else if (opcionOperacion==3) {
                clase.multiplicacion(l.getPila(), l2.getPila());
                clase.toString();
                System.out.println("\n¿Que operación aritmética quieres realizar?\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
                opcionOperacion = sc.nextInt();
            } else if (opcionOperacion==4) {
                clase.division(l.getPila(), l2.getPila());
                clase.toString();
                System.out.println("\n¿Que operación aritmética quieres realizar?\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
                opcionOperacion = sc.nextInt();
            }
        }

        System.out.println("\n!Hasta Pronto!");
        sc.close();
    }

    static void message() {
        System.out.println("\nIntroduce una opción: \n1. Añadir elemento\n2. Eliminar elemento\n3. Cambiar Pila\n4. Salir");
    }

}
