package MATH;
import java.util.Scanner;

public class EjercicioMath1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Escribe un número decimal");
        float decimalUsuario = sc.nextFloat();

        float absolutoUsuario = Math.abs(decimalUsuario);
        System.out.println("El valor absoluto de "+decimalUsuario+" es: \""+absolutoUsuario+"\"");
    

        sc.close();
    }
}
