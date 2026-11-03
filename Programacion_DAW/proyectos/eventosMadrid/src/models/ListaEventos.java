package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListaEventos {
    
    // ATTRIBUTES:
    @JsonProperty("@graph")
    private ArrayList<Evento> graph;

    // CONTRUCTOR:
    public ListaEventos(){
    }

    // METHOD:
    public String toString(){

        return graph.toString();
    }

    // SETTERS & GETTERS:
    public ArrayList<Evento> getGraph() {
        return graph;
    }

    public void setGraph(ArrayList<Evento> graph) {
        this.graph = graph;
    }

}
