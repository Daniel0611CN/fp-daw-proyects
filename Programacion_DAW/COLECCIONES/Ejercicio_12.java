package COLECCIONES;

import java.util.ArrayList;
import java.util.HashMap;

import COLECCIONES.Carta.valoresCarta;

public class Ejercicio_12 {
    

    public static void main(String[] args) {
        
    // Creo el Hashmap con las puntuaciones que necesito:
    HashMap<valoresCarta, Integer> valoresBrisca = new HashMap<>();

    valoresBrisca.put(valoresCarta.AS, 11);
    valoresBrisca.put(valoresCarta.tres, 10);
    valoresBrisca.put(valoresCarta.Sota, 2);
    valoresBrisca.put(valoresCarta.Caballo, 3);
    valoresBrisca.put(valoresCarta.Rey, 4);


    // Creo el arrayList con las 5 cartas elegidas al azar:
    ArrayList<Carta> mazo = new ArrayList<>();

    while(mazo.size() < 5)
    {            
        Carta newCarta = new Carta();
        
        if (!mazo.contains(newCarta))
        {
            mazo.add(newCarta);
        }
    }

    System.out.println(mazo);

    // SUMAMOS EL VALOR DE LAS 5 CARTAS DEL ARRAYLIST:
    int totalPuntos = 0;

    for (Carta carta : mazo)
    {
        valoresCarta valorcarta = carta.getValor();

        if(valoresBrisca.containsKey(valorcarta))
        {
            totalPuntos += valoresBrisca.get(valorcarta);
        }
        
        System.out.println();
    }

    System.out.println("Total puntos: " + totalPuntos);
   
    }
}
