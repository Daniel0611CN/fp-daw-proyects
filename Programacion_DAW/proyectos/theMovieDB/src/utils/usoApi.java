package utils;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.ListaActores;
import models.ListaPeliculas;

public class usoApi {
    
        // Clave de la API Key:
        // 6fde46fa6eaf4001e82d718976f8f6b5

        // Token de acceso de lectura a la API:
        // eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI2ZmRlNDZmYTZlYWY0MDAxZTgyZDcxODk3NmY4ZjZiNSIsInN1YiI6IjY0NzljYWZhY2FlZjJkMDBmY2U0ZWQwZCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.-Ctm41wwORvbc1nY4it_ZJ5Jk22-tvWsi1JtneXJYzk
        
        // Ejemplo busqueda por nombre:
        // INGLES  https://api.themoviedb.org/3/search/movie?api_key=6fde46fa6eaf4001e82d718976f8f6b5&include_adult=false&language=en-US&page=1&query=torrente
        // ESPAÑOL  https://api.themoviedb.org/3/search/movie?api_key=6fde46fa6eaf4001e82d718976f8f6b5&include_adult=false&language=es-ES&page=1&query=torrente
        
        // Ejemplo busqueda por actor:
        // INGLES  https://api.themoviedb.org/3/search/person?api_key=6fde46fa6eaf4001e82d718976f8f6b5&query=pitt&include_adult=false&language=en-US&page=1
        // ESPAÑOL  https://api.themoviedb.org/3/search/person?api_key=6fde46fa6eaf4001e82d718976f8f6b5&query=pitt&include_adult=false&language=es-ES&page=1


        // buscaPeli + IDIOMA + patronBusquedaPeli + consulta
        final static String buscaPeli = "https://api.themoviedb.org/3/search/movie?api_key=6fde46fa6eaf4001e82d718976f8f6b5&include_adult=false";
        final static String patronBusquedaPeli = "&page=1&query=";
        final static String ingles = "&language=en-US";
        final static String espanol = "&language=es-ES";
        // buscaActor + consulta + patron1Actor + IDIOMA + patron2Actor
        final static String buscaActor = "https://api.themoviedb.org/3/search/person?api_key=6fde46fa6eaf4001e82d718976f8f6b5&query=";
        final static String patron1Actor = "&include_adult=false";
        final static String patron2Actor = "&page=1";

        /**
         * Función que recibe una cadena y construye la url necesaria para hacer la consula a la Api
         * y devuelve un objeto de la clase ListaActores con el resultado obtenido
         * @param consulta
         * @param espanol
         * @return
         */
        public static ListaActores leerActoresFromTMDB(String consulta, boolean espanol)
        {
            ListaActores actores = new ListaActores();
    
            try {
                
                URL url = new URL(buscaActor + consulta + patron1Actor + idioma(espanol) + patron2Actor);
    
                URLConnection connection = url.openConnection();
    
                InputStream stream =  new BufferedInputStream(connection.getInputStream());
    
                ObjectMapper mapper = new ObjectMapper();
    
                actores = mapper.readValue(stream, ListaActores.class);
    
            } catch (Exception e) {
                System.out.println("Error al leer actores y/o directores desde TMDB");
            }
    
            return actores;
        }


        /**
         * Función que recibe una cadena y construye la url necesaria para hacer la consula a la Api
         * y devuelve un objeto de la clase ListaPeliculas con el resultado obtenido
         * @param consulta
         * @param espanol
         * @return
         */
        public static ListaPeliculas leerPeliculasFromTMDB(String consulta, boolean espanol)
        {
            ListaPeliculas peliculas = new ListaPeliculas();
    
            try {
                
                URL url = new URL(buscaPeli + idioma(espanol) + patronBusquedaPeli + consulta);
    
                URLConnection connection = url.openConnection();
    
                InputStream stream =  new BufferedInputStream(connection.getInputStream());
    
                ObjectMapper mapper = new ObjectMapper();
    
                peliculas = mapper.readValue(stream, ListaPeliculas.class);
    
            } catch (Exception e) {
                System.out.println("Error al leer peliculas desde TMDB");
            }
    
            return peliculas;
        }


        /**
         * Función que según el booleano del idioma devuelve el string de busqueda en español
         * para true, y el de busqueda en inglés para false
         * @param buscarEnEspanol
         * @return idioma
         */
        private static String idioma(boolean buscarEnEspanol)
        {
            String idioma = "";

            if(buscarEnEspanol)
            {
                idioma = espanol;
            }
            else 
            {
                idioma = ingles;
            }

            return idioma;
        }


}
