package BASICOS;
import java.util.Scanner; 

public class EjercicioBasico7 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final float IVA = 21;


        System.out.println("Introduce la base imponible");
        float Base = sc.nextFloat();
        float Totalfactura = (Base + (Base * IVA/100));


        System.out.println("El importe total con IVA es: " + Totalfactura);


        sc.close();
    }

}
