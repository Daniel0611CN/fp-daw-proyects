package INTERFACES.jugadoresFutbol;

import java.util.Arrays;

import INTERFACES.jugadoresFutbol.Comparator.JugadorComparatorFaltas;
import INTERFACES.jugadoresFutbol.Comparator.JugadorComparatorGoles;

/*
 *  JUGADORESSPAIN:  // LA EXPLICACIÓN //
 * 
 * Vamos a ver un partido entre dos equipos. Se generan 5 jugadores de forma aleatoria para cada equipo.
 * 
 * REGLAS DEL JUEGO:
 * 
 * Se saca desde el centro del campo (que tiene 5 partes, una por cada posición del array jugadores) 
 * y siempre que haya gol o falta se vuelve a sacar desde el centro. Cada vez que se reanuda el partido 
 * desde el centro se intercambian las posiciones de los jugadores de forma aleatoria, para que todos puedan meter goles.
 * 
 * El programa nos irá informando de que en posición se encuentra el juego constantemente, y la forma de avanzar
 * se debe a un enfrentamiento aleatorio entre dos jugadores de equipos contrarios en la misma posición (un defensa 
 * de un equipo con un delantero del contrario), si la diferencia entre la capacidad de juego (aleatoria) de 
 * ambos jugadores es mayor a 40, entonces se produce una falta.
 * 
 * En el caso en que el la pelota llega a la primera o ultima posición (porterías) si se gana el choque de jugadores
 * hacia fuera del array se produce un gol y se vuelve a reanudar el partido desde el centro.
 * 
 * El partido se ha limitado a 50 jugadas o regates, una vez finalizado se muestra el resultado y las estadísticas
 * de los jugadores, clasificándolos de las diferentes formas solicitadas.
*/

public class JugadoresSpain {
    
    // FINALS:
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_GREEN_BG = "\u001B[42m";
    private static final String ANSI_CYAN_BG = "\u001B[46m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {


        // Declaramos los equipos:
        Equipo malaga = new Equipo(ANSI_CYAN_BG + "Málaga Club de Futbol Sala" + ANSI_RESET);
        Equipo betis = new Equipo(ANSI_GREEN_BG + "Real Betis Balompie Sala" + ANSI_RESET);


        /*** VAMOS A CONVOCAR A 5 JUGADORES DE CADA EQUIPO PARA EL PARTIDO: ***/

        // Los convocamos usando el método que los crea, comprueba si están, y los añade al array:
        malaga.convocaJugador(5);

        // Convocamos 5 jugadores para el equipo contrario
        betis.convocaJugador(5);

        // Mostramos la plantilla de ambos equipos:
        System.out.println(ANSI_YELLOW + "¡¡AQUÍ TENEMOS LA ALINEACION DE AMBOS EQUIPO PARA EL PARTIDO DE HOY!!" + ANSI_RESET);
        System.out.println(malaga);
        System.out.println("----------------------------------------------------");
        System.out.println(betis);


        /******** ENFRENTAMOS A LOS EQUIPOS PARA GENERAR GOLES Y FALTAS: ********/

        System.out.println(bienvenida());

        // PARTIDO:
        int posicionPelota = sacaDesdeElCentroDelCampo(malaga, betis); // Empieza el partido en el centro del campo.
        int jugadas = 0;

