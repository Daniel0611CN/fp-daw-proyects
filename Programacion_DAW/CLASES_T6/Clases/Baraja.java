package CLASES_T6.Clases;

import CLASES_T6.Clases.Carta.Palo;

public class Baraja {
    
    // ATRIBUTOS:
    private Carta[] mazo;


    // CONSTRUCTOR:
    public Baraja()
    {
        this.mazo = new Carta[0];

        for (Palo palo : Palo.values())
        {
            for (int i = 1; i <= 12; i++)
            {
                Carta carta = new Carta(palo, i);

                push(carta);
            }
        }
    }

    // METODOS:

    /**
     * baraja el mazo de forma aleatoria
     */
    public void barajar()
    {

        for(int i=0; i < this.mazo.length; i++)
        {
            // Genero una posión aleatoria de cero a mi última posición
            int posicionAleatoria = (int)(Math.random()*this.mazo.length);

            // Guardo el valor de la posicion AUX y la intercambio por la aleatoria generada cada vez
            Carta cartaAux = this.mazo[i];
            this.mazo[i] = this.mazo[posicionAleatoria];
            this.mazo[posicionAleatoria] = cartaAux;
        }
    }

    /**
     * Inserta una carta al final del mazo
     * @param carta
     */
    public void push(Carta carta)
    {
        Carta[] nuevoMazo = new Carta[this.mazo.length+1];

        for (int i = 0; i < this.mazo.length; i++)
        {
            nuevoMazo[i] = this.mazo[i];
        }

        nuevoMazo[nuevoMazo.length-1] = carta;

        this.mazo = nuevoMazo;
    }


    public Carta pop()
    {
        Carta cartaExtraida = null;

        if(this.mazo.length>0)
        {
            Carta[] mazoNuevo = new Carta[this.mazo.length-1];

            for (int i = 0; i < mazoNuevo.length; i++)
            {
                mazoNuevo[i] = this.mazo[i];    
            }
    
            cartaExtraida = this.mazo[this.mazo.length-1];
    
            this.mazo = mazoNuevo;
        }
        else 
        {
            System.out.println("No hay cartas suficientes");
        }

        return cartaExtraida;
    }

    @Override
    public String toString()
    {
        String resultado = "\n";

        for (int i = 0; i < this.mazo.length; i++)
        {
            resultado += this.mazo[i].toString() + ", "; 
        }
        resultado+="\n";
        
        return resultado;
    }

    public Carta[] getMazo() {
        return mazo;
    }



}
