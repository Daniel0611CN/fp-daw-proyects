package CLASES_T6.Clases;

import CLASES_T6.Clases.Caja.AccionesBanco;

public class Cliente {

    // ATRIBUTOS:
    private String nombre;
    private AccionesBanco operacion;
    private double importe;
    

    // CONSTRUCTORES:
    public Cliente(String nombre, AccionesBanco operacion, double importe)
    {
        this.nombre = nombre;
        this.operacion = operacion;
        this.importe = importe;
    }

    public String getNombre() {
        return nombre;
    }

    public AccionesBanco getOperacion() {
        return operacion;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString()
    {
        String resultado = this.getNombre() + ", va a " + this.getOperacion() + " " + this.getImporte() + " euros";

        return resultado;
    }

    
}
