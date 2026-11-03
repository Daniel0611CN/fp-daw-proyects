package org.iesvdm.ejercicios.ej2;

import java.util.Scanner;

public class Main {

    public static <T> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaArray<T> p = new PilaArray<>();

        System.out.println("\nIngrese la longitud del array: ");
        int longArray = sc.nextInt();
        p.inicio(longArray);

        message();
        int opcion = sc.nextInt();

        System.out.println("\n¿Que valor vas a introducir?\n1. Cadena\n2. Enteros\n3. Decimales");
        int opcionTipoPila = sc.nextInt();
        T valor;

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("\nIntroduce el valor que quieres añadir: ");
                    if (opcionTipoPila == 1) {
                        valor = (T) sc.next();
                        p.aniadir(valor);
                    } else if (opcionTipoPila == 2) {
                        Integer var1 = sc.nextInt();
                        valor = (T) var1;
                        p.aniadir(valor);
                    } else {
                        Double var2 = sc.nextDouble();
                        valor = (T) var2;
                        p.aniadir(valor);
                    }
                    message();
                    opcion = sc.nextInt();
                    break;
                case 2:
                    p.primero();
                    message();
                    opcion = sc.nextInt();
                    break;
                case 3:
                    p.extraer();
                    message();
                    opcion = sc.nextInt();
                    break;
                case 4:
                    p.estaVacia();
                    message();
                    opcion = sc.nextInt();
                    break;
            }
        }
        p.contarElementosInsertados();
        System.out.println(p);
        sc.close();
    }

    static void message() {
        System.out.println("\nIntroduce una opción:\n1. Añadir valor\n2. Primer valor\n3. Extraer Valor\n4. Comprobar si está vacía\n5. Imprimir");
    }

}
