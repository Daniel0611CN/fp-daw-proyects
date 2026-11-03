package BASICOS;
import java.util.Scanner;

public class Ejercicio15{ // Biólogo

    // Un Biólogo necesita calcular el número de patas 
    // de distintas especies que está estudiando y capturando:
    // Hormiga -> 6 patas
    // Arañas -> 8 patas
    // Cochinitas -> 14 patas
    // La aplicación debe preguntar por el número capturado de cada una de ellas 
    // y devolver el número total de patas.

   
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        final int pataHormigas = 6;
        final int pataAranas = 8;
        final int pataCochinitas = 14;

        System.out.println("Introduce el número de hormigas");
        int hormigas = sc.nextInt();

        System.out.println("Introduce el número de arañas");
        int aranas = sc.nextInt();

        System.out.println("Introduce el número de cochinitas");
        int cochinitas = sc.nextInt();

        int totalHormigas = (hormigas*pataHormigas);
        int totalAranas = (aranas*pataAranas);
        int totalCochinitas = (cochinitas*pataCochinitas);
        int totalPatas = (totalHormigas + totalAranas + totalCochinitas);

        System.out.println("Has capturado " + totalHormigas + " patas de hormigas, " + totalAranas + " patas de arañas, y " + totalCochinitas + " patas de cochinitas.");
        System.out.println("En total has capturado " + totalPatas + " patas de diferentes especies.");

        sc.close();
    }

}
