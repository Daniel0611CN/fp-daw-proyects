import models.Ferreteria;
import utils.ManejoFicheros;

public class App {
    public static void main(String[] args) throws Exception {

        Ferreteria nuevaFerreteria = new Ferreteria();
        
        
        // Muestro salida de la lectura:
        System.out.println(nuevaFerreteria.getClientes());
        System.out.println(nuevaFerreteria.getProductos());
        System.out.println(nuevaFerreteria.getVentas());


        // ANTES DE EMPEZAR A ESCRIBIR EN EL FICHERO DE SALIDA TENGO QUE VER SI EXISTE 
        // Y BORRARLO PARA NO REPETIR LAS SALIDAS GUARDADAS:
        String nombreFichero = "FacturacionClientes.txt";
        ManejoFicheros.borraFichero("src/resources/" + nombreFichero);
        String salida1 = nuevaFerreteria.facturacionPorCliente();
        ManejoFicheros.escribeEnFichero(nombreFichero, salida1);


        String nombreFichero2 = "ProductosVendidos.txt";
        ManejoFicheros.borraFichero("src/resources/" + nombreFichero2);
        String salida2 = nuevaFerreteria.productosVendidos();
        ManejoFicheros.escribeEnFichero(nombreFichero2, salida2);


        String nombreFichero3 = "FacturacionTotal.txt";
        ManejoFicheros.borraFichero("src/resources/" + nombreFichero3);
        double facturacion = nuevaFerreteria.facturacionTotal();
        String salida3 = "Total de facturación: " + facturacion + "€";
        ManejoFicheros.escribeEnFichero(nombreFichero3, salida3);

    }
}
