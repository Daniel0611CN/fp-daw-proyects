package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Teclea que hora es:");
        int hora = sc.nextInt();

        String saludo = "";
        String error = "";

        if ((hora >=6) && (hora <=12)) {
            saludo = "Buenos días";
        }
        else if ((hora >=13) && (hora <=20)) {
            saludo = "Buenas tardes";
        }
        else if ((hora >=21) && (hora <=23) || ((hora >=0) && (hora <=5))) {
            saludo = "Buenas noches";
        }

        else {
            error = "La hora no está bien";
            System.out.println(error);
        }

        System.out.println(saludo);


        sc.close();
    }
}
