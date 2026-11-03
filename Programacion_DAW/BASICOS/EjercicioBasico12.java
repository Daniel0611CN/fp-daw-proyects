package BASICOS;
import java.util.Scanner;

public class EjercicioBasico12 {
    
    // Calculo de note necesaria de un examen 
    // segun la nota media que queramos sacar

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Introduce la nota del primer examen:");
        double Exam1 = sc.nextFloat();

        System.out.println("¿Que nota quieres sacar en el trimestre?:");
        double Media = sc.nextFloat();

        // El primer examen vale el 40% y el segundo el 60%
        // Media = (E1 * 0,4) + (E2 *0,6)
        // E2 = (Media - E1 * 0,4) / 0,6

        double Exam2 = (Media - (Exam1*0.4)) / (0.6);
        System.out.println("Para tener un " + Media + " en el trimestre necesitas sacar un " + Exam2 + " en el segundo examen.");

        sc.close();
    }
}
