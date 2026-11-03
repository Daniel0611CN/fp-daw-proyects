package org.iesvdm;

import java.util.Arrays;

public class UtilesArrays {

    /**
     * Devuelve un array vacío
     * @return nuevo
     */
    static int[] limpiar()
    {
        int[] nuevo = new int[0];

        return nuevo;
    }

    /**
     * Devuelve un array de ceros con el tamaño que le pasemos a la función
     * @param array,numeroElementos
     * @return nuevo
     */
    static int[] rellenar(int[] array, int numeroElementos)
    {
        int[] nuevo = new int[numeroElementos];

        for (int i = 0; i < nuevo.length; i++)
        {
            nuevo[i] = 0;
        }
        return nuevo;
    }

    /**
     * Llena el array con un número concreto de campos con el valor indicado
     * @param array,numeroElementos,valor
     * @return nuevo
     */
    static int[] rellenar(int[] array, int numeroElementos, int valor)
    {
        int[] nuevo = new int[numeroElementos];

        for (int i = 0; i < numeroElementos; i++)
        {
            nuevo[i] = valor;
        }
        return nuevo;
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
     * Inserta un elemento al principio del array
     * @param array,elemento
     * @return nuevo
     */
    static int[] insertarAlPrincipio(int[] array, int elemento)
    {
        int[] nuevo = new int[array.length+1];

        nuevo[0] = elemento;

        for (int i = 0; i < array.length; i++)
        {
            nuevo[i+1] = array[i];
        }

        return nuevo;
    }

    /**
     * Inserta un elemento en una posicion indicada del array
     * @param array,elemento,posicion
     * @return nuevo
     */
    static int[] insertarEnPosicion(int[] array, int elemento, int posicion)
    {
        int[] nuevo = array; // Parto del array original por si tengo que devolver el mismo

        if(posicion < array.length) // Caso de posicion correcta
        {
            nuevo = new int[array.length+1];

            for (int i = 0; i <= posicion-1; i++)
            {
                nuevo[i] = array[i];
            }

            nuevo[posicion] = elemento; // Copio el elemento en la posicion indicada

            if(posicion<nuevo.length-1) // Solo hago este paso en caso de que no halla insertado en la ultima posicion
            {
                for (int i = posicion+1; i < nuevo.length; i++)
                {
                    nuevo[i] = array[i-1];
                }
            }

        }

        return nuevo;

    }

    /**
     * Inserta un elemento ordenado dentro del array
     * @param array,elemento
     * @return nuevo
     */
    static int[] insertarOrdenado(int[] array, int elemento)
    {
        int posicion = 0;

        while(elemento > array[posicion] && posicion < array.length)
        {
            posicion++;
        }

        int[] nuevo = insertarEnPosicion(array, elemento, posicion);

        return nuevo;
    }

    /**
     * Elimina la última posición del array
     * @param array
     * @return nuevo
     */
    static int[] eliminarUltimo(int[] array)
    {
        int[] nuevo = array;

        if(array.length != 0)
        {
            nuevo = new int[array.length-1];

            for (int i = 0; i < nuevo.length; i++)
            {
                nuevo[i] = array[i];
            }
        }

        return nuevo;
    }

    /**
     * Elimina la primera posición del array
     * @param array
     * @return nuevo
     */
    static int[] eliminarPrimero(int[] array)
    {
        int[] nuevo = array;

        if(array.length != 0)
        {
            nuevo = new int[array.length-1];

            for (int i = 0; i < nuevo.length; i++)
            {
                nuevo[i] = array[i+1];
            }
        }

        return nuevo;
    }

    /**
     * Elimina la posicion indicada
     * @param array
     * @return nuevo
     */
    static int[] eliminarPosicion(int[] array, int posicion)
    {
        int[] nuevo = array;

        if(array.length != 0 && posicion<array.length)
        {
            nuevo = new int[array.length-1];

            for (int i = 0; i < array.length; i++)
            {
                if(posicion > i) // Copio la primera parte hasta la posción eliminada
                {
                    nuevo[i] = array[i];
                }
                else if(posicion < i) // Copio la segunda parte a partir de la posión eliminada
                {
                    nuevo[i-1] = array[i];
                }
            }
        }
        return nuevo;
    }

    /**
     * Elimina un elemento concreto buscándolo en el array
     * @param array
     * @return nuevo
     */
    static int[] eliminar(int[] array, int elemento)
    {
        int[] nuevo = Arrays.copyOfRange(array, 0, array.length);

        int index = 0;
        while (index < nuevo.length)
        {
            // Recorro el array y cada vez que encuentro una coincidencia llamo a la funcion que elimina esa posicion
            if(nuevo[index] == elemento)
            {
                nuevo = eliminarPosicion(nuevo, index);
            }
            else
            {
                index++; // Solo aumento el contador cuando no encuentro el elemento, para no saltar posiciones cuando elimino
            }
        }
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

    /**
     * Desordena el array de forma aleatoria
     * @param array
     */
    static void desordenar(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            // Genero una posión aleatoria de cero a mi última posición
            int posicionAleatoria = (int)(Math.random()*array.length);

            // Guardo el valor de la posicion AUX y la intercambio por la aleatoria generada cada vez
            int contenedor = array[aux];
            array[aux] = array[posicionAleatoria];
            array[posicionAleatoria] = contenedor;
        }
    }

    /**
     * Invierte el orden del array
     * @param array
     * @return nuevo
     */
    static int[] invertir(int[] array)
    {
        int[] nuevo = new int[array.length];

        for (int i = 0; i < nuevo.length; i++)
        {
            // Copia el array anterior empezando por el final
            nuevo[i] = array[(array.length-1)-i];
        }

        return nuevo;
    }

    /**
     * Imprime el array tabulado
     * @param array
     */
    static void imprimir(int[] array)
    {
        System.out.println("\t" + Arrays.toString(array));
    }

    /**
     * Devuelve true o false dependiendo de si el array está ordenado
     * @param array
     * @return ordenado
     */
    static boolean estaOrdenado(int[] array)
    {
        boolean ordenado = true; // caso base

        for (int i = 0; i < array.length-1; i++)
        {
            // Solo cambio el caso base si una posición no es inferior a la siguiente posición
            if(array[i] > array[i+1])
            {
                ordenado = false;
            }
        }
        return ordenado;
    }

    /**
     * Busca un valor dentro del array y devuelve su posición
     * ó -1 en caso de no aparecer ese elemento
     * @param array,elemento
     * @return posicion
     */
    static int buscar(int[] array, int elemento)
    {
        int posicion = -1;
        int index = 0;

        // Mientras no llegue al final de array y el valor de posicón no haya cambiado
        while(index < array.length && posicion == -1)
        {
            // Guardo la posición en el caso de encontrar un elemnto igual a elemento
            if(array[index] == elemento)
            {
                posicion = index;
            }
            index++;
        }

        return posicion;
    }

    /**
     * Devuelve el array desde la posicion inicial indicada
     * hasta la de corte sin incluir esta última en el array resultante
     * @param array,posicionInicio,posicionCorte
     * @return nuevo
     */
    static int[] partirPor(int[] array, int posicionInicio, int posicionCorte)
    {


        // Control de posiciones correctas:
        if(posicionInicio<array.length && posicionCorte<array.length && posicionInicio<posicionCorte)
        {
            // Nuevo array con el tamaño que vamos a cortar
            int[] nuevo = new int[posicionCorte-posicionInicio];

            // Se llena con las posiciones a partir de la de inicio del array de origen
            for (int i = 0; i < nuevo.length; i++)
            {
                nuevo[i] = array[i+posicionInicio];
            }

            return nuevo;
        }
        else
        {
            int[] nuevo = array;

            return nuevo;
        }

    }

    /**
     * Devuelve true si los dos arrays son iguales
     * @param array1,array2
     * @return iguales
     */
    static boolean sonIguales(int[] array1, int[] array2)
    {
        boolean iguales = false;

        if (array1.length == array2.length) // Comprobamos que los dos arrays tengan la misma longitud
        {
            int index = 0;

            // Mientras no haya un elemento diferente y no sobrepase la longitud del array aumentamos el contador
            while((elementosIguales(array1, array2, index) == true) && index < array1.length)
            {
                index++;
            }

            // Si el contador ha llegado a la ultima posición es que son iguales
            if(index ==  array1.length-1)
            {
                iguales = true;
            }
        }

        return iguales;
    }

    /**
     * devuelve true si el elemento
     * en ambos arrays son iguales
     * @param array1,array2,posicionAComparar
     * @return iguales
     */
    static boolean elementosIguales(int[] array1, int[] array2, int posicioAComparar)
    {
        boolean iguales = false;

        if(array1[posicioAComparar] == array2[posicioAComparar])
        {
            iguales = true;
        }

        return iguales;
    }

    /**
     * Devuelve un array que concatena los dos que se le pasan
     * @param array1,array2
     * @return nuevo
     */
    static int[] concatenarArrays(int[] array1, int[] array2)
    {
        int[] nuevo = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) // Copio el primer array
        {
            nuevo[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) // Copio el segundo a partir de la ultima posicion del primer array
        {
            nuevo[array1.length +i] = array2[i];
        }

        return nuevo;
    }
}