package BASICOS;
import java.util.Scanner; 

public class EjercicioBasico6 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del triángulo:");
        float Base = sc.nextFloat();

        System.out.println("Introduce la altura del triángulo:");
        float Altura = sc.nextFloat();

        float Area = (Base * Altura)/2;

        System.out.println("El área del triángulo es: " + Area);


        sc.close();
    }

}
