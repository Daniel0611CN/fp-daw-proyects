package FUNCIONES;

public class PartidoBaloncesto {
    
    //Variables de los equipos
    final static int E1_ACIERTO_2 = 70;
    final static int E2_ACIERTO_2= 75;

    final static int E1_ACIERTO_3 = 45;
    final static int E2_ACIERTO_3 = 35;
 
    final static int E1_JUEGA_DE_2 = 60;
    final static int E2_JUEGA_DE_2 = 70;
 
    final static int E1_REBOTE_DEF = 60;
    final static int E1_REBOTE_ATA = 30;
 
    final static int E2_REBOTE_DEF = 70;
    final static int E2_REBOTE_ATA = 40;

    static int puntosE1 = 0;
    static int puntosE2 = 0;

    public static void main(String[] args) {

        System.out.println("Empieza la simulación del partido de baloncesto");

        //salto Inicial
        String turno  = salto();
        System.out.println("Ataca el equipo: " + turno);

        //Un partido de baloncesto hay unas 150 posesiones de media.
        for(int posesion = 0; posesion < 150; posesion++)
        {
            int valorAtaque = canasta(turno);
            
            //Si hay canasta entonces el turno es del equipo que estaba defendiendo
            if (valorAtaque>0)
            {
                // Saco el INT puntos fuera del main, y hago el IF dentro de la función actualizarPuntos(String turno, int valorAtaque)
                actualizarPuntos(turno, valorAtaque);

                System.out.println("Canasta de " + turno + " - de " + valorAtaque + " puntos");
                imprimirResultado(puntosE1, puntosE2);
                turno = siguienteTurno(turno);
                System.out.println("Ataca el equipo: " + turno);
            }
            else 
            {
                //no hay canasta, se  produce un rebote
                turno = rebote(turno);
                System.out.println("Rebote del equipo: " + turno);
            }

            //si hay empate doy 40 posesiones mas
            if (posesion== 149 && puntosE1 == puntosE2)
            {
                System.out.println("EMPATE --- Hay Prorroga");
                posesion= 109;
            }
        }
        System.out.println("-------------------------");
        System.out.println("FIN de partido");
        imprimirResultado(puntosE1, puntosE2);
        System.out.println(" **** GANA EL EQUIPO: " + (puntosE1>puntosE2 ? "E1": "E2"));
    }

        //Funciones que necesito programar
        /*
            salto() --> devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
            canasta(turno) --> devuelve el valor de la canasta realizada (0, 2 o 3) 
            actualizarPuntos(turno, valor)  
            canasta(turno, tipoTiro) ---> dado un turno y el tipo de tiro devuelve true si hay canasta y false si no     
            canasta(porcentaje) ---> indica si hay canasta según el porcentaje -- Hay canasta si el aleatorio generado es mayor a 50;
            tipoTiro(turno) --> devuelve el tipo de tiro que va a realizar el equipo que tiene el turno(tiro2 o tiro3)
            tipoTiro(int porcentaje2) -> devuelve el tipo de tiro que se produce según el porcentaje indicado  (se genera un numero entre 0 y 100 y según el valor de X_JUEGA_DE_2 elegir que tipo de tiro hace)
            rebote(String equipoAtaque) ---> devuelve E1 si el rebote lo gana E1 y E2 si el rebote lo gana E2
            rebote(int reboteAtaque, int reboteDefensa) ---> indica true si el rebote es de ataque y false si el rebote es de defensa
                El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo. El que saque más será el ganador del rebote
            aleatorio(maximo)--> devuelve un numero aleatorio entre 0 y maximo
            aleatorio(minimo, maximo) ---> devuelve un número entre mínimo y máximo
            imprimirResultado(int valor1, int valor2) ---> imprime el resultado actual del partido.
        */
    
        /**
         * Devuelve 0,2 o 3 dependiendo si el equipo que ataca consigue canasta o no y según el tipo
         * @param equipoAtaca
         * @return
         */
        static int canasta(String turno)
        {
            int valorAtaque = 0;
            int tipoTiro = tipoTiro(turno); // 2,3
	
            boolean hayCanasta = canasta(turno, tipoTiro); // true-canasta / false-fallo 
            
            if (hayCanasta)
            {	
                valorAtaque = tipoTiro;
            }

            return valorAtaque;
        }

        /**
         * Dado un turno y el tipo de tiro devuelve true si hay canasta y false si no
         * @param turno
         * @param tipoTiro
         * @return
         */
        static boolean canasta(String turno, int tipoTiro) //boolean
        {
            boolean canasta = false;

            if(turno.equals("E1") && tipoTiro==2)
            {	
                canasta = canasta(E1_ACIERTO_2);
            }
            else if (turno.equals("E1") && tipoTiro==3)
            {	
                canasta = canasta(E1_ACIERTO_3);
            }
            else if (turno.equals("E2") && tipoTiro==2)
            {	
                canasta = canasta(E2_ACIERTO_2);
            }
            else if (turno.equals("E2") && tipoTiro==3)
            {	
                canasta = canasta(E2_ACIERTO_3);
            }
            
            return canasta;
        }

