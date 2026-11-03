import java.util.Scanner;

public class Ejercicio20{ // NOTA MEDIA

    // Se quiere realizar un programa que calcule la nota media de un alumno
    // según la nota de cada uno de los trimestres.
    // Además indicará si tienes derecho a beca o no 
    // según esta premisa:
    // nota media es mayor o igual a 8 Y renta es menor a 20.000 
    // o su nota es mayor o igual a 5 y su renta es menor a 4000€ 

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        final float RENTA_1 = 20000f;
        final float RENTA_2 = 4000f;
        final float MEDIA_1 = 8f;
        final float MEDIA_2 = 5f;


        System.out.println("Introduce la nota del primer trimestre");
        float nota1 = sc.nextFloat();

        System.out.println("Introduce la nota del segundo trimestre");
        float nota2 = sc.nextFloat();

        System.out.println("Introduce la nota del tercer trimestre");
        float nota3 = sc.nextFloat();

        float notaMedia = (nota1+nota2+nota3)/3;
        System.out.println("La nota media es " + notaMedia);

        System.out.println("Introduce tu renta anual");
        float renta = sc.nextFloat();

        boolean beca = ((notaMedia >= MEDIA_1) && (renta < RENTA_1)) || ((notaMedia >= MEDIA_2) && (renta < RENTA_2));

        System.out.println("VAR RENTA: " + renta);

        System.out.println("DERECHO A BECA: " + beca);
        
        String mensajeBeca = "Tienes derecho a una beca";
        String mensajeNoBeca = "No tienes derecho a beca";
        
        String mensajeFinal = (beca == true) ? mensajeBeca : mensajeNoBeca;

        System.out.println(mensajeFinal);



        sc.close();
    }


}