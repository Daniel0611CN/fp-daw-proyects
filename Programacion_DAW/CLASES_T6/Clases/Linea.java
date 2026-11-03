package CLASES_T6.Clases;

public class Linea {
    
    // ATRIBUTOS
    private Punto inicio;
    private Punto fin;

    // CONSTRUCTORES:
    public Linea(Punto inicio, Punto fin)
    {
        this.inicio = inicio;
        this.fin = fin;
    }

    // MÉTODOS:
    public Punto getInicio() {
        return inicio;
    }

    public void setInicio(Punto inicio) {
        this.inicio = inicio;
    }

    public Punto getFin() {
        return fin;
    }

    public void setFin(Punto fin) {
        this.fin = fin;
    }

    @Override
    public String toString()
    {
        return ("Línea formada por los puntos (" + this.getInicio().getX() + ", " + this.getInicio().getY() +
                ") y (" + this.getFin().getX() + ", " + this.getFin().getY() + ")");
    }
}
