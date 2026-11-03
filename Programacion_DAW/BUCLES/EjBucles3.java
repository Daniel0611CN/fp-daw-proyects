package BUCLES;

public class EjBucles3 { // Multiplos de 5 de 0 a 100 utilizando un bucle do-while.
    public static void main(String[] args) {
        
        int multiplo = 5;
        int contador = 0;
        int total = 0;

        do{
            total = multiplo * contador;
            System.out.println(total);
            contador++;
        } while (total < 100);

    }
}
