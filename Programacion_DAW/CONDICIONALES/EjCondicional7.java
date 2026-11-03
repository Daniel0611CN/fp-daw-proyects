package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa calcula la media de tres notas");

        System.out.println("Por favor, introduce la primera nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Ahora introduzca la segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Ahora introduzca la tercera nota");
        double nota3 = sc.nextDouble();

        System.out.println("La media de las 3 notas es igual a " + ((nota1+nota2+nota3)/3));

        sc.close();
    }
}
