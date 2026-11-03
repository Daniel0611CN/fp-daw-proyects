import java.util.Scanner;

public class Ejercicio13 { // VIP en la discoteca

        public static void main(String [] args){

            Scanner sc = new Scanner(System.in);

            // Para ser VIP hay que ser socio
            // + haber pagado las cuotas
            // ó puedes haber sido recomendado y estar en periodo de prueba

            //  PREGUNTAS
            // Eres socio?
            // Cuotas al dia?
            // recomendado?
            // prueba?

            System.out.println("¿Eres socio?");
            boolean Socio = sc.nextBoolean();

            System.out.println("¿Tienes las cuotas al día?");
            boolean Cuotas = sc.nextBoolean();

            System.out.println("¿Te ha recomendado otro usuario VIP?");
            boolean Recomendado = sc.nextBoolean();

            System.out.println("¿Estás dentro del perioso de prueba?");
            boolean Prueba = sc.nextBoolean();

            boolean EresVIP = (Socio && Cuotas) || (Recomendado && Prueba);

            System.out.println("ERES VIP: " + EresVIP);


            sc.close();
        }

}
