package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera):");
        String j1 = sc.nextLine().toLowerCase();

        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera):");
        String j2 = sc.nextLine().toLowerCase();

        String winner = ""; 

        if (j1.equals(j2)){
            System.out.println("EMPATE");
        }
        else {
            switch (j1){
                case "piedra":
                    if (j2.equals("papel")){
                        winner = "2";
                    }
                    else if (j2.equals("tijera")){
                        winner = "1";
                    }
                break;
                case "papel":
                    if (j2.equals("piedra")){
                        winner = "1";
                    }
                    else if (j2.equals("tijera")){
                        winner = "2";
                    }
                break;
                case "tijera":
                    if (j2.equals("piedra")){
                        winner = "2";
                    }
                    else if (j2.equals("papel")){
                        winner = "1";
                    }
                break;
            }
            System.out.println("Gana el jugador " + winner);
        }


            sc.close();
    }
}
