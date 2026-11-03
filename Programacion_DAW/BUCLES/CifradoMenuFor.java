package BUCLES;

import java.util.Scanner;

public class CifradoMenuFor { // Con FOR: mantengo los espacios creando un String de palabras
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_RESET = "\u001B[0m";

        // VARIABLES:
        int opcion = 0;
        int factorCifrado = 0;
        String texto = "";
        char caracterRevisado = ' ';
        char caracterCifrado = ' ';
        int numeroCaracter = 0;
        boolean salir = false;
        String palabra = "";
        String palabraCifrada = "";
        String fraseCifrada = "";
        String palabraC = "";
        String palabraDescifrada = "";
        String fraseDescifrada = "";

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
                    System.out.println("Dime el factor de cifrado entre 1 y 9:"); // Numero entre 1 y 9
                    factorCifrado = sc.nextInt();
                    //limpiar Buffer:
                    sc.nextLine();
            
                    System.out.println("Introduce el texto a cifrar (EN MAYÚSCULAS):");
                    texto = sc.nextLine().toUpperCase();
            
                    String[] palabras = texto.split(" ");
            
                    // PRIMER BUCLE QUE RECORRE CADA PALABRA DEL ARRAY (y otro dentro que la modifique)
                    for (int numeroPalabra = 0; numeroPalabra < palabras.length; numeroPalabra++)
                    {
                        palabra = palabras[numeroPalabra];
                        palabraCifrada = "";
            
                        // SEGUNDO BUCLE QUE CONSTRUYE CADA PALABRA Y LE AÑADE EL FACTOR DE CIFRADO
                        for (int contadorCaracter = 0; contadorCaracter<palabra.length(); contadorCaracter++)
                        {
                            caracterRevisado = palabra.charAt(contadorCaracter);
                            numeroCaracter = (int)caracterRevisado + factorCifrado;
            
                            if (numeroCaracter > 90)
                            {
                                numeroCaracter = numeroCaracter-26;
                            }
                            caracterCifrado = (char)numeroCaracter;
            
                            palabraCifrada = "" + palabraCifrada + caracterCifrado;
                        }
                        palabraCifrada = "" +  factorCifrado + palabraCifrada;
                        fraseCifrada = fraseCifrada + palabraCifrada + " ";
                    }
            
                    System.out.println(fraseCifrada);
                    break;

                case 2:
                    System.out.println("Introduce el texto cifrado (EN MAYÚSCULAS):");
                    texto = sc.nextLine().toUpperCase();
            
                    String[] palabrasCifradas = texto.split(" ");
            
                    // PRIMER BUCLE QUE RECORRE CADA PALABRA DEL ARRAY (y otro dentro que la modifique)
                    for (int numeroPalabra = 0; numeroPalabra < palabrasCifradas.length; numeroPalabra++)
                    {
                        palabraC = palabrasCifradas[numeroPalabra];
                        palabraDescifrada = "";

                        factorCifrado = Character.getNumericValue(palabraC.charAt(0));
                        palabraC = palabraC.substring(1);

                        // SEGUNDO BUCLE QUE CONSTRUYE CADA PALABRA Y LE AÑADE EL FACTOR DE CIFRADO
                        for (int contadorCaracter = 0; contadorCaracter<palabraC.length(); contadorCaracter++)
                        {
                            caracterRevisado = palabraC.charAt(contadorCaracter);
                            numeroCaracter = (int)caracterRevisado - factorCifrado;
            
                            if (numeroCaracter < 65)
                            {
                                numeroCaracter = numeroCaracter+26;
                            }
                            caracterCifrado = (char)numeroCaracter;
            
                            palabraDescifrada = "" + palabraDescifrada + caracterCifrado;
                        }
                        fraseDescifrada = fraseDescifrada + palabraDescifrada + " ";
                    }
                    System.out.println(fraseDescifrada);
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
