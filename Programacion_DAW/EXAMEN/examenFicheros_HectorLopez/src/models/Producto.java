package models;

public class Producto implements Comparable<Producto>{
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;


    public Producto(int codigo, String nombre, String descripcion, double precio, int stock){

        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto p)
    {
        return (this.codigo - p.codigo);
    }

    @Override
    public boolean equals(Object otro){

        boolean iguales = false;

        if(this.compareTo((Producto)otro) == 0)
        {
            iguales = true;
        }

        return iguales;
    }

    @Override
    public String toString(){

        return "código: " + codigo + " - Nombre: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: " + precio + " - Stock: " + stock + "\n\n";
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
