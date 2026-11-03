package BASICOS;
import java.util.Scanner;

public class EjercicioBasico3 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final double cambioAeuros = 0.006;


        System.out.println("Introduce la cantidad de pesetas a cambiar:");
        double pesetas = sc.nextDouble();
        double Euros = pesetas * cambioAeuros;
        

        System.out.println("La cantidad equivale a " + Euros + " euros.");



        sc.close();
        
    }
}    