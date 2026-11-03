package org.iis.ajnebro;
/**
 * A class called Calculator, containing four public methods
 * that return double values.
 */
public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return number1 / number2;
    }
}
