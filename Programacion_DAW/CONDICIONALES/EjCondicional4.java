package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional4 {
    public static void main(String[] args) {
        
        final int PRECIO_HORA = 12;
        final int HORA_EXTRA = 16;
        double sueldo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el número de horas trabajadas");
        double numHoras = sc.nextDouble();

        if (numHoras<=40){
            sueldo = numHoras*PRECIO_HORA;
        }
        else if (numHoras>40){
            sueldo = (40*PRECIO_HORA)+((numHoras-40)*HORA_EXTRA);
        }

        System.out.println("El sueldo semanal que le corresponde es de "+sueldo+" euros.");

        sc.close();
    }
}
