package BASICOS;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);


        System.out.println("Introduce el primer número:");
        float numero1 = datos.nextFloat();

        System.out.println("Introduce el segundo número:");
        float numero2 = datos.nextFloat();

        float resultado = (numero1 * numero2);
        System.out.println("El resultado es: " + resultado);

        datos.close();
    }

    
}