        // Enfrentamiento jugadores:
        while (jugadas<= 50) // Voy a dar 50 regates por partido para no hacerlo muy largo
        {
            // genero mi valor de enfrentamiento según la posición en la que está pelota
            int enfrentamiento = choque(malaga.getJugadores()[posicionPelota], betis.getJugadores()[posicionPelota]);

            if (enfrentamiento >= 0 && enfrentamiento < 40) // gana el regate el equipo local (y no hay falta)
            {
                if(posicionPelota == 4) // Si estamos en la portería visitante hacemos gol y sacamos del centro otra vez
                {
                    malaga.getJugadores()[4].hacerGol();
                    malaga.actualizaGoles();
                    posicionPelota = sacaDesdeElCentroDelCampo(malaga, betis);
                    muestraMarcador(malaga, betis);
                }
                else 
                {
                    posicionPelota++;
                    System.out.println(pelota(posicionPelota));
                }

            }
            else if (enfrentamiento < 0 && enfrentamiento > -40) // gana el regate el equipo visitante (y no hay falta)
            {

                if(posicionPelota == 0) // Si estamos en la portería local
                {
                    betis.getJugadores()[0].hacerGol();
                    betis.actualizaGoles();
                    posicionPelota = sacaDesdeElCentroDelCampo(malaga, betis);
                    muestraMarcador(malaga, betis);
                }
                else 
                {
                    posicionPelota--;
                    System.out.println(pelota(posicionPelota));
                }

            }
            else if (enfrentamiento >= 40 || enfrentamiento <= -40) // HAY FALTA
            {
                System.out.println("¡¡ARBITRO!!");

                if (enfrentamiento > 0) // falta del equipo local
                {
                    malaga.getJugadores()[posicionPelota].cometerFalta();
                    malaga.actualizaFaltas();
                }
                else // falta del equipo visitante
                {
                    betis.getJugadores()[posicionPelota].cometerFalta();
                    betis.actualizaFaltas();
                }
                posicionPelota = sacaDesdeElCentroDelCampo(malaga, betis); // las faltas se sacan desde el centro del campo
            }
            jugadas++;
        }

        System.out.println(ANSI_YELLOW + "\n\t¡¡¡ FIN DEL PARTIDO !!!\n¡EL ARBITRO PITA EL FINAL Y ESTO SE ACABA SEÑORES!" + ANSI_RESET);
        muestraMarcador(malaga, betis);

        System.out.println(ANSI_YELLOW + "\nPASAMOS CON LAS ESTADÍSTICAS DE LOS JUGADORES" + ANSI_RESET);


        /******** MOSTRAR JUGADORES ORDENADOS POR NUMERO DE LICENCIA: ********/
        System.out.println(ANSI_RED + "\n - - - - - Jugadores ordenados por licencia: - - - - - \n" + ANSI_RESET);

        Arrays.sort(malaga.getJugadores());
        System.out.println(malaga);

        Arrays.sort(betis.getJugadores());
        System.out.println(betis);


        /******** MOSTRAR JUGADORES ORDENADOS POR NUMERO DE GOLES: ********/
        System.out.println(ANSI_RED + "\n - - - - - Jugadores ordenados por goles: - - - - - \n" + ANSI_RESET);

        JugadorComparatorGoles comparatorGoles = new JugadorComparatorGoles();

        Arrays.sort(malaga.getJugadores(), comparatorGoles);
        System.out.println(malaga);

        Arrays.sort(betis.getJugadores(), comparatorGoles);
        System.out.println(betis);


        /******** MOSTRAR JUGADORES ORDENADOS POR NUMERO DE FALTAS:  ( CON LAMBDA )  ********/
        System.out.println(ANSI_RED + "\n - - - - - Jugadores ordenados por faltas: - - - - - \n" + ANSI_RESET);

        JugadorComparatorFaltas comparatorFaltas = new JugadorComparatorFaltas();

        Arrays.sort(malaga.getJugadores(), comparatorFaltas);
        System.out.println(malaga);

        Arrays.sort(betis.getJugadores(), comparatorFaltas);
        System.out.println(betis);

