package org.iesvdm.transformer;

public class UtilLispList {

    public static <E> LispList<E> add(LispList<E> list, int i, E elem) {

        if (i < 0 || i == 0 || list.isEmpty()) return list.cons(elem);

        return add(list.tail(), i - 1, elem).cons(list.head());

    }

}