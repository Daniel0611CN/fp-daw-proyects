package CLASES_T6.UsoClases;

import java.util.Scanner;

import CLASES_T6.Clases.Disco;

/**
 * ColeccionDeDiscosPrincipal.java
 * Gestión de una colección de discos.
 * 
 * @author Luis José Sánchez
 */
public class ColeccionDeDiscosPrincipal {
    public static void main(String[] args) {

    //Crea el array de discos
    Disco[] discos = new Disco[0];

    // Carga varios discos
    Disco d1 = new Disco(
        "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
    discos = insertarDiscos(discos, d1);

    Disco d2 = new Disco(
        "FGHQ64", "Metallica", "Black album", "hard rock", 46);
    discos = insertarDiscos(discos, d2);

    Disco d3 = new Disco(
        "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
    discos = insertarDiscos(discos, d3);


    int opcion;
    Scanner s = new Scanner(System.in);
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;

    do {
        System.out.println("\nCOLECCIÓN DE DISCOS");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Introduzca una opción: ");
        opcion = Integer.parseInt(s.nextLine());
        
        switch (opcion) {
        case 1:
        System.out.println("\nOPCIONES DE LISTADO");
        System.out.println("====================");
        System.out.println("1 - LISTADO COMPLETO");
        System.out.println("2 - LISTADO POR AUTOR");
        System.out.println("3 - LISTADO POR GENERO");
        System.out.println("4 - LISTADO POR DURACIÓN");
        System.out.println("Indica la opción de listado que prefieres:");
        int opcionListado = Integer.parseInt(s.nextLine());

            switch(opcionListado){
                case 1:
                    for(Disco d : discos)
                    {
                        System.out.println(d);
                    }
                break;

                case 2:
                    System.out.println("Introduce el autor que quieres ver:");
                    String autorBuscado = s.nextLine();
                    imprimeAutor(discos, autorBuscado);
                break;

                case 3:
                    System.out.println("Introduce el género que quieres ver:");
                    String generoBuscado = s.nextLine();
                    imprimeGenero(discos, generoBuscado);
                break;

                case 4:
                    System.out.println("Introduce el mínimo de duración a buscar:");
                    int min = s.nextInt();
                    System.out.println("Y el máximo:");
                    int max = s.nextInt();
                    imprimeDuracion(discos, min, max);
                break;

                default:
                    System.out.println("Opción no encontrada");
            }
        break;
        
        case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");

        System.out.println("Por favor, introduzca los datos del disco.");  
        System.out.print("Código: ");
        codigoIntroducido = s.nextLine();

        if (buscarDisco(discos, codigoIntroducido) < 0)
        {
            System.out.println("El código de ese disco ya está en uso");
        }
        else 
        {
            System.out.print("Autor: ");
            autorIntroducido = s.nextLine();
            System.out.print("Título: ");
            tituloIntroducido = s.nextLine();
            System.out.print("Género: ");
            generoIntroducido = s.nextLine();
            System.out.print("Duración: ");
            duracionIntroducida = Integer.parseInt(s.nextLine());
            
            Disco discoNuevo = new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);
            discos = insertarDiscos(discos, discoNuevo);
        }        
        break;
        
        case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = s.nextLine();
    
        int posicionEncontrada = buscarDisco(discos, codigoIntroducido);

        if(posicionEncontrada<0)
        {
            System.out.println("El código introducido no es correcto");
        }
        else 
        {
            System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
    
            System.out.println("Código: " + discos[posicionEncontrada].getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = s.nextLine();

            if (buscarDisco(discos, codigoIntroducido) > -1 && !codigoIntroducido.equals(""))
            {
                discos[posicionEncontrada].setCodigo(codigoIntroducido);
            }
            else 
            {
                System.out.println("Código ya en uso");
            }
            
            System.out.println("Autor: " + discos[posicionEncontrada].getAutor());
            System.out.print("Nuevo autor: ");
            autorIntroducido = s.nextLine();
            if (!autorIntroducido.equals("")) {
                discos[posicionEncontrada].setAutor(autorIntroducido);
            }
            
            System.out.println("Título: " + discos[posicionEncontrada].getTitulo());
            System.out.print("Nuevo título: ");
            tituloIntroducido = s.nextLine();
            if (!tituloIntroducido.equals("")) {
                discos[posicionEncontrada].setTitulo(tituloIntroducido);
            }
            
            System.out.println("Género: " + discos[posicionEncontrada].getGenero());
            System.out.print("Nuevo género: ");
            generoIntroducido = s.nextLine();
            if (!generoIntroducido.equals("")) {
                discos[posicionEncontrada].setGenero(generoIntroducido);
            }
            
            System.out.println("Duración: " + discos[posicionEncontrada].getDuracion());
            System.out.print("Duración: ");
            final String duracionIntroducidaString = s.nextLine();
            if (!duracionIntroducidaString.equals("")) {
                discos[posicionEncontrada].setDuracion(Integer.parseInt(duracionIntroducidaString));
            }
        }
        break;
        
        case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = s.nextLine();

        int posicion = buscarDisco(discos, codigoIntroducido);

        if (posicion > -1)
        {
            discos = borrarDisco(discos, posicion);
            System.out.println("Album borrado.");
        }
        else 
        {
            System.out.println("Disco no encontrado");
        }
        break;
        
        default:
        
        } // switch
    } while (opcion != 5);
    }


    /**
     * Inserta un elemento al final del array
     * @param array,elemento
     * @return nuevo
     */
    public static Disco[] insertarDiscos(Disco[] array, Disco nuevoDisco)
    {
        Disco[] nuevo = new Disco[array.length+1];

        for (int i = 0; i < array.length; i++)
        {
            nuevo[i] = array[i];
        }

        nuevo[nuevo.length-1] = nuevoDisco;

        return nuevo;
    }
    
    /**
     * Busca un valor dentro del array y devuelve su posición
     * ó -1 en caso de no aparecer ese elemento
     * @param array,elemento
     * @return posicion
     */
    public static int buscarDisco(Disco[] array, String codigo)
    {
        int posicion = -1;
        int index = 0;

        // Mientras no llegue al final de array y el valor de posicón no haya cambiado
        while(index < array.length && posicion == -1)
        {
            // Guardo la posición en el caso de encontrar un elemnto igual a elemento
            if(array[index].getCodigo().equalsIgnoreCase(codigo))
            {
                posicion = index;
            }
            index++;
        }
        return posicion;
    }

    /**
     * Elimina la posicion indicada
     * @param array
     * @return nuevo
     */
    public static Disco[] borrarDisco(Disco[] array, int posicion)
    {
        Disco[] nuevo = array;
        
        if(array.length != 0 && posicion < array.length)
        {
            nuevo = new Disco[array.length-1];

            for (int i = 0; i < array.length; i++)
            {
                if(posicion > i) // Copio la primera parte hasta la posción eliminada
                {
                    nuevo[i] = array[i];
                }
                else if(posicion < i) // Copio la segunda parte a partir de la posión eliminada
                {
                    nuevo[i-1] = array[i];
                }
            }
        }
        return nuevo;
    }

    /**
     * Busca coincidencias dentro del array y 
     * las imprime
     * @param array,autor
     */
    public static void imprimeAutor(Disco[] array, String autor)
    {
        for (Disco disco : array)
        {
            if(disco.getAutor().equalsIgnoreCase(autor))
            {
                System.out.println(disco);
            }
        }
    }

    /**
     * Busca coincidencias dentro del array y 
     * las imprime
     * @param array,autor
     */
    public static void imprimeGenero(Disco[] array, String genero)
    {
        for (Disco disco : array)
        {
            if(disco.getGenero().equalsIgnoreCase(genero))
            {
                System.out.println(disco);
            }
        }
    }

    /**
     * Busca coincidencias dentro del array y 
     * las imprime
     * @param array,autor
     */
    public static void imprimeDuracion(Disco[] array, int min, int max)
    {
        for (Disco disco : array)
        {
            if(disco.getDuracion() > min && disco.getDuracion() < max)
            {
                System.out.println(disco);
            }
        }
    }

}

