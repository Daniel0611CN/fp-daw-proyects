package utiles;

import java.util.Arrays;

public class Calculadora {
    

    public int suma(int x, int y)
    {
        return y+x;
    }

    public int multiplicacion(int x, int y)
    {
        return x*y;
    }

    public Integer dividir(int x, int y)
    {
        Integer resultado = null;

        try
        {
            resultado = x/y;
        }
        catch(ArithmeticException excepcionArit)
        {
            // OPCION 1: mostrar un mensaje:
            System.out.println("Estás dividiendo por cero"); // OPCION MUY HABITUAL

            // OPCION 2: la excepción tiene su toString ya ceado:
            System.out.println(excepcionArit);

            // o mostrar solo su mensaje:
            System.out.println(excepcionArit.getMessage()); // OPCION MÁS UTILIZADA

            // OPCIÓN 3: (para el desarrollador)
            // puedo sacar la pila de llamadas para ver donde ha fallado (te devuelve un array de String):
            System.out.println(Arrays.toString(excepcionArit.getStackTrace()));
            // otra forma de hacerlo:
            excepcionArit.printStackTrace();
        }
        return resultado;
    }

    public Integer division3(int x, int y)
    {
        
    }


}
