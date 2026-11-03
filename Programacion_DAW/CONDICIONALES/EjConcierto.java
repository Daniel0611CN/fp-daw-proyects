package CONDICIONALES;
import java.util.Scanner;

public class EjConcierto { // Recaudación de un concierto
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es el aforo del local?");
        int aforo = sc.nextInt();

        System.out.println("¿Cuál es el precio de las entradas?");
        float precio = sc.nextFloat();

        System.out.println("¿Número de entradas vendidas?");
        int numEntradas = sc.nextInt();

        float ocupacion = (numEntradas*100)/aforo;

        if (ocupacion <= 20){
            System.out.println("Se cancela el concierto");
            precio = 0;
        }
        else if (ocupacion > 20 && ocupacion <= 50){
            precio = precio * 0.75f;
        }
        
        System.out.println("La recaudación del concierto será de " + (precio*numEntradas) + " euros.");

        sc.close();
    }
}
