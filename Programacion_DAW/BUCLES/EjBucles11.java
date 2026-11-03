package BUCLES;

import java.util.Scanner;

public class EjBucles11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numUsuario = sc.nextInt();

        for (int aux = numUsuario; aux<=numUsuario+5; aux++)
        {
            System.out.println("Número: " + aux + "\t Cuadrado: " + Math.pow(aux, 2) + "\t\t Cubo: " + Math.pow(aux, 3));
        }

        sc.close();
    }
}
