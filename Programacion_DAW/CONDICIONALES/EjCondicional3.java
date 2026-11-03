package CONDICIONALES;
public class EjCondicional3 {
    public static void main(String[] args) {
        
        int diaAleatorio = 0;
        String diaSemana = "";

        diaAleatorio = (int)(Math.random()*7)+1;

        switch (diaAleatorio){

            case 1:
            diaSemana = "Lunes";
            break;
            case 2:
            diaSemana = "Martes";
            break;
            case 3:
            diaSemana = "Miércoles";
            break;
            case 4:
            diaSemana = "Jueves";
            break;
            case 5:
            diaSemana = "Viernes";
            break;
            case 6:
            diaSemana = "Sábado";
            break;
            case 7:
            diaSemana = "Domingo";
            break;
            default:
            System.out.println("ERROR"); 
        }

        System.out.println(diaSemana);

    }
}
