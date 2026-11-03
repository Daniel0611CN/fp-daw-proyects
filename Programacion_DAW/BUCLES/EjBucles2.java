package BUCLES;

public class EjBucles2 {//Multiplos de cinco (WHILE)
    public static void main(String[] args) {
        
        final int CINCO = 5;
        int contador = 0;

        while (contador * CINCO <= 100)
        {
            System.out.println(contador * CINCO);

            contador++;
        }
    }    
}