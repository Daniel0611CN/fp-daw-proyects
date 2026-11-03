package org.iesvdm.prueba_apuntes_stream;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        /*
         * La función asList, funciona como un array, pero no es necesario poner los {},
         * simplemente se separan los elementos con coma: c1, c2, c3.
         * Además, esta función actúa como wrapper, y devuelve un ArrayList del array, es un Varargs.
         */

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


        //Prueba aquí tus streams:
        List<String> lowCaloricDishesName = menu
                .stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());

        //Visualiza el resultado aquí
        System.out.println(lowCaloricDishesName);

        // Predicado -> Lambda que recibe un tipo de Stream, y que devuelve un booleano;

        List<Dish> vegetarianDishes = menu.stream()
                .filter(Dish::isVegetarian)
                .filter(d -> d.getCalories() < 400)
                // <-> .filter(  dish -> dish.isVegetarian() )
                // en filter los elementos del stream que no cumplen el predicado se eliminan
                //.collect(toList());
                .toList();

        Persona persona1 = new Persona("jose luis");
        Persona persona2 = new Alumno("daniel", "2");
        Persona persona = persona2;

        if (persona instanceof Alumno) {

            ((Alumno) persona).getCurso();
            System.out.println(persona2 + " Aprueba.");
        }


        List<Dish> sortedlowCaloricDishesName = menu
                .parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories, reverseOrder()).thenComparing(Dish::getName, reverseOrder()))

                // El reverseOrder(), dentro del comparing, es lo mismo que si sacas fuera y pones el .reversed();

                // .sorted((d1, d2) -> d2.getCalories() - d1.getCalories()) // op
                // comparing genera una lambda de tipo Comparator<T> sobre el metodo de getCalories de Dish

                .collect(toList());

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        // Además, el distinct, quita los elementos repetidos de una lista;


        // takeWhile -> recoge todos los elementos que cumplan la condicion hasta que se incumpla.
        // dropWhile -> descarta los elementos hasta que se cumpla la condicion, despues recoge el resto.
        // limit ->


        // Cualquier cosa que entra en un lambda de stream, es de Super T;

        // InstanceOf determina si un objeto es de 'X' clase;
        // En el ejemplo anterio, ya que la persona1 es de la clase Persona,
        // no entrará al if ya que debe ser Alumno;

        // Sin embargo, al indicarle a persona que es persona2,
        // fuera del instance, no podemos acceder al atributo curso,
        // ya que está asignando a persona2 como persona, pero entra al instanceof,
        // porque es un Alumno;

        // Siempre -> Los hijos pueden suplantar la identidad de los padres;
        // Persona p = new Alumno(...);
        // Sin embargo, no podemos hacer que un Padre suplante la identidad de su hijo;
        // Alumno a = p; -> Esto dará error;


        // Si queremos filtrar por una condición 'O' - '||', debemos ponerlo en un mismo filter,
        // Sin embargo, si es 'Y' - '&&', podemos repartirlo en diferentes filter;

        // PRUEBA DE CLASE;

        /*
            Predicate<Number> p = (Number n) -> n instanceof Integer;

            System.out.println(p.test(Integer.valueOf(10))); // Esto es lo que permite el metodo filter;


            List<Alumno> daw2 = Arrays.asList(
                    new Alumno("denis", "2"),
                    new Alumno("manuel", "2"),
                    new Alumno("jairo", "2")
            );


            daw2.stream()
                .filter((a) -> a.getCurso().equals("2"))
                .forEach(System.out::println);

         */

    }

}
