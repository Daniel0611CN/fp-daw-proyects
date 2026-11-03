package EXAMEN;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Tipo1 {

    public static void main(String[] args) {
        
        int diaAleatorio;
        int mesAleatorio;
        int añoAleatorio;

        mesAleatorio = (int) Math.ceil(Math.random() * 12);
        añoAleatorio = (int) (Math.random() * (9999 - 2022) + 2022);

        switch (mesAleatorio){

            case 2:
                if (añoAleatorio%4==0){  //años bisiestos
                  diaAleatorio =(int)Math.ceil(Math.random() * 29);
                }
                else{
                    diaAleatorio =(int)Math.ceil(Math.random() * 28);
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                diaAleatorio =(int)Math.ceil(Math.random() * 30);
                break;

            default:
                    diaAleatorio =(int)Math.ceil(Math.random() * 31);
                    break;
        }

        LocalDate fechaAleatoria = LocalDate.of(añoAleatorio, mesAleatorio, diaAleatorio);
        DateTimeFormatter fechaModificada = DateTimeFormatter.ofPattern("dd 'de' LLLL '('EEEE')' 'de' yyyy" );
        LocalDate fechaQueda = LocalDate.of(añoAleatorio ,12, 31);

        System.out.println("\"Es el día \" " + fechaAleatoria.format(fechaModificada));
        System.out.println("Para fin de año queda: " + ChronoUnit.DAYS.between(fechaAleatoria, fechaQueda) + " dias");

    }
    
}
