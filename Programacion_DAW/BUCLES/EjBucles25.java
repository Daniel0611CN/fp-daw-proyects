package BUCLES;

import java.util.Scanner;

public class EjBucles25 { // Numero del revés
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int resto = 0;
        int num2 = 0;

        System.out.println("Introduce un número para verlo al revés:");
        int numero = sc.nextInt();

        while (numero>0)
        {
            resto = numero % 10;
            num2 = num2*10 + resto;
            numero = numero/10;
        }
        System.out.println(num2);

        sc.close();
    }
}
