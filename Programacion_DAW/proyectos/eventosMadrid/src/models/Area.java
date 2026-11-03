package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Area {


    // ATTRIBUTES:
    @JsonProperty("postal-code")
    private String post_code;


    // CONSTRUCTOR:
    public Area(){

    }
    public Area(String postal_code){

        this.post_code = postal_code;
    }

    // METHODS:
    public String toString(){

        if(post_code.equals(""))
        {
            return "SIN INFO";
        }
        else
        {
            return post_code;
        }
    }


    // GETTERS & SETTERS:
    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String postal_code) {
        
        this.post_code = postal_code;
    }
   
}