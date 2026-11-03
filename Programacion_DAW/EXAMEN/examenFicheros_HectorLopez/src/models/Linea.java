package models;

public class Linea {
    
    // ATTRIBUTES:
    private int idLinea;
    private int codigoProducto;
    private int cantidad;

    // CONSTRUCTOR:
    public Linea(){

    }

    // METHODS:
    @Override
    public String toString()
    {
        return "id: " + idLinea + " - cod.Producto: " + codigoProducto + " - cant: " + cantidad + "\n";
    }

    // GETTERS Y SETTERS:
    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoproducto) {
        this.codigoProducto = codigoproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
