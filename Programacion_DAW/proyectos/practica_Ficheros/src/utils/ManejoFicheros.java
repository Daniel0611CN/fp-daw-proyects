package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.Cliente;
import models.Producto;
import models.Venta;

public class ManejoFicheros {
    

    public static ArrayList<Producto> leerFichero_CSV(String nombreArchivo)
    {
        String nombreFichero = nombreArchivo;
        String path = "src/resources/";
        
        ArrayList<Producto> listaT = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path+nombreFichero)))
        {
            String linea = br.readLine();
            
            while(linea!=null)
            {
                try
                {
                    String[] trozosLinea = linea.split(";");

                    // se sacan las variables necesarias:
                    int stock = Integer.valueOf(trozosLinea[4]);

                    // lanza excepcion personalizada:
                    if (stock == 0)
                    {
                        throw new ExcepcionProductoSinStock(trozosLinea[1], trozosLinea[0]);
                    }
                    else
                    {
                        listaT.add(new Producto(Integer.valueOf(trozosLinea[0]), trozosLinea[1], trozosLinea[2], Double.valueOf(trozosLinea[3]), stock)); 
                    }
                }
                catch (ExcepcionProductoSinStock e1) 
                {
                    System.out.println(e1.getMessage());
                }
                catch (Exception ex) 
                {
                    System.out.println("Error al leer la línea " + linea);
                    // System.out.println(ex.getMessage());
                }
                //actualiza concidion bucle:
                linea = br.readLine();
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error al leer el fichero");
            System.out.println(e.getMessage());
        }

        return listaT;
    }

	public static ArrayList<Cliente> leeListaClientes_Json(String relativePathFile)
	{
		ArrayList<Cliente> lista = null;
        
		try {
            File fileName = new File(relativePathFile);
            ObjectMapper objectMapper = new ObjectMapper();

            lista = objectMapper.readValue(fileName, new TypeReference<ArrayList<Cliente>>(){});

        } 
        catch (IOException e) {
            
            e.printStackTrace();
        }
        
		return lista;
	}

    public static ArrayList<Venta> leeListaVentas_Json(String relativePathFile)
	{
		ArrayList<Venta> lista = null;
        
		try {
            File fileName = new File(relativePathFile);
            ObjectMapper objectMapper = new ObjectMapper();

            lista = objectMapper.readValue(fileName, new TypeReference<ArrayList<Venta>>(){});

        } 
        catch (IOException e) {
            
            e.printStackTrace();
        }
        
		return lista;
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
            System.out.println("Error al borrar el fichero");
        }
    }

    public static void escribeEnFichero(String fileName, String output) throws Exception
    {
        String nombreFichero = fileName + ".txt";
        String path = "src/output/";
        
        try(FileWriter fileWriter = new FileWriter(path+nombreFichero, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);)
        {
            bWriter.append(output);
            bWriter.newLine();
        } 
        catch (Exception e) 
        {
            System.out.println("Error al escribir el fichero " + fileName);
        }
    }


}
