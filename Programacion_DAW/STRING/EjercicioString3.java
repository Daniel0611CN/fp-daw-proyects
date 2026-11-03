package STRING;
import java.util.Scanner;

public class EjercicioString3 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto");
        String texto = sc.nextLine();

        // calculo la longitud de la cadena:
        int longitud = texto.length();
        int posicionMax = longitud-1;

        System.out.println("Introduce la posición por donde partir el texto, con un valor menor o igual a " + (posicionMax));
        int posicion = sc.nextInt();

        // Comprobamos que la posicion es válida y declaramos el caracter buscado y el mensaje de error:

        boolean posicionValida = posicion <= texto.length()-1;

        // Sacamos los dos trozos de texto con subString
        String textoDerecha = texto.substring(posicion);
        String textoIzquierda = texto.substring(0, posicion);
        
        
        System.out.println("La parte izquierda es \""+textoIzquierda+"\" y la parte de la derecha es \""+textoDerecha+"\"");

        

        sc.close();
    }
}