        /**
         * Devuelve true si hay canasta y false en caso contrario
         * @param porcentajeAcierto
         * @return
         */
        static boolean canasta(int porcentajeAcierto)
        {
            boolean canasta = false;
            int aleatorio = aleatorio(100);

            // Comparo el aleatorio de 100 con el porcentaje de acierto:
            canasta = (aleatorio < porcentajeAcierto);
            
            return canasta;
        }

        /**
         * Devuelve según de que equipo sea el turno, si este equipo tira de 2 o de 3
         * Llama a la funcion tipoTiro(porcentajeTiro2) para decidir si cada equipo hace un tipo de tiro u otro
         * @param turno
         * @return tipoTiro
         */
        static int tipoTiro(String turno)
        {
            int tipoTiro;

            if(turno.equals("E1"))
            {
                tipoTiro = tipoTiro(E1_ACIERTO_2);
            }
            else 
            {
                tipoTiro = tipoTiro(E2_ACIERTO_2);
            }
            return tipoTiro;
        }

        /**
         * Devuelve 2 si intenta tirar de 2 y 3 si intenta tirar de 3
         * Se genera un numero aleatorio de 0 a 100 y si es mayor al porcentajeTiro2 entonces el tiro es de 3
         * @param porcentajeTiro2
         * @return tiro
         */
        static int tipoTiro(int porcentajeTiro2)
        {
            int tiro = 2;

            int aleatorio = aleatorio(100);

            if(aleatorio>porcentajeTiro2)
            {
                tiro = 3;
            }
            
            System.out.println("    Tira de " + tiro);
            return tiro;
        }

        /**
         * Devuelve el equipo que gana el sato inicial
         * Utiliza la funcion rebote
         * @return
         */
        static String salto()
        {   
            String resultado = "E1";

            int reboteDef_E1 = aleatorio(E1_REBOTE_DEF);
            int reboteDef_E2 = aleatorio(E2_REBOTE_DEF);

            if(reboteDef_E1<=reboteDef_E2)
            {
                resultado = "E2";
            }

            return resultado;
        }

        /**
         * Devuelve un mumero entero aleatorio entre 0 y maximo
         * @param maximo
         * @return
         */
        static int aleatorio(int maximo)
        {
            int aleatorio = (int)(Math.random()*(maximo+1));
            return aleatorio;
        }

        /**
         * Devuelve un numero entero aleatorio entre minimo y maximo
         * @param maximo
         * @param minimo
         * @return
         */
        static int aleatorio(int minimo, int maximo)
        {
            int aleatorio = (int)(Math.random()*(maximo+1-minimo)+minimo);
            return aleatorio;
        }

        /**
         * Devuelve el equipo que consigue obtener el rebote de un tiro.
         * @param equipoAtaca
         * @return
         */
        static String rebote(String equipoAtaca)
        {
            String rebotePara = "E1";

            if (equipoAtaca.equals(rebotePara))
            {
                boolean ganaRebote = rebote(E1_REBOTE_ATA, E2_REBOTE_DEF);

                if(ganaRebote == false)
                {
                    rebotePara = "E2";
                }
            }
            else
            {
                boolean ganaRebote = rebote(E2_REBOTE_ATA, E1_REBOTE_DEF);

                if(ganaRebote == true)
                {
                    rebotePara = "E2";
                }
            }

            return rebotePara;
        }

        /**
         * Devuelve true si el rebote se lo lleva el equipo atacante y false si se lo lleva el equipo defensor
         * El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo. 
         * El que saque más será el ganador del rebote
         * @param porcentajeAtaque
         * @param porcentajeDefensa
         * @return
         */
        static boolean rebote(int porcentajeAtaque, int porcentajeDefensa)
        {
            boolean ganaRebote = true;

            int valorAtaque = aleatorio(porcentajeAtaque);
            int valorDefensa = aleatorio(30, porcentajeDefensa);

            if (valorAtaque < valorDefensa)
            {
                ganaRebote = false;
            }

            return ganaRebote;
        }

        /**
         * Devuelve el equipo contrario al que se le pasa por parametros
         * @param equipo
         * @return
         */
        static String siguienteTurno(String equipo)
        {
            String resultado = "E1";
            
            if(equipo.equals(resultado))
            {
                resultado = "E2";
            }
            return resultado;
        }

        /**
         * Suma el valor de la canasta al marcador del equipo según el turno
         * @param turno
         * @param valor
         */
        static void actualizarPuntos(String turno, int valor)
        {
            if(turno.equals("E1"))
            {
                puntosE1 = puntosE1 + valor;
            }
            else 
            {
                puntosE2 = puntosE2 + valor;
            }
        }

        /**
         * Imprime los puntos de cada equipo
         * @param puntosE1
         * @param puntosE2
         */
        static void imprimirResultado(int puntosE1, int puntosE2)
        {
            System.out.println("E1: " + puntosE1 + " - E2: " + puntosE2);
        }
}
