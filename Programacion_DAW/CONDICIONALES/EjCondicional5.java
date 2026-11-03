package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double resultadoX = 0;

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduce el valor de a:");
        double valorA = sc.nextDouble();
        System.out.println("Ahora introduzca el valor de b:");
        double valorB = sc.nextDouble();

        if (valorA != 0){
            resultadoX = (0-valorB)/valorA;
            System.out.println("x = " + resultadoX);
        }

        else {
            System.out.println("Esa ecuación no tiene solución real");
        }    

        sc.close();
    }
}
