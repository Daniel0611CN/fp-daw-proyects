package BUCLES;

public class EjBucles3_2 {//Multiplos de 5 (DO WHILE)
    public static void main(String[] args) {
        
        final int CINCO = 5;
        int contador = 0;

        do
        {
            System.out.println(contador * CINCO);
            contador++;

        }while (contador * CINCO <= 100);
    }
}