package BASICOS;
import java.util.Scanner;

public class Fruteria {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        final float Manzana = 2.35f;
        final float Pera = 1.77f;
        final float Gas = 0.6f;

        // Ingresos por manzanas y peras a un precio de venta fijo x €/kg
        // Sumamos ingresos según kilos de venta
        // restamos gastos de luz (variable) y de gasolina a 0,60€ por Litro
        
        System.out.println("Kilos de manzana:");
        float kgManzana = datos.nextFloat();

        System.out.println("Kilos de pera:");
        float kgPera = datos.nextFloat();

        System.out.println("Gasto de luz:");
        float Luz = datos.nextFloat();


        float TotalIngresos = (kgManzana * Manzana) + (kgPera * Pera);
        float TotalGastos = (Luz + (Gas*kgManzana) + (Gas*kgPera));
        float Beneficio = (TotalIngresos - TotalGastos);


        System.out.println("Total de ingresos: " + TotalIngresos);
        System.out.println("Total de gasto:" + TotalGastos);
        System.out.println("Beneficio: " + Beneficio);
       

        datos.close();
    }

    
}