        // Arrays.sort(jugadoresSpain, (j1,j2)->j1.getGoles()-j2.getGoles());
    }


    /***************  METODOS: ***************/

    /**
     * Devuelve el mensaje de presentación del partido de futbol
     * @return mensajeBienvenida
     */
    public static String bienvenida()
    {
        return (ANSI_YELLOW + "\nBIENVENIDO AL PARTIDO DE LA TEMPORADA\n" +
        "El Málaga, que hoy juega en casa, necesita afianzar una racha tres victorias consecutivas para salir" +
        "\ndel profundo pozo en el que se encuentra, pero nuestro visitante, el Betis, no está dispuesto" +
        "\n a vender su piel puesto que se se acerca a los grandes y este curso aspiran a lo máximo." +
        "\n\t\t¡¡NOS ESPERA UN DUELO DE TITANES!!" + ANSI_RESET + "\n\nEMPIEZA EL PARTIDO:");
    }

    /**
     * Devuelve un String indicando donde se está jugando el partido dependiendo de 
     * la que posición del array en que se esté produciendo el enfrentamiento de jugadores
     * @param posicionPelota
     * @return StringPosicion
     */
    public static String pelota(int posicionPelota)
    {
        String salida = "";

        switch(posicionPelota)
        {
            case 0:
                salida = "¡¡Tiro a puerta de los visitantes!!";
                break;
            case 1:
                salida = "¡¡Estamos en el área local!!";
                break;
            case 2:
                salida = "Se juega la pelota en el medio campo";
                break;
            case 3:
                salida = "¡¡Atacan los locales!!";
                break;
            case 4:
                salida = "¡¡Contra las cuerdas el equipo visitante!!";
                break;
            default:
        }
        return salida;
    }

    /**
     * Me devuelve un entero como resultado del enfrentamiento de dos jugadores, 
     * positivo si gana el primer jugador o jugador local 
     * y negativo si gana el segundo jugador o jugador visitante
     * @param local
     * @param visitante
     * @return resultadoChoque
     */
    public static int choque(Jugador local, Jugador visitante)
    {
        // Parto de la capacidad de regate de cada jugador para generar un aleatorio entre 
        // ese número del jugador y 100 y enfrentarlos, obteniendo la diferencia entre ambos.
        int ataque_J1 = (int)(Math.random()*(100-local.getRegate())) + local.getRegate();
        int ataque_J2 = (int)(Math.random()*(100-visitante.getRegate())) + visitante.getRegate();

        return ataque_J1 - ataque_J2;
    }

    /**
     * Imprime el resultado actual del partido
     */
    public static void muestraMarcador(Equipo e1, Equipo e2)
    {
        System.out.println("\n\n\t MARCADOR \n" + e1.getNombre() + " -\t " + e1.getGoles() + "\n" + e2.getNombre() + " -\t " + e2.getGoles() + "\n\n");
    }

    /**
     * Intercambia de forma aleatoria las posiciones del array 
     * Jugadores para que no sea siempre el mismo el que mete los goles
     * @param equipo
     */
    public static void cambiaPosiciones(Equipo equipo)
    {
        for(int aux=0; aux < equipo.getJugadores().length; aux++)
        {
            // Genero una posión aleatoria de cero a mi última posición
            int posicionAleatoria = (int)(Math.random()*equipo.getJugadores().length);

            // Guardo el Jugador de la posicion AUX y la intercambio por la aleatoria generada cada vez
            Jugador auxiliar = equipo.getJugadores()[aux];
            equipo.getJugadores()[aux] = equipo.getJugadores()[posicionAleatoria];
            equipo.getJugadores()[posicionAleatoria] = auxiliar;
        }
    }

    /**
     * Devuelve la posicion del centro del campo (Array Jugadores) e intercambia de forma aleatoria
     * las posiciones de los jugadores.
     * @param equipo1
     * @param equipo2
     * @return posicionCentral
     */
    public static int sacaDesdeElCentroDelCampo(Equipo e1, Equipo e2)
    {
        // Se cambia la posición de la pelota a la posición central del array Para sacar desde el Centro.
        int posicionCentral = (int)(e1.getJugadores().length/2);

        // Se intercambian las posiciones de los jugadores de cada equipo:
        cambiaPosiciones(e1);
        cambiaPosiciones(e2);

        return posicionCentral;
    }

}
