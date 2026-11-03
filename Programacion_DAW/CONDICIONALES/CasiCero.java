package CONDICIONALES;

public class CasiCero {
    public static void main(String[] args) {
        
        double numero = 0.34;

        if ((numero > -1) && (numero < 1) && (numero != 0))
        {
            System.out.println(numero+" es casi cero");
        }
        else {
            System.out.println("No es casi cero");
        }
        
    }
}