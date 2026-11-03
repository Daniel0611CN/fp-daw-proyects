package COLECCIONES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ajedrez {
    
    public enum Ficha {DAMA, TORRE, ALFIL, CABALLO, PEON};

    public static void main(String[] args) {
        
        // Creo el HashMap donde guardo el valor de cada ficha:
        HashMap<Ficha, Integer> ValoresFichas = new HashMap<>();

        ValoresFichas.put(Ficha.DAMA, 9);
        ValoresFichas.put(Ficha.TORRE, 5);
        ValoresFichas.put(Ficha.ALFIL, 3);
        ValoresFichas.put(Ficha.CABALLO, 2);
        ValoresFichas.put(Ficha.PEON, 1);

        // Creo el ArrayList donde guardo las 15 fichas posibles que puedo capturar:
        ArrayList<Ficha> listaFichas = new ArrayList<>();

        listaFichas.add(Ficha.DAMA); // 1x Dama

        for (int i = 0; i < 2; i++) // 2x Torre, Alfil y Caballo
        {
            listaFichas.add(Ficha.TORRE);
            listaFichas.add(Ficha.ALFIL);
            listaFichas.add(Ficha.CABALLO);    
        }
        for (int i = 0; i < 8; i++) // 8x Peon
        {
            listaFichas.add(Ficha.PEON);
        }

        // Desordeno el ArrayList.
        Collections.shuffle(listaFichas);


        // Genero el número de fichas aleatorio entre 0 y 15:
        int numCapturadas = (int)(Math.random()*16);


        // Creo una nueva lista con las fichas capturadas:
        ArrayList<Ficha> fichasCapturadas = new ArrayList<>();

        for (int i = 0; i < numCapturadas; i++)
        {
            fichasCapturadas.add(listaFichas.get(i));
        }

        // Recorro la lista de Fichas Capturadas sacando las puntuaciones del HashMap:
        int puntuacionTotal = 0;
        
        System.out.println("\nFichas capturadas por el jugador:\n");

        for (Ficha ficha : fichasCapturadas)
        {
            puntuacionTotal += ValoresFichas.get(ficha);
            System.out.println(ficha + " (" + ValoresFichas.get(ficha) + " peones)");
        }

        System.out.println("Puntos totales: " + puntuacionTotal + " peones.");
    }

}
