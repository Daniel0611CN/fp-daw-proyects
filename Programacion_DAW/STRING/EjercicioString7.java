package STRING;
import java.util.Scanner;

public class EjercicioString7 { // Identificar un caracter introducido por teclado
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter");
        char caracterUsuario = sc.nextLine().charAt(0);

        boolean esDigito = Character.isDigit(caracterUsuario);
        boolean esEspacio = Character.isSpaceChar(caracterUsuario);
        boolean esMayuscula = Character.isUpperCase(caracterUsuario);


        System.out.println((esDigito) ? caracterUsuario + " es un dígito" : caracterUsuario + " no es un dígito");
        System.out.println((esEspacio) ? caracterUsuario + " es un espacio" : caracterUsuario + " no es un espacio");
        System.out.println((esMayuscula) ? caracterUsuario + " es un caracter en mayúscula" : caracterUsuario + " no es mayúscula");


        sc.close();
    }
}
