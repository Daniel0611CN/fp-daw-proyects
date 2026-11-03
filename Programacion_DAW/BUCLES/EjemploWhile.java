package BUCLES;
import java.util.Scanner;

public class EjemploWhile { // Leer edades 

    /* Me dice al terminar la edad máxima y minima
     * 
     * Para para de introducir numeros marcar -1
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una edad:");
        int edad = sc.nextInt();

        int edadMaxima = edad;
        int edadMinima = edad;

        while (edad > -1)
        {   // Conjunto de instrucciones
            if (edadMaxima < edad)
            {
                edadMaxima = edad;
            }
            edadMinima = Math.min(edadMinima, edad);

            // Actualizar la condición:
            System.out.println("Introduce otra edad:");
            edad = sc.nextInt();
        }

        if (edadMaxima <= -1){
            System.out.println("No has metido ninguna edad válida");
        }
        else{
            System.out.println("La edad mínima es: "+edadMinima);
            System.out.println("La edad máxima es: "+edadMaxima);
        }
        sc.close();
    }
}
