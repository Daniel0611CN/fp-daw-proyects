package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.Cliente;
import models.Producto;
import models.Venta;


public class ManejoFicheros {
    
    public static ArrayList<Producto> leerFicheroProductos(String nombreArchivo)
    {
        String nombreFichero = nombreArchivo;
        String path = "src/resources/";
        
        ArrayList<Producto> listaProductos = new ArrayList<>();
        HashSet<Producto> listaSinRepetidos = new HashSet<Producto>();

        try (BufferedReader br = new BufferedReader(new FileReader(path+nombreFichero)))
        {
            String linea = br.readLine();
            
            while(linea!=null)
            {
                try
                {
                    String[] trozosLinea = linea.split(";");

                    if(Integer.valueOf(trozosLinea[4]) == 0)
                    {
                        Exception e1 = new ExcepcionProductoSinStock(trozosLinea[1], Integer.valueOf(trozosLinea[0]));
                        System.out.println(e1.toString());
                    }
                    else 
                    {
                        listaSinRepetidos.add(new Producto(Integer.valueOf(trozosLinea[0]), trozosLinea[1], trozosLinea[2], Double.valueOf(trozosLinea[3]), Integer.valueOf(trozosLinea[4]))); 
                    }
                } 
                catch (Exception ex) 
                {
                    System.out.println("ERROR en la lectura de un producto -> en la cadena: " + linea);
                }
                //actualiza concidion bucle:
                linea = br.readLine();
            }
        } 
        catch (Exception e) 
        {
            System.out.println("No se ha podido leer el fichero");
            System.out.println(e.getMessage());
        }

        listaProductos.addAll(listaSinRepetidos);
        return listaProductos;
    }
    

    public static ArrayList<Cliente> leeListaClientesFromJson(String nombreArchivo)
	{
        String path = "src/resources/";
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        HashSet<Cliente> listaSinRepetidos = null;

		try {
            File fileClientes = new File(path+nombreArchivo);
            ObjectMapper objectMapper = new ObjectMapper();

            listaSinRepetidos = objectMapper.readValue(fileClientes, new TypeReference<HashSet<Cliente>>(){});
        } 
        catch (IOException e) {
            
            e.printStackTrace();
        }

        if(listaSinRepetidos != null)
        {
            listaClientes.addAll(listaSinRepetidos);
            return listaClientes;
        }
        else 
        {
            return null;
        }
	}

	public static ArrayList<Venta> leeListaVentasFromJson(String nombreArchivo)
	{
        String path = "src/resources/";
		ArrayList<Venta> listaName = null;

		try {
            File fileName = new File(path+nombreArchivo);
            ObjectMapper objectMapper = new ObjectMapper();

            listaName = objectMapper.readValue(fileName, new TypeReference<ArrayList<Venta>>(){});
        } 
        catch (IOException e) {
            
            e.printStackTrace();
        }

		return listaName;
	}
	

    public static void borraFichero(String path) throws Exception
    {
        try
        {
            File fichero = new File(path);

            if(fichero.exists())
            {
                fichero.delete();
            }
        }
        catch (Exception e)
        {

        }
    }

    public static void escribeEnFichero(String fileName, String output) throws Exception
    {

        String nombreFichero = fileName;
        String path = "src/resources/";
        
        FileWriter fileWriter = null;
        BufferedWriter bWriter = null;
        
        try
        {
            fileWriter = new FileWriter(path+nombreFichero, true);
            bWriter = new BufferedWriter(fileWriter);
            
            bWriter.append(output);
            bWriter.newLine();
        } 
        catch (Exception e) 
        {
            //System.out.println("Algo ha fallado");
        }
        finally
        {
            try 
            {
                if(bWriter != null)
                {
                    bWriter.close();
                }
                if(fileWriter != null)
                {
                    fileWriter.close();
                }
            } 
            catch (Exception e) 
            {

            }
        }
    }
}
