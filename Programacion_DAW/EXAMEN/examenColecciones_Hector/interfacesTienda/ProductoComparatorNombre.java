package EXAMEN.examenColecciones_Hector.interfacesTienda;

import java.util.Comparator;

import EXAMEN.examenColecciones_Hector.elementosTienda.Producto;

public class ProductoComparatorNombre implements Comparator<Producto>{
    
    
    // Declaro el nuevo compare para poder usar luego el Comparator cuando quiera ordenarlo por nombre:
    @Override
    public int compare(Producto p0, Producto p1)
    {
        int diferencia = p0.getNombre().compareTo(p1.getNombre());

        if(diferencia == 0)
        {
            diferencia = p0.compareTo(p1);
        }
        return diferencia;
    }
}
