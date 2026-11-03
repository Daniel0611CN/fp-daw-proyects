package CLASES_T6.UsoClases;

import CLASES_T6.Clases.Baraja;
import CLASES_T6.Clases.Carta;

public class JuegoCartas {
    
    public static void main(String[] args) {
        
        int cartasSacadas = 0;

        Baraja baraja = new Baraja();

        System.out.println("\nBARAJA CREADA:");
        System.out.println(baraja);

        baraja.barajar();

        System.out.println("\nBARAJAMOS LIKE A BOSS:");
        System.out.println(baraja);

        Carta anterior = baraja.pop();
        cartasSacadas++;
        System.out.println("Primera carta: " + anterior + "\n");


        boolean esMenor = false;
        do
        {
            Carta nueva = baraja.pop();
            cartasSacadas++;

            System.out.println("Siguiente carta: " + nueva);

            esMenor = nueva.esMenor(anterior);

            if(esMenor)
            {
                System.out.println("La nueva carta es más pequeña");
            }
            else 
            {
                anterior = nueva;
            }

        }while(esMenor == false);

        System.out.println("\n¡Fin del juego!\n\nHas conseguido sacar " + cartasSacadas + " cartas");
    }

}
