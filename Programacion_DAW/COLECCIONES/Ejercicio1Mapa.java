package COLECCIONES;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1Mapa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        // VARIABLES:
        HashMap<String, Integer> recambios = new HashMap<>();

        boolean salir = false;
        int opcion = 0;

        do
        {
            opcion = menu();

            switch(opcion)
            {
                case 1: // INSERTAR PRODUCTO (CANT. 0)

                    System.out.println("Inserta el nombre del producto a introducir:");
                    String nuevoNombre = sc.nextLine().toUpperCase();

                    recambios.put(nuevoNombre, 0);

                    break;

                case 2: // BORRAR PRODUCTO:

                    System.out.println("Introduce el nombre del producto a borrar:");
                    String productoBuscado = sc.nextLine().toUpperCase();

                    if(recambios.containsKey(productoBuscado))
                    {
                        recambios.remove(productoBuscado);
                        System.out.println("Producto eliminado correctamente");
                    }
                    else 
                    {
                        System.out.println("No se ha encontrado el producto a eliminar");
                    }

                    break;

                case 3: // CAMBIO STOCK:

                    System.out.println("Introduce el nombre del producto a modificar:");
                    String productoBuscado2 = sc.nextLine().toUpperCase();

                    System.out.println("Introduce el nuevo stock:");
                    Integer nuevoStock = sc.nextInt();
                    sc.nextLine();

                    if(recambios.containsKey(productoBuscado2))
                    {
                        recambios.replace(productoBuscado2, nuevoStock);
                        System.out.println("Stock actualizado correctamente");
                    }
                    else 
                    {
                        System.out.println("No se ha encontrado el producto a actualizar");
                    }

                    break;

                case 4: // MOSTRAR INFORMACION:
                
                    System.out.println("INFORME DE STOCK DE LA TIENDA:");
                    System.out.println(recambios);

                    break;

                case 5: // MOSTRAR ORDENADO POR CANTIDAD:
                
                    System.out.println("STOCK ORDENADO:");
                    System.out.println(recambios);

                    break;

                case 0: // SALIR:
                    salir = true;
                    System.out.println("Hasta pronto");

                default:
                    System.out.println("Opción incorrecta, vuelve a intentarlo");
            }

            System.out.println();

        }while(!salir);

    }

    

    // FUNCIONES:

    static int menu()
    {
        System.out.println("\n\n- - - - - BIENVENIDO A REPUESTOS LÓPEZ - - - - -");
        System.out.println("1 - Insertar producto");
        System.out.println("2 - Borrar producto");
        System.out.println("3 - Cambio de stock");
        System.out.println("4 - Mostrar informe");
        System.out.println("5 - Mostrar ordenado por cantidad");
        System.out.println("0 - Salir");
        System.out.println("---------------------------------------------");
        System.out.println(" Indique opción...\n");

        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }


    public static void ordenarPorCantidad(HashMap<String, Integer> coleccion)
    {
        
    }
}
