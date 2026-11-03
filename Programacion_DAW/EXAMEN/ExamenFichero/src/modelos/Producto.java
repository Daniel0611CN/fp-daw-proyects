package modelos;

public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Double cantidad;


    public Producto(int codigo, String nombre, String descrip, Double precio, Double cantidad  )
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descrip;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object obj) {
        Producto p = (Producto)obj;
        return this.codigo == p.codigo;
    }

    @Override
    public String toString() {
        return "Producto (" + codigo + ")=" + nombre ;
    }

    public int getCodigo() {
        return codigo;
    }

    public Double getPrecio() {
        return precio;
    }

    
}
