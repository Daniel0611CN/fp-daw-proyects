package models;

import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    
    // ATRIBUTOS:
    private String id;
    private String num;
    private String name;
    private ArrayList<String> type;
    private String height;
    private String weight;
    private ArrayList<String> weaknesses;
    private Evolution[] next_evolution;

    // CONSTRUCTOR:
    public Pokemon(){
    }

    // METHODS:
    @Override
    public String toString(){

        return "\n" + this.name.toUpperCase() + ": \n" + "id: " + this.id + "\n" + "num: " + this.num + "\n" +
                "type: " + this.type + "\n" + "height: " + this.height + " - " + "weight: " + this.weight + "\n" +
                "weaknesses: " + this.weaknesses + "\n" + "\tnext evolution: " + Arrays.toString(this.next_evolution)  + "\n";
    }


    // GETTERS & SETTERS:
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNum() {
        return num;
    }
    
    public void setNum(String num) {
        this.num = num;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }
    
    public String getHeight() {
        return height;
    }
    
    public void setHeight(String height) {
        this.height = height;
    }
    
    public String getWeight() {
        return weight;
    }
    
    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    public Evolution[] getNext_evolution() {
        return next_evolution;
    }
    
    public void setNext_evolution(Evolution[] next_evolution) {
        this.next_evolution = next_evolution;
    }
    
    public ArrayList<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(ArrayList<String> weaknesses) {
        this.weaknesses = weaknesses;
    }
}
