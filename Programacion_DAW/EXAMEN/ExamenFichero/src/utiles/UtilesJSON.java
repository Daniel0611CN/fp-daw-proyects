package utiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Cliente;
import modelos.Venta;

public class UtilesJSON {

    public static List<Cliente> leerFicheroCliente()
    {
        List<Cliente> listaClientes = new ArrayList<Cliente>();

        try {
            File fichero = new File("src/recursos/clientes.json");

            ObjectMapper mapper = new ObjectMapper();

            //listaClientes = mapper.readValue(fichero, Cliente.class)
            listaClientes = mapper.readValue(fichero, new TypeReference<List<Cliente>>(){});

        } catch (Exception e) {
            System.out.println("Error lectura cliente -" + e);
        }


        return listaClientes;

    } 

    public static List<Venta> leerFicheroVenta()
    {
        List<Venta> listaVenta = new ArrayList<Venta>();

        try {
            File fichero = new File("src/recursos/ventas.json");

            ObjectMapper mapper = new ObjectMapper();

            
            listaVenta = mapper.readValue(fichero, new TypeReference<List<Venta>>(){});

        } catch (Exception e) {
            System.out.println("Error lectura ventas -" + e);
        }


        return listaVenta;

    }
    
}
