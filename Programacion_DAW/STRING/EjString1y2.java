package STRING;
import java.util.Scanner;

public class EjString1y2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto");
        //String texto = sc.nextLine();
        String texto2 = "Hola soy Hector y estoy aprendiendo Java";
        System.out.println(texto2);

        int longitud = texto2.length();
        System.out.println("El texto tiene "+longitud+" caracteres.");

        // Introduce un número:
        int posicion = 9;

        // Controlar que la posición no pasa de la longitud de la cadena:
        // char caracterBuscado = texto2.charAt(posicion);
        System.out.println((posicion < longitud)? "El caracter en posicion "+posicion+" es "+(texto2.charAt(posicion)) : "La posición excede la cadena");


        sc.close();
    }
}
