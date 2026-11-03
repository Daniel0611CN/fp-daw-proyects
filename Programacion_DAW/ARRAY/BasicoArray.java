package ARRAY;

import java.util.Scanner;

public class BasicoArray {

    static Scanner sc = new Scanner(System.in); // Abrimos el Scanner fuera para poder utilizarlo en todas las funciones

    public static void main(String[] args) {

        String[] nombres = new String[10];

        boolean salir = false;

        do
        {
            int opcion = menu();

            switch (opcion)
            {
                case 1:
                    limpiar(nombres);
                    break;
                case 2:
                    insertarEn(nombres);
                    break;
                case 3:
                    mostrarPosicion(nombres);
                    break;
                case 4:
                    llenar(nombres);
                    break;
                case 5:
                    imprimirArray(nombres);
                    break;
                case 0:
                    sc.close();
                    salir = true;
                    break;
            }

        }while (!salir);
    }

    // Funcion imprimir menu
    static int menu()
    {
        System.out.println("\t* Opción 1 - Limpiar (null)");
        System.out.println("\t* Opción 2 - Insertar en posición");
        System.out.println("\t* Opción 3 - Mostrar valor en posición");
        System.out.println("\t* Opción 4 - Llenar todo el Array con cadena \"n\"");
        System.out.println("\t* Opción 5 - Mostrar todo el array");
        System.out.println("\t* Opción 0 - Salir");
        System.out.println("Indique la opción que quiere realizar:");

        int lecturaEntrada = sc.nextInt();
        sc.nextLine();

        return lecturaEntrada;
    }

    // Opción 1 - Limpiar (null)");
    static void limpiar(String[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = null;
        }
    }

    // Pide posición y cadena para insertar
    static void insertarEn (String[] array)
    {
        sc.nextLine(); // Limpio Buffer antes de leer String (por si he leído números antes)
        System.out.println("¿Que cadena quieres insertar?");
        String cadenaInsertada = sc.nextLine();

        System.out.println("¿En que posición?");
        int posicion = sc.nextInt();

        if(posicion<array.length)
        {
            insertar(array, posicion, cadenaInsertada);
        }
        else
        {
            System.out.println("Posición fuera de rango");
        }
    }

    // Opción 2 - Insertar en posición
    static void insertar(String[] array, int posicion, String cadenaInsertada)
    {
        array[posicion] = cadenaInsertada;
    }

    // Opción 3 - Mostrar valor en posición
    static void mostrarPosicion(String[] array) 
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
    static void llenar(String[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = "C" + aux;
        }
    }

    // Opción 5 - Mostrar todo el array
    static void imprimirArray(String[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            System.out.println(array[aux]);
        }
    }

}
