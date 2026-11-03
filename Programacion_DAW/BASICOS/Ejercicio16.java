package BASICOS;
import java.util.Scanner;

public class Ejercicio16{ //Parque de atracciones

    // Empresa de un parque de atracciones quiere una aplicación 
    // que les ayude al cobro de entradas a las familias que sacan las entradas.
    // Existen las entradas infantiles a 15,50€ y de adultos a 20€. 
    // En caso de que el importe sea mayor a 100€ se aplicará un descuento del 5%.
    
    public static void main(String[] args){

        final float PRECIO_INFANTIL = 15.5f;
        final float PRECIO_ADULTO = 20f;
        final float DESCUENTO = 0.05f;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas entradas infantiles quiere?");
        int entradasInfantil = sc.nextInt();

        System.out.println("¿Cuantas entradas de adulto quiere?");
        int entradasAdulto = sc.nextInt();

        float precioEntradas = (entradasInfantil * PRECIO_INFANTIL)+(entradasAdulto * PRECIO_ADULTO);
        
        // Podemos declarar el booleano y luego utilizarlo en el mensaje final
        // boolean descuentoPrecio = precioEntradas > 100;



        // Así metemos la expresion booleana completa:

        // precioEntradas = (precioEntradas > 100) ? precioEntradas - precioEntradas * DESCUENTO : precioEntradas;

        // System.out.println("El precio total es: " + precioEntradas);



        // tambien podemos declarar solo el descuento

        float descuento = (precioEntradas > 100) ? precioEntradas * DESCUENTO : 0;



        System.out.println("El precio total es: " + precioEntradas + " con un descuento de " + descuento);

        sc.close();

    }
}
