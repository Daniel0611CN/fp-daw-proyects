package MATH;
import java.util.Scanner;

public class EjercicioMath5 { // Calcular en que minuto está un numero indicado de segundos:
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número de segundos:");
        double segundosUsuario = sc.nextDouble();

        double minutos = segundosUsuario/60;
        // Si lo haces con un int, el valor minutos no tiene decimales y no se puede hacer ceil (siempre queda igual)

       System.out.println("Estamos en el minuto: " + Math.ceil(minutos));

        sc.close();
    }
}
