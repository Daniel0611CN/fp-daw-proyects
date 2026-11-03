package FECHAS;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EjercicioFechas {

    /* Pedir fecha de nacimiento con tres preguntas
     * mostrar en pantalla: dias - mes con letras - yy
     * mostrar la edad
     * cuanto queda para tu proximo cumpleaños (con chronoUnit y Period)
     */
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que año naciste?");
        int ano = sc.nextInt();

        System.out.println("¿Que mes naciste?");
        int mes = sc.nextInt();

        System.out.println("¿Que día naciste?");
        int dia = sc.nextInt();

        // Creo la fecha con las variables leídas:
        LocalDate fechaNacimiento = LocalDate.of(ano, mes, dia);

        // Declaro el nuevo formato de fecha y se lo apico a fechaCumple al imprimir:
        DateTimeFormatter FormatoNuevo = DateTimeFormatter.ofPattern("dd - LLLL - yy");
        System.out.println("Naciste el " + fechaNacimiento.format(FormatoNuevo));

        // Calculo el numero de años con ChronoUnit:
        int edad = (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
        System.out.println("Tienes " + edad + " años.");

        // Calculo cuanto queda para el proximo cumpleaños:
        
        
        // Fecha de cumpleaños de este año:
        LocalDate fechaProximoCumple = fechaNacimiento.plusYears(edad);
        
        // Controlo si la comparación da negativo (ya he cumplido años este año), si es así le sumo un año a la Fecha Prox Cumple, si no, lo dejo igual
        System.out.println((ChronoUnit.DAYS.between(LocalDate.now(), fechaProximoCumple) < 0) ? ChronoUnit.DAYS.between(LocalDate.now(), fechaNacimiento.plusYears(edad+1)) : (ChronoUnit.DAYS.between(LocalDate.now(), fechaProximoCumple)));

        // Queda muy largo, lo saco de la ternaria:
        long diasSiEsteAno = (ChronoUnit.DAYS.between(LocalDate.now(), fechaProximoCumple));
        long diasSiAnoQueViene = ChronoUnit.DAYS.between(LocalDate.now(), fechaNacimiento.plusYears(edad+1));
        // Hago la misma expresión, más corta y con texto:
        System.out.println((diasSiEsteAno<1) ? "Te quedan "+diasSiAnoQueViene+" días para tu cumpleaños" : "Te quedan "+diasSiEsteAno+" días para tu cumpleaños");


        sc.close();
    }
}
