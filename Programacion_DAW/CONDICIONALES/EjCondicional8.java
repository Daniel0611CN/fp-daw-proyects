package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa calcula la media de tres notas");

        System.out.println("Por favor, introduce la primera nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Ahora introduzca la segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Ahora introduzca la tercera nota");
        double nota3 = sc.nextDouble();

        double notaMedia = (nota1+nota2+nota3)/3;

        // Vamos aintentar hacerlo con un Array

        double[] notas = {nota1, nota2, nota3};
        double media = (notas[0]+notas[1]+notas[2])/3;

        System.out.println("La media de las 3 notas es igual a " + notaMedia);

        String nota = "";

        if (notaMedia < 5){
            nota = "Suspenso";
        }
        else if (notaMedia >= 5 && notaMedia < 7){
            nota = "Aprobado";
        }
        else if (notaMedia >= 7 && notaMedia < 9){
            nota = "Notable";
        }
        else if (notaMedia >= 9 && notaMedia <= 10){
            nota = "Sobresaliente";
        }

        System.out.println("Has sacado un "+nota);


        sc.close();
    }
}
