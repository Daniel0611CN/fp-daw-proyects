package models;

import java.util.ArrayList;

public class Venta {
    
    // ATTRIBUTES:
    private int codigoCliente;
    private String fecha;
    private ArrayList<Linea> lineas;

    // CONSTRUCTOR:
    public Venta(){

    }

    // METHODS:
    @Override
    public String toString()
    {
        return "\ncod.Cliente: " + codigoCliente + " - fecha: " + fecha + "\n" + lineas + "\n";
    }

    
    // GETTERS Y SETTERS:
    public int getCodigoCliente() {
        return codigoCliente;
    }


    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public ArrayList<Linea> getLineas() {
        return lineas;
    }


    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

    
}
