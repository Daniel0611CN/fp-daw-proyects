package INTERFACES.jugadoresFutbol.Comparator;

import java.util.Comparator;

import INTERFACES.jugadoresFutbol.Jugador;

public class JugadorComparatorNombre implements Comparator<Jugador>{

    @Override
    public int compare(Jugador j1, Jugador j2)
    {

        int dif = j1.getNombre().compareTo(j2.getNombre());

        return dif;
    }
    
}
