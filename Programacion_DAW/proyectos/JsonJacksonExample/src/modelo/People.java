package modelo;

import java.util.ArrayList;

public class People {
    

    // ATRIBUTOS:
    private ArrayList<Person> people; 


    // CONSTRUCTOR:
    public People()
    {

    }

    
    // METODOS:
    @Override
    public String toString() {
        return "People [people=" + people + "]";
    }


    // GETTERS Y SETTERS:
    public ArrayList<Person> getPeople() {
        return people;
    }


    public void setPeople(ArrayList<Person> listaPersonas) {
        this.people = listaPersonas;
    }

    // METODO:
    public People sacaSoloPersonasDe24()
    {
        ArrayList<Person> personasCon24 = new ArrayList<>();

        for (Person persona : people)
        {
            if(persona.getAge() == 24)
            {
                personasCon24.add(persona);
            }    
        }
        
        People gente24 = new People();
        gente24.setPeople(personasCon24);
        return gente24;
    }
}
