package BASICOS;
import java.util.Scanner; 

public class EjercicioBasico8 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final float precioHora = 12;


        System.out.println("Introduce el número de horas trabajadas a la semana:");
        float Horas = sc.nextFloat();
        float Sueldo = (Horas * precioHora);


        System.out.println("El salario semanal será de: " + Sueldo);


        sc.close();
    }

}
