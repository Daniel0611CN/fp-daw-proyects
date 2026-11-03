package INTERFACES.jugadoresFutbol;

import java.util.Arrays;

public class Equipo{
    

    // ATRIBUTOS:
    private String nombre;
    private Jugador[] jugadores;
    private int goles;
    private int faltas;


    // CONSTRUCTOR:
    public Equipo(String nombre)
    {
        this.nombre = nombre;
        jugadores = new Jugador[0];
    }



    // METODOS:
    
    /**
     * Crea un jugador aleatorio, comprueba si está para insertarlo en el array, 
     * o crea uno nuevo si está repetido hasta que pueda insertarlo
     * @param array
     * @param player
     * @return
     */
    public void convocaJugador()
    {
        Jugador jugadorAl = UtilesJugadores.generaJugadorAleatorio();

        // Mientras no se pueda insertar al jugador genera otro aleatorio y lo inserta:
        while(!this.insertaJugador(jugadorAl))
        {
            jugadorAl = UtilesJugadores.generaJugadorAleatorio();
            
        }

    }

    /**
     * Convoca el número de jugadores que le pasemos a la función, 
     * haciendo todas las comprobaciones de los métodos anteriores
     * @param array
     * @param player
     * @return
     */
    public void convocaJugador(int numeroDeJugadores)
    {
        for (int i = 0; i < numeroDeJugadores; i++)
        {
            this.convocaJugador();
        }
    }


    /**
     * Inserta un Jugador en el array comprobando que no esté ya anteriormente
     * @param array
     * @param player
     * @return insertado
     */
    public boolean insertaJugador(Jugador player)
    {
        boolean insertado = false;

        if(this.jugadores.length == 0)
        {
            Jugador[] nuevo = new Jugador[1];
            nuevo[0] = player;
            this.jugadores = nuevo;
            insertado = true;
        }
        else
        {
            if(!this.compruebaJugador(player)) // llama a la función comprueba jugador
            {
                Jugador[] nuevo = new Jugador[this.jugadores.length+1];
    
                for (int i = 0; i < this.jugadores.length; i++)
                {
                    nuevo[i] = this.jugadores[i];
                }
                nuevo[nuevo.length-1] = player;
    
                this.jugadores = nuevo;
    
                insertado = true;
            }
            else 
            {
                System.out.println("Este jugador ya está convocado");
            }
        }

        return insertado;
    }


    /**
     * Comprueba si el jugador está en el array por su nombre completo,
     * devuelve true si está y false si no lo encuentra
     * @param array
     * @param player
     * @return yaEsta
     */
    public boolean compruebaJugador(Jugador player)
    {
        boolean yaEsta = false;

        for (int i = 0; i < this.jugadores.length; i++)
        {
            if(this.jugadores[i].getNombre().equals(player.getNombre()))
            {
                System.out.print(this.jugadores[i].getNombre() + " - " + player.getNombre());
                yaEsta = true;
            }
        }
        return yaEsta;
    }


    public void ordenar()
    {
        Arrays.sort(jugadores);
    }


    public void actualizaGoles()
    {
        int totalGoles = 0;

        for (int i = 0; i < jugadores.length; i++)
        {
            totalGoles += ((Jugador)jugadores[i]).getGoles();
        }
        
        this.goles = totalGoles;

        System.out.println("Otro tanto para el " + this.getNombre());
    }


    public void actualizaFaltas()
    {
        int totalFaltas = 0;

        for (int i = 0; i < jugadores.length; i++)
        {
            totalFaltas += ((Jugador)jugadores[i]).getFaltas();
        }
        
        this.faltas = totalFaltas;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public int getGoles() {
        return goles;
    }

    public int getFaltas() {
        return faltas;
    }

    @Override
    public String toString()
    {
        return "\n\tEQUIPO: " + this.nombre + "\nJugadores: " + Arrays.toString(jugadores);
    } 

}
