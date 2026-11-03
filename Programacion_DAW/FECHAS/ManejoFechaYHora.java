package FECHAS;
import java.time.LocalTime;
import java.time.Period;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class ManejoFechaYHora {
    
    public static void main(String[] args) {
        
        // declaro la hora y la muestro:
        LocalTime relojHora = LocalTime.now();
        System.out.println("Reloj unicamente con la hora: " + relojHora);
        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha actual es: " + fechaActual);

        // importo el reloj completo y lo muestro por pantalla
        LocalDateTime relojCompleto = LocalDateTime.now();
        System.out.println("Fecha y hora sin formatear: " + relojCompleto);

        
        // Declaro el cambio de formato
        DateTimeFormatter nuevoFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        // Vuelco el nuevo formato a un String ESTE PASO NO ES NECESARIO, SE PUEDE IMPRIMIR DIRECTAMENTE
        String relojFormateado = nuevoFormato.format(relojCompleto);

        // Lo muestro por pantalla
        System.out.println("Reloj completo con nuevo formato: " + relojFormateado);

        System.out.println("----------------------------");

        // Crear fechas con - of()
        LocalDate fechaCumple = LocalDate.of(2000,1,15);
        LocalTime horaExamen = LocalTime.of(12,45);
        LocalDateTime concierto = LocalDateTime.of(2022, 12, 15, 20, 30);

        System.out.println("Fecha de cumpleaños: " + fechaCumple);
        System.out.println("La hora del examen es: " + horaExamen);
        System.out.println("El concierto es: " + concierto);

        // Si pongo una fecha errónea me avisa y da error
        // LocalDate febrero29 = LocalDate.of(2022, 2, 29);


        // Usar partes de una fecha:
        System.out.println("Dia concierto: " + concierto.getDayOfMonth());
        System.out.println("Hora concierto: " + concierto.getHour());

        System.out.println("----------------------------");

        // Clase INSTANT: Es un punto concreto en el tiempo medido en nanosegundos, se mide desde 1970
        Instant instante = Instant.now();
        System.out.println("Instante: " + instante);

        // Añadir/quitar tiempo plus/minus:
        System.out.println("En dos semanas: " + fechaActual.plusWeeks(2));
        System.out.println("Hace 12 horas: " + relojCompleto.minusHours(12));

        System.out.println("----------------------------");


        // Ajustes temporales:
        System.out.println("El primer dia del mes: " + fechaActual.with(TemporalAdjusters.firstDayOfNextMonth()));
        

        // Dar formato a fechas:
        DateTimeFormatter formatoMio = DateTimeFormatter.ofPattern("dd/MM/yyyy 'dia' EEEE");
        System.out.println("Fecha con formato: " + fechaActual.format(formatoMio));

        System.out.println("Fecha con formato español pero en Inglés: " + fechaActual.format(formatoMio.withLocale(new Locale("en", "UK"))));
        // el lenguaje se escribe como idioma y país, por ejemplo, ingles de Inglaterra, o español de latinoamérica.

        System.out.println("----------------------------");

        // Diferencias entre fechas con period y ChronoUnit:
        ChronoUnit.YEARS.between(fechaCumple, LocalDate.now());
        int edadFecha = (int)ChronoUnit.YEARS.between(fechaCumple, LocalDate.now());
        System.out.println("Tengo la edad de " + edadFecha + " años.");

        // Lo mismo del tirón para días de vida: (Si lo imprimo directamente no hace falta castear a INT porque no creo una variable nueva)
        System.out.println("Y " + ChronoUnit.DAYS.between(fechaCumple, LocalDate.now()) + " días de vida");


        System.out.println("----------------------------");


        // PERIOD
        LocalDate finAno = LocalDate.of(2022, 12, 31);

        Period hastaFinAno = fechaActual.until(finAno);
        System.out.println("Hasta final de año quedan: " + hastaFinAno);

        System.out.println("Quedan " + hastaFinAno.getYears() + " años " + hastaFinAno.getMonths() + " meses y " + hastaFinAno.getDays() + " dias.");

    

    }
}
