package MATH;
import java.util.Scanner;

public class ParImpar { // Numero par o impar
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número al azar:");
        int Numero = sc.nextInt();

        boolean esPar = (Numero % 2) == 0;

        System.out.println("¿Es un numero par?: " + esPar);
  
        // Ahora usando un operador ternario

        String mensaje = (esPar) ? " es Par" : " es IMPAR";

        System.out.println("El número " + Numero + mensaje);



        sc.close();
    }

}
