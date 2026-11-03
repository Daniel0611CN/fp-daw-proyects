package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional23 {
    public static void main(String[] args) {
        
        final int IVA_NORMAL = 21;
        final int IVA_REDUCIDO = 10;
        final int IVA_SUPERRED = 4;

        // VARIABLES:
        double baseImponible = 0;
        double ivaSeleccionado = 0;
        double importeIVA = 0;
        double precioConIva = 0;
        double descuento = 0;
        double importeFinal = 0;

        Scanner sc = new Scanner(System.in);

        // Pido los datos que voy a necesitar:
        System.out.println("Importe de la base imponible");
        baseImponible = sc.nextDouble();

        //Limpio el Buffer:
        sc.nextLine();

        System.out.println("Tipo de IVA aplicado (general, reducido o superreducido)");
        String tipoIVA = sc.nextLine().toLowerCase();

        System.out.println("Introduzca el cod promocional (nopro, mitad, meno5, 5porc)");
        String codigoPromocional = sc.nextLine().toLowerCase();

        // Calculo el IVA seleccionado:
        switch (tipoIVA) {

            case "general":
                ivaSeleccionado = IVA_NORMAL;
                break;
            case "reducido":
                ivaSeleccionado = IVA_REDUCIDO;
                break;
            case "superreducido":
                ivaSeleccionado = IVA_SUPERRED;
                break;
            default:
                ivaSeleccionado = IVA_NORMAL;
        }

        // Calculo el IVA separado:
        importeIVA = baseImponible * (ivaSeleccionado)/100;

        // Calculo el precio con IVA:
        precioConIva = baseImponible + importeIVA;

        //Calculo el descuento que vamos a restar al precio total:
        switch (codigoPromocional){

            case "5porc":
            descuento = precioConIva * 0.05;
            break;
            case "meno5":
            descuento = 5;
            break;
            case "mitad":
            descuento = precioConIva / 2;
            break;
            default:
            descuento = 0;
            break;
        }

        importeFinal = precioConIva - descuento;

        System.out.println("Base imponible: \t" + baseImponible);
        System.out.println("IVA (" + ivaSeleccionado + "%) \t\t" + importeIVA);
        System.out.println("Precio con IVA \t\t" + precioConIva);
        System.out.println("Cód. promo.("+codigoPromocional+"):\t" + (-descuento));
        System.out.println("TOTAL \t\t\t" + importeFinal);
        

        sc.close();
    }
}
