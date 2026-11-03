package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class BasicoArrayNumerico {

    static Scanner sc = new Scanner(System.in); // Abrimos el Scanner fuera para poder utilizarlo en todas las funciones

    public static void main(String[] args) {

        int[] numeros = new int[10];

        boolean salir = false;

        do
        {
            int opcion = menu();

            switch (opcion)
            {
                case 1:
                    limpiar(numeros);
                    break;
                case 2:
                    insertarEn(numeros);
                    break;
                case 3:
                    mostrarPosicion(numeros);
                    break;
                case 4:
                    llenar(numeros);
                    break;
                case 5:
                    imprimirArray(numeros);
                    break;
                case 6:
                    ordenar(numeros);
                    break;
                case 9:
                    desordenar(numeros);
                    break;
                case 0:
                    System.out.println("HASTA PRONTO");
                    sc.close();
                    salir = true;
                    break;
            }

        }while (!salir);
    }//Fin MAIN

    // Función imprimir Menu
    static int menu()
    {
        System.out.println("\t* Opción 1 - Limpiar (cero)");
        System.out.println("\t* Opción 2 - Insertar en posición");
        System.out.println("\t* Opción 3 - Mostrar valor en posición");
        System.out.println("\t* Opción 4 - Llenar todo el Array con número \"n\"");
        System.out.println("\t* Opción 5 - Mostrar todo el array");
        System.out.println("\t* Opción 6 - Ordenar el array");
        System.out.println("\t* Opción 9 - Desordenar el array");
        System.out.println("\t* Opción 0 - Salir");
        System.out.println("Indique la opción que quiere realizar:");

        int lecturaEntrada = sc.nextInt();

        return lecturaEntrada;
    }

    // Opción 1 - Limpiar (cero)");
    static void limpiar(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = 0;
        }
    }

    // Pide posición y cadena para insertar
    static void insertarEn (int[] array)
    {
        System.out.println("¿Que número quieres insertar?");
        int cadenaInsertada = sc.nextInt();

        System.out.println("¿En que posición?");
        int posicion = sc.nextInt();

        if(posicion < array.length)
        {
            insertar(array, posicion, cadenaInsertada);
        }
        else
        {
            System.out.println("Posición fuera de rango");
        }
    }

    // Opción 2 - Insertar en posición
    static void insertar(int[] array, int posicion, int cadenaInsertada)
    {
        array[posicion] = cadenaInsertada;
    }

    // Opción 3 - Mostrar valor en posición
    static void mostrarPosicion(int[] array)
    {
        System.out.println("¿Que posición quieres mostrar?");
        int posicion = sc.nextInt();

        if(posicion<array.length)
        {
            System.out.println(array[posicion]);
        }
        else
        {
            System.out.println("Posición fuera de rango");
        }
    }

    // Opción 4 - Llenar todo el Array con cadena creciente
    static void llenar(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = aux;
        }
    }

    // Opción 5 - Mostrar todo el array
    static void imprimirArray(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            System.out.println("["+aux+"] -> " +array[aux]);
        }

        System.out.println(Arrays.toString(array)); // Un método para imprimir todo el Array
    }

    // Opción 6 - Ordenar el array
    static void ordenar(int[] array)
    {
        Arrays.sort(array);
    }

    // Opción 7 - Buscar en el array y mostrar la posición del elemento encontrado
    static int buscar(int[] array, int elementoBuscado)
    {
        int posicion = -1; // Presupongo que no está y devuelvo -1 en ese caso

        // CON UN FOR RECORRO TODO EL ARRAY AUNQUE LO ENCUENTRE

        // for(int aux=0; aux < array.length; aux++)
        // {
        //     if (array[aux] == elementoBuscado)
        //     {
        //         // Encontrado:
        //         posicion = aux;
        //     }
        // }

        // CON WHILE PARO EN CUANTO ENCUENTRO EL ELEMENTO
        int indice = 0;
        while (indice < array.length && posicion == -1)
        {
            if (array[indice] == elementoBuscado)
            {
                posicion = indice;
            }
            indice++;
        }
        return posicion;
    }

    // Opción 8 - Buscar ordenado (reduciendo el campo de busqueda)
    static int buscarOrdenado(int[] array, int elemento)
    {
        int posicion = Arrays.binarySearch(array, elemento);

        return posicion;
    }

    // Opción 9 - Desordenar el array de forma aleatoria
    static int[] desordenar(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            int posicionAleatoria = (int)(Math.random()*array.length);

            int contenedor = array[aux];
            array[aux] = array[posicionAleatoria];
            array[posicionAleatoria] = contenedor;
        }
        return array;
    }

}
