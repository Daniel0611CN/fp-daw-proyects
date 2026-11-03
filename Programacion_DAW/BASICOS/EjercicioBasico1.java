package BASICOS;
import java.util.Scanner;

public class EjercicioBasico1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        float Num1 = sc.nextFloat();

        System.out.println("Introduce el segundo número:");
        float Num2 = sc.nextFloat();

        float Total = (Num1 * Num2);
        System.out.println("Su multiplicación es: " + Total);



        sc.close();

    }

}
