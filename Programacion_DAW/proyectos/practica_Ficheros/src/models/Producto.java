package models;

public class Producto {
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;


    public Producto(int codigo, String nombre, String descripcion, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
                + precio + ", stock=" + stock + "]";
    }

    

    @Override
    public int hashCode() {

        return 0;
    }


    @Override
    public boolean equals(Object obj) {

        Producto other = (Producto) obj;
        if (codigo != other.codigo)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }


    public int getCodigo() {
        return codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public double getPrecio() {
        return precio;
    }


    public int getStock() {
        return stock;
    }

    
    
}
