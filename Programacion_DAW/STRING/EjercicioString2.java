package STRING;
import java.util.Scanner;

public class EjercicioString2 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto");
        String texto = sc.nextLine();

        // En vez de calcular la pos Max lo hago directamente en el booleano de comprobación
        int longitud = texto.length();
        int posicionMax = longitud-1;

        System.out.println("Introduce la posición, con un valor menor o igual a " + (posicionMax));
        int posicion = sc.nextInt();

        // Comprobamos que la posicion es válida y declaramos el caracter buscado y el mensaje de error:

        boolean posicionValida = posicion <= texto.length()-1;
        char caracterBuscado = (posicionValida) ? texto.charAt(posicion) : ' ';
        String error = "El valor introducido es incorrecto";

        // Imprimimos con un booleano según si posicionvalida es correcto o no
        System.out.println((posicionValida) ? ("La letra que está en esa posición es la \'" + caracterBuscado + "\'.") : error);
        

        sc.close();
    }
}
