package BASICOS;
import java.util.Scanner;

public class EjercicioBasico2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double cambio = 166.386;
        

        System.out.println("Introduce la cantidad de euros a convertir:");
        double euros = sc.nextDouble();
        double total = (euros * cambio);


        System.out.println(euros + " euros equivalen a " + total + " pesetas." );


        sc.close();
    } 
}
