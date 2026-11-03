package BUCLES;

import java.util.Scanner;

public class EjBucles18 { // Enteros entre dos numeros introducidos
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt(); 

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();

        if (num1 != num2)
        {
            int numMenor = Math.min(num1, num2);
            int numMayor = Math.max(num1, num2);

            if ((numMenor+7) <= numMayor)
            {
                int num = numMenor +7;
                System.out.println(num);
                do
                {
                    num = num +7;
                    System.out.println(num);

                }while (num <= numMayor);

            }
            else
            {
                System.out.println("No hay más de 7 enteros entre ambos números");
            }
        }
        else
        {
            System.out.println("Los números son iguales");
        }



        sc.close();
    }
}
