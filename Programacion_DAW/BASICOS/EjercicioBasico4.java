package BASICOS;
import java.util.Scanner;

public class EjercicioBasico4 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número de la operación:");
        float Num1 = sc.nextFloat();

        System.out.println("Introduce el segundo numero:");
        float Num2 =sc.nextFloat();

        float Suma = (Num1 + Num2);
        float Resta = (Num1 - Num2);
        float Multi = (Num1 * Num2);
        float Division = (Num1 / Num2);

        System.out.println("La suma es " + Suma);
        System.out.println("La resta es " + Resta);
        System.out.println("La multiplicación es " + Multi);
        System.out.println("La dividión es " + Division);



        sc.close();
    }

}
