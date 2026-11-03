package COLECCIONES.carritoTienda;

import java.text.DecimalFormat;

public class Elemento {
    
    // ATRIBUTOS:
    private String nombre;
    private double precio;
    private Integer cantidad;

    // CONSTRUCTOR:
    public Elemento (String nombre, double precio, Integer cantidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // METODOS:
    @Override
    public String toString()
    {
        // con almohadillas me pone hasta 3 decimales si hacen falta, pero si no, no los pone
        DecimalFormat df = new DecimalFormat("#.###");

        // con 00 me pone siempre dos posiciones para decimales, sean numeros o no:
        DecimalFormat df2 = new DecimalFormat("#.00");

        return this.nombre + " PVP: " + this.precio + " Unidades: " + this.cantidad + " Subtotal: " + df2.format(this.precio*this.cantidad);
    }

    @Override
    public boolean equals(Object obj)
    {
        Elemento nuevoElemento = (Elemento)obj;
        boolean iguales = false;

        if(this.nombre.equals(nuevoElemento.getNombre()) && this.precio == nuevoElemento.getPrecio())
        {
            iguales = true;
        }

        return iguales;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
}
