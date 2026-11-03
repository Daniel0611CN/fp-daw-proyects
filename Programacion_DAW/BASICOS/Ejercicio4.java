package BASICOS;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);


        System.out.println("Introduce tu año de nacimiento:");
        int nacimiento = datos.nextInt();

        System.out.println("Introduce el año en el que quieres conocer tu edad:");
        int añoObjetivo = datos.nextInt();

        int edadFinal = (añoObjetivo - nacimiento);
        System.out.println("Tu edad es: " + edadFinal);

        datos.close();
    }

    
}
