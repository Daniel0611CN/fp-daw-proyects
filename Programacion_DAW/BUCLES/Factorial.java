package BUCLES;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int factorial = 1;

        System.out.println("Introduce un numero para calcular su factorial:");
        int numUsuario = sc.nextInt();

        for (int aux = 1; aux<=numUsuario; aux++)
        {
            factorial = factorial*aux;
            System.out.println(aux + " y factorial: " + factorial);
        }
        System.out.println(numUsuario + "! = " + factorial);

        sc.close();
    }
}
