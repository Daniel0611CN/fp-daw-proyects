package models;

public class Evolution {

    // ATRIBUTOS:
    private String num;
    private String name;

    // CONSTRUCTOR:
    public Evolution(){}

    // METHODS:
    @Override
    public String toString(){
        
        return this.num + " -> " + this.name;
    }

    // GETTERS & SETTERS:
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
}
