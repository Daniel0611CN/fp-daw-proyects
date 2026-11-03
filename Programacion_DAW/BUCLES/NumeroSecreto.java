package BUCLES;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numAleatorio = (int) (Math.random()*100+1);

        System.out.println("Introduce un numero:");
        int numUsuario = sc.nextInt();

        while (numUsuario != numAleatorio && numUsuario != -1){

            if (numUsuario > numAleatorio){
                System.out.println("Demasiado grande!");
            }
            else{
                System.out.println("Demasiado pequeño!");
            }
            numUsuario = sc.nextInt();
        }

        if (numUsuario == -1){
            System.out.println("GALLINA");
        }
        else{
            System.out.println("Enhorabuena");
        }

        sc.close();
    }
}
