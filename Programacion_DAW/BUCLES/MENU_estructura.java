package BUCLES;

import java.util.Scanner;


public class MENU_estructura {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_RESET = "\u001B[0m";

        // VARIABLES:
        boolean salir = false;
        int opcion = 0;


        // BUCLE MENU
        while (!salir)
        {
            System.out.println("\n"+ANSI_GREEN_BACKGROUND + "PROGRAMA COMPUTACIONAL DE CIFRADO DE SEGURIDAD EXTREMA" + ANSI_RESET+"\n");

            System.out.println("Elige la opción que quieres realizar:");
            System.out.println("\t1 -> para CIFRAR");
            System.out.println("\t2 -> para DESCIFRAR");
            System.out.println("\t3 -> para SALIR");
            opcion = sc.nextInt();


        // limpiar Buffer:
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                   
                    break;

                case 2:
                   
                    break;

                case 3:
                
                default:
                    salir = true;
                    System.out.println("Hasta pronto");
            }
        }
        sc.close();
    }
}
