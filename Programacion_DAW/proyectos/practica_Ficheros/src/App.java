import models.Ferreteria;

public class App {
    public static void main(String[] args) throws Exception {
        

        Ferreteria nuevaFerreteria = new Ferreteria();

        System.out.println(nuevaFerreteria.getVentas());
        System.out.println(nuevaFerreteria.getProductos());
        System.out.println(nuevaFerreteria.getClientes());

        System.out.println(nuevaFerreteria.facturacionClientes());
        System.out.println(nuevaFerreteria.facturacionTotal());
        System.out.println(nuevaFerreteria.productosVendidos());

        utils.ManejoFicheros.escribeEnFichero("FacturacionClientes", nuevaFerreteria.facturacionClientes());
        utils.ManejoFicheros.escribeEnFichero("ProductosVendidos", nuevaFerreteria.productosVendidos());
        utils.ManejoFicheros.escribeEnFichero("FacturacionTotal", nuevaFerreteria.facturacionTotal());

    }

}
