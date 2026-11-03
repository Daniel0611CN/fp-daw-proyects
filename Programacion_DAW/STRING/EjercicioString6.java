package STRING;
import java.util.Scanner;

public class EjercicioString6 { // Leer caracter y sustituirlo
 
    public static void main(String[] args) {
        
        String texto = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Fornite";

        Scanner sc = new Scanner(System.in);


        System.out.println("¿Quien estaba en casa de Juan?");
        String cadenaBuscada = sc.nextLine();

        String textoMinuscula = texto.toLowerCase();
        String cadenaMinuscula = cadenaBuscada.toLowerCase();

        boolean estaba = (textoMinuscula.indexOf(cadenaMinuscula) >= 0); 
        // IndexOf devuelve un valor, si está da cero o más, y si no está da negativo,
        // por eso ponemos el booleano con mayor o igual a cero.


        System.out.println((estaba) ? cadenaBuscada + " SI estaba" : cadenaBuscada + " NO estaba");



        sc.close();
    }
}
