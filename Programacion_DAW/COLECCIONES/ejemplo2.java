package COLECCIONES;

import java.util.ArrayList;
import java.util.Iterator;

public class ejemplo2 {
    
    public static void main(String[] args) {
        

        ArrayList<Integer> coleccion = new ArrayList<>();

        for (int i = 0; i < 100; i++)
        {
            coleccion.add((int)(Math.random()*10)+1);
        }

        // Mostramos la colección creada:
        System.out.println("\n\nColección original:");
        System.out.println(coleccion);
        System.out.println("Tamaño: " + coleccion.size());


        // Borramos los 5:
        // for (int i = 0; i < coleccion.size(); i++)
        // {
        //     Integer numLeido = coleccion.get(i);
    
        //     if (numLeido == 5)
        //     {
        //         coleccion.remove(i);
        //     }
        // }


        // Borramos los 5:
        ArrayList<Integer> listaAux = new ArrayList<>();
        listaAux.add(5);
        coleccion.removeAll(listaAux);

        System.out.println("\nColección cambiada:");
        System.out.println(coleccion);
        System.out.println("Tamaño: " + coleccion.size());



        // Borramos los 4 con iterator:
        Iterator<Integer> iterador = coleccion.iterator();

        while(iterador.hasNext())
        {
            Integer numero = iterador.next();

            if (numero.equals(4))
            {
                iterador.remove();
            }
        }

        System.out.println("\nColección sin los 4:");
        System.out.println(coleccion);
        System.out.println("Tamaño: " + coleccion.size());



    }
}
