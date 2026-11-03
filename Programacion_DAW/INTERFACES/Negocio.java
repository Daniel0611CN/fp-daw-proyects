package INTERFACES;

public abstract class Negocio {
    

    protected String nombreNegocio;
    protected double dineroEnCaja;
    protected Cliente[] colaCliente;
    protected boolean estado;


    public Negocio(String nombre)
    {
        this.nombreNegocio = nombre;
        this.dineroEnCaja = 0;
        this.colaCliente = new Cliente[0];

    }
}
