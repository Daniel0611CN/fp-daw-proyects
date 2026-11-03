package INTERFACES.jugadoresFutbol.Comparator;

import java.util.Comparator;

import INTERFACES.jugadoresFutbol.Jugador;

public class JugadorComparatorApodo implements Comparator<Jugador>{
    

    @Override
    public int compare(Jugador j1, Jugador j2)
    {

        int dif = j1.getApodo().compareTo(j2.getApodo());

        if(dif == 0)
        {
            dif = new JugadorComparatorNombre().compare(j1, j2);
        }

        return dif;
    }
    
}
