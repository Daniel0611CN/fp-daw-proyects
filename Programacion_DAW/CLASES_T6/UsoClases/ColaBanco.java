package CLASES_T6.UsoClases;

import CLASES_T6.Clases.Caja;
import CLASES_T6.Clases.Cliente;
import CLASES_T6.Clases.Caja.AccionesBanco;

public class ColaBanco {
    
    public static void main(String[] args) {
      
        Caja caja = new Caja();
        Cliente cliente1 = new Cliente("Andres", AccionesBanco.RETIRAR, 100);
        caja.cogerTurno(cliente1);
        Cliente cliente2 = new Cliente("Javier", AccionesBanco.RETIRAR, 540.5);
        caja.cogerTurno(cliente2);
        Cliente cliente3 = new Cliente("Sara", AccionesBanco.RETIRAR, 1500);
        caja.cogerTurno(cliente3);

        caja.estadoCola();

        caja.atender();// atendemos a Andres:
        System.out.println(caja.saldo());
       
        Cliente cliente4 = new Cliente("Miguel", AccionesBanco.INGRESAR, 2000);
        caja.cogerTurno(cliente4);

        caja.atender(); // atendemos a Javier
        System.out.println(caja.saldo());

        caja.atender(); // atendemos a Sara
        System.out.println(caja.saldo());

        caja.atender(); // atendemos a Miguel
        System.out.println(caja.saldo());
        caja.estadoCola();
    }
 
}
