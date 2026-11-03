package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListaPeliculas {


    // ATRIBUTOS:
    @JsonProperty("results")
    private ArrayList<Pelicula> listaPeliculas;


    // METODOS:
    @Override
    public String toString() {
        return listaPeliculas.toString();
    }


    // GETTERS & SETTERS:
    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

}
