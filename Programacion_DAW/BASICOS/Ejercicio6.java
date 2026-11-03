package BASICOS;
import java.util.Scanner;

public class Ejercicio6 { // El cubo de un numero

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);


        System.out.println("Introduce un número:");
        float numero1 = datos.nextFloat();

        
        float resultado = (numero1 * numero1 *numero1);
        System.out.println("El resultado es: " + resultado);

        datos.close();
    }

    
}
