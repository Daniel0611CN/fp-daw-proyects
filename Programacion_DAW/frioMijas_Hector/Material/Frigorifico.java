package frioMijas_Hector.Material;

public class Frigorifico extends Equipo {
 
    
    // ATRIBUTOS:


    // CONSTRUCTORES:
    public Frigorifico(double alto, double ancho, double profundo, double frigorias, String marca)
    {
        super(alto, ancho, profundo, frigorias, marca);
    }

    
    // METODOS:

    /*****      este metodo lo tengo en la clase padre   *****/
    // public double getVolumen()
    // {
    //     return (super.getAlto()*super.getAncho()*super.getProfundidad());
    // }

    public double getConsumo()
    {
        return super.getFrigorias()*3;
    }

    @Override
    public String toString()
    {
        String resultado = "";

        resultado += super.toString() + " - Frigorífico con consumo: " + this.getConsumo();

        return resultado;
    }

}
