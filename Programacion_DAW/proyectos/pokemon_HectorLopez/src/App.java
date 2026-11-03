import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.Evolution;
import models.Pokedex;
import models.Pokemon;
import utils.JsonUtils;

public class App {

    public static void main(String[] args) throws Exception {
        


        // ANTES DE EMPEZAR A ESCRIBIR EN EL FICHERO TENGO QUE VER SI EXISTE Y BORRARLO PARA NO REPETIR LAS SALIDAS GUARDADAS:
        JsonUtils.deleteFile("src/resources/consultasPokemon.txt");


        // Extraigo la Pokedex del json:
        Pokedex pokedex = JsonUtils.readPokemonListFromJson("src/resources/pokemon.json");


        // Los 5 ultimos Pokemons según el listado:
        List<Pokemon> cincoUltimos = pokedex.getTheXFromEnd(5);
        String output1 = "\nLOS ÚLTIMOS 5 POKEMONS SEGÚN EL LISTADO:\n" + cincoUltimos.toString() + "\n";
        JsonUtils.writeIntoTextFile(output1);


        // Datos de Pikachu:
        Pokemon buscado = pokedex.findPokemonByName("Pikachu");
        String output2 = "\nRESULTADOS DE LA BÚSQUEDA POR \"Pikachu\":\n" + buscado.toString() + "\n";
        JsonUtils.writeIntoTextFile(output2);


        // Evolución de Charmander:
        Evolution[] searchedEvolution = pokedex.findEvolutionByName("Charmander");
        String output3 = "\nEVOLUCIÓN DE \"Charmander\":\n" + Arrays.toString(searchedEvolution) + "\n";
        JsonUtils.writeIntoTextFile(output3);


        // Pokemons de tipo fire:
        ArrayList<String> tipoBuscado = new ArrayList<>();
        tipoBuscado.add("Fire");
        ArrayList<Pokemon> tipoFire = pokedex.findPokemonsByType(tipoBuscado);
        String output4 = "\nPOKEMONS DE TIPO \"Fire\":\n" + tipoFire.toString() + "\n";
        JsonUtils.writeIntoTextFile(output4);


        // Pokemons con debilidad water o electric:
        ArrayList<String> weakBuscado = new ArrayList<>();
        weakBuscado.add("Water");
        weakBuscado.add("Electric");
        ArrayList<Pokemon> weakWaterOrElectric = pokedex.findPokemonsByWeeknesses(weakBuscado);
        String output5 = "\nPOKEMONS CON DEBILIDAD \"Water\" ó \"Electric\":\n" + weakWaterOrElectric.toString() + "\n";
        JsonUtils.writeIntoTextFile(output5);


        // Pokemon con mas debilidades:
        Pokemon weakest = pokedex.weakestPokemon();
        String output6 = "\nRESULTADOS DE LA BÚSQUEDA DEL POKEMON CON MÁS DEBILIDADES:\n" + weakest.toString() + "\n";
        JsonUtils.writeIntoTextFile(output6);


        // Pokemon más alto:
        Pokemon highest = pokedex.highestPokemon();
        String output7 = "\nRESULTADOS DE LA BÚSQUEDA DEL POKEMON MÁS ALTO:\n" + highest.toString() + "\n";
        JsonUtils.writeIntoTextFile(output7);
    }
}


