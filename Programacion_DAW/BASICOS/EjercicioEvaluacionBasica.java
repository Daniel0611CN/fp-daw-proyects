package BASICOS;
import java.util.Scanner;

public class EjercicioEvaluacionBasica{ // Nomina PCFactory S.A.

    public static void main(String[] args){
        
        // Declaro como final cada valor fijo por si tuviera que editarlo en un futuro:

        final float SUELDO_BASE = 950f;
        final float BONO_ANTIGUEDAD = 150f;
        final float BONO_HIJO = 10f;
        final float PRECIO_HORA_EXTRA = 21.4f;
        final float FORMACION = 0.05f;

        Scanner sc = new Scanner(System.in);

        // Pido los datos necesarios:

        System.out.println("Antiguedad del empleado:");
        float antiguedad = sc.nextFloat();

        System.out.println("Numero de hijos del empleado:");
        float numeroHijos = sc.nextFloat();

        System.out.println("Horas extra de este mes:");
        float numeroHorasExtra = sc.nextFloat();

        // Declaro todas las variables que voy a necesitar para desglosar todas las partes del sueldo:

        float sueldoAntiguedad = antiguedad * BONO_ANTIGUEDAD;
        float sueldoHijo = numeroHijos * BONO_HIJO;

        // Si quisiera meter un bono de 100€ por familia numerosa:
        // sueldoHijo = (numeroHijos >= 3) ? sueldoHijo+100 : sueldoHijo

        float sueldoExtra = numeroHorasExtra * PRECIO_HORA_EXTRA;
        float sueldoBruto = SUELDO_BASE + sueldoAntiguedad + sueldoExtra + sueldoHijo;
        float sueldoFormacion = FORMACION * sueldoBruto;
        float sueldoTotal = sueldoBruto - sueldoFormacion;

        // Saco el resultado final:

        System.out.println("El empleado recibirá en su nómina mensual " + sueldoTotal + "€");

        System.out.println("De los cuales:");

        System.out.println(SUELDO_BASE + "€ son del sueldo base, " + sueldoAntiguedad + "€ por antiguedad, y " + sueldoHijo + "€ por hijo.");
        System.out.println(sueldoExtra + "€ son de horas extras realizadas (\"" + numeroHorasExtra + "\" horas realizadas).");
        System.out.println(sueldoFormacion + "€ para formación.");


        sc.close();
    }
}
