package EXAMEN.examenClases_HectorLopez;


import EXAMEN.examenClases_HectorLopez.material.Avion;
import EXAMEN.examenClases_HectorLopez.material.Paracaidas;
import EXAMEN.examenClases_HectorLopez.material.Paracaidas.Fabricante;
import EXAMEN.examenClases_HectorLopez.personal.Cliente;
import EXAMEN.examenClases_HectorLopez.personal.Instructor;
import EXAMEN.examenClases_HectorLopez.personal.Piloto;

public class AcademiaVuelo {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pepe_cliente", "Garcia", "555-1212", 4500);
        Cliente cliente2 = new Cliente("Juan_cliente", "Lopez", "555-3333", 8000);
        Cliente cliente3 = new Cliente("Maria_cliente", "Garrido", "555-4444", 4000);
        Cliente cliente4 = new Cliente("Sofia_cliente", "Perez", "555-6666", 7000);
        Cliente cliente5 = new Cliente("Leo_cliente", "Martin", "555-7777", 5000);
        Cliente cliente6 = new Cliente("Tomas_cliente", "Arceaga", "555-8888", 6000, true);
        Cliente cliente7 = new Cliente("Paco_cliente", "Sanz", "555-8888", 5500, true);
        Cliente cliente8 = new Cliente("Juan_cliente", "Lopez", "555-3333", 4000);

        Avion avion1 = new Avion("CFG123", 500, 5, 6000, true);
        Avion avion2 = new Avion("BFF909", 800, 5, 10000, false);

        Instructor instructor = new Instructor("Kike", "Loco");

        Paracaidas paraca1 = new Paracaidas(2012, Fabricante.ALTUS, instructor);
        Paracaidas paraca2 = new Paracaidas(2012, Fabricante.ALTUS, instructor);
        Paracaidas paraca3 = new Paracaidas(2012, Fabricante.ALTUS, instructor);
        Paracaidas paraca4 = new Paracaidas(2012, Fabricante.ALTUS, instructor);
        Paracaidas paraca5 = new Paracaidas(2012, Fabricante.ALTUS, instructor);
        Paracaidas paraca6 = new Paracaidas(2012, Fabricante.ALTUS, instructor);

        Paracaidas paraca7 = new Paracaidas(2012, Fabricante.CAIDALIBRE, instructor);
        Paracaidas paraca8 = new Paracaidas(2012, Fabricante.CAIDALIBRE, instructor);
        Paracaidas paraca9 = new Paracaidas(2012, Fabricante.CAIDALIBRE, instructor);
        Paracaidas paraca10 = new Paracaidas(2012, Fabricante.CAIDALIBRE, instructor);
        Paracaidas paraca11= new Paracaidas(2012, Fabricante.CAIDALIBRE, instructor);
        Paracaidas paraca12 = new Paracaidas(2012, Fabricante.CAIDALIBRE, instructor);

        Paracaidas paraca13 = new Paracaidas(2012, Fabricante.MOLTEM, instructor);
        Paracaidas paraca14 = new Paracaidas(2012, Fabricante.MOLTEM, instructor);
        
        Piloto piloto1 = new Piloto("Gustavo_Piloto", "apelli_piloto1", 2015);
        Piloto piloto2 = new Piloto("Pilar_Piloto", "apelli_piloto2", 2023);
        
        Vuelo vuelo1 = new Vuelo(avion1, piloto1);
        Vuelo vuelo2 = new Vuelo(avion2, piloto2);

        System.out.println("\nXXXXXXXXX  Añadimos saltadores a Vuelo1 XXXXXXXXXXXXXXXX\n");

        vuelo1.addSaltador(cliente1, paraca1, paraca2);
        vuelo1.addSaltador(cliente2, paraca3, paraca4);
        vuelo1.addSaltador(cliente3, paraca5, paraca6);
        vuelo1.addSaltador(cliente4, paraca7, paraca8);
        vuelo1.addSaltador(cliente5, paraca9, paraca10);


        System.out.println("\nXXXXXXXXX  Añadimos saltadores a Vuelo2 XXXXXXXXXXXXX\n");

