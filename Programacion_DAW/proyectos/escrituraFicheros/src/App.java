import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import logCutre.Log;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Escritura!");


        String nombreFichero = "fichero1.ppp";
        String path = "src/recursos/";
        
        FileWriter fileWriter = null;
        BufferedWriter bWriter = null;
        Scanner sc = null;
        
        try
        {
            fileWriter = new FileWriter(path+nombreFichero, false);
            bWriter = new BufferedWriter(fileWriter);
            sc = new Scanner(System.in);
            

            boolean fin = false;
            do
            {
                System.out.println("Escribe una linea:");
                String linea = sc.nextLine();

                if(!linea.equals("fin"))
                {
                    Log.nuevaEntradaALog("Se ha escrito: "+linea, Log.Tipo.INFORMACION);
                    bWriter.append(linea);
                    bWriter.newLine();
                }
                else 
                {
                    fin = true;
                }

            }while(!fin);

        } 
        catch (Exception e) 
        {
            System.out.println("Algo ha fallado");
            Log.nuevaEntradaALog(e.toString(), Log.Tipo.ERROR);
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

                sc.close();

            } 
            catch (Exception e) 
            {

            }
        }
    }
}
