package COLECCIONES;

import java.util.ArrayList;

import CLASES_T6.Clases.Baraja;
import CLASES_T6.Clases.Carta;

public class Ej_8 {
    
    public static void main(String[] args) {
        

        Baraja baraja = new Baraja();
        ArrayList<Carta> cartasElegidas = new ArrayList<>();


        while(cartasElegidas.size() < 10)
        {
            int aleatorio = (int)(Math.random()*baraja.getMazo().length);

            if(!cartasElegidas.contains(baraja.getMazo()[aleatorio]))
            {
                cartasElegidas.add(baraja.getMazo()[aleatorio]);
            }
        }

        System.out.println(cartasElegidas.toString());

    }
}
