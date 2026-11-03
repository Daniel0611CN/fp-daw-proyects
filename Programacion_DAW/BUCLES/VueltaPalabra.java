package BUCLES;

import java.util.Scanner;

public class VueltaPalabra {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // VARIABLES:
        String mensaje = "Introduce una palabra o frase: (escribe SALIR para cerrar el programa)";
        String frase = "";
        int longitud = 0;
        int primeraPosicion = 0;
        int ultimaPosicion = 0;
        boolean esPali = true;


        // PRIMER MENSAJE:
        System.out.println(mensaje);
        frase = sc.nextLine().toLowerCase();



        System.out.println("-----------------------------------------------------------------------");


        // DAR LA VUELTA A LA FRASE:
        String fraseAlReves = "";

        for (int aux = 0; aux < frase.length(); aux++)
        {
            fraseAlReves = fraseAlReves + frase.charAt(aux);
        }

        System.out.println("Frase al revés: " + fraseAlReves);

        if (frase.equals(fraseAlReves))
        {
            System.out.println("La frase es Palíndroma");
        }
        else{
            System.out.println("NO es Palíndroma");
        }


        System.out.println("-----------------------------------------------------------------------");



        // BUCLE PRINCIPAL:
        while (!frase.equalsIgnoreCase("salir"))
        {
            frase = frase.replace(" ", ""); // Quito los espacios

            longitud = frase.length();
            primeraPosicion = 0;
            ultimaPosicion = longitud-1;

            // Bucle comparador:
            while (primeraPosicion <= ultimaPosicion) // Hasta que llegue al caracter del centro:
            {

                if (frase.charAt(primeraPosicion) == frase.charAt(ultimaPosicion))
                {
                    esPali = esPali && true;
                }
                else
                {
                    esPali = esPali && false;
                }
                // Actualizo condicion:
                primeraPosicion++;
                ultimaPosicion--;
            }

            if (esPali == true)
            {
                System.out.println("La frase es Palídroma");
            }
            else
            {
                System.out.println("NO es una frase Palídroma");
            }

            // ACTUALIZO LA CONDICIÓN:
            System.out.println(mensaje);
            frase = sc.nextLine().toLowerCase();
        }
        sc.close();
    }
}

