package CLASES_T6.Clases;

public class Carta {
    
    public enum Palo {ORO, COPAS, ESPADAS, BASTOS};

    // ATRIBUTOS:
    private Palo palo;
    private int numero;

    // CONSTRUCTOR:
    public Carta(Palo palo, int numero)
    {
        this.palo = palo;
        this.numero = numero;
    }

    // METODOS:
    public Palo getPalo() {
        return palo;
    }
    public void setPalo(Palo palo) {
        this.palo = palo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString()
    {
        String resultado = this.getNumero() + " de " + this.getPalo();

        return resultado;
    }    

    public boolean esMenor(Carta carta)
    {
        boolean menor = false;

        if(this.getNumero() < carta.getNumero())
        {
            menor = true;
        }

        return menor;
    }

    @Override
    public boolean equals(Object obj) {

        Carta carta = (Carta)obj;

        return this.palo.equals(carta.palo) && (this.numero == carta.numero);
    }
}
