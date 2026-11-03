package CLASES_T6.UsoClases;

import CLASES_T6.Clases.CuentaCorriente;
import CLASES_T6.Clases.Gestor;

public class Banco {
    public static void main(String[] args) {
        
        CuentaCorriente cc_Andres = new CuentaCorriente("08868633H","Andres");

        cc_Andres.ingresarDinero(1000);

        System.out.println(cc_Andres.mostrarInformacion());

        cc_Andres.sacarDinero(2000);

        System.out.println(cc_Andres.mostrarInformacion());

        cc_Andres.sacarDinero(600);

        System.out.println(cc_Andres);
        // Esto imprime: CLASES_T6.Clases.CuentaCorriente@27c170f0
        // Esto es igual a:
        System.out.println(cc_Andres.toString());
        
        // Puedo redefinir (o sobreescribir) el método toString para MI CLASE:
        // Y ahora funciona:
        System.out.println(cc_Andres);


        CuentaCorriente cc_Sara = new CuentaCorriente("65473826K", 2500);
        System.out.println(cc_Sara);

        CuentaCorriente cc_Javi = new CuentaCorriente("65473826K", "Javi", 800);
        System.out.println(cc_Javi);


        Gestor luis_Gestor = new Gestor("Luis", "555-64532446");


        cc_Andres.setGestor(luis_Gestor);
        
    }
}
