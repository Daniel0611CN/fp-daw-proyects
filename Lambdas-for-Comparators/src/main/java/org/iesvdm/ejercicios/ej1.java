package org.iesvdm.ejercicios;

import java.util.*;

public class ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int reference = sc.nextInt();

        Comparator<Integer> comparator = (a, b) -> {
            int diffA = Math.abs(a - reference);
            int diffB = Math.abs(b - reference);
            return Integer.compare(diffA, diffB);
        };


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 40) +1);
        }

        list.sort(comparator);
        System.out.println(list);

        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
        for (int i = 0; i < 10; i++) {
            treeSet.add((int) (Math.random() * 40) +1);
        }
        System.out.println(treeSet);

    }

}
