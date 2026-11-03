package org.iesvdm.ejercicios;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class PaymentScheme {
    
    public static void main(String[] args) {

        double a = 0.05/12;

        BigDecimal monto = new BigDecimal("200000");
        BigDecimal r = BigDecimal.valueOf(a);
        int months = 360;

        BigDecimal one = BigDecimal.ONE;

        System.out.println("Préstamo: " + monto);
        System.out.println("Tasa de Interés Mensual: " + r);

        BigDecimal up = monto.multiply(r);
        BigDecimal down = one.subtract(one.add(r.negate()).pow(months));
        BigDecimal result = up.divide(down, 2, RoundingMode.HALF_EVEN);;

        System.out.println("Pago Mensual: " + result);

        // Intereses del Mes;
        BigDecimal interesMes = BigDecimal.valueOf(monto.doubleValue()).multiply(r).setScale(2, RoundingMode.HALF_EVEN);

        // Principal del Mes;
        BigDecimal principalMes = BigDecimal.valueOf(result.doubleValue()).subtract(interesMes).setScale(2, RoundingMode.HALF_EVEN);

        // Nuevo saldo;
        BigDecimal nuevoSaldo = BigDecimal.valueOf(monto.doubleValue()).subtract(principalMes).setScale(2, RoundingMode.HALF_EVEN);

        double aux = nuevoSaldo.doubleValue();

        System.out.println("\nEsquema de Amortización\n----------------------");

        System.out.println("Mes Pago" + "      " + "Principal" + "     " + "Interés" + "     " + "Balance");
        System.out.println(result + "       " + principalMes + "        " + interesMes + "      " + nuevoSaldo);

        for (@SuppressWarnings("unused")
        int i = 0; aux > 0; i++) {
            interesMes = BigDecimal.valueOf(nuevoSaldo.doubleValue()).multiply(r).setScale(2, RoundingMode.HALF_EVEN);
            principalMes = BigDecimal.valueOf(result.doubleValue()).subtract(interesMes).setScale(2, RoundingMode.HALF_EVEN);
            nuevoSaldo = BigDecimal.valueOf(aux).subtract(principalMes).setScale(2, RoundingMode.HALF_EVEN);
            aux = nuevoSaldo.doubleValue();

            if (nuevoSaldo.doubleValue() < 0) {
                System.out.println(result + "       " + principalMes + "       " + interesMes + "       " + 0);
            } else {
                System.out.println(result + "       " + principalMes + "        " + interesMes + "      " + nuevoSaldo);
            }
            
        }
        
    }   

}
