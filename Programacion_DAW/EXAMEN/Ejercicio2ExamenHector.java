package EXAMEN;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Ejercicio2ExamenHector {
    public static void main(String[] args) {
        
        int diaAleatorio = (int) (Math.random()*31)+1;
        int mesAleatorio = (int) Math.ceil(Math.random()*12);
        int anoAleatorio = (int) (Math.random()*(2030-2000)+2000);


        boolean diaYMes = (diaAleatorio>30) && (mesAleatorio==4 || mesAleatorio==6 || mesAleatorio==9 || mesAleatorio==11) || (mesAleatorio==2) && (diaAleatorio>28);

        boolean fechaCorrecta = (!diaYMes) && (anoAleatorio>=2000 && anoAleatorio<=2030) || (diaAleatorio>0 && diaAleatorio<=31) && (mesAleatorio>0 && mesAleatorio<=12) && (anoAleatorio>=2000 && anoAleatorio<=2030);

        // Declaro la fecha del año generado:
        LocalDate fechaAleatoria = LocalDate.of(anoAleatorio, mesAleatorio, diaAleatorio);


        System.out.println((fechaCorrecta==true) ? fechaAleatoria: "La fecha es incorrecta");


        // Fecha de final de año para calcular los días:
        LocalDate finDeAno = LocalDate.of(anoAleatorio, 12, 31);
        
        // FORMATO:
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' LLLL '('EEEE')' 'de' yyyy");
        System.out.println("\"Es el día " + fechaAleatoria.format(formato) + "\"");


        // Comparo con ChronoUnit:
        int diasHastaFinalAnoAleatorio = (int) ChronoUnit.DAYS.between(fechaAleatoria, finDeAno);

        System.out.println("Quedan "+diasHastaFinalAnoAleatorio+" días hasta el 31 de diciembre del "+anoAleatorio+" .");


    }
}
