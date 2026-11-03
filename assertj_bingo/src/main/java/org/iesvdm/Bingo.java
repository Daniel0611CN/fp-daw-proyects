package org.iesvdm;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Genero los arrays columnas:
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];

        // Los paso a mi matriz o array bidimensional:
        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};

        // Array de bolas sacadas
        int[] numerosGenerados = new int[0];

        // Condición de salida del bucle:
        boolean salir = true;

        do
        {
            // Vaciado de los numeros generados en el juego anterior:
            numerosGenerados = UtilesArrays.limpiar();

            //introduzco los numeros de cada columna y los ordeno
            rellenarNumerosCarton(carton);

            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            ponerBlancos(carton);


            //pinto el cartón ;
            System.out.println("\n\tTU CARTÓN PARA ESTA PARTIDA:");
            pintarCarton(carton, numerosGenerados);

            //pregunto si quiero sacar otra bola o terminar este juego
            boolean jugar = false;

            System.out.println("¿Quieres sacar bola o salir? -> 1 para jugar, 0 para salir");
            int quiereBola = sc.nextInt();

            if(quiereBola == 1)
            {
                jugar = true;
            }
            else
            {
                System.out.println("Hasta pronto");
            }

            while(jugar)
            {
                //saco numero aleatorio - no se debe repetir
                boolean bolaRepetida = true;

                do
                {
                    int nuevaBola = (int)(Math.random()*99+1);

                    bolaRepetida = buscarValorRepetido(numerosGenerados, nuevaBola);

                    if(!bolaRepetida)
                    {
                        numerosGenerados = insertarAlFinal(numerosGenerados, nuevaBola);

                        System.out.println("Nuevo número sacado: " + nuevaBola);
                    }

                }while(bolaRepetida);

                //pinto el carton con numeros sacados
                System.out.print("Números que han salido: ");
                System.out.println(Arrays.toString(numerosGenerados));


                int numeroAciertos = pintarCarton(carton, numerosGenerados);


                //Eres ganador??
                if (numeroAciertos >= 15)
                {
                    System.out.println("--------------------------------");
                    System.out.println("-----------  BINGO -------------");
                    System.out.println("--------------------------------");

                    jugar = false;
                }
                else //pregunto si quiero sacar otra bola o terminar este juego
                {
                    System.out.println("¿Quieres sacar otra bola? -> 1 para SI, 0 para salir");
                    quiereBola = sc.nextInt();

                    if(quiereBola == 1)
                    {
                        jugar = true;
                    }
                }

            } // WHILE JUGAR

            //Pregunto si quiero jugar otro cartón o salir definitivamente del programa
            System.out.println("¿Quieres jugar otro cartón? -> 1 para SI, 0 para salir");
            int quiereJugar = sc.nextInt();

            if(quiereJugar == 1)
            {
                salir = false;
            }
            else
            {
                System.out.println("Gracias por jugar con nosotros, ¡¡hasta pronto!!");

                // actualizo condición para que en las siguientes partidas
                // no me imprima el carton cuando quiero salir
                salir = true;
            }

        } while(!salir);
    }


    // FUNCIONES:

    /**
     * Rellena el cartón completo con los numeros aleatorios
     * de la decena correspondiente en cada columna
     * @param arrayBi
     */
    static void rellenarNumerosCarton(int[][] arrayBi)
    {
        // Selecciono cada una de las 8 columnas
        for (int i = 0; i < arrayBi.length; i++)
        {
            // Recorro las 3 posiciones de cada columna
            for (int j = 0; j < arrayBi[0].length; j++)
            {
                if(i == 0) // Caso columna 0 (1-9)
                {
                    boolean esta = true;
                    do
                    {
                        int aleatorio = (int)(Math.random()*9+1);

                        esta = buscarValorRepetido(arrayBi[i], aleatorio);

                        if(!esta)
                        {
                            arrayBi[i][j] = aleatorio;
                        }

                    }while(esta); // Bucle que comprueba si existe ese valor en el array para generar otro random

                }
                else // Resto de columnas: Random 0-9*(columna*10)
                {
                    boolean esta = true;
                    do
                    {
                        int aleatorio = (int)(Math.random()*10 + (i*10));

                        esta = buscarValorRepetido(arrayBi[i], aleatorio);

                        if(!esta)
                        {
                            arrayBi[i][j] = aleatorio;
                        }

                    }while(esta);
                }
            }
            arrayBi[i] = ordenar(arrayBi[i]); // Ordena cada columna despues de terminar de rellenarla
        }
    }



    /**
     * Marca los espacios en blanco con el valor -1
     * @param arrayBi
     */
    static void ponerBlancos(int[][] arrayBi)
    {

        for (int i = 0; i < arrayBi[0].length; i++) // Recorre las 3 filas
        {

            for (int j=0; j<4; j++) // Genera 4 randoms por cada fila
            {
                boolean estaEnLaFila = true;
                boolean hay2blancos = true;
                do
                {
                    int posicionAleatoria = (int)(Math.random()*9);

                    estaEnLaFila = buscarFila(arrayBi, i, posicionAleatoria); // Devuelve si ya hay -1 en esa posicion
                    hay2blancos = buscarColumna(arrayBi, posicionAleatoria); // Devuelve si hay dos -1 en ese array

                    if(!estaEnLaFila && !hay2blancos)
                    {
                        arrayBi[posicionAleatoria][i] = -1;
                    }

                }while(estaEnLaFila || hay2blancos);
            }

        }
    }

    /**
     * Busca una posicion de una fila de la matriz
     * y devuelve true si ya tiene -1 o false
     * en caso de no tener ese valor
     * @param arrayBi,fila,posicion
     * @return esta
     */
    static boolean buscarFila(int[][] arrayBi, int fila, int posicion)
    {
        boolean esta = false;

        if(arrayBi[posicion][fila] == -1)
        {
            esta = true; // Cambio condición en caso de que ya tenga menos -1
        }

        return esta;
    }


    /**
     * Busca el -1 en el array columna y devuelve true si el valor aparece dos
     * veces (es decir ya hay dos blancos y no se puede colocar)
     * @param arrayBi,posicionAleatoria
     * @return esta2Veces
     */
    static boolean buscarColumna(int[][] arrayBi, int posicionAleatoria)
    {
        boolean esta2Veces = false;
        int contador = 0;

        for (int i = 0; i < arrayBi[0].length; i++) // Recorre las 3 posiciones del array
        {
            if(arrayBi[posicionAleatoria][i] == -1)
            {
                contador++;
            }
        }

        if(contador>=2) // Cambio condición en caso de que ya tenga dos -1
        {
            esta2Veces = true;
        }

        return esta2Veces;
    }

    /**
     * Busca un valor dentro del array y devuelve
     * true si aparece en el array o false
     * en caso de no aparecer ese elemento
     * @param array,elemento
     * @return esta
     */
    static boolean buscarValorRepetido(int[] array, int elemento)
    {
        boolean esta = false;

        // Recorro todo el array buscando el elemento
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == elemento)
            {
                esta = true; // Cambio condición en caso de encontrar el elemento
            }
        }

        return esta;
    }

    /**
     * Imprime el carton por pantalla
     * @param arrayBi,arrayBolas
     * @return aciertos
     */
    static int pintarCarton(int[][] arrayBi, int[] arrayBolas)
    {
        int aciertos = 0;

        System.out.println("\n");

        for (int i = 0; i < arrayBi[0].length; i++) // Recorre las 3 filas que vamos a pintar
        {
            System.out.print("|  ");

            for (int j = 0; j < arrayBi.length; j++) // Pinta las 8 posiciones de cada fila
            {

                boolean seTacha = buscarValorRepetido(arrayBolas, arrayBi[j][i]);

                if(seTacha) // Si la bola ha salido pinto X, si no pinto la casilla original
                {
                    System.out.print("X  |  ");

                    aciertos++;
                }
                else
                {
                    System.out.print(arrayBi[j][i] + "  |  ");
                }

            }
            System.out.println("");
        }
        System.out.println("\n");

        return aciertos;
    }

    /**
     * Inserta un elemento al final del array
     * @param array,elemento
     * @return nuevo
     */
    static int[] insertarAlFinal(int[] array, int elemento)
    {
        int[] nuevo = new int[array.length+1];

        for (int i = 0; i < array.length; i++)
        {
            nuevo[i] = array[i];
        }

        nuevo[nuevo.length-1] = elemento;

        return nuevo;
    }

    /**
     * Ordena el array de menor a mayor
     * @param array
     * @return array
     */
    static int[] ordenar(int[] array)
    {
        Arrays.sort(array);

        return array;
    }

}