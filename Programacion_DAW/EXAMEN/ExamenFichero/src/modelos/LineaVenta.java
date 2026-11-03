package modelos;

public class LineaVenta {

    private int idLinea;
    private int codigoProducto;
    private int cantidad;

    public LineaVenta() {

    }
    
    public int getIdLinea() {
        return idLinea;
    }
    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }
    public int getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LineaVenta [idLinea=" + idLinea + ", codigoProducto=" + codigoProducto + ", cantidad=" + cantidad + "]";
    }

    

}
