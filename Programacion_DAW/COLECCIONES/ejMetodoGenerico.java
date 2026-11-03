package COLECCIONES;

import java.util.Arrays;

public class ejMetodoGenerico {
    
    public static void main(String[] args) {
        
        String[] trozos = {};
        String uno = "cadena 1";
        String dos = "otro trozo";

        trozos = insertaObjeto(trozos, uno);
        trozos = insertaObjeto(trozos, dos);

        System.out.println(Arrays.toString(trozos));




        Integer[] numeros = {};
        Integer num1 = 1;
        Integer num2 = 2;

        numeros = insertaObjeto(numeros, num1);
        numeros = insertaObjeto(numeros, num2);

        System.out.println(Arrays.toString(numeros));


    }

    // METODOS:

    static <U> int numeroDeNulos (U[] tabla)
    {
        int cont = 0;

        for (U e : tabla)
        {
            if (e == null)  
            {
                cont++;
            }  
        }
        return cont;
    }

    static <T> T[] insertaObjeto(T[] tabla, T objeto)
    {
      //  T[] nuevo = new T[tabla.length+1];  ERROR, NO SE PUEDE

        T[] nuevo = Arrays.copyOf(tabla, tabla.length+1);

        nuevo[nuevo.length-1] = objeto;

        tabla = nuevo;

        return tabla;
    }

}
