package STRING;
import java.util.Scanner;

public class datosPersonales 
{
    public static void main(String[] args) 
    {
    Scanner datos = new Scanner(System.in);


    System.out.println("Introduce tu Nombre:");
    String nombreUsuario = datos.nextLine();


    System.out.println("Introduce tu edad:");
    int edadUsuario = datos.nextInt();

    System.out.println("Introduce tu altura");
    Float alturaUsuario = datos.nextFloat();

    // Hacemos los calculos de edad en segundos y altura en centímetros

    int edadSegundos = (edadUsuario * 365 * 24 * 60 * 60);

    Float alturaCM = (alturaUsuario * 100);


    System.out.println("Tu nombre es \"" + nombreUsuario + "\", \nhas vivido \'" + edadSegundos + "\' segundos" + ",\ny mides" + alturaCM + " centímetros.");

    datos.close();
    }

}
