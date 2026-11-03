package MATH;
import java.util.Scanner;

public class EjercicioMath2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Escribe un número:");
        int numeroUsuario = sc.nextInt();

        System.out.println("Escribe el exponente:");
        int exponenteUsuario = sc.nextInt();

        System.out.println(Math.pow(numeroUsuario, exponenteUsuario));
    

        sc.close();
    }
}
