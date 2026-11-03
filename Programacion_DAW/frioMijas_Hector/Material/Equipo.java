package frioMijas_Hector.Material;

public abstract class Equipo {


    // ATRIBUTOS:
    private double alto;
    private double ancho;
    private double profundidad;
    private double frigorias;
    private String marca;


    // CONSTRUCTOR:
    public Equipo()
    {

    }

    public Equipo(double alto, double ancho, double profundo, double frigorias, String marca)
    {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundo;
        this.frigorias = frigorias;
        this.marca = marca;
    }

    // METODOS:
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public double getFrigorias() {
        return frigorias;
    }

    public String getMarca() {
        return marca;
    }

    public double getVolumen()
    {
        return (this.getAlto()*this.getAncho()*this.getProfundidad());
    }

    @Override
    public String toString()
    {
        return "\nEquipo marca " + this.getMarca() + " de " + this.getFrigorias() + " frigorías, con una superficie de " +
        this.getProfundidad() + " x " + this.getAncho() + " y una altura de " + this.getAlto();
    }
    
    
}
