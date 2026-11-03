package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que día de la semana es");
        String dia = sc.nextLine();

        String asignatura = "";
        switch (dia){

            case "lunes":
            asignatura = "Programación";
            break;
            case "martes":
            case "viernes":
            asignatura = "Base de Datos";
            break;
            case "miercoles":
            asignatura = "Formación y Orientación Laboral";
            break;
            case "jueves":
            asignatura = "Sistemas Informáticos";
            break;

            default:
            System.out.println("ERROR"); 
        }
        System.out.println("El "+dia+" hay "+asignatura+" a primera hora.");

        sc.close();
    }
}
