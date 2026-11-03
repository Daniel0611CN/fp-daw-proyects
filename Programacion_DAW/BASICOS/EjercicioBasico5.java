package BASICOS;
import java.util.Scanner; 

public class EjercicioBasico5 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el largo o base del rectángulo:");
        float Base = sc.nextFloat();

        System.out.println("Introduce el ancho o altura del rectángulo:");
        float Altura = sc.nextFloat();

        float Area = (Base * Altura);

        System.out.println("El área del rectángulo es: " + Area);


        sc.close();
    }

}
