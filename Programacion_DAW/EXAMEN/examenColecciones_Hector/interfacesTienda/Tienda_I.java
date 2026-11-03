package EXAMEN.examenColecciones_Hector.interfacesTienda;

import EXAMEN.examenColecciones_Hector.elementosTienda.Producto;

public interface Tienda_I {

    boolean insertarProductoAlmacen(Producto producto);
    String mostrarProductosAlmacenPorNombre();
    String mostrarProductosAlmacenPorId();
    Producto buscarProductoAlmacen(int id);
    double obtenerCuentaTotal();
}
