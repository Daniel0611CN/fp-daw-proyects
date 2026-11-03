package EXAMEN.examenColecciones_Hector.elementosTienda;

import java.util.ArrayList;
import java.util.HashMap;
import EXAMEN.examenColecciones_Hector.elementosTienda.Producto.Categoria;

public class DescuentoPorCategoria {
    
    // ATRIBUTOS:
    private HashMap<Categoria, Integer> mapaDescuentos;


    // CONSTRUCTOR:
    public DescuentoPorCategoria()
    {
        this.mapaDescuentos = new HashMap<>();
    }


    // METODOS:
    public boolean insertar(String categoria, int descuento)
    {
        boolean insert = false;

        if(!this.mapaDescuentos.containsKey(Categoria.valueOf(categoria.toUpperCase())))
        {
            this.mapaDescuentos.put(Categoria.valueOf(categoria.toUpperCase()), descuento);
            insert = true;
        }

        return insert;
    }

    public boolean modificar(Categoria categoria, int nuevoDescuento)
    {
        boolean modificado = false;

        if(this.mapaDescuentos.containsKey(categoria))
        {
            this.mapaDescuentos.replace(categoria, nuevoDescuento);
            modificado = true;
        }
        return modificado;
    }

    public boolean eliminarDescuento(Categoria categoria)
    {
        boolean eliminado = false;

        if(this.mapaDescuentos.containsKey(categoria))
        {
            // Elimino la ocurrencia del diccionario
            this.mapaDescuentos.remove(categoria);
            eliminado = true;
        }
        return eliminado;
    }

    public int obtener(Categoria categoria)
    {
        int descuento = 0;

        if(this.mapaDescuentos.containsKey(categoria))
        {
            descuento = this.mapaDescuentos.get(categoria);      
        }

        return descuento;
    }


    public String mostrarDescuentos()
    {
        String resultado = "";

        // creo un array de categorias para poder usar iterator:
        ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();

        // paso las Categorias del HashMap al ArrayList:
        listaCategorias.addAll(this.mapaDescuentos.keySet());

        for (Categoria categoria : listaCategorias)
        {
            resultado+= categoria + " - " + this.mapaDescuentos.get(categoria) + "%\n";
        }
        return resultado;
    }

}
