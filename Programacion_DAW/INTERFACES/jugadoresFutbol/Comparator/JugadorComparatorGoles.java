package INTERFACES.jugadoresFutbol.Comparator;

import java.util.Comparator;

import INTERFACES.jugadoresFutbol.Jugador;

public class JugadorComparatorGoles implements Comparator<Jugador>{


    @Override
    public int compare(Jugador j1, Jugador j2)
    {
        
        int dif = 0;

        if(j1.getGoles() < j2.getGoles())
        {
            dif = 1;
        }
        else if(j1.getGoles() > j2.getGoles())
        {
            dif = - 1;
        }
        else 
        {
            dif = new JugadorComparatorNombre().compare(j1, j2);
        }

        return dif;
    }
    
}
