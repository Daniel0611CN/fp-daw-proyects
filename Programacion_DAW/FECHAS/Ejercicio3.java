package FECHAS;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        final int añoactual = 2022;

        System.out.println("Introduce tu año de nacimiento:");
        int nacimiento = datos.nextInt();


        int edadFinal = (añoactual - nacimiento);

        System.out.println("Tu edad es: " + edadFinal);

        datos.close();
    }

    
}
