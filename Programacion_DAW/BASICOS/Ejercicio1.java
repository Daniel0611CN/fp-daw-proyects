package BASICOS;

import java.util.Scanner; 

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        System.out.println("Introduce un número decimal: ");
        float decimal = datos.nextFloat();
        datos.nextLine(); //con esta lectura de teclado limpio el buffer de entrada
                         //para limpiar el enter que no me ha leido al poner el float 
                        //y poder escribir el String sin que me salte de línea

        System.out.println("Introduce nombre: ");
        String nombre = datos.nextLine();

        System.out.println("Introduce la hora actual:");
        String hora = datos.nextLine();


        System.out.println("Tu nombre es \"" + nombre + "\".\n" + "El número introducido es \'" + decimal + "\'\n\t Y la hora introducida era las \"" + hora + "\"");
        

        datos.close();


    }




}
