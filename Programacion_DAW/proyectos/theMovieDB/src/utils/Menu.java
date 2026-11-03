package utils;

import java.util.ArrayList;

import models.Actor;
import models.ListaActores;
import models.ListaPeliculas;
import models.Pelicula;


public class Menu {

    // CONSTANTES DE ESTILO:
    static final String ANSI_CYAN = "\u001B[36m";
    static final String ANSI_CYAN_BG = "\u001B[46m";
    final static String ANSI_RESET = "\u001B[0m";
    
    // SCANNER ESTÁTICO:
    static LecturaTeclado lc = new LecturaTeclado();




    /**
     * Función que contiene el menú principal del programa y hace las llamadas
     * al resto de funciones del menú
     */
    static public void ejecutarMenuPrincipal()
    {
        // VARIABLES:
        boolean salir = false;
        boolean espanol = true;
        int opcion = 0;
        
        mensajeBienvenida();

        // BUCLE MENU
        while (!salir)
        {
            espanol = menuIdiomaEnEspañol();
            imprimirMenuBusqueda();
            opcion = lc.leerInteger();
    
            switch (opcion)
            {
                case 1:
                    System.out.println("Introduce el título de la película...");
                    String tituloBuscado = lc.leerCadena();
                    ListaPeliculas resultado = usoApi.leerPeliculasFromTMDB(tituloBuscado, espanol);
                    
                    ArrayList resul = resultado.getListaPeliculas();
                    imprimeListaResultados(resul);

                    submenuInformacionDetallada(resul);
                    break;
    
                case 2:
                    System.out.println("Introduce el nombre por el que quieres buscar...");
                    String nombreBuscado = lc.leerCadena();
                    ListaActores resultado2 = usoApi.leerActoresFromTMDB(nombreBuscado, espanol);
                    
                    ArrayList result = resultado2.getListaActores();
                    imprimeListaResultados(result);

                    submenuInformacionDetallada(result);
                    break;
    
                case 3:
                    salir = true;
                    System.out.println("Hasta pronto");
                    break;
                
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }




    /**
     * Función que muestra el menú que permite elegir una posición del array
     * mostrado para acceder a ese objeto y mostrar su información completa
     * @param array
     */
    private static void submenuInformacionDetallada(ArrayList array)
    {
        // VARIABLES:
        boolean salir = false;

        // BUCLE MENU
        while (!salir)
        {
            if(array.isEmpty()) // compruebo que no se ha pasado un array vacío para inciar el sub-menú
            {
                salir=true;
            }
            else 
            {
                System.out.println("\nIntroduce un número para ver la información completa ó pulsa 0 para volver al menú principal");
                Integer numero = lc.leerInteger();
        
                if(numero > 0 && numero <= array.size())
                {
                    var t = array.get(numero-1);
        
                    muestraPelicula_o_Actor(t, true);
                    salir=true;
                }
                else if(numero == 0)
                {
                    salir=true;
                }
                else 
                {
                    System.out.println("El valor introducido no corresponde con niguna opción mostrada");
                }
            }
        }
    }



    /**
     * Función a la que se la pasa un arraylist (raw) e imprime sus 10 primeras 
     * posiciones ó las que tenga si el tamaño es menor
     * @param result
     */
    private static void imprimeListaResultados(ArrayList result)
    {
        if(result.size() < 1)
        {
            System.out.println("No se han obtenido resultados para esta búsqueda");
        }
        else if(result.size() > 10)
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.print((i+1) + " -> "); 
                
                var t = result.get(i);
                
                muestraPelicula_o_Actor(t, false);
            }
        }
        else 
        {
            for (var t : result) 
            {
                System.out.print(result.indexOf(t)+1 + " -> ");
                
                muestraPelicula_o_Actor(t, false);
            }
        }
    }
    
    

    /**
     * Función a la que se le pasa un objeto y comprueba si es de clase pelicula o Actor,
     * lo castea e imprime sólo su nombre si se le pasa false como parámetro, o toda
     * su información completa en caso de pasarle true.
     * @param t
     * @param completo
     */
    private static void muestraPelicula_o_Actor(Object t, boolean completo)
    {
        if (t instanceof Pelicula)
        {
            Pelicula peli = (Pelicula)t;
            
            if(completo)
            {
                System.out.println(peli);
            }
            else 
            {
                System.out.println(peli.getTitulo());
            }
        }
        else 
        {
            Actor actor = (Actor)t;
            
            if(completo)
            {
                System.out.println(actor);
            }
            else 
            {
                System.out.println(actor.getNombre());
            }
        }
    }
    
    
    
