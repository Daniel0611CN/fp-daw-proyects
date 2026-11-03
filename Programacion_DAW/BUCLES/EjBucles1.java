package BUCLES;

public class EjBucles1 {//Multiplos de cinco (FOR)
    public static void main(String[] args) {
        
        final int CINCO = 5;

        System.out.println("Los múltiplos de 5 son:");
        for (int aux = 0; aux*CINCO <= 100; aux++){
           
            System.out.println(aux * CINCO);
        }   
    }
}