package EXAMEN;
import java.util.Scanner;

public class Ejercicio3ExamenHector {

    /*  Quiero saber si puedo comprarme un piso y para ello debo de pedir una hipoteca al banco.
El banco me pone una serie de condiciones: tener trabajo fijo y tener cuenta con ellos, si no tengo trabajo fijo entonces debo tener cuenta con ellos y tener ahorrado mas del 20% del importe del piso. La última opción para que me den la hipoteca es tener 50% del valor del piso ahorrado.

Realiza un programa que pregunte las  diferentes cuestiones que necesito saber y me diga si el banco me daría o no la hipoteca.

Realiza el ejercicio utilizando el operador ternario
     */

    public static void main(String[] args) {
        
        final double AHORRO_20 = 0.2;
        final double AHORRO_50 = 0.5;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto cuesta el piso?");
        double piso = sc.nextDouble();
        
        System.out.println("¿Tienes trabajo fijo? (1 para SI, 0 para NO)");
        int fijo = sc.nextInt();

        System.out.println("¿Tienes cuenta con nosotros? (1 para SI, 0 para NO)");
        int cuenta = sc.nextInt();

        System.out.println("¿Cuanto tienes ahorrado?");
        double ahorro = sc.nextDouble();

        double ahorro50 = piso*AHORRO_50;
        double ahorro20 = piso*AHORRO_20;

        boolean decision = (fijo!=0 && cuenta!=0) || (cuenta==1 && (ahorro>=ahorro20)) || ahorro >= ahorro50;

        System.out.println((decision == true) ? "Enhorabuena, puedes obetener una hipoteca" : "Lo siento, no cumples las condiciones del banco");


        sc.close();
    }
}
