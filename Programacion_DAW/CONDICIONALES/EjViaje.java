package CONDICIONALES;
import java.util.Scanner;

public class EjViaje {
    public static void main(String[] args) {
        
        final float PRECIO_GASOLINA = 1.75f;
        final int DISTANCIA = 550;
        final int CONSUMO = 8; // (litros a los 100km)
        final int BILLETE_AVION = 95;
        final int EQUIPAJE_AVION = 20;
        final int BILLETE_TREN = 80;
        final int DESCUENTO_3_TREN = 10;
        final int DESCUENTO_4_TREN = 25;

        Scanner sc = new Scanner(System.in);

        int suplementoViaje = 0; 
        float descuentoTren = 0;
        float importeViaje = 0;
        float importePersona = 0;
        String desglose = "";
        
        System.out.println("Cuantas personas viajan?");
        int numPersonas = sc.nextInt();
        //Limpio el Buffer:
        sc.nextLine();
        System.out.println("¿Como queréis viajar?");
        String transporte = sc.nextLine().toLowerCase();

        boolean opcionCorrecta = true;

        switch (transporte){
            case "coche": // PRECIO DEL VIAJE EN COCHE:
                float consumoLitros = ((DISTANCIA * CONSUMO)/100);
                importeViaje = PRECIO_GASOLINA * consumoLitros;
                desglose = "\033[0;1m"+"\tKilometros recorridos: "+DISTANCIA+" km \n\tPrecio gasolina: "+PRECIO_GASOLINA+"€/Litro \n\tLitros consumidos: "+consumoLitros+" litros.";
                break;

            case "avion": // PRECIO DEL VIAJE EN AVION:
                System.out.println("¿Lleváis equipaje? (s/n)");
                String equipaje = sc.nextLine().toLowerCase();
                if (equipaje.equals("s")) {
                    suplementoViaje = EQUIPAJE_AVION;
                }
                importeViaje = numPersonas*(BILLETE_AVION+suplementoViaje);
                desglose = "\033[0;1m"+"\tBillete de avión: "+BILLETE_AVION+"€ \n\tSuplemento por equipaje: "+suplementoViaje+"€";
                break;

            case "tren": // PRECIO DEL VIAJE EN TREN:
                if (numPersonas == 3){
                    descuentoTren = DESCUENTO_3_TREN;
                }
                else if (numPersonas == 4){
                    descuentoTren = DESCUENTO_4_TREN;
                }
                float descuentoTotal = (numPersonas*BILLETE_TREN) * ((descuentoTren)/100);
                importeViaje = (numPersonas*BILLETE_TREN) - descuentoTotal;
                desglose = "\033[0;1m"+"\tBillete de tren: "+BILLETE_TREN+"€ \n\tDescuento aplicado: "+descuentoTren+"% \n\tDescuento total del viaje: "+descuentoTotal+"€";
                break;
            default:
                opcionCorrecta = false;
        }

        if (opcionCorrecta) {
            importePersona = importeViaje/numPersonas;
        
            System.out.println("Vais a viajar "+numPersonas+" personas.");
            System.out.println("Viajáis en: "+transporte);
            System.out.println("Precio por persona: "+importePersona+"€");
            System.out.println("El importe total del viaje es de "+importeViaje+"€");
            System.out.println("-----------------------------------------");
            System.out.println("El desglose de tu viaje es: \n" + desglose);   
        }   
        else {
            System.out.println("Opción incorrecta, no se corresponde con ningún medio de transporte.");
        }         

        sc.close();
    }
}
