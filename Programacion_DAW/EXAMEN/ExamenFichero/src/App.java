import clases.Ferreteria;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Ferreteria!");


        Ferreteria ferreteria = new Ferreteria();

        // System.out.println(ferreteria.getClientes());


        // System.out.println(ferreteria.getProductos());
        // System.out.println("-----------------------------------------------");
        // System.out.println(ferreteria.getVentas());

        ferreteria.facturacionClientes();

        
    }
}
