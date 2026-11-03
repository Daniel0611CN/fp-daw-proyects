package INTERFACES.jugadoresFutbol.Comparator;

import java.util.Comparator;

import INTERFACES.jugadoresFutbol.Jugador;

public class JugadorComparatorFaltas implements Comparator<Jugador>{
    

    @Override
    public int compare(Jugador j1, Jugador j2)
    {

        int dif = 0;

        if(j1.getFaltas() < j2.getFaltas())
        {
            dif = 1;
        }
        else if(j1.getFaltas() > j2.getFaltas())
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
