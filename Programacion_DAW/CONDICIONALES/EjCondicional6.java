package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional6 {
    public static void main(String[] args) {
        
        final double G = 9.81;

        Scanner sc = new Scanner(System.in);

        double resultadoT = 0;

        System.out.println("Este programa calcula el tiempo que tarda un objeto en caer desde una altura");
        System.out.println("Por favor, introduce la altura ó valor de h:");
        double alturaH = sc.nextDouble();

        if (alturaH < 0){
            System.out.println("La altura no puede ser negativa");
        }
        else if (alturaH >= 0){
            resultadoT = Math.sqrt((2*alturaH)/G);
            System.out.println("El objeto tardará " + resultadoT +" segundos en caer.");
        }    

        sc.close();
    }
}
