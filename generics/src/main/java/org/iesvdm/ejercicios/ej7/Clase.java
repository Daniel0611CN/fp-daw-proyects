package org.iesvdm.ejercicios.ej7;

import java.util.LinkedList;
import java.util.List;

public class Clase<E> implements Operable<E> {

    private List<E> result = new LinkedList<>();

    public Clase() {}

    public List<E> getResult() {
        return result;
    }

    public void setResult(List<E> result) {
        this.result = result;
    }

    @Override
    public void suma(List<E> o, List<E> o2) {
        result.clear();
        if (o.size()==o2.size()) {
            Integer valueCelda = 0;
            for (int i = 0; i < o.size(); i++) {
                for (int j = 0; j < o2.size(); j++) {
                    valueCelda = (int) o.get(i) + (int) o2.get(i);
                }
                result.add((E) valueCelda);
            }
            System.out.println("Suma: " + result);
        }
        else {
            System.out.println("\nNo se puede realizar la operación con distintas longitudes");
        }
    }

    @Override
    public void resta(List<E> o, List<E> o2) {
        result.clear();
        if (o.size()==o2.size()) {
            Integer valueCelda = 0;
            for (int i = 0; i < o.size(); i++) {
                for (int j = 0; j < o2.size(); j++) {
                    valueCelda = (int) o.get(i) - (int) o2.get(i);
                }
                result.add((E) valueCelda);
            }
            System.out.println("Resta: " + result);
        }
        else {
            System.out.println("\nNo se puede realizar la operación con distintas longitudes");
        }
    }

    @Override
    public void multiplicacion(List<E> o, List<E> o2) {
        result.clear();
        if (o.size()==o2.size()) {
            Integer valueCelda = 0;
            for (int i = 0; i < o.size(); i++) {
                for (int j = 0; j < o2.size(); j++) {
                    valueCelda = (int) o.get(i) * (int) o2.get(i);
                }
                result.add((E) valueCelda);
            }
            System.out.println("Multiplicación: " + result);
        }
        else {
            System.out.println("\nNo se puede realizar la operación con distintas longitudes");
        }
    }

    @Override
    public void division(List<E> o, List<E> o2) {
        result.clear();
        if (o.size()==o2.size()) {
            Integer valueCelda = 0;
            for (int i = 0; i < o.size(); i++) {
                for (int j = 0; j < o2.size(); j++) {
                    valueCelda = (int) o.get(i) / (int) o2.get(i);
                }
                result.add((E) valueCelda);
            }
            System.out.println("División: " + result);
        }
        else {
            System.out.println("\nNo se puede realizar la operación con distintas longitudes");
        }

    }

    @Override
    public String toString() {
        return "Clase{" +
                "result=" + result +
                '}';
    }
}
