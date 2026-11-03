package MATH;
import java.util.Scanner;

public class RepasoNumerosMath {

    public static void main(String[] args) {

        // Los final se declaran arriba del todo en Mayusculas: (ojo la f en floats)
        final float PRECIO_HORA = 12.5f;

        Scanner sc = new Scanner(System.in);

        System.out.println ("Introduce un número decimal: ");
        float decimal = sc.nextFloat();
        sc.nextLine();      //con esta lectura de teclado limpio el buffer de entrada
                            //para limpiar el enter que no me ha leido al poner el float 
                            //y poder escribir el String sin que me salte de línea
    
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine(); 
        
        // Booleanos y ternarios:

        System.out.println("Introduce un número al azar:");
        int Numero = sc.nextInt();

        boolean esPar = (Numero % 2) == 0;
  
        // Operador ternario

        String mensaje = (esPar) ? " es Par" : " es IMPAR";

        System.out.println("El número " + Numero + mensaje);

        sc.close();
    }
}
