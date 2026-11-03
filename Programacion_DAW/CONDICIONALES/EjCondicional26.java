package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional26 { // Entradas de cine:
    public static void main(String[] args) {
        
        final int PRECIO_BASE = 8;
        final int PRECIO_ESPECTADOR = 5; // miercoles
        final int PRECIO_PAREJA = 11; // jueves
        final int DESCUENTO_TARJETA = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Venta de entradas CineCampa");

        System.out.println("Número de personas: ");
        int numPersonas = sc.nextInt();

        // Limpio Buffer:
        sc.nextLine();

        System.out.println("Día de la semana: ");
        String dia = sc.nextLine();

        System.out.println("¿Tiene tarjeta CineCampa? (s/n): ");
        String tarjeta = sc.nextLine();

        float precioTotal = 0.0f;
        int numEntradasIndiv = numPersonas;
        int numEntradasPareja = 0;
        int precioEntrada = PRECIO_BASE;
        float descuento = 0.0f;
        float precioConDescuento = 0;


        switch (dia){
            case "miercoles":
                precioEntrada = PRECIO_ESPECTADOR;
                precioTotal = numEntradasIndiv * PRECIO_ESPECTADOR;
            break;
            case "jueves":
                numEntradasPareja = (int)numPersonas/2;
                numEntradasIndiv = numPersonas%2;
                precioTotal = (numEntradasPareja * PRECIO_PAREJA) + (numEntradasIndiv * PRECIO_BASE);
            break;
            default:
                precioTotal = numEntradasIndiv * PRECIO_BASE;
        }
        
        if (tarjeta.equals("s")){
            descuento = precioTotal * DESCUENTO_TARJETA/100;
        }
        precioConDescuento = (precioTotal - descuento);
        

        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

        if (numEntradasPareja > 0){
            System.out.println("Entradas de parejas: " + numEntradasPareja);
            System.out.println("Precio por entrada de pareja: " + PRECIO_PAREJA);
        }

        System.out.println("Entradas individuales: "+numEntradasIndiv);
        System.out.println("Precio por entrada individual: " + precioEntrada);
        System.out.println("Total " + precioTotal);
        System.out.println("Descuento " + descuento);
        System.out.println("A pagar " + precioConDescuento);


        sc.close();
    }
}
