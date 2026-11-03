package models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Evento {
    

    // ATTRIBUTES:
    private String id;
    private String title;
    private String free;
    private Direccion address;
    private String link;

    // CONSTRUCTOR:
    public Evento(){

    }

    public Evento(String id, String title, String free, Direccion address, String link){

        this.id = id;
        this.title = title;
        this.free = free;
        this.address = address;
        this.link = link;
    }


    // METHODS:
    public String toString(){

        String direccion = (address!=null)?address.toString():"no hay info";
        String gratis = (free.equals("1")?"SI":"NO");
        String enlace = (link.length()==0?"sin información":link.toString());

        return "\n\nid: " + id + " - Actividad: " + title + "\ngratis: " + gratis + " - CP: " + direccion + "\nEnlace: " + enlace;
    }


    // GETTERS & SETTERS:
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Direccion getAddress() {
        return address;
    }

    public void setAddress(Direccion address) {
        this.address = address;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

}
