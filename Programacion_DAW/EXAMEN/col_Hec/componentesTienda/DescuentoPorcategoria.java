package EXAMEN.col_Hec.componentesTienda;

import java.util.ArrayList;
import java.util.HashMap;

import EXAMEN.col_Hec.componentesTienda.Producto.Categoria;

public class DescuentoPorcategoria {
    

    // ATRIBUTOS:
    private HashMap<Categoria, Integer> diccionarioDescuentos;


    // CONSTRUCTOR:
    public DescuentoPorcategoria()
    {
        this.diccionarioDescuentos = new HashMap<>();
    }

    // METODOS:
    public boolean insertar(String categoria, int descuento)
    {
        boolean insertado = false;

        if(!this.diccionarioDescuentos.containsKey(Categoria.valueOf(categoria.toUpperCase())))
        {
            this.diccionarioDescuentos.put(Categoria.valueOf(categoria.toUpperCase()), descuento);
            insertado = true;
        }

        return insertado;
    }

    public boolean modificar(Categoria categoria, int nuevoDescuento)
    {
        boolean cambiado = false;

        if(this.diccionarioDescuentos.containsKey(categoria))
        {
            this.diccionarioDescuentos.replace(categoria, nuevoDescuento);
            cambiado = true;
        }
        return cambiado;
    }

    public boolean eliminarDescuento(Categoria categoria)
    {
        boolean eliminado = false;

        if(this.diccionarioDescuentos.containsKey(categoria))
        {
            // machacho el descuento a 0%
            this.diccionarioDescuentos.replace(categoria, 0);
            eliminado = true;
        }
        return eliminado;
    }

    public int obtener(Categoria categoria)
    {
        int descuento = 0;

        if(this.diccionarioDescuentos.containsKey(categoria))
        {
            descuento = this.diccionarioDescuentos.get(categoria);      
        }

        return descuento;
    }


    public String mostrarDescuentos()
    {
        String resultado = "DESCUENTOS POR CATEGORÍA:\n";

        // Saco el array de claves para iterar:
        ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();

        // añado las claves del Map al ArrayList:
        listaCategorias.addAll(this.diccionarioDescuentos.keySet());

        for (Categoria categoria : listaCategorias)
        {
            resultado+= "Categoría: " + categoria + " -> Descuento: " + this.diccionarioDescuentos.get(categoria) + "%\n";
        }

        return resultado;
    }

}
