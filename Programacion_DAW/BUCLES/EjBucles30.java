package BUCLES;

import java.util.Scanner;

public class EjBucles30 { // Horas transcurridas entre dos horas de dos días de la semana:
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String diaLetras = "";
        String diaLetras2 = "";

        System.out.println("Escribe el día de la semana (1 para lunes, 7 para domingo) y la hora (de 0 a 23):");

        System.out.println("Día 1:");
        int dia1 = sc.nextInt();

        System.out.println("Hora:");
        int hora1 = sc.nextInt();

        System.out.println("Día 2:");
        int dia2 = sc.nextInt();

        System.out.println("Hora:");
        int hora2 = sc.nextInt();

        // Condición de dia2 mayor a dia1 & dias 1 y 2 correctos:
        if (dia1 >= 1 && dia1 <= 7 && dia2 >= 1 && dia2 <= 7 && dia2 > dia1)
        {
            // Calculo las horas totales:
            // Horas hasta el final del día 1 + horas del día 2:
            int horas = (24 - hora1) + hora2;
            // Horas días completos:
            int horasDiasCompletos = 24*((dia2-dia1)-1);

            int totalHoras = horas + horasDiasCompletos;

            switch (dia1)
            {
                case 1:
                    diaLetras = "Lunes";
                    break;
                case 2:
                    diaLetras = "Martes";
                    break;
                case 3:
                    diaLetras = "Miércoles";
                    break;
                case 4:
                    diaLetras = "Jueves";
                    break;
                case 5:
                    diaLetras = "Viernes";
                    break;
                case 6:
                    diaLetras = "Sábado";
                    break;
                case 7:
                    diaLetras = "Domingo";
                    break;
            }
            switch (dia2)
            {
                case 1:
                    diaLetras2 = "Lunes";
                    break;
                case 2:
                    diaLetras2 = "Martes";
                    break;
                case 3:
                    diaLetras2 = "Miércoles";
                    break;
                case 4:
                    diaLetras2 = "Jueves";
                    break;
                case 5:
                    diaLetras2 = "Viernes";
                    break;
                case 6:
                    diaLetras2 = "Sábado";
                    break;
                case 7:
                    diaLetras2 = "Domingo";
                    break;
            }
            System.out.println("Entre las "+hora1+":00h del "+diaLetras+" y las "+hora2+":00h del "+diaLetras2+" hay "+totalHoras+" hora/s.");
        }
        else
        {
            System.out.println("Día incorrecto");
        }

        sc.close();
    }
}
