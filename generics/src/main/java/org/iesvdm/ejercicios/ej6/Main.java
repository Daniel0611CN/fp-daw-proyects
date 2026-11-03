package org.iesvdm.ejercicios.ej6;

import java.util.Scanner;

public class Main {

    public static <E extends Comparable<E>> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaOrdenada<E> l = new ListaOrdenada<>();

        message();
        int opcion = sc.nextInt();

        System.out.println("\nIntroduce el tipo de elemento: \n1. Cadena\n2. Enteros\n3. Decimales");
        int opcionTipo = sc.nextInt();

        E value;

        while(opcion!=7) {
            switch (opcion) {
                case 1:
                    System.out.println("\nIntroduce un valor: ");
                    if (opcionTipo == 1) {
                        value = (E) sc.next();
                        l.add(value);
                    } else if (opcionTipo == 2) {
                        Integer valor = sc.nextInt();
                        value = (E) valor;
                        l.add(value);
                    } else if (opcionTipo == 3) {
                        Double valor = sc.nextDouble();
                        value = (E) valor;
                        l.add(value);
                    }
                    message();
                    opcion = sc.nextInt();
                    break;
                case 2:
                    System.out.println("\nIntroduce una posición: ");
                    int pos = sc.nextInt();
                    l.get(pos);
                    message();
                    opcion = sc.nextInt();
                    break;
                case 3:
                    l.size();
                    message();
                    opcion = sc.nextInt();
                    break;
                case 4:
                    l.isEmpty();
                    message();
                    opcion = sc.nextInt();
                    break;
                case 5:
                    System.out.println("\nIntroduce un valor: ");
                    E aux2;
                    if (opcionTipo == 1) {
                        aux2 = (E) sc.next();
                        l.indexOf(aux2);
                    } else if (opcionTipo == 2) {
                        Integer t1 = sc.nextInt();
                        aux2 = (E) t1;
                        l.indexOf(aux2);
                    } else if (opcionTipo == 3) {
                        Double t2 = sc.nextDouble();
                        aux2 = (E) t2;
                        l.indexOf(aux2);
                    }
                    message();
                    opcion = sc.nextInt();
                    break;
                case 6:
                    System.out.println("\nIntroduce un valor: ");
                    E delete;
                    if (opcionTipo == 1) {
                        delete = (E) sc.next();
                        l.remove(delete);
                    } else if (opcionTipo == 2) {
                        Integer t1 = sc.nextInt();
                        delete = (E) t1;
                        l.remove(delete);
                    } else if (opcionTipo == 3) {
                        Double t2 = sc.nextDouble();
                        delete = (E) t2;
                        l.remove(delete);
                    }
                    message();
                    opcion = sc.nextInt();
                    break;
            }
        }

        System.out.println("\n" + l.toString());
        sc.close();
    }

    static void message() {
        System.out.println("\nIntroduce una opción: \n1. Añadir elemento\n2. Obtener elemento\n3. Obtener tamaño\n4. Comprobar si está vacía\n5. Obtener el índice de un elemento\n6. Eliminar elemento\n7. Salir");
    }

}
