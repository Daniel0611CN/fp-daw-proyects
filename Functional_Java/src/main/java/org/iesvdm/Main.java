package org.iesvdm;

import org.iesvdm.prueba_apuntes_stream.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );

//        String[] words = { "Hello", "World" };
//
//        List<String[]> list = Arrays.stream(words)
//                .map(word -> word.split(""))
//                .distinct()
//                .collect(toList());
//
//        Arrays.stream(words)
//                .map(word -> word.split(""))
//                .map(array -> Arrays.stream(array))
//                //Va a convertir cada elemento del stream de tipo array en un stream. Tendremos streams Stream<String> dentro del stream principal.
//                .distinct()
//                .collect(toList()); // El resultado será List<Stream<String>>
//
//        List<String> uniqueCharacters = Arrays.stream(words)
//                .map(word -> word.split(""))
//                .flatMap(array -> Arrays.stream(array))
//                .distinct()
//                .collect(toList());

        // A partir de una lista de String, creamos un stream de words;
        // Creamos un nuevo Stream de un array de String, ya que recogemos las palabras enç
        // un array;
        // Aplicamos un flatMap, para que te quedases con una única dimensión.,
        // Es decir, pasa de una dimensión Stream<String[]> a Stream<String>;
        // Has prensado o has reducido. Lo has dejado unidimensional;


        // otros métodos;
        // allMatch, anyMatch, noneMatch
        // 1. si todos los elementos cumplen con el predicado
        // 2. si alguno de los elementos cumplen con el predicado;
        // 3. si ninguno de los elementos

//        if(menu.stream()
//                .anyMatch(Dish::isVegetarian)) {  // anyMatch comprueba que algún elemento cumpla con el predicado  devolviendo true en ese caso
//            //Predicado por referencia a metodo Dish::isVegetarian
//            System.out.println("The menu is (somewhat) vegetarian friendly!!");
//        }
//
//        boolean isHealthy = menu.stream()
//                .allMatch(dish -> dish.getCalories() < 1000); //allMatch comprueba que todos los elementos cumplan con el predicado devolviendo true en ese caso
//
//        boolean isHealthyComplejo = menu.stream()
//                .filter(dish -> dish.getCalories() < 1000)
//                .toList()
//                .size() == menu.size();
//
        Optional<Dish> dishOpt = menu.stream()
                .filter(dish1 -> dish1.isVegetarian())
                .findAny();

        menu.stream()
                .filter(dish1 -> dish1.isVegetarian())
                .findAny()
                .ifPresentOrElse(dish -> System.out.println(dish),
                        () -> System.out.println("Plato no encontrado"));

        if (dishOpt.isPresent()) System.out.println(dishOpt.get());
        else System.out.println("Plato no encontrado");

        Optional<Dish> dishOptHiperCal = menu.stream()
                .filter(dish1 -> dish1.getCalories() > 3000)
                .findAny();

        if (dishOptHiperCal.isEmpty()) System.out.println("Plato hipercalorico no encontrado");
        else System.out.println(dishOptHiperCal.get());

//        System.out.println(dishOptHiperCal.orElse(new Dish("NO_ENCONTRADO", false, 0, Dish.Type.OTHER)));
        dishOptHiperCal.ifPresentOrElse(dish -> System.out.println(dish),
                                () -> System.out.println("Plato no encontrado"));

    }
}