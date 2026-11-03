import java.util.Scanner;

public class edadBoolean 
{
    public static void main(String[] args) 
    {
        final int MAYORIA_EDAD = 18;  // Establecemos una variable fija que no va a cambiar nunca

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");

        int edad = entrada.nextInt();

        boolean resultado = edad >= MAYORIA_EDAD;

        System.out.println("Eres mayor de edad: " + resultado);

       
        // Hasta aquí con la edad, ahora vamos con el carnet de conducir

        System.out.println("En las siguientes preguntas: SI= 1  , NO= 0");
        
        System.out.println("¿Tienes carnet?: ");
        int carnet = entrada.nextInt();

        boolean puedeConducir = (carnet != 0) && resultado; 

        System.out.println("¿Puedes Conducir?: " + puedeConducir);
        
        // mas ejemplos concatenados con los anteriores

        System.out.println("¿Es tu primer año?: ");
        int primerizo = entrada.nextInt();

        boolean llevaL = (primerizo >= 1) && puedeConducir && resultado;

        System.out.println("¿Tienes que llevar la L?: " + llevaL);




        entrada.close();


    }


    
}
