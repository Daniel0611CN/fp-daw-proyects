package CONDICIONALES;
import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce que día de la semana es:");
        String diaSemana = sc.nextLine();
        String diaMinuscula = diaSemana.toLowerCase();

        String trabajo = "Tienes que ir a trabajar";
        String finde = "Jaranaaaaaaa";

        int diasHastaFinDeSemana = 0;

        switch (diaMinuscula){
        
            case "lunes":
                diasHastaFinDeSemana = diasHastaFinDeSemana +1;
            case "martes":
                diasHastaFinDeSemana +=1;
            case "miercoles":
                diasHastaFinDeSemana++;
            case "jueves":
            diasHastaFinDeSemana +=1;
            case "viernes":
            diasHastaFinDeSemana +=1;
            System.out.println(trabajo);
                break;        
                                 
            case "sabado":
            case "domingo":
            System.out.println(finde);
                break;   

            default:
            System.out.println("ERROR"); 
        }   // final del switch

        if (diasHastaFinDeSemana>0){
            System.out.println("Te quedan "+diasHastaFinDeSemana+" días para el fin de semana.");
        }

        sc.close();
    }
}
