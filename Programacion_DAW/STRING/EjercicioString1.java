package STRING;

import java.util.Scanner;

public class EjercicioString1 { // Leer texto y devolver longitud
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Escribe un texto:");
        String cadena = sc.nextLine();

        int longitud = cadena.length();

        System.out.println("El texto tiene una longitud de \"" + longitud + "\" caracteres.");


        sc.close();
    }
}
