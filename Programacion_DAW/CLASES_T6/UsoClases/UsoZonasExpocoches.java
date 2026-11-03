package CLASES_T6.UsoClases;

import java.util.Scanner;
import CLASES_T6.Clases.Zona;

public class UsoZonasExpocoches {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Zona principal = new Zona(1000);
        Zona compra_venta = new Zona(200);
        Zona vip = new Zona(25);
    
        boolean salir = false;
        int opcion = 0;
    
        do
        {
            System.out.println("\nBIENVENIDO A EXPOCOCHES CAMPANILLAS\n");
    
            menu();
            opcion = sc.nextInt();

            switch(opcion)
            {
                case 1:
                    imprimirLibres(principal, compra_venta, vip);
                    break;

                case 2:
                    System.out.println("¿Cuantas entradas quieres?");
                    int cantidad = sc.nextInt();
                    System.out.println("¿De que zona? (1 - principal, 2 - compra_venta, 3 - vip)");
                    int numZona = sc.nextInt();

                    switch(numZona)
                    {
                        case 1:
                            principal.vender(cantidad);
                            break;
                        case 2:
                            compra_venta.vender(cantidad);
                            break;
                        case 3:
                            vip.vender(cantidad);
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                    }
                    break;

                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }//switch

        } while(!salir);

    }//main

    
    // funciones:
    public static void menu()
    {
        System.out.println("1 - Mostrar número de entradas");
        System.out.println("2 - Venta de entradas");
        System.out.println("3 - Salir");
        System.out.println("\nIntroduce la opción deseada:");
    }

    public static void imprimirLibres(Zona z1, Zona z2, Zona z3)
    {
        System.out.println("Zona principal :" + z1.getEntradasPorVender());
        System.out.println("Zona principal :" + z2.getEntradasPorVender());
        System.out.println("Zona principal :" + z3.getEntradasPorVender());
    }


}//class

