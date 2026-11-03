package equipoDeFutbol_Hector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import equipoDeFutbol_Hector.Jugador.Posicion;

public class Main {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Creamos la Plantilla:
        Map<Integer, Jugador> plantilla = new HashMap<>();

        // Introduce 6 Jugadores:
        Jugador j1 = new Jugador("11111111", "M.REINA", Posicion.valueOf("PORTERO"), 185);
        Jugador j2 = new Jugador("22222222", "YÁÑEZ", Posicion.valueOf("PORTERO"), 190);
        Jugador j3 = new Jugador("33333333", "BUSTINZA M.", Posicion.valueOf("DEFENSA"), 175);
        Jugador j4 = new Jugador("44444444", "JUANDE", Posicion.valueOf("DEFENSA"), 185);
        Jugador j5 = new Jugador("55555555", "RUBEN CASTRO", Posicion.valueOf("DELANTERO"), 169);
        Jugador j6 = new Jugador("66666666", "F.SOL", Posicion.valueOf("DELANTERO"), 182);

        altaJugador(plantilla, 1, j1);
        altaJugador(plantilla, 13, j2);
        altaJugador(plantilla, 4, j3);
        altaJugador(plantilla, 5, j4);
        altaJugador(plantilla, 24, j5);
        altaJugador(plantilla, 9, j6);

        // Muestra toda la plantilla:
        mostrar(plantilla);

        // Muestra solo los porteros:
        System.out.println(" AQÚI NUESTROS PORTEROS: ");
        mostrar(plantilla, Posicion.valueOf("PORTERO"));


        // Edita un delantero y muestra la plantilla:
        boolean editado = editarJugador(plantilla, 9);

        if(!editado)
        {
            System.out.println("No se ha encontrado un jugador con ese dorsal");
        }

        // Introduce un nuevo jugador y muestra plnatilla:
        Jugador yo = new Jugador("77777777", "HECTOR", Posicion.valueOf("CENTROCAMPISTA"), 170);
        altaJugador(plantilla, 88, yo);

        mostrar(plantilla);


        // Elimina 2 defensas y muestra plantilla:
        eliminarJugador(plantilla, 4);


        System.out.println("Eliminados los 2 defensas");
        mostrar(plantilla);

    }

    // METODOS:
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal)
    {
        System.out.println("Introduce los datos del Jugador Fichado:");
        System.out.println("DNI:");
        String dni = sc.nextLine();
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Posicion: (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO)");
        String posicion = sc.nextLine().toUpperCase();
        Posicion posJ = Posicion.valueOf(posicion);

        System.out.println("Estatura (en centímetros):");
        Integer estatura = sc.nextInt();

        // limpio Buffer despues de leer numeros:
        sc.nextLine();

        Jugador nuevo = new Jugador(dni, nombre, posJ, estatura);

        plantilla.put(dorsal, nuevo);
    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador)
    {
        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal)
    {
        // Guardo el Jugador
        Jugador eliminado = plantilla.get(dorsal);

        // Lo elimino de la plantilla:
        plantilla.remove(dorsal);

        // Lo devuelvo:
        return eliminado;
    }

    static void mostrar(Map<Integer, Jugador> plantilla)
    {
        // Saco el array de claves para iterar:
        ArrayList<Integer> dorsales = new ArrayList<>();

        dorsales.addAll(plantilla.keySet());

        System.out.println("\n\n\tPLANTILLA ACTUAL DEL MÁLAGA C.F.\n");
        for (Integer dorsal : dorsales)
        {
            System.out.print("DORSAL " + dorsal + " - " + plantilla.get(dorsal).toString());

        }
    }

    static void mostrar(Map<Integer, Jugador> plantilla, Posicion posicion)
    {
        // Saco el array de claves para iterar:
        ArrayList<Integer> dorsales = new ArrayList<>();

        dorsales.addAll(plantilla.keySet());

        for (Integer dorsal : dorsales)
        {
            // Imprimo solo los que tienen la posicion indicada:
            if(plantilla.get(dorsal).getPosicion().equals(posicion))
            {
                System.out.print("DORSAL " + dorsal + " - " + plantilla.get(dorsal).toString() + "\n");
            }
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal)
    {
        boolean encontrado = false;

        // Si el dorsal aparece empiezo a preguntar:
        if(plantilla.containsKey(dorsal))
        {
            encontrado = true;

            System.out.println("Introduce los nuevos datos del jugador a editar:");
            System.out.println("Nombre:");
            String nombre = sc.nextLine();
            System.out.println("Posicion: (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO)");
            String posicion = sc.nextLine().toUpperCase();
            Posicion posJ = Posicion.valueOf(posicion);
            System.out.println("Estatura (en centímetros):");
            Integer estatura = sc.nextInt();

            plantilla.get(dorsal).setNombre(nombre);
            plantilla.get(dorsal).setPosicion(posJ);
            plantilla.get(dorsal).setEstatura(estatura);
        }
        return encontrado;
    }

}
