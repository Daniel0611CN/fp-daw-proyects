package FUNCIONES;

public class Ejercicio16 { // Numeros capicua entre 1 y 99999
    public static void main(String[] args) {
        
        for (int aux = 1; aux<=99999; aux++)
        {
            if(UtilesParaNumeros.esCapicua(aux))
            {
                System.out.println(aux);
            }
        }



    }
}
