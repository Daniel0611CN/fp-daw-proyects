package EXAMEN;

import java.util.Arrays;

public class ej1_examT5 {
    
        /*     COMENTARIOS PROFESOR:
            *
            * EJ1: El método modificarRepetido() tiene errores que
            * hacen que no haga lo que tiene que hacer
            *
            *      CORRECCIÓN:
            *
            * Lo he re-hecho de cero, ya que no le encontré la lógica el día del examen.
            * En esta ocasión he simplificado el funcionamiento de la función cambiaRepetido()
            * para que sobre una posición fija controle todas las coincidencias y las cambie.
            * Y luego uso otro bucle en el main donde aplico el mismo sistema a todas las posiciones
            * del array.
            */
        public static void main(String[] args) {

            int[] array = {4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4};

            System.out.println(Arrays.toString(array));

            /*  Recorro el array pasando la posición i
                *  a la función que cambiará todas las
                *  coincidencias del valor de esa posición
                */
            for (int i = 0; i < array.length; i++)
            {
                cambiaRepetido(array,i);
            }

            System.out.println(Arrays.toString(array));
        }

        // METHODS:

        /**
         * Devuelve el valor máximo de un array
         * @param array
         * @return maximo
         */
        static int sacaMaximo(int[] array)
        {
            int maximo = 0;

            for (int i = 0; i < array.length; i++)
            {
                if(maximo < array[i])
                {
                    maximo = array[i];
                }
            }
            return maximo;
        }


        /**
         * Busca las coincidencias de valor con la posición pasada del array
         * y modifica el valor por máximo +1
         * @param array
         */
        static void cambiaRepetido(int[] array, int index)
        {
            int valorAComparar = array[index]; //fijo el valor que voy a comparar con el resto del array

            for (int i = index+1; i < array.length; i++) // recorro el array desde la posición siguiente a la pasada a la función
            {
                if(array[i] == valorAComparar) // cada vez que encuentro coincidencia saco el máximo y cambio el valor por maximo+1
                {
                    int maximo = sacaMaximo(array);
                    array[i] = maximo+1;

                }//if
            }//for
        }

}
    