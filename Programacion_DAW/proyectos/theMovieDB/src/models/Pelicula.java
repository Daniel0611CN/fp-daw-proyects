package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pelicula {


    // ATRIBUTOS:
    @JsonProperty("title")
    private String titulo;
    @JsonProperty("original_title")
    private String titulo_original;
    @JsonProperty("overview")
    private String sinopsis;
    @JsonProperty("release_date")
    private String lanzamiento;
    @JsonProperty("vote_average")
    private String puntuacion;
    
    
    // METODOS:
    @Override
    public String toString() {
        return "\tTÍTULO PELÍCULA: " + titulo + "\nTítulo original: " + titulo_original + "\nSinopsis: " + sinopsis
                + "\nLanzamiento: " + lanzamiento + "\nPuntuación: " + puntuacion + "\n";
    }
    
    
    
    // GETTERS & SETTERS:
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo_original() {
        return titulo_original;
    }
    public void setTitulo_original(String titulo_original) {
        this.titulo_original = titulo_original;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public String getLanzamiento() {
        return lanzamiento;
    }
    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
    public String getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }
    
}
