package FECHAS;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ManejoEdad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dia de nacimiento");
        int dia = sc.nextInt();
        
        System.out.println("Mes de nacimiento");
        int mes = sc.nextInt();

        System.out.println("Año de nacimiento");
        int ano = sc.nextInt();

        // Declaro la fecha de nacimiento:
        LocalDate nacimiento = LocalDate.of(ano, mes, dia);
        // Fecha actual para calcular la edad:
        LocalDate actual = LocalDate.now();
        // Calculo la edad actual
        int edad = (int)ChronoUnit.YEARS.between(nacimiento, actual);
        // Declaro la fecha del proximo cumpleaños, sumando su edad a su cumpleaños:
        LocalDate proximoCumple = nacimiento.plusYears(edad+1);

        // Comparo Nacimiento con Proximo Cumple con ChronoUnit:
        int diasHastaProxCumple = (int) ChronoUnit.DAYS.between(actual, proximoCumple);

        System.out.println("Quedan "+diasHastaProxCumple+" para tu cumple.");

        sc.close();
    }
}
