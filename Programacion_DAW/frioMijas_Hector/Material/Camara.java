package frioMijas_Hector.Material;

public class Camara extends Equipo{
    

    // ATRIBUTOS:
    private double tempMin;
    private double tempMax;

    // CONSTRUCTORES:
    public Camara(double alto, double ancho, double profundo, double frigorias, String marca, double tMin, double tMax)
    {
        super(alto, ancho, profundo, frigorias, marca);
        this.tempMin = tMin;
        this.tempMax = tMax;
    }

    // METODOS:
    public double getVolumen()
    {
        return (super.getAlto()*super.getAncho()*super.getProfundidad());
    }

    public double getConsumo()
    {
        return super.getFrigorias()*5;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    @Override
    public String toString()
    {
        String resultado = "";

        resultado += super.toString() + " - Cámara con temperatura mínima " + this.getTempMin() + "º y máxima de " + this.getTempMax() + "º, consumo: " + this.getConsumo();

        return resultado;
    }
}
