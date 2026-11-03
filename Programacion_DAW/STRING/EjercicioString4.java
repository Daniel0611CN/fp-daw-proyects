package STRING;
import java.util.Scanner;

public class EjercicioString4 { // Leer caracter y sustituirlo
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto");
        String texto = sc.nextLine();

        // Leo el primer caracter con charAt 0
        System.out.println("Introduce el caracter que quieres cambiar");
        char caracterBuscado = sc.nextLine().charAt(0);

        // Leo el segundo caracter con charAt 0
        System.out.println("Introduce el caracter nuevo");
        char caracterNuevo = sc.nextLine().charAt(0);

        // Declaro el texto modificado cambiando los caracteres con REPLACE
        String textoModificado = texto.replace(caracterBuscado, caracterNuevo);

        System.out.println(textoModificado);


        sc.close();
    }
}
