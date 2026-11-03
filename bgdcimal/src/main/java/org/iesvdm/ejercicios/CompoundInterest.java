package org.iesvdm.ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompoundInterest {

    public static void main(String[] args) {

        BigDecimal monto = new BigDecimal("8750");
        BigDecimal r = new BigDecimal("0.05");
        BigDecimal n = new BigDecimal("12");

        BigDecimal c = monto.multiply(BigDecimal.ONE.add(r).pow(n.intValue()));
        c = c.setScale(10, RoundingMode.HALF_EVEN);

        System.out.println("Cantidad Final: " + c);
    }

}