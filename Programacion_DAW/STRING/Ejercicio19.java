package STRING;
import java.util.Scanner;

public class Ejercicio19{ // Variables de tipo Char y String

        // CASTING
    

    public static void main(String[] args){

        char caracter = 'f';

        String mensaje = " Esto es una cadena larga";

        System.out.println(caracter + mensaje);


        char char1 = 'r';
        char char2 = 'a';
        char char3 = 'm';
        char char4 = 'o';
        char char5 = 'n';

        String cadena = "" + char1 + char2 + char3 + char4 + char5;

        // Se pone un String vacio para que entienda que está concatenando Strings y no sumando valores

        System.out.println(cadena);


        // Leer de teclado un caracter
        // Si es la "s" entonces sumo dos valores
        // Si no es la "s" muestro los caracteres con esos codigos ASCII
        // 

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un caracter");
        char opcion = sc.next().charAt(0);

        System.out.println("introduce un numero");
        int num1 = sc.nextInt();

        System.out.println("introduce otro numero");
        int num2 = sc.nextInt();

        int resultadoSuma = (num1+num2);

        // Aquí convierto numeros a sus caracteres correspondientes
        // paso de int a char poniendoselo delante

        String cadenasMostradas = (char)num1 + "" + (char)num2;

        System.out.println((opcion == 's') ? resultadoSuma : cadenasMostradas);


        // Aquí voy a convertir el char 's' en su valor numerico

        int ejemplo = (int)opcion;
        System.out.println(ejemplo);


        sc.close();

    }
}
