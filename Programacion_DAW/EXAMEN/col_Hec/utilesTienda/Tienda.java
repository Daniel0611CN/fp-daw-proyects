package EXAMEN.col_Hec.utilesTienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import EXAMEN.col_Hec.componentesTienda.CarritoCompra;
import EXAMEN.col_Hec.componentesTienda.DescuentoPorcategoria;
import EXAMEN.col_Hec.componentesTienda.Producto;
import EXAMEN.col_Hec.componentesTienda.Producto.Categoria;
import EXAMEN.col_Hec.interfaces_tienda.ProductoPorNombre;
import EXAMEN.col_Hec.interfaces_tienda.Tienda_I;


public class Tienda implements Tienda_I{

    // ATRIBUTOS:
    private ArrayList<Producto> listadoProductos;
    private CarritoCompra carritoDeCompra;
    private DescuentoPorcategoria descuentoPorCategoria;

    // CONSTRUCTOR:
    public Tienda()
    {
        this.listadoProductos = new ArrayList<>();
        this.carritoDeCompra = new CarritoCompra();
        this.descuentoPorCategoria = new DescuentoPorcategoria();
    }

    // METODOS:

    @Override
    public boolean insertarProducto(Producto producto)
    {
        boolean insertado = false;

        if(!listadoProductos.contains(producto))
        {
            listadoProductos.add(producto);
            insertado = true;
        }
        return insertado;
    }

    @Override
    public String mostrarProductosPorNombre()
    {
        ProductoPorNombre comparatorNombre = new ProductoPorNombre();

        Collections.sort(listadoProductos, comparatorNombre);

        String salida = "Productos por Nombre:\n";

        for (Producto producto : listadoProductos)
        {
            salida+= producto.toString() + "\n";    
        }
        return salida;
    }

    
    @Override
    public String mostrarProductosPorId()
    {
        Collections.sort(listadoProductos);

        String salida = "Productos por ID:\n";

        for (Producto producto : listadoProductos)
        {
            salida+= producto.toString() + "\n";    
        }
        return salida;
    }

    @Override
    public Producto buscarProducto(int id)
    {
        Producto encontrado = null;

        for (Producto producto : listadoProductos)
        {
            if(producto.getId() == id)
            {
                encontrado = producto;
            }
        }
        return encontrado;
    }

    @Override
    public double obtenerCuentaTotal()
    {
        // variables:
        double total = 0;
        double descuentoAcumulado = 0;

        // saco lista de categorias SIN REPETIR en una coleccion:
        Set<Categoria> categoriasCompradas = new HashSet<>();

        // itero sobre el carrito para sacar el precio total de los productos de la compra, y sus categorias
        for (Producto producto : carritoDeCompra.getCarrito())
        {
            total+= producto.getPrecio();
            categoriasCompradas.add(producto.getCategoria());
        }

        // itero para buscar el descuento de cada categoria que haya en la cesta de la compra
        for (Categoria categoria : categoriasCompradas)
        {
            descuentoAcumulado+= this.descuentoPorCategoria.obtener(categoria);
        }

        System.out.println("Total sin descuento: " + total + "€");
        total = (1-(descuentoAcumulado/100)) * total;
        return total;
    }

    // GETTERS:
    public ArrayList<Producto> getListadoProductos() {
        return listadoProductos;
    }

    public CarritoCompra getCarritoDeCompra() {
        return carritoDeCompra;
    }

    public DescuentoPorcategoria getDescuentoPorCategoria() {
        return descuentoPorCategoria;
    }

}
