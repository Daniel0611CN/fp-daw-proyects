package STRING;

import java.util.Scanner;  //Import nos lleva a la libreria "Scanner" que es la que nos permite leer teclado

public class lecturaTeclado 
{
    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in); //El warning se debe a que siempre que se abre un flujo de conexion o lectura externo se debe cerrar despues
        System.out.println("Introduce tu nombre y pulsa Enter");
        String nombreUsuario = lector.nextLine();     //nextLine lo que hace es leer lo que escribe el teclado en la siguiente linea

        System.out.println("------");  //las lineas las ponemos para separar la entrada que hemos tecleado de la que lee el archivo de nuestro teclado
        System.out.println(nombreUsuario);

        System.out.println("Introduce tu edad y pulsa Enter");
        int edadUsuario = lector.nextInt(); //int nos permite trabajar con numeros enteros en vez de con cadenas de carateres como String

        System.out.println("------");
        System.out.println(edadUsuario);

        System.out.println("Introduce tu note media y pulsa Enter");
        Float notaUsuario = lector.nextFloat(); // Float nos permite leer numeros decimales (como estamos en español con coma y no punto)

        System.out.println("------");
        System.out.println(notaUsuario);

        lector.close();
    }     

}
