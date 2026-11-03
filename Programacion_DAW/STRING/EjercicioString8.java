package STRING;
import java.util.Scanner;

public class EjercicioString8 { // Identificar un caracter introducido por teclado
                                // usando el valor de la tabla ASCII
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter");
        char caracterUsuario = sc.nextLine().charAt(0);

        // Puedo sacar el valor con Integer:
        int caracterNumero = Integer.valueOf(caracterUsuario);
        System.out.println("El valor ASCII del caracter con Integer.valueOf es: "+caracterNumero);

        // O tambien puedo hacer un casting directamente de char a Int:
        int caracterNumero2 = (int)caracterUsuario;
        System.out.println("El valor ASCII del caracter con Int casting es: "+caracterNumero2);


        // Una vez tenemos los valores, utilizamos los mismos booleanos para
        // comparar si el valor esta dentro del rango de digito y Mayuscula, así como es igual al espacio
        System.out.println(((caracterNumero>=48)&&(caracterNumero<=57)) ? caracterUsuario + " es un dígito" : caracterUsuario + " no es un dígito");
        System.out.println((caracterNumero==32) ? caracterUsuario + " es un espacio" : caracterUsuario + " no es un espacio");
        System.out.println(((caracterNumero>=65)&&(caracterNumero<=90)) ? caracterUsuario + " es un caracter en mayúscula" : caracterUsuario + " no es mayúscula");


        sc.close();
    }
}
