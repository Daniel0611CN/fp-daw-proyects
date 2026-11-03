package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListaActores {
 
    // ATRIBUTOS:
    @JsonProperty("results")
    private ArrayList<Actor> listaActores;


    // METODOS:
    @Override
    public String toString() {
        return listaActores.toString();
    }

    
    // GETTERS & SETTERS:
    public ArrayList<Actor> getListaActores() {
        return listaActores;
    }

    public void setListaActores(ArrayList<Actor> listaActores) {
        this.listaActores = listaActores;
    }

}
