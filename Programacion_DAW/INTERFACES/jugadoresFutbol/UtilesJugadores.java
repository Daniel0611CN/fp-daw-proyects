package INTERFACES.jugadoresFutbol;

public class UtilesJugadores {
    

    static String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
    static String[] apellidos = {"García", "Fernández", "Martínez", "González", "Pérez", "López", "Ruiz", "Sánchez", "Hernández", "Jiménez"};

    static String[] apodo1 = {"Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero", "Muñeco", "Burro", "Pantera"};
    static String[] apodo2 = {"de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro"};

    
    /**
     * Genera un jugador con nombre, apellido y apodo aleatorios
     * @return JugadorAleatorio
     */
    public static Jugador generaJugadorAleatorio()
    {
        String nombre = nombres[(int)(Math.random()*(nombres.length))];
        String apellido = apellidos[(int)(Math.random()*(apellidos.length))];

        String apodoAl1 = apodo1[(int)(Math.random()*(apodo1.length))];
        String apodoAl2 = apodo2[(int)(Math.random()*(apodo2.length))];

        return new Jugador(nombre+" "+apellido, apodoAl1+" "+apodoAl2);
    }

}
