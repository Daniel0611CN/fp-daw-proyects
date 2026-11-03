package COLECCIONES;

import java.util.HashMap;
import java.util.HashSet;

import CLASES_T6.Clases_Herencia.Instituto.ProfesorTitular;

public class EjemploMapa {
    public static void main(String[] args) {
        

        HashMap<Integer, String> alumnos = new HashMap<>();


        // INSERTAR ALUMNOS:
        alumnos.put(1, "Paco");
        alumnos.put(2, "Alfredo");
        alumnos.put(3, "David");
        alumnos.put(4, "Ricardo");

        // CUIDADO QUE CON PUT MACHACO EL VALOR ANTERIOR:
        alumnos.put(2, "Jose");

        System.out.println(alumnos);

        // BUSCAR POR CLAVE:

        String alumnoBuscado = alumnos.get(2);
        System.out.println("Alumno buscado: " + alumnoBuscado);

        // PUEDO PREGUNTAR POR UNA CLAVE CONCRETA:
        if(alumnos.containsKey(5))
        {
            System.out.println("SI ESTA LA CLAVE 5");
        }
        else 
        {
            System.out.println("NO ESTÁ LA CLAVE 5");
        }

        // PUEDO PREGUNTAR POR VALOR:
        boolean estajose = alumnos.containsValue("Jose");
        System.out.println("Esta Jose: " + estajose);


        // PUEDO BORRAR POR CLAVE:
        alumnos.remove(2);
        System.out.println(alumnos);

        // PUEDO CREAR UNA COLECCION CON LAS CLACES:
        HashSet<Integer> conjuntoClaves = new HashSet<>(alumnos.keySet());
        System.out.println("Las claves son " + conjuntoClaves);

        // Y AHORA YA PUEDO USAR UN BUCLE FOR:
        for (Integer clave : conjuntoClaves)
        {
            System.out.println(clave + " - " + alumnos.get(clave));
        }

        HashMap<Integer, ProfesorTitular> claustro = new HashMap<>();

        ProfesorTitular p1 = new ProfesorTitular(alumnoBuscado, 0, alumnoBuscado, estajose, 0);

        claustro.put(1, p1);

        ProfesorTitular pt = claustro.get(1);
        System.out.println(pt.getSalario());

        

        


    }
}
