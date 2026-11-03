import java.util.ArrayList;
import java.util.HashMap;

import models.Evento;
import models.ListaEventos;
import utils.ManejoFicheros;

public class App {
    public static void main(String[] args) throws Exception {
        


        // Leo los eventos de CSV, aplico los métodos y vuelco la salida en ficheros:
        ArrayList<Evento> listaEventosCsv = ManejoFicheros.leerFicheroEventos("206974-0-agenda-eventos-culturales-100.csv");
        // System.out.println(listaEventosCsv);
        System.out.println("Número de eventos listados en el archivo CSV: " + listaEventosCsv.size());


        /**** LISTADO DE EVENTOS GRATIS: ****/
        ArrayList<Evento> listaEventosGratis = extraeListaEventosGratuitos(listaEventosCsv);
        // System.out.println(listaEventosGratis);

        String salida1 = " - - - - - LISTA DE EVENTOS GRATIS (CSV) - - - - - ";
        salida1 += "\nnúmero de eventos listados en el fichero: " + listaEventosGratis.size() + "\n";
        salida1 += listaEventosGratis;
        // Borro el fichero de salida si existe y vuelco la salida en un .txt
        ManejoFicheros.borraFichero("src/output/Eventos_gratis_CSV.txt");
        // Lo vuelco en el fichero:
        ManejoFicheros.escribeEnFichero("Eventos_gratis_CSV", salida1);


        /**** LISTADO DE EVENTOS GRATIS POR CÓDIGO POSTAL: 28009 ****/
        ArrayList<Evento> listaEventosGratis28009 = extraeListaEventosPorCP(listaEventosCsv, "28009");
        listaEventosGratis28009 = extraeListaEventosGratuitos(listaEventosGratis28009);
        // System.out.println(listaEventosGratis28009);

        String salida2 = " - - - - - LISTA DE EVENTOS GRATIS EN CP: 28009 (CSV) - - - - - ";
        salida2 += "\nnúmero de eventos listados en el fichero: " + listaEventosGratis28009.size() + "\n";
        salida2 += listaEventosGratis28009;
        // Borro el fichero de salida si existe y vuelco la salida en un .txt
        ManejoFicheros.borraFichero("src/output/Eventos_gratis_28009_CSV.txt");
        // Lo vuelco en el fichero:
        ManejoFicheros.escribeEnFichero("Eventos_gratis_28009_CSV", salida2);


        /**** NÚMERO DE EVENTOS TOTALES POR CÓDIGO POSTAL ****/
        HashMap<String, Integer> diccionarioNumEventos = diccionarioNumEventosPorCP(listaEventosCsv);
        // System.out.println(diccionarioNumEventos);

        String salida3 = " - - - - - NÚMERO DE EVENTOS POR CÓDIGO POSTAL (CSV) - - - - - ";
        salida3 += imprimeMapaEventos(diccionarioNumEventos);
        // Borro el fichero de salida si existe y vuelco la salida en un .txt
        ManejoFicheros.borraFichero("src/output/Eventos_por_CP_CSV.txt");
        // Lo vuelco en el fichero:
        ManejoFicheros.escribeEnFichero("Eventos_por_CP_CSV", salida3);
        

        /********************/
        /******* JSON *******/
        /********************/

        ListaEventos listaEventosJson = ManejoFicheros.leeListaEventosJson("206974-0-agenda-eventos-culturales-100.json");
        // System.out.println(listaEventosJson);
        System.out.println("Número de eventos listados en el archivo JSON: " + listaEventosJson.getGraph().size());


        /**** LISTADO DE EVENTOS GRATIS: ****/
        ArrayList<Evento> listaEventosGratisJSON = extraeListaEventosGratuitos(listaEventosJson.getGraph());

        String salida4 = " - - - - - LISTA DE EVENTOS GRATIS (JSON) - - - - - ";
        salida4 += "\nnúmero de eventos listados en el fichero: " + listaEventosGratisJSON.size() + "\n";
        salida4 += listaEventosGratisJSON;

        ManejoFicheros.borraFichero("src/output/Eventos_gratis_JSON.txt");
        ManejoFicheros.escribeEnFichero("Eventos_gratis_JSON", salida4);


        /**** LISTADO DE EVENTOS GRATIS POR CÓDIGO POSTAL: 28009 ****/
        ArrayList<Evento> listaEventosGratis28009JSON = extraeListaEventosPorCP(listaEventosJson.getGraph(), "28009");
        listaEventosGratis28009JSON = extraeListaEventosGratuitos(listaEventosGratis28009JSON);

        String salida5 = " - - - - - LISTA DE EVENTOS GRATIS EN CP: 28009 (JSON) - - - - - ";
        salida5 += "\nnúmero de eventos listados en el fichero: " + listaEventosGratis28009JSON.size() + "\n";
        salida5 += listaEventosGratis28009JSON;

        ManejoFicheros.borraFichero("src/output/Eventos_gratis_28009_JSON.txt");
        ManejoFicheros.escribeEnFichero("Eventos_gratis_28009_JSON", salida5);


        /**** NÚMERO DE EVENTOS TOTALES POR CÓDIGO POSTAL ****/
        HashMap<String, Integer> diccionarioNumEventosJSON = diccionarioNumEventosPorCP(listaEventosJson.getGraph());

        String salida6 = " - - - - - NÚMERO DE EVENTOS POR CÓDIGO POSTAL (JSON) - - - - - ";
        salida6 += imprimeMapaEventos(diccionarioNumEventosJSON);

        ManejoFicheros.borraFichero("src/output/Eventos_por_CP_JSON.txt");
        ManejoFicheros.escribeEnFichero("Eventos_por_CP_JSON", salida6);

    }



