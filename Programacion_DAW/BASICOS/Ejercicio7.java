package BASICOS;
import java.util.Scanner;

public class Ejercicio7 { // Longitud y area de la circunferencia

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double pi = 3.1416;

        // Longitud circunferencia = 2pi * radio
        // Area circunferencia = pi * radio2

        System.out.println("Introduce el radio de la circunferencia:");
        double radio = sc.nextDouble();
        double Longitud = (2 * pi * radio);
        double Area = (pi * (radio * radio));

        System.out.println("Para el radio \"" + radio + "\" la longitud de la circunferencia equivale a \"" + Longitud + "\" y su area es \"" + Area + "\".");

        sc.close();
    }

}