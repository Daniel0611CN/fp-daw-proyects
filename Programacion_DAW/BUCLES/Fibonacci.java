package BUCLES;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int nuevo = 0;

        System.out.println("Serie de FIBONACCI");
        System.out.println("-------------------");
        System.out.println("Introduce un número");
        int num = sc.nextInt();

        if (num == 1)
        {
            System.out.println(num1); // Imprimo el 0 para el caso 1
        }
        else if (num == 2)
        {
            System.out.println(num1 + ", " + num2); // Imprimo 0, 1 para el caso 2
        }
        else
        {   
            System.out.print(num1 + ", " + num2); // Imprimo los dos primeros y reasigno valores y sumo con el bucle:

            for (int aux = 1; aux <= num-2; aux++) // Le resto 2 a num porque ya he escrito los dos primeros
            {
                nuevo = num1 + num2;
                System.out.print(", " + nuevo);
                
                // Actualiza la condicion:
                num1 = num2;
                num2 = nuevo;
            }
            System.out.println("");
        }

        sc.close();
    }
}
