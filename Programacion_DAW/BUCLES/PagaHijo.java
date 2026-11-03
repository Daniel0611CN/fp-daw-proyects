package BUCLES;

public class PagaHijo {
    public static void main(String[] args) {
        
        final double PAGA_INICIAL = 0.05;

        double paga = PAGA_INICIAL;
        double ahorroTotal = 0;
        int contadorSemanas = 1;
        

        while (ahorroTotal <= 2000)
        {
            paga = paga*2;
            ahorroTotal = ahorroTotal + paga;
            contadorSemanas++;

            System.out.println("Semana " + contadorSemanas + ": Recibe " + paga + "€ y lleva ahorrados " + ahorroTotal + "€ en total.");
            System.out.println("----------------------------------------");
        }

        System.out.println("El hijo tardará " + contadorSemanas + " semanas en comprarse la bici de 2.000€");

    }
}
