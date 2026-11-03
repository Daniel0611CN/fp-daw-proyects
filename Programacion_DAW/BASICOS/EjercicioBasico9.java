package BASICOS;
import java.util.Scanner; 

public class EjercicioBasico9{  //VOLUMEN DE UN CONO

    // V =⅓ πr2h 
    // El usuario debe introducir el valor de r y h

    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final double Pi = 3.1416;

        System.out.println("Vamos a calcular el volumen de un cono");
        System.out.println("Introduce su altura:");
        double Altura = sc.nextFloat();

        System.out.println("Introduce el radio:");
        double Radio = sc.nextFloat();

        double Volumen = ((Pi * (Radio * Radio) * Altura) /3);

        System.out.println("El volumen del cono es: " + Volumen);


        sc.close();

    }

}
