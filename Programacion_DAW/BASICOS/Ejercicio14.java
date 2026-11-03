package BASICOS;
import java.util.Scanner;

public class Ejercicio14 { // y = ax2 + bx + c
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // tenemos que pedir a, b, c + X
        // y calcular el valor de Y

        System.out.println("Introduce el valor de A");
        float A = sc.nextFloat();

        System.out.println("Introduce el valor de B");
        float B = sc.nextFloat();

        System.out.println("Introduce el valor de C");
        float C = sc.nextFloat();

        System.out.println("Introduce el valor de X");
        float X = sc.nextFloat();

        float ResultadoY = (A*(X*X))+(B*X)+C;
        System.out.println("El valor resultante de Y es igual a " + ResultadoY);

        
        sc.close();
    }
}
