package org.iesvdm.ejercicios;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class HaversineFormula {

    private BigDecimal Latitud;
    private BigDecimal Longitud;

    public BigDecimal getLatitud() {
        return Latitud;
    }

    public void setLatitud(BigDecimal latitud) { Latitud = new BigDecimal("3"); }

    public BigDecimal getLongitud() {
        return Longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        Longitud = new BigDecimal("5");
    }

    public HaversineFormula(BigDecimal latitud, BigDecimal longitud) {
        Latitud = latitud;
        Longitud = longitud;
    }

    public static class Extensiones
    {
        public static float RadioTierraKm = 6378;
        public static float DistanciaKm(HaversineFormula posOrigen, HaversineFormula posDestino) {
            float difLatitud = EnRadianes(posDestino.Latitud.floatValue() - posOrigen.Latitud.floatValue());
            float difLongitud = EnRadianes(posDestino.Longitud.floatValue() - posOrigen.Longitud.floatValue());

            float aux1 = posOrigen.Latitud.floatValue();
            float aux2 = posDestino.Latitud.floatValue();

            float a = (float) AlCuadrado(Math.sin(difLatitud/2)) + EnRadianes((float) Math.cos(aux1))*EnRadianes((float) Math.cos(aux2))*(float) AlCuadrado(Math.sin(difLongitud/2));
            float c = (float) (2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a)));

            BigDecimal result1 = BigDecimal.valueOf(a).round(MathContext.DECIMAL128);
            BigDecimal result2 = BigDecimal.valueOf(c).round(MathContext.DECIMAL128);

            System.out.println("Diferencia de Latitud: " + difLatitud);
            System.out.println("Diferencia de Longitud: " + difLongitud);
            System.out.println("Mitad del Cuadrado de la Distancia en Linea Recta: " + a);
            System.out.println("Distancia en Kilómetros: " + c);

            return RadioTierraKm*c;

        }
    }

    static float EnRadianes(float valor) {
        return (float) (Math.PI/180)*valor;
    }

    static double AlCuadrado(double valor) {
        return Math.pow(valor, 2);
    }

    public static void main(String[] args) {
        Extensiones.DistanciaKm(new HaversineFormula(BigDecimal.TWO, BigDecimal.valueOf(4)), new HaversineFormula(BigDecimal.valueOf(6), BigDecimal.valueOf(12)));
    }

}
