package BUCLES;

public class Tablas1al5 {
    public static void main(String[] args) {

        int num = 0;
        int repeticiones = 10;

        System.out.println("Tablas de multiplicar del 1 al 5: ");

        for (num = 1; num <= 5; num++){

            System.out.println("TABLA DEL " + num);

            for (int aux = 1; aux <= repeticiones; aux++)
            {
                System.out.println(aux + " x " + num + " = " + (aux*num));
            }
        }

    }
}
