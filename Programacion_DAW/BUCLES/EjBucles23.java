package BUCLES;

import java.util.Scanner;

public class EjBucles23 { // Números hasta 10.000
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        int contador = 0;
        int max, min;

        System.out.println("Ve introduciendo número de forma seguida:");
        num = sc.nextInt();

        min = num;
        max = num;

        while (suma + num <= 10000) 
        {  
            max = Math.max(max, num);
            min = Math.min(min, num);

            contador++;
            // Actualiza la condición:
            suma = suma + num;
            // Vuelvo a leer numero:
            num = sc.nextInt();
        }

        if (contador > 0)
        {
            System.out.println("El acumulado es " + (suma));
            System.out.println("Has introducido " + (contador) + " números.");
            System.out.println("La media de los números introducidos es " + (float)suma/contador);
            System.out.println("El máximo es " + max);
            System.out.println("El mínimo es " + min);
        }
        else
        {
            System.out.println("Los datos no son correctos");
        }

        sc.close();
    }
}
