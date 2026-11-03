package utiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import modelos.Producto;

public class utilesTexto {
    

    public static List<Producto> leerFicheroProductos()
    {

        List<Producto> listaProductos = new ArrayList();

        try (FileReader fr = new FileReader("src/recursos/productos.csv");
            BufferedReader br = new BufferedReader(fr)) 
        {
            String linea = br.readLine();
            
            while(linea != null)
            {
   
                String[] trozos = linea.split(";");

                try {

                    //Procesamiento de una linea
                    int codigo = Integer.valueOf(trozos[0]);
                    String nombre = trozos[1];
                    String descrip = trozos[2];
                    Double precio = Double.valueOf(trozos[3]);
                    Double stock = Double.valueOf(trozos[4]);

                    if (stock == 0)
                    {
                        throw new ExcepccionProductoSinStock(codigo, nombre);
                    }
                    else
                    {

                        Producto p = new Producto(codigo, nombre, descrip, precio, stock);
                        listaProductos.add(p);
                    }
                    
                }catch (ExcepccionProductoSinStock ex) {
                    System.out.println(ex.getMessage());
                } 
                catch (Exception e) {
                    System.out.println("Error al leer la linea: " + linea);
                }


                linea = br.readLine();
            }


        } catch (Exception e) {
            System.out.println("ERROR de lectura del fichero de productos");
        }


        return listaProductos;
        
    }
}
