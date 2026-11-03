package STRING;
import java.util.Scanner;

public class EjercicioString11 { //  digito del 0 al 9 
    
    public static void main(String[] args) {
        
        String texto = "Hola tu!";

        Scanner sc = new Scanner(System.in);

        // Pido el dígito y lo leo como caracter:
        System.out.println("Introduce un dígito del 0 al 9:");
        char posicion = sc.nextLine().charAt(0);

        /* COMPROBACIONES
        *   boolean esDigito = Character.isDigit(digitoLeido)
            int longitudCadenaEjemplo = cadenaEjemplo.length();

            // convierto el caracter a us valor entero (int)
            int digitoLeidoEntero = character.getNumericValue(digitoLeido)

            // esto es lo mismo
            boolean estaDentro = longitudCadenaEjemplo > (int)digitoLeido;

            Leer carater de la cadena:
            char caracterleido = (esDigito && estaDentro) ? cadenaEjemplo.charAt(digitoLeidoEntero) : "";

            boolean esEspacio = Character.isSpaceChar(caracterLeido);

            String resultadoFinal = (!esEspacio) ? caracterLeido + "" : "ESPACIO";


            // Muestro el caracter y la posicion leida

            System.out.println((esDigito && estaDentro)? " El caracter es " + resultadoFinal : "ERROR")


        *
        *
        *
        */




        // convierto a entero
        int posicionNumerica = Character.getNumericValue(posicion);

        // compruebo que entra en la cadena
        boolean entradaValida = (posicionNumerica <= texto.length()-1) && (Character.isDigit(posicion));
        
        // Declaro el caracter final equivalente en mi cadena de texto:
        char caracterFinal = texto.charAt(posicionNumerica);

        // mostrar comprobando si es un caracter incorrecto o no 
        System.out.println((entradaValida)? posicion+" equivale al caracter \""+caracterFinal+"\" en nuestro texto." : posicion+" es un valor incorrecto.");
        
        
        // Compruebo si es un espacio o no, y lo informo solo en caso de serlo
        System.out.println(Character.isSpaceChar(caracterFinal)?"Es un espacio":" ");


    

        sc.close();
    }
}
