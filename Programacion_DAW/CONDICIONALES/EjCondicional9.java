package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional9 { // Realiza un programa que resuelva una ecuación de segundo grado (del tipo
                                //  ax2 + bx + c = 0).
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double resultadoX = 0;

        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0");
        System.out.println("Por favor, introduce el valor de a:");
        double valorA = sc.nextDouble();
        System.out.println("Ahora introduzca el valor de b:");
        double valorB = sc.nextDouble();
        System.out.println("Ahora introduzca el valor de c:");
        double valorC = sc.nextDouble();


        resultadoX = (-valorB + (Math.sqrt(Math.pow(valorB, 2)-4*(valorA*valorC))))/2*valorA;
        resultadoX2 = (-valorB - (Math.sqrt(Math.pow(valorB, 2)-4*(valorA*valorC))))/2*valorA;

        if ((Math.pow(valorB, 2)-4*(valorA*valorC)) < 0) {
    
            System.out.println("La raíz no puede ser negativa");
        }
        else if (valorA == 0) {
            System.out.println("El valor de a no puede ser cero");
        }    
        else {
            resultadoX = (-valorB + (Math.sqrt(Math.pow(valorB, 2)-4*(valorA*valorC))))/2*valorA;
            resultadoX2 = (-valorB - (Math.sqrt(Math.pow(valorB, 2)-4*(valorA*valorC))))/2*valorA;
            System.out.println("x = " + resultadoX);
        }

        sc.close();
    }
}
