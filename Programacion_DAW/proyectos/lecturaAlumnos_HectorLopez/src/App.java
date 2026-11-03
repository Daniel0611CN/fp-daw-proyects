import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;


public class App {
    public static void main(String[] args) throws Exception {
        
        // EMPIEZA EL PROGRAMA DECLARANDO EL GRUPO DE ALUMNOS Y CARGANDO SUS DATOS LEYENDO DESDE EL FICHERO 
        // QUE NOS ADJUNTAN Y TENEMOS EN SRC/RECURSOS:

        GrupoAlumnos daw1 = new GrupoAlumnos();

        BufferedReader br = null;
        String linea = null;

        try 
        {
            br = new BufferedReader(new FileReader("src/recursos/ficheroAlumnos"));
            linea = br.readLine();
            // Me salto la primera línea:
            linea = br.readLine();

            while(linea!=null)
            {

                try
                {
                    String[] trozosLinea = linea.split(" ");
    
                    // Le hago un trim a cada fragmento:
                    for (int index = 0; index < trozosLinea.length; index++)
                    {
                        trozosLinea[index] = trozosLinea[index].trim();
                    }
    
                    // Para cada línea creo un alumno utilizando cada parte del array de String obtenido
                    // y lo añado al grupo de alumnos
                    daw1.getGrupo().add(new Alumno(trozosLinea[0], Integer.valueOf(trozosLinea[1]), Double.valueOf(trozosLinea[2].replace(",", ".")), Integer.valueOf(trozosLinea[3]), Integer.valueOf(trozosLinea[4]), trozosLinea[5]));
                }
                catch (Exception e)
                {
                    System.out.println("Error en la linea: " + linea);
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }

                // actualizo variables:
                linea = br.readLine();
            }
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        finally 
        {
            try
            {                
                if(br!=null)
                {
                    br.close();
                }
            }
            catch (Exception e)
            {
                
            }
        }

        // MUESTRO MI CLASE GRUPO DE ALUMNOS CON SU COLECCIÓN RELLENA A PARTIR DEL FICHERO:
        System.out.println("\nLISTADO DE ALUMNOS CREADO:");
        System.out.println(daw1.getGrupo().toString());


        /* PRUEBO LOS MÉTODOS CREADOS: */
        System.out.println("\n - - - - - - PRUEBA DE MÉTODOS - - - - - - ");
        System.out.println("\nCOLECCIÓN ORDENADA POR EDAD:");

        Collections.sort(daw1.getGrupo());
        System.out.println(daw1.getGrupo());


        double edadMedia = daw1.mediaEdades();
        System.out.println("\nMEDIA DE LAS EDADES: " + edadMedia);


        int numAlumnos = daw1.cantidadAlumnos();
        System.out.println("\nCANTIDAD DE ALUMNOS: " + numAlumnos);


        int numSuspensos = daw1.numeroSuspensos();
        System.out.println("\nCANTIDAD DE SUSPENSOS: " + numSuspensos);


        int numMujeres = daw1.numeroMujeres();
        System.out.println("\nCANTIDAD DE MUJERES: " + numMujeres);


        int suspensas = daw1.numMujeresSuspensas();
        System.out.println("\nCANTIDAD DE SUSPENSAS: " + suspensas);
        
    }
}
