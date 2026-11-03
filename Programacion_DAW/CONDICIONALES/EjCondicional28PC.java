package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional28PC { // Juego contra la máquina
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera):");
        String j1 = sc.nextLine().toLowerCase();

        //System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera):");
        //String j2 = sc.nextLine().toLowerCase();

        int jMaquina = (int) Math.random() * 3;

        String j2 = "";
        String winner = ""; 

        switch (jMaquina){
            case 0:
                j2 = "piedra";
                break;
            case 1:
                j2 = "papel";
                break;
            case 2:
                j2 = "tijera";
                break;
        }
        System.out.println("PC juega: " + j2);
        

        if (j1.equals(j2)){
            System.out.println("EMPATE");
        }
        else {
            switch (j1){
                case "piedra":
                    if (j2.equals("papel")){
                        winner = "PC";
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
                        winner = "PC";
                    }
                break;
                case "tijera":
                    if (j2.equals("piedra")){
                        winner = "PC";
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
