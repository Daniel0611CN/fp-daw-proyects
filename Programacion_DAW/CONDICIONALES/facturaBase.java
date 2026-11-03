package CONDICIONALES;
import java.util.Scanner;


public class facturaBase 
{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final int IVA = 21;
        
        
        System.out.println("Introduce el importe sin IVA de la factura:" );
        float base = entrada.nextFloat();
        float totalFactura = ((base * IVA) / 100) + base;


        
        System.out.println("El importe con IVA es: " + totalFactura);


        entrada.close();
    }

}
