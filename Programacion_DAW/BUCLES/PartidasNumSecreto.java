package BUCLES;
import java.util.Scanner;

public class PartidasNumSecreto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numAleatorio = (int) (Math.random()*100+1);
        System.out.println(numAleatorio);

        int contadorIntentos = 0;
        int minimoIntentos = 0;
        int contadorPartidas = 0;
        int contadorGanadas = 0;
        String respuesta = "s";

        System.out.println("Introduce un numero:");
        int numUsuario = sc.nextInt();

        while (respuesta.equals("s"))
        {
            while (numUsuario != numAleatorio && numUsuario != -1){

                if (numUsuario > numAleatorio){
                    System.out.println("Demasiado grande!");
                }
                else{
                    System.out.println("Demasiado pequeño!");
                }
                System.out.println("Dime otro");
                numUsuario = sc.nextInt();
                contadorIntentos++;
            }
            contadorPartidas++;

            if (numUsuario == -1){
                System.out.println("GALLINA");
            }
            else{
                System.out.println("Enhorabuena");
                contadorGanadas++;

                if (contadorPartidas > 0){
                    minimoIntentos = contadorIntentos;
                }
            }
            
            // Limpio Buffer:
            sc.nextLine();
            System.out.println("¿Quieres jugar otra vez? (s/n)");
            respuesta = sc.nextLine().toLowerCase();
        }

        if (contadorPartidas > 0){
            System.out.println("Partidas totales: " + contadorPartidas);
            System.out.println("Partidas ganadas: " + contadorGanadas);
            System.out.println("La partida más rápida ha tenido " + minimoIntentos + " intentos");
        }



        sc.close();
    }
}
