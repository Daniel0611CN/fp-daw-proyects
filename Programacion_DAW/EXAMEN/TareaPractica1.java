package EXAMEN;
import java.time.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TareaPractica1 {

    /* Realiza un programa que pregunte la fecha y hora del examen de Programación.
    Dada dicha fecha:

    Muéstrala en el formato: "El examen será el LUNES, 15 de MAYO del 23"
    Indica cuantos horas quedan hasta ese día */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Pido todos  los datos necesarios para construir la fecha y la hora:
        System.out.println("Introduce el día del examen");
        int dia = sc.nextInt();

        System.out.println("Introduce el mes del examen");
        int mes = sc.nextInt();

        System.out.println("Introduce el año del examen");
        int ano = sc.nextInt();

        System.out.println("Introduce la hora del examen");
        int hora = sc.nextInt();

        System.out.println("Introduce los minutos del examen");
        int minutos = sc.nextInt();

        // Creo la fecha con las variables leídas:
        LocalDateTime fechaExamenCompleta = LocalDateTime.of(ano, mes, dia, hora, minutos);
    
        // Doy el formato deseado e imprimo:
        DateTimeFormatter FormatoNuevo = DateTimeFormatter.ofPattern("EEEE',' dd 'de' LLLL 'del' yy");
        System.out.println("El examen será el " + fechaExamenCompleta.format(FormatoNuevo));

        // Calculo las horas restantes e imprimo:
        int horasRestantes = (int) ChronoUnit.HOURS.between(LocalDateTime.now(), fechaExamenCompleta);
        System.out.println("Quedan " + horasRestantes + " horas para el examen.");


        sc.close();
    }
}
