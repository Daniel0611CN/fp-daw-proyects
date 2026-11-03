package models;

import java.util.ArrayList;
import java.util.List;


public class Pokedex {
    
    // ATTRIBUTES:
    private ArrayList<Pokemon> pokemon;

    // CONSTRUCTOR:
    public Pokedex(){
        
    }

    // METHODS:
    @Override
    public String toString() {
        return "Pokedex [pokemon=" + pokemon + "]";
    }

    public List<Pokemon> getTheXFromEnd(int cant)
    {
        return this.pokemon.subList(pokemon.size()-(cant), pokemon.size());
    }

    public Pokemon findPokemonByName(String name){

        Pokemon search = null;

        for (Pokemon item : pokemon) {
            
            if(item.getName().equals(name))
            {
                search = item;
            }
        }

        return search;
    }

    public Evolution[] findEvolutionByName(String name){

        Pokemon search = findPokemonByName(name);

        return search.getNext_evolution();
    }

    public ArrayList<Pokemon> findPokemonsByType(ArrayList<String> types){

        ArrayList<Pokemon> list = new ArrayList<>();

        for (Pokemon item : pokemon) {
            
            for (String OneType : types) {
                
                if(item.getType().contains(OneType))
                {
                    list.add(item);
                }
            }
        }

        if(list.size()>0)
        {
            return list;
        }
        else
        {
            return null;
        }
    }

    public ArrayList<Pokemon> findPokemonsByWeeknesses(ArrayList<String> weaknesses){

        ArrayList<Pokemon> list = new ArrayList<>();

        for (Pokemon item : pokemon) {
            
            for (String weak : weaknesses) {
                
                if(item.getWeaknesses().contains(weak))
                {
                    list.add(item);
                }
            }
        }

        if(list.size()>0)
        {
            return list;
        }
        else
        {
            return null;
        }
    }

    public Pokemon weakestPokemon(){

        int count = 0;
        Pokemon search = null;

        for (Pokemon item : pokemon)
        {
            if(item.getWeaknesses().size() > count)
            {
                count=item.getWeaknesses().size();
                search=item;
            }
        }
        return search;
    }

    public Pokemon highestPokemon(){

        double maxHeight = 0;
        Pokemon search = null;

        for (Pokemon item : pokemon)
        {
            double heightPokemon = Double.parseDouble(item.getHeight().replace(" m", ""));

            if(heightPokemon > maxHeight)
            {
                maxHeight=heightPokemon;
                search=item;
            }
        }
        return search;
    }

    // GETTERS & SETTERS: 
    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}
