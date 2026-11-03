import java.util.Scanner;

public class Ejercicio8 { // VACACIONES playa o montaña

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Si tienes dinero siempre puedes ir de vacaciones, 
        // la otra opción es que ya tengas una reserva y el pasaporte en regla
      

        System.out.println("Veamos si puedes ir de vacaciones el próximo año");
        System.out.println("¿Tienes dinero?");
        boolean TienesDinero = sc.nextBoolean();

        System.out.println("¿Tienes reserva?");
        boolean TienesReserva = sc.nextBoolean();

        System.out.println("¿Tienes el pasaporte en regla?");
        boolean TienesPasaporte = sc.nextBoolean();

        // Donde voy:
        // playa = true
        // montaña = false

        System.out.println("¿Tu primer hijo quiere ir a la playa?");
        boolean Hijo1 = sc.nextBoolean();

        System.out.println("¿Tu segundo hijo quiere ir a la playa?");
        boolean Hijo2 = sc.nextBoolean();

        System.out.println("¿Tu tercer hijo quiere is a la playa?");
        boolean Hijo3 = sc.nextBoolean();


        boolean Vacaciones = TienesDinero || (TienesReserva && TienesPasaporte);
        boolean Destino = (Hijo1 && Hijo2 && Hijo3);


        System.out.println("¿PODRÁS IR DE VACACIONES?: " + Vacaciones);
        System.out.println("¿CONSEGUIRÁS IR POR FIN A LA PLAYA?: " + Destino);


        sc.close();
    }
}
