package BUCLES;

import java.util.Scanner;

public class EjBucles26 { // Posición de un dígito:
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long resto = 0;
        long volteado = 0;
        int contadorGlobal = 0;
        int contadorDigito = 0;
        int contadorDeNoApariciones = 0;

        System.out.println("Introduce un número:");
        long numero = sc.nextLong();

        System.out.println("Introduce un dígito:");
        int digito = sc.nextInt();

         // Con el primer bucle le doy la vuelta al número para sacar los dígitos en orden
         // y contar el numero de digitos totales:
        while (numero > 0)
        {
            resto = numero % 10;
            volteado = volteado*10 + resto;
            contadorGlobal++;
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
                System.out.println(digito + " aparece en la posición " + contadorDigito);
            }
            else
            {
                contadorDeNoApariciones++;
            }
            // Actualización de la condición:
            volteado = volteado/10;
        }
        if (contadorDeNoApariciones == contadorGlobal)
        {
            System.out.println("El dígito introducido no aparece en el número anterior.");
        }
    
        sc.close();
    }
}
