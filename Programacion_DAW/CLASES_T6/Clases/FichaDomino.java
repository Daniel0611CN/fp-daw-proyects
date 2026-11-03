package CLASES_T6.Clases;

public class FichaDomino {
    
    // ATRIBUTOS:
    private int izq;
    private int dch;

    // CONSTRUCTOR:
    public FichaDomino(int izq, int dch)
    {
        if(izq>=0 && izq<=6 && dch>=0 && dch<=6 )
        {
            this.izq = izq;
            this.dch = dch;
        }
    }

    // METODOS:
    public int getIzq() {
        return izq;
    }

    public void setIzq(int izq) {
        this.izq = izq;
    }

    public int getDch() {
        return dch;
    }

    public void setDch(int dch) {
        this.dch = dch;
    }

    public FichaDomino voltea()
    {
        int aux = this.getIzq();
        this.setIzq(this.getDch());
        this.setDch(aux);

        return this;
    }

    public boolean encaja(FichaDomino ficha)
    {
        boolean encaja = false;

        if(this.izq == ficha.izq || this.izq == ficha.dch || this.dch == ficha.izq || this.dch == ficha.dch)
        {
            encaja = true;
        }

        return encaja;
    }

    @Override
    public String toString()
    {
        return "[" + (this.izq == 0 ? " " : this.getIzq()) + "|" + (this.dch == 0 ? " " : this.getDch()) + "]";
    }
}
