package CLASES_T6.Clases;

public class Incidencia {
    
    enum estadoIncidencia {Pendiente, Resuelto, EnProceso, Cerrado}

    // ATRIBUTOS:
    private int codigo;
    private int puesto;
    private String descripcion;
    private String reparacion;
    //private boolean estaPendiente;
    private estadoIncidencia estado;

    static private int contadorCodigo;
    static private int pendientes;

    // CONSTRUCTORES:
    public Incidencia(int puesto, String descripcion)
    {
        this.puesto = puesto;
        this.descripcion = descripcion;
        //this.estaPendiente = true;
        this.estado = estadoIncidencia.Pendiente;

        this.codigo = contadorCodigo+1;
        contadorCodigo++;
        pendientes++;
    }

    // METODOS:
    public int getCodigo() {
        return codigo;
    }

    public int getPuesto() {
        return puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getReparacion() {
        return reparacion;
    }

    // public boolean getEstaPendiente() {
    //     return estaPendiente;
    // }

    public static int getContadorCodigo() {
        return contadorCodigo;
    }

    public static int getPendientes() {
        return pendientes;
    }

    private void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    // private void setEstaPendiente(boolean estaPendiente) {
    //     this.estaPendiente = estaPendiente;
    // }

    private static void setPendientes(int pendientes) {
        Incidencia.pendientes = pendientes;
    }

    public void resuelve(String info)
    {
        setReparacion(info);
        //setEstaPendiente(false);
        this.estado = estadoIncidencia.Resuelto;

        setPendientes(getPendientes()-1);
    }

    @Override
    public String toString()
    {
        String resultado = "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " +
        this.descripcion + " - " + estado + (this.estado == estadoIncidencia.Resuelto ? " - " + this.reparacion : "");

        return resultado;
    }

}
