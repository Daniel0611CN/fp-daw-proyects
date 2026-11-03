package COLECCIONES.academicosLengua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RealAcademia {
    public static void main(String[] args) {
        

        HashMap <Character, Academico> academiaLengua = new HashMap<>();

        Academico a1 = new Academico("Federico Lorca", 2005);
        Academico a2 = new Academico("Miguel de Unamuno", 1999);
        Academico a3 = new Academico("Miguel Ulloa", 2010);
        Academico a4 = new Academico("Cervantes", 1980);
        Academico a5 = new Academico("Miguel Ulloa", 1975);
        Academico a6 = new Academico("Bebé Jefazo", 2023);

        System.out.println("- - - - - - - - - - - - - - - - - - - - -");

        nuevoAcademico(academiaLengua, a1, 'a');
        nuevoAcademico(academiaLengua, a2, 'b');
        nuevoAcademico(academiaLengua, a3, 'C');
        nuevoAcademico(academiaLengua, a4, 'd');
        nuevoAcademico(academiaLengua, a5, 'e');
        nuevoAcademico(academiaLengua, a1, 'a');
        nuevoAcademico(academiaLengua, a6, 'A');

        System.out.println(academiaLengua);


        // LISTADO POR NOMBRE Y AÑO: (necesito solo la parte Academico del Hashmap)

        // ArrayList<Academico> listAcademicos = (ArrayList<Academico>)academiaLengua.values();

        ArrayList<Academico> listAcademicos = new ArrayList<>();
        listAcademicos.addAll(academiaLengua.values());

        // Ordeno por su orden natural:
        Collections.sort(listAcademicos);

        // Muestro la lista ordenada:
        System.out.println(listAcademicos);



        // LISTADO CON LETRA + NOMBRE + AÑO: 
        TreeMap<Character, Academico> diccionarioOrdenado = new TreeMap<>();
        diccionarioOrdenado.putAll(academiaLengua);

        // Lo mostramos una vez ordenado:
        System.out.println(diccionarioOrdenado);

        // Podemos invertir el orden:
        System.out.println(diccionarioOrdenado.descendingMap());
        
    }

    // METODOS:

    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra)
    {
        boolean entra = false;

        if(Integer.valueOf(letra) >= 65 && Integer.valueOf(letra) <= 90 || Integer.valueOf(letra) >= 97 && Integer.valueOf(letra) <= 117)
        {

            // Tambien se puede hacer con:
            // if(Character.isAlphabetic(letra))

            // Con el valor ASCII podemos marcar las excepciones:
            // Integer.valueOf(letra) >= 65 && Integer.valueOf(letra) <= 90 || Integer.valueOf(letra) >= 97 && Integer.valueOf(letra) <= 117

            if(!academia.containsKey(letra))
            {
                academia.put(letra, nuevo);
                entra = true;
                System.out.println("El Académico " + nuevo.toString() + ", está ahora en el sillón \"" + letra + "\".\n");
            }
            else 
            {
                System.out.println("El sillón \""+ letra + "\" está ocupado");
            }
        }
        else 
        {
            System.out.println("La letra introducida no es corrrecta");
        }

        return entra;
    }

}
