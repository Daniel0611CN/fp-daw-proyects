package FECHAS;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tarea1PracticaRepaso {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuando es el examen (dia)?");
        int dia = sc.nextInt();

        System.out.println("¿Cuando es el examen (mes)?");
        int mes = sc.nextInt();

        System.out.println("¿Cuando es el examen (año)?");
        int ano = sc.nextInt();

        System.out.println("¿Cuando es el examen (hora)?");
        int hora = sc.nextInt();

        System.out.println("¿Cuando es el examen (minutos)?");
        int minutos = sc.nextInt();

        // Monto mi fecha
        LocalDateTime fechaExamen = LocalDateTime.of(ano, mes, dia, hora, minutos);

        // Declaro mi formato
        DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("'El examen será el' EEEE',' dd 'de' LLLL 'del' yy");

        // Aplico mi formato e imprimo:
        System.out.println("\"El examen es el: "+fechaExamen.format(miFormato)+"\"");

        sc.close();
    }
}
