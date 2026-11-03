package BASICOS;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = datos.nextInt();
        edad++;
        System.out.println("El año que viene tendrás " + (edad) + " años.");

            // se puede aplicar el ++ antes con el parentesis sumarle 1 unidad (no funciona el ++ dentro de la operacion)

        datos.close();


    }


}
