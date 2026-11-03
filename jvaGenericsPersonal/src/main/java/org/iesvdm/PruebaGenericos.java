package org.iesvdm;

import java.util.ArrayList;
import java.util.List;

public class PruebaGenericos {

    public static void main(String[] args) {

        // Antes de JAVA 5
        List lista = new ArrayList();

        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        List<Boolean> booleanList = new ArrayList<>();

        Integer integer = 1;
        String string = "Hola";
        Boolean bool = true;

        lista.add(integer);
        lista.add(string);
        lista.add(bool);


        integerList.add(integer);
        stringList.add(string);
        booleanList.add(bool);


        for (Object o : lista) {
            System.out.println(o);

            Integer otro =  (Integer)o;

            if (o instanceof Integer) {
                Integer integer1 = (Integer)o+1;
                System.out.println(integer1++);
            }

            if (o instanceof String) {
                String string1 = (String)o+" Dani";
                System.out.println(string1);
            }

        }

        for (Integer i : integerList) {
            System.out.println(i++);
        }

        for (String s : stringList) {
            System.out.println(s + " mundo");
        }


    }


}
