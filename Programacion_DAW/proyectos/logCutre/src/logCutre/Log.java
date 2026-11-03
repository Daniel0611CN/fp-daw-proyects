package logCutre;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {

    private static String nombreFichero = "log.txt";
    
    public enum Tipo {ERROR, INFORMACION};

    public static void nuevaEntradaALog(String mensaje, Tipo tipo)
    {
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("src/"+nombreFichero, true)))
        {
            String horaMensaje = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"));

            String mensajeTotal = horaMensaje + " - " + tipo + " : " + mensaje;

            bf.write(mensajeTotal);
            bf.newLine();
        }
        catch (Exception e)
        {
            System.out.println("ERROR: " + e);
        }
    }
}
