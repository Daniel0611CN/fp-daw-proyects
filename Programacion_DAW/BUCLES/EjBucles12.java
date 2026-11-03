package BUCLES;

import java.util.Scanner;

public class EjBucles12 { // Fibonacci
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero a calcular");
        int numero = sc.nextInt();

        switch (numero){

            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("0, 1");
                break;
            default:
                // Bucle de Fibonacci:

                int num1 = 0;
                int num2 = 1;

                for (int aux = 0; aux < numero-2 ; aux++){

                    System.out.print(num1 + ", " + num2 + ", " + (num1+num2));

                    num1 = num2;
                    num2 = num1 + num2;
                }
                break;
            

        }





        sc.close();
    }
}
