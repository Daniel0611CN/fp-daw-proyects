package models;

public class Corredor extends Ciclista implements Comparable<Corredor>{
 
    // ATTRIBUTES:
    private Integer dorsal;
    private Integer tiempo;


    // CONSTRUCTOR:
    public Corredor(Ciclista c, Integer dorsal){

        super(c.nombre, c.codigoEquipo, c.peso, c.pais);
        this.dorsal = dorsal;
        this.tiempo = 0;
    }

    // METHODS:
    @Override
    public int compareTo(Corredor c)
    {
        return (this.tiempo-c.tiempo);
    }

    @Override
    public String toString(){

        // dorsal – NombreCiclista (codEquipo) : tiempo
        return this.dorsal + " - " + super.toString() + " : " + this.tiempo + "s\n";
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
        
}
