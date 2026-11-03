package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import models.Alumno;
import models.Instituto;

public class ManejoFicheros {
    

	/**
	 * Convierte un objeto en un Json
	 */
    public static void exportaComoJson(List<Alumno> array, String fileName)
    {
        try 
        {
            ObjectMapper objectMapper = new ObjectMapper();

            objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        
            File file = new File("src/output/" + fileName);
            objectMapper.writeValue(file, array);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }


    public static HashMap<String,Double> leerFicheroBecas(String nombreArchivo)
    {
        String nombreFichero = nombreArchivo;
        String path = "src/resources/";
        
        HashMap<String,Double> listaT = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path+nombreFichero)))
        {
            String linea = br.readLine();
            
            while(linea!=null)
            {
                try
                {
                    String[] trozosLinea = linea.split("-");

                    // se sacan las variables necesarias:
                    String asignatura = trozosLinea[0];
                    double notaBeca = Double.valueOf(trozosLinea[1]);

                    listaT.put(asignatura, notaBeca);
                }
                catch (Exception ex) 
                {
                    System.out.println("Error al leer la línea " + linea);
                    System.out.println(ex.getMessage());
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

    
    public static Instituto lee_FromJson(String relativePathFile)
    {
        Instituto listaNueva = null;
        
        try {
            File fileName = new File(relativePathFile);
            ObjectMapper objectMapper = new ObjectMapper();

            listaNueva = objectMapper.readValue(fileName, new TypeReference<Instituto>(){});
        }
        catch (IOException e) {
            
            e.printStackTrace();
        }
        return listaNueva;
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
        String nombreFichero = fileName;
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
