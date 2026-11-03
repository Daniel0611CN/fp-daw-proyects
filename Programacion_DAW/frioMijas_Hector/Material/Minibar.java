package frioMijas_Hector.Material;

public class Minibar extends Equipo {
    

    // ATRIBUTOS:
    private int numBaldas;

    // CONSTRUCTORES:
    public Minibar(double alto, double ancho, double profundo, double frigorias, String marca, int baldas)
    {
        super(alto, ancho, profundo, frigorias, marca);
        this.numBaldas = baldas;
    }

    

    // METODOS:
    public double getConsumo()
    {
        return super.getFrigorias()*2;
    }

    public int getNumBaldas() {
        return numBaldas;
    }

    @Override
    public String toString()
    {
        String resultado = "";

        resultado += super.toString() + " - Minibar de " + this.getNumBaldas() + " baldas y con consumo: " + this.getConsumo();

        return resultado;
    }
}
