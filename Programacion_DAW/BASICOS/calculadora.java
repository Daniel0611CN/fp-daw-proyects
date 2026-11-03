package BASICOS;
import java.util.Scanner;

public class calculadora 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduzca el primer numero"); 
        
        Scanner entrada = new Scanner(System.in);

        int numero1 = entrada.nextInt();

        System.out.println("Introduzca el segundo numero");

        int numero2 = entrada.nextInt();

        int resultadoSuma = numero1 + numero2;
        System.out.println("La suma es: " + resultadoSuma);

        System.out.println("La resta es: " + (numero1 - numero2) );

        String cadenaResultado = "El resultado es: " + resultadoSuma + "€";
        System.out.println(cadenaResultado);

        // HASTA AQUÍ ABRIMOS TECLADO Y PROGRAMAMOS SUMA Y RESTA, primero identificando el resultado y segundo haciendo la operacion directamente)

        System.out.println("Introduzca el primer numero");

        float numero3 = entrada.nextFloat();

        System.out.println("Introduzca el segundo numero");

        float numero4 = entrada.nextFloat();

        float resultadoMulti = numero3 * numero4;

        System.out.println("La multiplicacion es: " + resultadoMulti);

        System.out.println("La division es: " + (numero3 / numero4) );

        entrada.close();



    }

}
