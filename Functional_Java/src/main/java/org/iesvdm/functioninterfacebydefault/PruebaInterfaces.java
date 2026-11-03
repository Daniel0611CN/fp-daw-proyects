package org.iesvdm.functioninterfacebydefault;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PruebaInterfaces {

    public static void main(String[] args) {

        Supplier<Integer> sup = () -> (int) (Math.random()*100);
        System.out.println("Número Aleatorio con Lambdas: " + sup.get());

        Function<String, Integer> longCad = (s) -> s.length();
        System.out.println("longCad = " + longCad.apply("123"));

        UnaryOperator<String> grita = (s) -> s.toUpperCase() + "!";

        Function<String, String> gritaMasEnojado = (s) -> {
            String aux = "@#€$%" + s.toUpperCase();
            return aux + "!";
        };

        System.out.println("grita = " + grita.apply("dani"));
        System.out.println("gritaMasEnojado = " + gritaMasEnojado.apply("dani"));

        Predicate<Integer> esMayorEdad = (e) -> e >= 18;

        Function<Integer, Boolean> esMenorDeEdad = (e) -> e < 18;
        int edad = 2;
        System.out.println("edad = " + edad + (esMayorEdad.test(edad) ? " es mayor" : " es menor")); // true - false;
        System.out.println("edad = " + edad + (esMenorDeEdad.apply(edad) ? " es menor" : " es mayor"));

    }

}
