package EXAMEN.examenColecciones_Hector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import EXAMEN.examenColecciones_Hector.elementosTienda.CarritoCompra;
import EXAMEN.examenColecciones_Hector.elementosTienda.DescuentoPorCategoria;
import EXAMEN.examenColecciones_Hector.elementosTienda.Producto;
import EXAMEN.examenColecciones_Hector.elementosTienda.Producto.Categoria;
import EXAMEN.examenColecciones_Hector.interfacesTienda.ProductoComparatorNombre;
import EXAMEN.examenColecciones_Hector.interfacesTienda.Tienda_I;

public class Tienda implements Tienda_I{

    // ATRIBUTOS:
    ArrayList<Producto> almacenDeProductos;
    DescuentoPorCategoria descuentoPorCategoria;
    CarritoCompra carritoDeCompra;
    

    public Tienda()
    {
        this.almacenDeProductos = new ArrayList<>();
        this.descuentoPorCategoria = new DescuentoPorCategoria();
        this.carritoDeCompra = new CarritoCompra();
    }

    @Override
    public boolean insertarProductoAlmacen(Producto producto)
    {
        boolean insert = false;

        if(!almacenDeProductos.contains(producto))
        {
            almacenDeProductos.add(producto);
            insert = true;
        }
        else 
        {
            System.out.println("Producto con nombre " + producto.getNombre() + " repetido.");
        }
        return insert;
    }

    @Override
    public String mostrarProductosAlmacenPorNombre()
    {
        // Declaro el Comparator creado para ordenar por nombre:
        ProductoComparatorNombre comparatorNombre = new ProductoComparatorNombre();
        Collections.sort(almacenDeProductos, comparatorNombre);

        String cadena = "";
        for (Producto producto : almacenDeProductos)
        {
            cadena+= producto.toString() + "\n";    
        }
        return cadena;
    }

    @Override
    public String mostrarProductosAlmacenPorId()
    {
        // Utilizo los métodos de Collections para ordenar por defecto (id)
        Collections.sort(almacenDeProductos);

        String cadena = "";
        for (Producto producto : almacenDeProductos)
        {
            cadena+= producto.toString() + "\n"; 
        }
        return cadena;
    }

    @Override
    public Producto buscarProductoAlmacen(int id)
    {
        // declaro la salida como null por si no encuantro el producto
        Producto buscado = null;

        for (Producto producto : almacenDeProductos)
        {
            if(producto.getId() == id)
            {
                buscado = producto;
            }
        }
        return buscado;
    }

    @Override
    public double obtenerCuentaTotal()
    {
        double total = 0;
        double descuentoTotal = 0;

        // para que no se repitan paso mi lista de categorias a una Coleccion de tipo SET:
        Set<Categoria> categoriasCarrito = new HashSet<>();

        // calculo el precio total de los productos del carro, y guardo sus categorias enla coleccion creada
        for (Producto producto : carritoDeCompra.getCarrito())
        {
            total+= producto.getPrecio();
            categoriasCarrito.add(producto.getCategoria());
        }

        // Sumo el descuento de cada categoria que hubiera en la cesta de la compra
        for (Categoria categoria : categoriasCarrito)
        {
            descuentoTotal+= this.descuentoPorCategoria.obtener(categoria);
        }

        // Imprimo el total sin descuento y devuelvo el total con el descuento aplicado:
        System.out.println("//Total sin descuento: " + total + "€");
        total = (1-(descuentoTotal/100)) * total;
        return total;
    }


    // GETTERS:
    public ArrayList<Producto> getAlmacenDeProductos() {
        return almacenDeProductos;
    }

    public DescuentoPorCategoria getDescuentoPorCategoria() {
        return descuentoPorCategoria;
    }

    public CarritoCompra getCarritoDeCompra() {
        return carritoDeCompra;
    }

}
