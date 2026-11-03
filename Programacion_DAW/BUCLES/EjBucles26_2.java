package BUCLES;

import java.util.Scanner;

public class EjBucles26_2 { //Posicion de un dígito (CON STRING)
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long resto = 0;
        long volteado = 0;
        int contadorDigito = 0;
        int contadorApariciones = 0;
        int digito = 0;


        System.out.println("Introduce un número:");
        long numero = sc.nextLong();

        System.out.println("Introduce un dígito:");
        digito = sc.nextInt();

        // Declaro mi String una vez tengo el int digito para grabar su valor.
        String posicion = "El dígito " + digito + " aparece en las posiciones:";

         // Con el primer bucle le doy la vuelta al número para sacar los dígitos en orden
         // y contar el numero de digitos totales:
        while (numero > 0)
        {
            resto = numero % 10;
            volteado = volteado*10 + resto;
            // Actualiza condicion:
            numero = numero/10;
        }

        // Un segundo bucle para recorrer el numero al revés y sacar las posiciones
        while (volteado>0)
        {   // Operaciones:
            resto = volteado % 10;
            contadorDigito++;
            if (resto == digito)
            {
                posicion = posicion + " " + contadorDigito;
                contadorApariciones++;
            }
            // Actualización de la condición:
            volteado = volteado/10;
        }

        if (contadorApariciones > 0)
        {
            System.out.println(posicion);
        }
        else
        {
            System.out.println("El dígito introducido no aparece en el número anterior.");
        }

        sc.close();
    }
}
