import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class LeerInformacion {

    public static ArrayList<Municipio> leerFicheroMunicipio(Integer año)
    {
        String nombreFichero = "PoblacionMunicipiosMalaga.csv";
        String path = "src/resources/";
        
        ArrayList<Municipio> municipios = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path+nombreFichero)))
        {
            String linea = br.readLine();

            while(linea!=null)
            {
                try
                {
                    String[] trozosLinea = linea.split(";");

                    if(!trozosLinea[0].equals("29 Málaga") && trozosLinea[1].equals("Total"))
                    {
                        String[] cpCiudad = trozosLinea[0].split(" ", 2);

                        if(año == null)
                        {
                            municipios.add(new Municipio(cpCiudad[0], cpCiudad[1], trozosLinea[2], Integer.valueOf(trozosLinea[3].replace(".", ""))));
                        }
                        else 
                        {
                            if(trozosLinea[2].equals(año.toString()))
                            {
                                municipios.add(new Municipio(cpCiudad[0], cpCiudad[1], trozosLinea[2], Integer.valueOf(trozosLinea[3].replace(".", ""))));
                            }
                        }
                    }
                } 
                catch (Exception ex) 
                {
                    // System.out.println("Dato no encontrado");
                    // System.out.println(ex.getMessage());
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

        return municipios;
    }


    public static Municipio buscarMunicipio(ArrayList<Municipio> coleccionMunicipios, String nombre, Integer año)
    {
        Municipio buscado = null;
        Municipio claveBuscada = new Municipio("", nombre, año.toString(), 0);

        Collections.sort(coleccionMunicipios);
        int posicionBuscada = Collections.binarySearch(coleccionMunicipios, claveBuscada);

        if(posicionBuscada>=0)
        {
            buscado = coleccionMunicipios.get(posicionBuscada);
        }
        else 
        {
            System.out.println("Municipio no encontrado");
        }
        return buscado;
    }


    public static HashMap<String, Integer> incrementoPoblacion(ArrayList<Municipio> coleccionMunicipios, int año1, int año2)
    {
        HashMap<String, Integer> resultado = new HashMap<>();
        int incremento = 0;
        int poblacionAño1 = 0;
        int poblacionAño2 = 0;

        for (Municipio pueblo : coleccionMunicipios) 
        {
            if(Integer.valueOf(pueblo.getAño()) == año1)
            {
                poblacionAño1 = pueblo.getPoblacion();

                for (Municipio puebloBuscado : coleccionMunicipios) 
                {
                    if(pueblo.getNombre().equals(puebloBuscado.getNombre()) && Integer.valueOf(puebloBuscado.getAño()) == año2)
                    {
                        poblacionAño2 = puebloBuscado.getPoblacion();

                        incremento = poblacionAño2 - poblacionAño1;

                        resultado.put(pueblo.getNombre(), incremento);
                    }
                }
            }
        }
        return resultado;
    }
}
