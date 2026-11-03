package COLECCIONES;

import INTERFACES.jugadoresFutbol.Jugador;

public class UsoContenedor {
    
    public static void main(String[] args) {
        
        Jugador[] listaJugadores = new Jugador[0];

        Contenedor<Jugador> equipo = new Contenedor<Jugador>(listaJugadores);


        Jugador j1 = new Jugador("ROKO", "Pitbull");
        Jugador j2 = new Jugador("SULTAN", "Toro");
        Jugador j3 = new Jugador("TITAN", "Leon");
        Jugador j4 = new Jugador("BILBO", "Rocket");

        equipo.insertarAlFinal(j1);
        equipo.insertarAlFinal(j2);
        System.out.println(equipo.toString());

        equipo.insertarAlPrincipio(j3);
        equipo.insertarAlPrincipio(j4);
        System.out.println(equipo.toString());

        equipo.ordenar();
        System.out.println(equipo.toString());

        Jugador j10 = equipo.extraerDelFinal();
        System.out.println(j10.toString());

        Jugador j20 = equipo.extraerDelPrincipio();
        System.out.println(j20.toString());

    }
}
