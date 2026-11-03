package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Actor {


    // ATRIBUTOS:
    @JsonProperty("name")
    private String nombre;
    @JsonProperty("original_name")
    private String nombre_real;
    @JsonProperty("gender")
    private int genero;
    @JsonProperty("known_for")
    private ArrayList<Pelicula> peliculas;
    
    
    // METODOS:
    @Override
    public String toString() {
        return "Personaje: " + nombre + "\nNombre real: " + nombre_real + "\nGénero: " + genero + "\nPeliculas:\n"
                + peliculas + "\n";
    }


    // GETTERS & SETTERS:
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre_real() {
        return nombre_real;
    }


    public void setNombre_real(String nombre_real) {
        this.nombre_real = nombre_real;
    }


    public int getGenero() {
        return genero;
    }


    public void setGenero(int genero) {
        this.genero = genero;
    }


    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }


    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
}
