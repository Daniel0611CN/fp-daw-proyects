package org.iesvdm.ejercicios;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        BigInteger bgInteger1 = new BigInteger("7");
        int aux = bgInteger1.intValue();

        for (int i = bgInteger1.intValue()-1; i > 0; i--) {
            bgInteger1 = BigInteger.valueOf(i).multiply(bgInteger1);
        }

        System.out.println("Valor Factorial de " + aux + ": " + bgInteger1);

    }

}