package COLECCIONES.carritoTienda;

import java.util.ArrayList;

public class Carrito {
    

    // ATRIBUTOS:
    private ArrayList<Elemento> miCarrito;
    

    // CONSTRUCTOR:
    public Carrito()
    {
        miCarrito = new ArrayList<>();
    }


    // METODOS:
    public void agrega(Elemento nuevoElemento)
    {
        // Si no está en mi carrito lo añado
        if(!miCarrito.contains(nuevoElemento))
        {
            miCarrito.add(nuevoElemento);
        }
        else // Si ya está:
        {
            // Lo busco en mi ArrayList
            for (Elemento elem : miCarrito)
            {
                // Cuando lo encuentro modifico la cantidad para poner la actual más la del elemento añadido:
                if(elem.equals(nuevoElemento))
                {
                    elem.setCantidad(elem.getCantidad() + nuevoElemento.getCantidad());
                }
            }
        }
    }

    public int numeroDeElementos()
    {
        int numero = miCarrito.size();
        return numero; 
    }

    public int numeroTotalElementos()
    {
        int total = 0;

        for (Elemento elemento : miCarrito)
        {
            int cantidad = elemento.getCantidad();
            total += cantidad;
        }
        return total;
    }

    public double importeTotal()
    {
        double total = 0;

        for (Elemento elemento : miCarrito)
        {
            int cantidad = elemento.getCantidad();
            double precio = elemento.getPrecio();
            total += (cantidad*precio);
        }
        return total;
    }

    public String toString()
    {
        String resultado = "";

        for (Elemento elemento : miCarrito)
        {
            resultado += elemento.toString() + " \n";
        }

        return resultado;
    }
}
