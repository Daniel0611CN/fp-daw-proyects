package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.Cliente;
import modelos.LineaVenta;
import modelos.Producto;
import modelos.Venta;
import utiles.UtilesJSON;
import utiles.utilesTexto;

public class Ferreteria {

    private List<Cliente> clientes; 
    private List<Producto> productos;
    private List<Venta> ventas;


    public Ferreteria()
    {
        clientes = UtilesJSON.leerFicheroCliente();

        filtrarClientes();


        productos = utilesTexto.leerFicheroProductos();

        ventas = UtilesJSON.leerFicheroVenta();

        filtrarVentas();

    }


    public List<Cliente> getClientes() {
        return clientes;
    }


    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }


    public List<Producto> getProductos() {
        return productos;
    }


    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    /**
     * elimino los clientes repetidos (mismo nombre)
     */
    private void filtrarClientes()
    {
        List<Cliente> clientesDefinitivos = new ArrayList<>();

        for (Cliente cliente : this.clientes) {
            if (!clientesDefinitivos.contains(cliente))
            {
                clientesDefinitivos.add(cliente);
            }
        
        }

        clientes = clientesDefinitivos;
    }



    private void filtrarVentas()
    {
        //List<Venta> listavetasFiltrada = new ArrayList<>();


        for (Venta venta : this.getVentas())
        {
            
            List<LineaVenta> lineasCorrectas = new ArrayList<>();
            for (LineaVenta linea : venta.getLineas()) 
            {
                int codigoProducto = linea.getCodigoProducto();

                Producto p = buscarProducto(codigoProducto);

                if (p!=null)
                {
                    p.getPrecio();
                    lineasCorrectas.add(linea);
                }
                else
                {
                    System.out.println("El producto " + codigoProducto + " no existe en el alamcen");
                }
            }
            venta.setLineas(lineasCorrectas);

        }
    }

    private Producto buscarProducto(int codigo)
    {

        //Producto resultado = new Producto(codigo, null, null, null, null);

        Producto resultado = null;
        for (Producto prod : productos) 
        {
            if (prod.getCodigo() == codigo)
            {
                resultado = prod;
            }    
        }

        return resultado;
    }

    /**
     * Calcula la facturación de cada cliente y lo vuelca a un fichero de texto
     */
    public void facturacionClientes() 
    {
        //Creo la estructura donde guardo el codigo de cliente y lo que lleva guardado
        Map<Integer, Double> dicCodigoClienteFacturacion = new HashMap<>();

        for (Cliente cliente : clientes) 
        {
            double totalFacturadoCliente = 0;

            int codigoClienteActual = cliente.getCodigo();

            for (Venta venta : ventas) 
            {
                if (venta.getCodigoCliente() == codigoClienteActual)
                {
                    for (LineaVenta linea : venta.getLineas()) 
                    {
                        Producto pBuscado = buscarProducto(linea.getCodigoProducto());

                        if (pBuscado != null)
                        {
                            totalFacturadoCliente += (pBuscado.getPrecio() * linea.getCantidad());
                        }
                    }
                }    
            }
            
            dicCodigoClienteFacturacion.put(codigoClienteActual, totalFacturadoCliente);
        }

        crearFicheroFacturacionClientes(dicCodigoClienteFacturacion);

        crearFicheroFacturacionTotal(dicCodigoClienteFacturacion);
    }


    private void crearFicheroFacturacionTotal(Map<Integer, Double> dicCodigoClienteFacturacion) 
    {
        Double total = 0.0;

        for (Double cantidad : dicCodigoClienteFacturacion.values()) 
        {
            total += cantidad;    
        }

        String path = "src/recursos/FacturacionTotal.txt";
        try (FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw)) 
        {

           bw.write("TOTAL FACTURADO: " + total);
        } catch (Exception e) {
            System.out.println("Error en la escritura de fichero "+ path);
        }
    }


    private void crearFicheroFacturacionClientes(Map<Integer, Double> dicCodigoClienteFacturacion) 
    {
        String path = "src/recursos/FacturacionClientes.txt";

        try (FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw)) 
        {
            
            for (Integer codigoCliente : dicCodigoClienteFacturacion.keySet()) 
            {
                //Cliente cBuscado = buscarCliente(codigoCliente);
                
                Double totalGastadoCliente = dicCodigoClienteFacturacion.get(codigoCliente);

                bw.write(codigoCliente + " - " + totalGastadoCliente);
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Error en la escritura del ficehro " + path);
        }
    }
}
