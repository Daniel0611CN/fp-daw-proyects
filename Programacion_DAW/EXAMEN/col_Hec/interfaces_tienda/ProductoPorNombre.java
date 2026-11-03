package EXAMEN.col_Hec.interfaces_tienda;

import java.util.Comparator;

import EXAMEN.col_Hec.componentesTienda.Producto;

public class ProductoPorNombre implements Comparator<Producto>{

    @Override
    public int compare(Producto prod1, Producto prod2)
    {
        int diferencia = prod1.getNombre().compareTo(prod2.getNombre());

        if(diferencia == 0)
        {
            diferencia = prod1.compareTo(prod2);
        }

        return diferencia;
    }
    
}
