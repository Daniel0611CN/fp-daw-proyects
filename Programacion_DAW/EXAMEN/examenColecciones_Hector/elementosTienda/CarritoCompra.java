package EXAMEN.examenColecciones_Hector.elementosTienda;

import java.util.ArrayList;
import java.util.Collections;

import EXAMEN.examenColecciones_Hector.interfacesTienda.ProductoComparatorNombre;

public class CarritoCompra {
    
    //ATRIBUTOS:
    private ArrayList<Producto> carro;

    // CONSTRUCTOR:
    public CarritoCompra()
    {
        this.carro = new ArrayList<>();
    }

    // METODOS:

    /**
     * Inserta un producto en el Carrito y devuelve true o false
     * @param producto
     * @return boolean
     */
    public boolean insertar(Producto producto)
    {
        return carro.add(producto);
    }

    /**
     * Busca un producto en el Carrito y lo elimina si aparece y devuelve true,
     * si no está devuelve false.
     * @param id
     * @return boolean
     */
    public boolean eliminar(int id)
    {
        boolean encontrado = false;
        int posicion = 0;

        while(!encontrado && posicion<this.carro.size())
        {
            if(this.carro.get(posicion).getId() == id)
            {
                carro.remove(posicion);
                encontrado = true;
            }
            posicion++;
        }    
        return encontrado;
    }

    /**
     * Vacía el Carrito por completo
     */
    public void limpiarCarrito()
    {
        this.carro.clear();
    }

    
    public String mostrarPorCodigo()
    {
        // Utilizo su ordenación natural definida por el compareTo de Producto (id)
        Collections.sort(this.carro);

        String resultado = "";

        for (Producto producto : carro)
        {
            resultado+= producto.toString() + "\n";
        }
        return resultado;
    }

    public String mostrarPorNombre()
    {
        // Declaro el Comparator creado para poder ordenar la colección por nombre:
        ProductoComparatorNombre comparatorNombre = new ProductoComparatorNombre();
        Collections.sort(this.carro, comparatorNombre);

        String resultado = "";

        for (Producto producto : carro)
        {
            resultado+= producto.toString() + "\n";
        }
        return resultado;
    }

    // GETTERS:
    public ArrayList<Producto> getCarrito() {
        return carro;
    }

}
