package org.iesvdm.transformer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilLispListTest {

    @Test
    public void addBetweenTest() {

        LispList<Integer> lispList = LispList.<Integer>empty().cons(4).cons(3).cons(2).cons(1);
        //lispList: [1, 2, 3, 4]
        System.out.println(lispList);

        LispList<Integer> lispList1 = UtilLispList.add(lispList, 2, -3);
        System.out.println(lispList1);
        LispList<Integer> expectedLispList1 = LispList.<Integer>empty().cons(4).cons(3).cons( -3).cons( 2).cons( 1);
        //expectedLispList1: [1, 2, -3, 3, 4]
        Assertions.assertEquals(expectedLispList1, lispList1);

    }

    @Test
    public void addIndexBelow0Test() {

        LispList<Integer> lispList = LispList.<Integer>empty().cons(4).cons(3).cons(2).cons(1);
        //lispList: [1, 2, 3, 4]
        System.out.println(lispList);

        LispList<Integer> lispList1 = UtilLispList.add(lispList, -1, -1);
        System.out.println(lispList1);
        LispList<Integer> expectedLispList1 = LispList.<Integer>empty().cons(4).cons(3).cons( 2).cons( 1).cons(-1);
        //expectedLispList1: [-1, 1, 2, 3, 4]
        Assertions.assertEquals(expectedLispList1, lispList1);

    }

    @Test
    public void addIndexAboveSizeTest() {

        LispList<Integer> lispList = LispList.<Integer>empty().cons(4).cons(3).cons(2).cons(1);
        //lispList: [1, 2, 3, 4]
        System.out.println(lispList);

        LispList<Integer> lispList1 = UtilLispList.add(lispList, 100, -4);
        System.out.println(lispList1);
        LispList<Integer> expectedLispList1 = LispList.<Integer>empty().cons(-4).cons(4).cons(3).cons( 2).cons( 1);
        //expectedLispList1: [ 1, 2, 3, 4, -4]
        Assertions.assertEquals(expectedLispList1, lispList1);

    }

}
