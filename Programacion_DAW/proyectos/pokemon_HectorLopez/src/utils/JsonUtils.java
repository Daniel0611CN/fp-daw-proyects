package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.Pokedex;
import models.Pokemon;

public class JsonUtils {
    

    public static Pokemon readPokemonFromJson(String relativePathFile)
    {
		Pokemon pokemon = null;
		try {
			
            // Create File
			File pokeFile = new File(relativePathFile);
			
			//create ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();
			
			//convert json string to object
			try {
				pokemon = objectMapper.readValue(pokeFile, Pokemon.class);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		catch (Exception e)
		{
			
		}
        return pokemon;
    }


	public static Pokedex readPokemonListFromJson(String relativePathFile)
	{
		File pokeFile = new File(relativePathFile);

		ObjectMapper objectMapper = new ObjectMapper();

		Pokedex pokeList = null;
		try {
            pokeList = objectMapper.readValue(pokeFile,  new TypeReference<Pokedex>(){});
        } catch (IOException e) {
            
            e.printStackTrace();
        }

		return pokeList;
	}


	public static void writeIntoTextFile(String arg) throws Exception
	{
		String fileName = "consultasPokemon.txt";
        String path = "src/resources/";
        
        FileWriter fileWriter = null;
        BufferedWriter bWriter = null;
        
        try
        {
            fileWriter = new FileWriter(path+fileName, true);
            bWriter = new BufferedWriter(fileWriter);
            
            bWriter.append(arg);
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


	public static void deleteFile(String path) throws Exception
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

}
