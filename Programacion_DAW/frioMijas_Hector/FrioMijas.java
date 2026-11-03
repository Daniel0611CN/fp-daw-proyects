package frioMijas_Hector;

import frioMijas_Hector.Material.Arcon;
import frioMijas_Hector.Material.Camara;
import frioMijas_Hector.Material.Frigorifico;
import frioMijas_Hector.Material.Minibar;
import frioMijas_Hector.Personal.Empleado;
import frioMijas_Hector.Personal.Jefe;


public class FrioMijas {

    public static void main(String[] args) {
        
        Jefe jefe1 = new Jefe("Jefazo", "Garcia", 45, 2500, "45000001X" );
        Jefe jefe2 = new Jefe("Jefe_malaga", "Lopez", 34, 2100, "77000002P" );

        Sede sede1 = new Sede("Madrid", "Calle ancha", 80881, jefe1);
        
        Sede sede2 = new Sede("Malaga", "Calle Larios", 29001);
        sede2.setJefe(jefe2);

        Empleado empleado1 = new Empleado("Daniel", "ape1", 35, 1000, "88000008W" );
        Empleado empleado2 = new Empleado("Juan", "ape2", 35, 1200, "21000008E" );
        Empleado empleado3 = new Empleado("Maria", "ape3", 55, 1700, "99000008R" );
        Empleado empleado4 = new Empleado("Pepe", "ape4", 45, 900, "66000008Y" );
        Empleado empleado5 = new Empleado("Pedro", "ape5", 30, 2000, "54000008T" );
        Empleado empleado6 = new Empleado("Daniel", "ape6", 24, 1000, "12000008P" );
        Empleado empleado7 = new Empleado("Pilar", "ape7", 24, 1000, "12000008P" );

        System.out.println(empleado1);
        System.out.println(empleado2);

        sede1.addEmpleado(empleado1);
        sede1.addEmpleado(empleado2);

        sede2.addEmpleado(empleado3);
        sede2.addEmpleado(empleado4);
        sede2.addEmpleado(empleado5);
        sede2.addEmpleado(empleado6);
        sede2.addEmpleado(empleado7);

        //Cambiamos contraseñas
        System.out.println(jefe1);
        jefe1.generaPassword(5);
        System.out.println("Nueva contraseña para jefe1");
        System.out.println(jefe1);

        System.out.println(jefe2);
        jefe2.generaPassword();
        System.out.println("Nueva contraseña para jefe2");
        System.out.println(jefe2);

        //Mostrar la información completa de cada una de las sedes + jefe + empleados
        System.out.println(sede1);
        
        System.out.println(sede2);

        /*
         * HACER:
         * Mostrar si la contraseña de los jefes es no Fuerte
         */
        
        boolean fuerte = jefe1.esFuerte();
        String resultado = (fuerte)?" SÍ ":" NO ";
        System.out.println("La contraseña de " + jefe1.getNombre() + resultado + "es fuerte");
        
        fuerte = jefe2.esFuerte();
        resultado = (fuerte)?" SÍ ":" NO ";
        System.out.println("La contraseña de " + jefe2.getNombre() + resultado + "es fuerte");



         /*
          * HACER:
          * Generar contraseña de 10 elementos que sea fuerte para cada uno de los jefes
          */
        
        boolean passOk = false;
        do
        {
            jefe1.generaPassword(10);

            passOk = jefe1.esFuerte();

        }while(!passOk);
        System.out.println("Nueva contraseña segura de Jefe 1: " + jefe1.getContraseña());

        
        passOk = false;
        do
        {
            jefe2.generaPassword(10);

            passOk = jefe2.esFuerte();

        }while(!passOk);

        System.out.println("Nueva contraseña segura de Jefe 2: " + jefe2.getContraseña());



         /*
         * HACER:
         * Empleados de la sede2 con sueldo entre 500 y 1500 
         */
        System.out.println("\nEmpleados de la sede 2 con sueldos entre 500€ y 1.500€");
        for (int i = 0; i < sede2.getEmpleados_Sede().length; i++)
        {
            if(sede2.getEmpleados_Sede()[i].getSalario() >= 500 && sede2.getEmpleados_Sede()[i].getSalario() <= 1500)
            {
                System.out.println(sede2.getEmpleados_Sede()[i].toString());
            }
        }



        /*
         * HACER:
         * Crea 5 equipos frigorificos diferentes y asignalos a la 2º sede y muéstralos a continuación   
         */
        Frigorifico frigo = new Frigorifico(185, 60, 60, 500, "Balay");
        Camara refrigerador = new Camara(200, 200, 100, 2500, "Frost", -30, 10);
        Arcon congelador = new Arcon(80, 1500, 60, 1000, "Hisense", "frontal");
        Minibar mini = new Minibar(70, 45, 50, 300, "Bosch", 2);
        Frigorifico frigoAmericano = new Frigorifico(200, 100, 60, 1000, "Samsung");

        sede2.addEquipo(frigo);
        sede2.addEquipo(refrigerador);
        sede2.addEquipo(congelador);
        sede2.addEquipo(mini);
        sede2.addEquipo(frigoAmericano);

        System.out.println(sede2);


    }
    
}
