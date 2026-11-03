package CLASES_T6.Clases;

import java.util.Scanner;

public class Hora_ejercicio {
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
 
 
        Hora2 r = new Hora2(11, 30);
        System.out.println(r);
 
 
        for (int i = 0; i < 61; i++) //incrementamos en 61 minutos
        {
            r.inc();
        }
 
 
        System.out.println(r);
        System.out.println("Escriba una hora");
        int hora = sc.nextInt();
 
 
        boolean cambio = r.setHora2(hora);
 
 
        if (cambio)
        {
            System.out.println(r);
        }
        else
        {
            System.out.println("No se pudo cambiar la hora");
        }
 
 
        HoraExacta re = new HoraExacta(11,15, 23);
        System.out.println(re);
 
 
        for (int i = 0; i < 61; i++) //incrementamos en 61 segundos
        {
            re.inc();
        }
   
        System.out.println(re);
        System.out.println("Escriba los segundos");
        int segundos = sc.nextInt();
 
 
        if (re.setSegundo2(segundos))
        {
            System.out.println(re);
        }
        else
        {
            System.out.println("No se pudo cambiar los segundos");
        }
 
 
        HoraExacta re1 = new HoraExacta(1,2,3);
        HoraExacta re2 = new HoraExacta(1,2,3);
        HoraExacta re3 = new HoraExacta(10,20,30);
        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re3);
 
 
        System.out.println(re1.equals(re2));
        System.out.println(re1.equals(re3));
 
 
        sc.close();
    }
 
}
