package modelos;

import java.util.List;

public class Venta {
    private int codigoCliente;
    private String fecha;
    private List<LineaVenta> lineas;

    public Venta()
    {

    }

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

    public List<LineaVenta> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaVenta> lineas) {
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        return "Venta [codigoCliente=" + codigoCliente + ", lineas=" + lineas + "]";
    }

    
    
}
