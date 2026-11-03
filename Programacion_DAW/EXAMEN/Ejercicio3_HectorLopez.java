package EXAMEN;

import java.util.Scanner;

public class Ejercicio3_HectorLopez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salida = false;
        String frase = "";
        int longitudActual = 0;

        // Bucle principal
        while (salida == false)
        {
            // Imprimir menu:
            System.out.println("\n\t* Opción A - Introducir una cadena de caracteres (elimina la frase que hubiera y almacena la nueva)");
            System.out.println("\t* Opción B - Mostrar la cadena actual");
            System.out.println("\t* Opción C - Buscar una cadena y su numero de apariciones");
            System.out.println("\t* Opción D - Recorrer cada palabra en orden inverso + posición + longitud");
            System.out.println("\t* Opción E - Invertir las palabras de la cadena");
            System.out.println("\t* Opción F - Salir\n");
            System.out.println("Indique la opción que quiere realizar:");

            String lecturaEntrada = sc.nextLine(); // Lo leo como String para coger el char solo si se ha escrito algo válido:

            // Controlo que se ha leído algo para no dar error:
            if (lecturaEntrada.isEmpty() || lecturaEntrada.length() > 1)
            {
                System.out.println("Entrada no válida");
            }
            else // Si no hay error procedemos a leer opciones:
            {
                char entrada = lecturaEntrada.charAt(0); // Una vez valido la entrada saco mi char(0)
                entrada = Character.toUpperCase(entrada);

                switch (entrada){
                    case 'A': // Añadir texto machacando el valor anterior
                        System.out.println("Introducir frase:");
                        frase = sc.nextLine();
                        break;

                    case 'B': // Mostrar cadena actual

                        longitudActual = frase.length();
                        if (longitudActual > 0) // Controlo si está vacía
                        {
                            System.out.println("La frase actual es: \"" + frase + "\"");
                        }
                        else
                        {
                            System.out.println("La frase esta vacía");
                        }
                        break;

                    case 'C': // Buscar cadena dentro del texto completo:

                        longitudActual = frase.length();

                        if (longitudActual < 1)
                        {
                            System.out.println("La frase esta vacía");
                        }
                        else
                        {
                            System.out.println("¿Que cadena quieres buscar?");
                            String cadenaBuscada = sc.nextLine().toLowerCase();

                            int posicion = 0;
                            int contadorApariciones = 0;

                            while (frase.toLowerCase().indexOf(cadenaBuscada, posicion) >= 0)
                            {
                                // Busco la primera aparición a partir de una posición que vamos actualizando:
                                posicion = frase.toLowerCase().indexOf(cadenaBuscada, posicion);
                                // Imprimo cada vez que aparece con su posición encontrada
                                System.out.println("Aparece en la posición: " + posicion); 

                                posicion++;
                                contadorApariciones++;
                            }
                            System.out.println("La cadena \"" + cadenaBuscada + "\" aparece: " + contadorApariciones + " veces");
                        }
                        break;

                    case 'D': // Recorrer palabras en orden inverso con posicion y longitud

                        longitudActual = frase.length();

                        if (longitudActual < 1)
                        {
                            System.out.println("La frase esta vacía");
                        }
                        else
                        {
                            // Creo un Array de palabras separando por cada espacio
                            String[] palabrasFrase = frase.split(" ");

                            for (int aux = (palabrasFrase.length)-1; aux>=0; aux--)
                            {   
                                            // POSICION              // PALABRA EN ESA POSICION          // LONGITUD DE ESA PALABRA
                                System.out.println((aux) + "- " + palabrasFrase[aux].toString() + "(" + palabrasFrase[aux].length() + " letras)" );
                            }
                        }
                        break;

                    case 'E': // Invertir frase:

                        longitudActual = frase.length();

                        if (longitudActual < 1)
                        {
                            System.out.println("La frase esta vacía");
                        }
                        else
                        {
                            // Meto las palabras sueltas en un ARRAY
                            String[] palabrasSueltas = frase.split(" ");
                            String invertida = "La frase invertida es: ";

                            for (int aux = (palabrasSueltas.length)-1; aux>=0; aux--)
                            {   
                                // Voy metiendo las palabras en un String recorriendo el Array desde el final
                                invertida = invertida + " " + palabrasSueltas[aux].toString();
                            }
                            System.out.println(invertida);
                        }
                        break;

                    case 'F':
                        salida = true;
                        System.out.println("¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("Opción no contemplada");

                }// FIN SWITCH

            }// FIN IF/ELSE

        }// FIN BUCLE

        sc.close();
    }
}