    /**
     * Función que imprime el menú de búsqueda de película o director
     */
    private static void imprimirMenuBusqueda()
    {
        System.out.println("Elige la opción que quieres realizar:");
        System.out.println("\t1 -> Buscar Película");
        System.out.println("\t2 -> Buscar Actor/director");
        System.out.println("\t3 -> para SALIR");
    }
    


    /**
     * Función que pregunta por el idioma y devuelve true si se hará la consula
     * en español o false si se hace en inglés
     * @return espanol
     */
    private static boolean menuIdiomaEnEspañol()
    {
        // VARIABLES:
        boolean salir = false;
        boolean espanol = true;
        
        // BUCLE MENU
        while (!salir)
        {
            System.out.println("\n\t\t\t"+ANSI_CYAN_BG + "THE MOVIE DATA BASE" + ANSI_RESET+"\n");

            System.out.print("\nPulsa 1 para obtener los resultados de la búsqueda en Español ó 2 para Inglés: ");
            int idioma = lc.leerInteger();

            if(idioma == 1)
            {
                salir=true;
            }
            else if(idioma == 2)
            {
                espanol = false;
                salir=true;
            }
            else 
            {
                System.out.println("El valor introducido no corresponde con niguna opción de idioma");
            }
        }
        return espanol;
    }



    /**
     * Función que muestra el mesaje de bienvenida al programa
     */
    private static void mensajeBienvenida()
    {
        System.out.println(ANSI_CYAN+
        "    888888b.   d8b                                              d8b      888                         \n"+   
        "    888  `88b  Y8P                                              Y8P      888                         \n"+   
        "    888  .88P                                                            888                         \n"+   
        "    8888888K.  888  .d88b.  88888b.  888  888  .d88b.  88888b.  888  .d88888  .d88b.       8888b.    \n"+   
        "    888  `Y88b 888 d8P  Y8b 888 `88b 888  888 d8P  Y8b 888 `88b 888 d88´ 888 d88´`88b         ´88b   \n"+  
        "    888    888 888 88888888 888  888 Y88  88P 88888888 888  888 888 888  888 888  888     .d888888   \n"+  
        "    888   d88P 888 Y8b.     888  888  Y8bd8P  Y8b.     888  888 888 Y88b 888 Y88..88P     888  888   \n"+  
        "    8888888P´  888  `Y8888  888  888   Y88P    `Y8888  888  888 888  `Y88888  `Y88P´      `Y888888\n\n\n"+  

        "88888888888 888                   888b     d888                   d8b              8888888b.  888     \n"+ 
        "    888     888                   8888b   d8888                   Y8P              888  `Y88b 888     \n"+ 
        "    888     888                   88888b.d88888                                    888    888 888     \n"+
        "    888     88888b.   .d88b.      888Y88888P888  .d88b.  888  888 888  .d88b.      888    888 88888b. \n"+
        "    888     888 `88b d8P  Y8b     888 Y888P 888 d88´`88b 888  888 888 d8P  Y8b     888    888 888 `88b\n"+
        "    888     888  888 88888888     888  Y8P  888 888  888 Y88  88P 888 88888888     888    888 888  888\n"+
        "    888     888  888 Y8b.         888   Y   888 Y88..88P  Y8bd8P  888 Y8b.         888  .d88P 888 d88P\n"+
        "    888     888  888  `Y8888      888       888  `Y88P´    Y88P   888  `Y8888      8888888P´  88888P´ \n"+
        ANSI_RESET);

        System.out.println("\n\n¡La base de datos de películas y personajes del mundo del cine más grande del mundo!");
        System.out.println("\nAquí podrás encontrar toda la información que buscas, puedes buscar por título en español,\n" + 
        "título original, o por el nombre de tu actor/actriz o director/directora favorito");
        System.out.println("\n\t\t\t¡¡ADELANTE!!");
    }
    
}
