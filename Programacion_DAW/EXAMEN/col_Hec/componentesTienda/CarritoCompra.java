package EXAMEN.col_Hec.componentesTienda;

import java.util.ArrayList;
import java.util.Collections;

import EXAMEN.col_Hec.interfaces_tienda.ProductoPorNombre;

public class CarritoCompra {
    
    //ATRIBUTOS:
    private ArrayList<Producto> carrito;


    // CONSTRUCTOR:
    public CarritoCompra()
    {
        this.carrito = new ArrayList<>();
    }


    // METODOS:
    public boolean insertar(Producto producto)
    {
        return carrito.add(producto);
    }

    public boolean eliminar(int id)
    {
        boolean encontrado = false;
        int index = 0;

        while(!encontrado && index<this.carrito.size())
        {
            if(this.carrito.get(index).getId() == id)
            {
                carrito.remove(index);
                encontrado = true;
            }
            index++;
        }    
        return encontrado;
    }

    public void limpiarCarrito()
    {
        this.carrito.clear();
    }

    public String mostrarPorCodigo()
    {
        Collections.sort(this.carrito);

        String resultado = "Carrito por código:\n";

        for (Producto producto : carrito)
        {
            resultado+= producto.toString() + "\n";
        }
        return resultado;
    }

    public String mostrarPorNombre()
    {
        ProductoPorNombre comparatorNombre = new ProductoPorNombre();
        Collections.sort(this.carrito, comparatorNombre);

        String resultado = "Carrito por nombre:\n";

        for (Producto producto : carrito)
        {
            resultado+= producto.toString() + "\n";
        }
        return resultado;
    }

    // GETTERS:
    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    
}

