package EXAMEN;
import java.util.Scanner;

public class Tipo3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tienes trabajo fijo?");
        String trabajo = sc.nextLine();
        trabajo = trabajo.toLowerCase();

        System.out.println("¿Tienes cuenta con nosotros?");
        String cuenta = sc.nextLine();
        cuenta = cuenta.toLowerCase();

        System.out.println((cuenta.equals("si"))?"¿Tienes 20% ahorrado?":"¿Tienes 50% ahorrado?");
        String ahorrado = sc.nextLine();
        ahorrado = ahorrado.toLowerCase();


        System.out.println(((trabajo.equals("si") && (cuenta.equals("si"))) || (ahorrado.equals("si")))? "Tienes hipoteca":"No tienes hipoteca"); 
        sc.close();
    }
    
}
