package BUCLES;
import java.util.Scanner;

public class EstadisticaIES {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int acumuladorEdad = 0;
        int contador = 0;
        int contadorMayoresEdad = 0;

        System.out.println("Introduce una edad:");
        int edad = sc.nextInt();

        while (edad != -1)
        {  // Conjunto de instrucciones:
           
           if (edad >= 11)
           {
                acumuladorEdad = acumuladorEdad + edad;
                //acumuladorEdad += edad;
                contador = contador +1;
                //contador++;

                if (edad >= 18){
                    contadorMayoresEdad = contadorMayoresEdad +1;
                }
            }
            else{
                System.out.println("Edad no válida, debe tener más de 10 ");
            }
            // Actualizar la condición:
            System.out.println("Introduce otra edad:");
            edad = sc.nextInt();
        }
     
        if (contador > 0)
        {
            System.out.println("La suma de la edades es: " + acumuladorEdad);
            System.out.println("La media de las edades es: " + acumuladorEdad/(double)contador);
            System.out.println("El total de alumnos es: " + contador);
            System.out.println("El número de alumnos mayores de edad es: " + contadorMayoresEdad);
        }

        sc.close();
    }
}
