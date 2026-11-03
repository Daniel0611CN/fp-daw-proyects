package BUCLES;

import java.util.Scanner;

public class CifradoMenuWhile { // Con While: elimino espacios, no forma palabras sueltas
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_RESET = "\u001B[0m";

        // VARIABLES:
        int opcion = 0;
        int factorCifrado = 0;
        String texto = "";
        int contador = 0;
        char caracterRevisado = ' ';
        char caracterCifrado = ' ';
        int numeroCaracter = 0;
        boolean salir = false;


        // BUCLE MENU
        while (!salir)
        {
            System.out.println(ANSI_GREEN_BACKGROUND + "PROGRAMA COMPUTACIONAL DE CIFRADO DE SEGURIDAD EXTREMA" + ANSI_RESET);

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
                    System.out.println("Dime el factor de cifrado entre 1 y 9:"); // Numero entre 1 y 9
                    factorCifrado = sc.nextInt();
                    //limpiar Buffer:
                    sc.nextLine();
            
                    System.out.println("Introduce el texto a cifrar (EN MAYÚSCULAS):");
                    texto = sc.nextLine().toUpperCase().replace(" ","");
            
                    System.out.print(factorCifrado);
                    // Bucle que cambia cada caracter:
                    contador = 0;
                    while (contador < texto.length())
                    {
                        caracterRevisado = texto.charAt(contador);
                        numeroCaracter = (int)caracterRevisado +factorCifrado;
                        if (numeroCaracter > 'Z') // Tambien se puede poner 90
                        {
                            numeroCaracter = numeroCaracter-26;
                        }
                        caracterCifrado = (char)numeroCaracter;
                        System.out.print(caracterCifrado);
                        contador++;
                    }
                    System.out.println("");
                    break;

                case 2:
                    contador = 0;
                    System.out.println("Introduce el texto cifrado:");
                    texto = sc.nextLine().toUpperCase();
                    factorCifrado = Character.getNumericValue(texto.charAt(0));

                    texto = texto.substring(1);

                    while (contador < texto.length())
                    {
                        caracterRevisado = texto.charAt(contador);
                        numeroCaracter = (int)caracterRevisado - factorCifrado;
                        if (numeroCaracter < 65)
                        {
                            numeroCaracter = numeroCaracter+26;
                        }
                        caracterCifrado = (char)numeroCaracter;
                        System.out.print(caracterCifrado);
                        contador++;
                    }
                    System.out.println("");
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
