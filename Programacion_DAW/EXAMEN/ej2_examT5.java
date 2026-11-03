package EXAMEN;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ej2_examT5 {
    
        /*      COMENTARIOS PROFESOR:
     *
     * EJ2: Muy bien, solo un fallo, la modificación masiva lo haces según el
     * precio vs media de cantidad vendida (comparas valores distintos)
     * y en el informe no utilizas la media para el + -
     *
     *      CORRECCIÓN:
     *
     * Se me pasaron esos detalles con las prisas del examen, implementados ambos
     * añadiéndolo al código ya realizado. También he limpiado el búffer en ciertos
     * momentos para que no de saltos el programa.
     */

     static Scanner sc = new Scanner(System.in);
     static DecimalFormat df = new DecimalFormat("0.00");

     static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
     static final String ANSI_RESET = "\u001B[0m";
 
     public static void main(String[] args) {
 
         // VARIABLES:
         String[] frutas = new String[0];
         double[] precios = new double[0];
         double[] cantidadVendida = new double[0];
 
         boolean salir = false;
         String opcion = "";
 
         do
         {
             opcion = menu();
 
             switch(opcion)
             {
                 case "a":
 
                     System.out.println("Inserta el nombre de la fruta a introducir:");
                     String nuevoNombre = sc.nextLine();
 
                     frutas = añadeFruta(frutas, nuevoNombre);
                     precios = añadePrecio(precios);
                     cantidadVendida = añadeCantidad(cantidadVendida);
                     break;
 
                 case "b":
 
                     System.out.println("Introduce el nombre de la fruta vendida:");
                     String frutaBuscada = sc.nextLine();
 
                     int posicion = buscaFruta(frutas, frutaBuscada);
 
                     System.out.println("Introduce la cantidad vendida:");
                     double cantidad = sc.nextDouble();
                     sc.nextLine();
 
                     sumaEnPosicion(cantidadVendida, posicion, cantidad);
                     break;
 
                 case "c":
 
                     System.out.println("Introduce el nombre de la fruta a modificar:");
                     String frutaBuscada2 = sc.nextLine();
 
                     int posicion2 = buscaFruta(frutas, frutaBuscada2);
 
                     System.out.println("Introduce el nuevo precio:");
                     double cantidad2 = sc.nextDouble();
                     sc.nextLine();
 
                     modificaPosicion(precios, posicion2, cantidad2);
                     break;
 
                 case "d":
                     double media = calculaMedia(cantidadVendida);
 
                     incrementaPrecio(precios, cantidadVendida, media);
                     break;
 
                 case "e":
 
                     mostrar(frutas, precios, cantidadVendida);
                     break;
 
                 case "x":
                     salir = true;
                     System.out.println("Hasta pronto");
 
                 default:
                     System.out.println("Opción incorrecta, vuelve a intentarlo");
             }
 
             System.out.println();
 
         }while(!salir);
 
     }
 
     // FUNCIONES:
 
     static String menu()
     {
         System.out.println("\n\t" + ANSI_GREEN_BACKGROUND + "BIENVENIDO A FRUTERÍA LÓPEZ" + ANSI_RESET + "\n");
         System.out.println("a - Insertar fruta");
         System.out.println("b - Añadir compra");
         System.out.println("c - Modificar precio fruta");
         System.out.println("d - Modificar todos los precios");
         System.out.println("e - Mostrar informe");
         System.out.println("x - Salir");
         System.out.println("---------------------------------------------");
         System.out.println(" Indique opción...\n");
 
         String opcion = sc.nextLine();
         return opcion;
     }
 
     /**
      * Añade una nueva fruta al final del array
      * @param array,nombre
      * @return nuevo
      */
     static String[] añadeFruta(String[] array, String nombre)
     {
         String[] nuevo = new String[array.length+1];
 
         for (int i = 0; i < array.length; i++)
         {
             nuevo[i] = array[i];
         }
 
         nuevo[nuevo.length-1] = nombre;
 
         return nuevo;
     }
 
     /**
      * Añade el precio de una nueva fruta al final del array
      * @param array
      * @return nuevo
      */
     static double[] añadePrecio(double[] array)
     {
         double[] nuevo = new double[array.length+1];
         double precioPorDefecto = 1;
 
         for (int i = 0; i < array.length; i++)
         {
             nuevo[i] = array[i];
         }
 
         modificaPosicion(nuevo, nuevo.length-1, precioPorDefecto);
 
         return nuevo;
     }
 
     /**
      * Añade una nueva posicion a 0 en el array cantidadVendida
      * @param array
      * @return nuevo
      */
     static double[] añadeCantidad(double[] array)
     {
         double[] nuevo = new double[array.length+1];
         double cantidadPorDefecto = 0;
 
         for (int i = 0; i < array.length; i++)
         {
             nuevo[i] = array[i];
         }
 
         modificaPosicion(nuevo, nuevo.length-1, cantidadPorDefecto);
 
         return nuevo;
     }
 
     /**
      * Modifica el valor DOUBLE de una posicion dada del array por un valor también dado
      * @param array,posicion,nuevo
      */
     static void modificaPosicion(double[] array, int posicion, double nuevo)
     {
         if(posicion>=0 && posicion<array.length) // Controlo que la posicion no esté fuera del rango
         {
             array[posicion] = nuevo;
         }
         else
         {
             System.out.println("No se ha encontrado el producto indicado");
         }
 
     }
 
     /**
      * Suma una cantidad dada al valor DOUBLE de una posicion dada del array
      * @param array,posicion,sumando
      */
     static void sumaEnPosicion(double[] array, int posicion, double sumando)
     {
         if(posicion>=0 && posicion<array.length) // Controlo que la posicion no esté fuera del rango
         {
             array[posicion] += sumando;
         }
         else
         {
             System.out.println("No se ha encontrado el producto indicado");
         }
 
     }
 
     /**
      * Busca la coincidencia de un nombre en el array y devuelve su posición
      * o devuelve -1 si no lo encuentra
      * @param array,nombre
      * @return posicionEncontrada
      */
     static int buscaFruta(String[] array, String nombre)
     {
         int posicionEncontrada = -1;
         int index = 0;
 
         // Mientras no llegue al final de array y el valor de posicón no haya cambiado
         while(index <= array.length-1 && posicionEncontrada == -1)
         {
             // Guardo la posición en el caso de encontrar un nombre igual
             if(array[index].equalsIgnoreCase(nombre))
             {
                 posicionEncontrada = index;
             }
             index++;
         }
 
         return posicionEncontrada;
     }
 
     /**
      * Pinta el informe
      * @param arrayNombre,arrayPrecio,cantidadVendida
      */
     static void mostrar(String[] arrayNombre, double[] arrayPrecio, double[] cantidadVendida)
     {
         double cantidadTotal = 0;
         double ganaciatotal = 0;
         double media = calculaMedia(cantidadVendida);
         String signo = "";
 
         System.out.println("\nINFORME DE VENTAS:\n");
         System.out.println("\t\t\t\tPrecio \t \t Cantidad\tGanancia");
 
         for (int i = 0; i < arrayNombre.length; i++)
         {
             if(cantidadVendida[i] > media) // Añado el signo al final de cada fila según la media de ventas
             {
                 signo = " (+)";
             }
             else if(cantidadVendida[i] < media)
             {
                 signo = " (-)";
             }
             else
             {
                 signo = " (=)";
             }
 
             System.out.println("Fruta: " + arrayNombre[i] + "\t\t-\t" + df.format(arrayPrecio[i]) + "\t-\t" + df.format(cantidadVendida[i]) + "\t-\t" + df.format((arrayPrecio[i]*cantidadVendida[i])) + signo);
 
             cantidadTotal = cantidadTotal + cantidadVendida[i];
             ganaciatotal = ganaciatotal + (arrayPrecio[i]*cantidadVendida[i]);
 
         }
         System.out.println("---------------------------------------------------------------");
 
         System.out.println("Totales:\t\t\t\t" + df.format(cantidadTotal) + " kgs\t-\t" + df.format(ganaciatotal) + " €");
     }
 
     /**
      * Calcula el valor medio de un array
      * @param array
      * @return media
      */
     static double calculaMedia(double[] array)
     {
         double media = 0;
 
         for (int i = 0; i < array.length; i++)
         {
             media = media + array[i];
         }
 
         if(media/array.length > 0) // controlo la division por cero
         {
             media = media/(array.length);
         }
 
         return media;
     }
 
     /**
      * Modifica el precio segun la cantidad media vendida
      * @param arrayPrecios,arrayCantidades,media
      */
     static void incrementaPrecio(double[] arrayPrecios, double[] arrayCantidades, double media)
     {
 
         double incremento = 0.25;
         double rebaja = -0.15;
 
         for (int i = 0; i < arrayPrecios.length; i++)
         {
 
             if(arrayCantidades[i]>media)
             {
                 arrayPrecios[i] += incremento;
             }
             else if(arrayCantidades[i]<media)
             {
                 arrayPrecios[i] += rebaja;
 
                 if(arrayPrecios[i]<0)
                 {
                     arrayPrecios[i] = 0.01;
                 }
             }
         }
     }
 
}
