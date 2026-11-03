package CONDICIONALES;
import java.util.Scanner;

public class EjCondicional21 { // Nota de un trimestre de Programación
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen:");
        float nota1 = sc.nextFloat();

        System.out.println("Nota del segundo examen:");
        float nota2 = sc.nextFloat();

        // Declaro nota media:
        float media = (nota1+nota2)/2;

        System.out.println("Nota del primer control: "+nota1);
        System.out.println("Nota del segundo control: "+nota2);

        if (media < 5.0f){
            
            sc.nextLine(); // Limpio Buffer y pido el String
            System.out.println("¿Cual ha sido el resultado de la recuperación? (apto/no apto):");
            String apto = sc.nextLine();
            apto = apto.toLowerCase(); // Paso la respuesta a minuscula para evitar errores

            if (apto.equals("apto") || apto.equals("no apto")) { // Controlo los valores correctos de entrada
                
                // Instrucciones para apto:
                if (apto.equals("apto")){
                    media = 5;
                }
            }
            else // En caso de respuesta incorrecta:
            {
                System.out.println("Nota de recuperación incorrecta");
            }
        }
        // Imprimo el resultado:
        System.out.println("Tu nota de Programación es "+media);

        sc.close();
    }
}
