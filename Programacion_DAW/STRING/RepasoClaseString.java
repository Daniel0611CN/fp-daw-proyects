package STRING;
import java.util.Scanner;

public class RepasoClaseString { // Repaso completo de uso de cadenas de texto
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 1. Leer un texto y medir su longitud:

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        int longitud = texto.length();

        System.out.println("La longitud del texto es de " + longitud + " caracteres.");

        System.out.println("----------------------------------------------------------");

        // 2. Buscar el caracter de una posición dada:

        System.out.println("Introduce otro texto:");
        String texto2 = sc.nextLine();

        System.out.println("Introduce la posición que quieres conocer:");
        int posicion = sc.nextInt();

        char caracter = texto2.charAt(posicion); // aquí si se sale me da error, tengo que hacerlo controlando que no salga error

        System.out.println((posicion<longitud) ? "El caracter buscado es \'"+caracter+"\'" : "La posición excede el tamaño del texto." );

        System.out.println("----------------------------------------------------------");

        // 3. Pedir texto y posición y partir el texto por la posición, mostrando las dos partes:

        System.out.println("Introduce otro texto diferente:");
        String textoParaCortar = sc.nextLine();

        System.out.println("Introduce la posición por la que quieres partirlo:");
        int posicion2 = sc.nextInt();

        String textoDesdePrincipio = textoParaCortar.substring(0, posicion2);
        System.out.println("La segunda parte del texto es: " + textoDesdePrincipio);

        String textoDesdePosicion = textoParaCortar.substring(posicion2);
        System.out.println("La primera parte del texto es: " + textoDesdePosicion);

        System.out.println("----------------------------------------------------------");

        // 4. Reemplazar un caracter indicado por el usuario por otro caracter tambíen indicado:




        sc.close();
    }
}
