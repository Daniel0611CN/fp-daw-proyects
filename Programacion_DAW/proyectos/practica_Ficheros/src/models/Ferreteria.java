package models;

import java.util.ArrayList;

public class Ferreteria {
    

    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;


    public Ferreteria(){

        this.clientes = utils.ManejoFicheros.leeListaClientes_Json("src/resources/clientes.json");
        eliminaClientesrepetidos();

        this.ventas = utils.ManejoFicheros.leeListaVentas_Json("src/resources/ventas.json");

        this.productos = utils.ManejoFicheros.leerFichero_CSV("productos.csv");
        eliminaProductosQueNoExisten();
    }


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }


    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }


    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }


    public ArrayList<Venta> getVentas() {
        return ventas;
    }


    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }


    public void eliminaClientesrepetidos(){

        ArrayList<Cliente> nuevaLista = new ArrayList<>();

        for (Cliente cliente : clientes)
        {
            if(!nuevaLista.contains(cliente))
            {
                nuevaLista.add(cliente);
            }
        }
        this.clientes = nuevaLista;
    }

    public void eliminaProductosQueNoExisten(){

        // Saco lista de codigos Producto:
        ArrayList<Integer> codigos = new ArrayList<>();
        for (Producto producto : this.productos)
        {
            codigos.add(producto.getCodigo());    
        }

        // Recorro las lineas de todas las ventas:
        for (Venta venta : this.ventas)
        {
            ArrayList<Linea> nuevasLineas = new ArrayList<>(); 

            for (Linea linea : venta.getLineas()) 
            {
                if(codigos.contains(linea.getCodigoProducto()))
                {
                    nuevasLineas.add(linea);
                }
            }
            // actualizo las lineas de la venta:
            venta.setLineas(nuevasLineas);    
        }
    }

    public String facturacionClientes(){

        String salida = "";

        for (Cliente cliente : this.clientes)
        {
            double totalCliente = 0;
            salida+= "\n"+cliente.getNombre() + " -> ";

            for (Venta venta : this.ventas)
            {
                if(venta.getCodigoCliente() == cliente.getCodigo())
                {

                    for (Linea linea : venta.getLineas())
                    {
                        totalCliente+= (linea.getCantidad()*buscaProducto(linea.getCodigoProducto()).getPrecio());
                    }
                }    
            }
            salida+= totalCliente + " €";
        }
        return salida;
    }

    public String facturacionTotal(){

        String salida = "Facturacion total ferreteria: ";
        double total = 0;

        for (Venta venta : this.ventas)
        {

            for (Linea linea : venta.getLineas())
            {
                total+= (linea.getCantidad()*buscaProducto(linea.getCodigoProducto()).getPrecio());
            }
        }
        salida+= total + " €";
        
        return salida;
    }

    public Producto buscaProducto(int codigo){

        Producto buscado = null;

        for (Producto producto : this.productos)
        {
            if(producto.getCodigo() == codigo)
            {
                buscado = producto;
            }
        }
        return buscado;
    }

    public String productosVendidos(){

        String salida = "\nCANTIDADES VENDIDAS POR PRODUCTO: \n";

        for (Producto producto : this.productos)
        {
            salida+= producto.getNombre();
            int cantidades = 0;
            
            for (Venta venta : this.ventas)
            {
                for (Linea linea : venta.getLineas())
                {
                    if(linea.getCodigoProducto() == producto.getCodigo())
                    {
                        cantidades+= linea.getCantidad();
                    }    
                }
            }

            salida+= " " + cantidades + " cantidades.\n";
        }

        return salida;
    }
}