        vuelo2.addSaltador(cliente6, paraca11, paraca12);
        vuelo2.addSaltador(cliente7, paraca13, paraca14);
        vuelo2.addSaltador(cliente2, paraca3, paraca4);
        vuelo2.addSaltador(cliente4, paraca7, paraca8);
        vuelo2.addSaltador(cliente8, paraca1, paraca4);
        vuelo2.addSaltador(cliente2, paraca3, paraca4);
        vuelo2.addSaltador(cliente3, paraca5, paraca6);
        vuelo2.addSaltador(cliente4, paraca7, paraca8);
        vuelo2.addSaltador(cliente5, paraca9, paraca10);


        //Muestro cada uno de los vuelos
        System.out.println("\nXXXXXXXXX  INFO DE LOS VUELOS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
        System.out.println(vuelo1.informacionVuelo());
        System.out.println();
        System.out.println(vuelo2.informacionVuelo());

        System.out.println("\nXXXXXXXXX  ORDEN DE SALTO  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");

        //Muestro el orden de salto de cada vuelo
        System.out.println("Orden de Salto: Vuelo1");
        System.out.println(vuelo1.ordenSalto());
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Orden de Salto: Vuelo2");
        System.out.println(vuelo2.ordenSalto());
        


        System.out.println("\nXXXXXXXXX  SALTOS Vuelo1  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
        vuelo1.salto();
        vuelo1.salto();
        vuelo1.salto();
        vuelo1.salto();
        vuelo1.salto();

        System.out.println("\nXXXXXXXXX  SALTOS Vuelo2  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");

        vuelo2.salto();
        vuelo2.salto();
        
                
    }
    /* SALIDA QUE DEBE DE DARSE:

    XXXXXXXXX  Añadimos saltadores a Vuelo1 XXXXXXXXXXXXXXXX

    La altura de salto del cliente es superior a la altura máxima del avión
    La altura de salto del cliente es superior a la altura máxima del avión

    XXXXXXXXX  Añadimos saltadores a Vuelo2 XXXXXXXXXXXXX

    Este saltador ya se encuentra dentro del avión
    Este saltador ya se encuentra dentro del avión
    No caben más saltadores en el avión
    No caben más saltadores en el avión

    XXXXXXXXX  INFO DE LOS VUELOS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    ----- Vuelo ------- 
    Codigo: 1
    Piloto: Gustavo_Piloto apelli_piloto1Título: 2015
    Avion: CFG123 (6000) Capacidad: 5 saltadores
    Fecha del vuelo: 07/03/2023
    Saltadores: 3
    -------------------------------------------------
    Saltadores 
    Pepe_cliente Garcia --> 4500 metros
    Maria_cliente Garrido --> 4000 metros
    Leo_cliente Martin --> 5000 metros


    ----- Vuelo ------- 
    Codigo: 2
    Piloto: Pilar_Piloto apelli_piloto2Título: 2023
    Avion: BFF909 (10000) Capacidad: 5 saltadores
    Fecha del vuelo: 07/03/2023
    Saltadores: 5
    -------------------------------------------------
    Saltadores 
    Tomas_cliente Arceaga --> 6000 metros
    Paco_cliente Sanz --> 5500 metros
    Juan_cliente Lopez --> 8000 metros
    Sofia_cliente Perez --> 7000 metros
    Maria_cliente Garrido --> 4000 metros


    XXXXXXXXX  ORDEN DE SALTO  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    Orden de Salto: Vuelo1
    Leo_cliente (5000) | Maria_cliente (4000) | Pepe_cliente (4500) | 
    --------------------------------------------------------
    Orden de Salto: Vuelo2
    Maria_cliente (4000) | Sofia_cliente (7000) | Juan_cliente (8000) | Paco_cliente (5500) | Tomas_cliente (6000) | 

    XXXXXXXXX  SALTOS Vuelo1  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    El saltador Leo_cliente Martin --> 5000 metros ha saltado
    El saltador Maria_cliente Garrido --> 4000 metros ha saltado
    El saltador Pepe_cliente Garcia --> 4500 metros ha saltado
    No quedan saltadores en el avión
    No quedan saltadores en el avión

    XXXXXXXXX  SALTOS Vuelo2  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    El saltador Maria_cliente Garrido --> 4000 metros ha saltado
    El saltador Sofia_cliente Perez --> 7000 metros ha saltado

*/
}