    // METHODS:

    /**
     * Devuelve un String con la salida del mapa formateada
     * @param diccionario
     * @return
     */
    public static String imprimeMapaEventos(HashMap<String, Integer> diccionario){

        String salida = "\n";

        for (String codigo_postal : diccionario.keySet())
        {
            salida += "cód. postal: " + codigo_postal + " - " + diccionario.get(codigo_postal) + " eventos.\n";
        }

        return salida;
    }


    /**
     * Se le pasa una lista de eventos y devuelve otra con los que son gratuitos
     * @param lista
     * @return
     */
    public static ArrayList<Evento> extraeListaEventosGratuitos(ArrayList<Evento> lista){

        ArrayList<Evento> nuevaLista = new ArrayList<>();

        for (Evento evento : lista) 
        {
            if(evento.getFree().equals("1"))
            {
                nuevaLista.add(evento);
            }
        }

        if(nuevaLista.size()>0)
        {
            return nuevaLista;
        }
        else 
        {
            return null;
        }
    }


    /**
     * Se le pasa una lista de eventos y un Codigo Postal y devuelve la lista de eventos
     * de ese codigo postal indicado
     * @param lista
     * @param cp
     * @return
     */
    public static ArrayList<Evento> extraeListaEventosPorCP(ArrayList<Evento> lista, String cp){

        ArrayList<Evento> nuevaLista = new ArrayList<>();

        for (Evento evento : lista) 
        {
            // Control de nulos:
            if(evento.getAddress() != null)
            {
                if(evento.getAddress().getArea() != null)
                {
                    if(evento.getAddress().getArea().getPost_code().equals(cp))
                    {
                        nuevaLista.add(evento);
                    }
                }
            }
        }

        if(nuevaLista.size()>0)
        {
            return nuevaLista;
        }
        else 
        {
            return null;
        }
    }


    /**
     * Se le pasa una lista de eventos y devuelve un diccionario con los códigos postales como
     * clave y el numero de eventos encontrados para ese codigo postal como valor
     * @param lista
     * @return
     */
    public static HashMap<String, Integer> diccionarioNumEventosPorCP(ArrayList<Evento> lista){

        HashMap<String, Integer> diccionario = new HashMap<>();

        for (Evento evento : lista) 
        {
            String cpBuscado = "";

            // Control de nulos:
            if(evento.getAddress() != null)
            {
                if(evento.getAddress().getArea() != null)
                {
                    if(evento.getAddress().getArea().getPost_code() != null)
                    {
                        cpBuscado = evento.getAddress().getArea().getPost_code();
                    }
                }
            }

            if(!diccionario.containsKey(cpBuscado))
            {
                ArrayList<Evento> lista_Cp = extraeListaEventosPorCP(lista, cpBuscado);

                if(lista_Cp != null) 
                {
                    int cantidad = lista_Cp.size();
    
                    diccionario.put(cpBuscado, cantidad);
                }
            }
        }

        if(diccionario.size()>0)
        {
            return diccionario;
        }
        else 
        {
            return null;
        }

    }
}
