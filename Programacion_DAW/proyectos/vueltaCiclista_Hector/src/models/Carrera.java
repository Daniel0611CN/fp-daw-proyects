package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Carrera {
    
    // ATTRIBUTES:
    ArrayList<Equipo> equipos;
    ArrayList<Corredor> corredores;
    String nombre;


    // CONSTRUCTOR:
    public Carrera(List<Ciclista> inscritos, String nombre){

        int dorsal = 0;
        this.nombre = nombre;
        this.equipos = new ArrayList<Equipo>();
        this.corredores = new ArrayList<Corredor>();

        for (Ciclista ciclista : inscritos) 
        {
            dorsal++;

            if(!this.corredores.contains(ciclista))
            {
                this.corredores.add(new Corredor(ciclista, dorsal));
            }
        }
    }

    
    // METHODS:
    private void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void añadeEquiposCarrera(ArrayList<Equipo> lista)
    {
        this.setEquipos(lista);
    }

    public void insertarTiemposEtapa(Map<Integer, Integer> tiempos){

        // Saco el array de claves (dorsales) para poder iterar sobre la coleccion:
        ArrayList<Integer> dorsales = new ArrayList<>();
        dorsales.addAll(tiempos.keySet());
        
        // actualizo el tiempo para todos los dorsales del archivo de tiempos:
        for (Integer dorsal : dorsales)
        {
            Corredor buscado = this.buscarCorredorPorDorsal(dorsal);

            buscado.setTiempo(buscado.getTiempo() + tiempos.get(dorsal));
        }

        // Saco el tiempo máximo (pelotón):
        ArrayList<Integer> tiemposSueltos = new ArrayList<>();
        tiemposSueltos.addAll(tiempos.values());
        Collections.sort(tiemposSueltos);
        int maxTiempo = tiemposSueltos.get(tiemposSueltos.size()-1);

        // Busco todos los dorsales que no están en la lista para ponerles el tiempo del peloton:
        for (Corredor corredor : this.corredores) 
        {
            if(!dorsales.contains(corredor.getDorsal()))   
            {
                corredor.setTiempo(corredor.getTiempo() + maxTiempo);
            } 
        }
    }

    public void ordenarCorredoresPorTiempo(){

        Collections.sort(this.corredores);
    }

    public Corredor buscarCorredorPorDorsal(int dorsal){

        Corredor buscado = null;

        for (Corredor corredor : this.corredores) {
            
            if(corredor.getDorsal() == dorsal)
            {
                buscado = corredor;
            }
        }

        return buscado;
    }

    public Integer posicionCorredor(Corredor c){

        this.ordenarCorredoresPorTiempo();

        return this.corredores.indexOf(c);
    }

    public String clasificacionCompleta(){

        // FORMATO: dorsal – NombreCiclista (codEquipo) : tiempo

        // Primero ordenamos los corredores por tiempo:
        this.ordenarCorredoresPorTiempo();

        String salida = "";

        for (Corredor corredor : this.corredores) {

            salida += corredor.toString();
        }

        return salida;
    }

    public String clasificacionPorEquipos(){

        String salida = "";

        ArrayList<EquipoParticipante> listaEquiposCarrera = sumaTiemposPorEquipo();

        // Elimino los equipos que no tiene tiempo acumulado (los que no han participado con ningun ciclista):
        ArrayList<EquipoParticipante> nuevaLista = new ArrayList<>();

        for (EquipoParticipante equipoP : listaEquiposCarrera) {
            
            if(equipoP.getTiempoEquipo() != 0)
            {
                nuevaLista.add(equipoP);
            }
        }

        // Ordeno por tiempo y acumulo la clasificación de equipos:
        Collections.sort(nuevaLista);
        for (EquipoParticipante equipoParticipante : nuevaLista) {
            
            salida+= (nuevaLista.indexOf(equipoParticipante)+1) + ": " + equipoParticipante.toString();
            
        }

        return salida;
    }

    private ArrayList<EquipoParticipante> sumaTiemposPorEquipo(){

        ArrayList<EquipoParticipante> listaEquiposCarrera = new ArrayList<EquipoParticipante>();

        for (Equipo equipo : this.equipos)
        {
            int tiempoEquipo = 0;

            // Lista de los mejores corredores de ese equipo:
            List<Corredor> corredoresEquipo = this.lista3MejoresPorEquipo(equipo.getCodigo());
            
            // itero sobre los corredores de ese equipo concreto para sacar sus tiempos:
            for (Corredor corredor : corredoresEquipo) 
            {
                tiempoEquipo += corredor.getTiempo();    
            }

            EquipoParticipante nuevo = new EquipoParticipante(equipo);
            nuevo.setTiempoEquipo(tiempoEquipo);
            listaEquiposCarrera.add(nuevo);
        }
        return listaEquiposCarrera;
    }

    private List<Corredor> lista3MejoresPorEquipo(String codigoEquipo){

        List<Corredor> corredoresEquipo = new ArrayList<Corredor>();

        for (Corredor corredor : this.corredores)
        {
            if(corredor.codigoEquipo.equals(codigoEquipo))
            {
                corredoresEquipo.add(corredor);
            }
        }

        // Los ordeno por tiempo:
        Collections.sort(corredoresEquipo);

        // Saco los tres primeros para devolverlos: (compruebo que tiene al menos 3)
        List<Corredor> mejoresPorEquipo = new ArrayList<Corredor>();

        if(corredoresEquipo.size()>2)
        {
            mejoresPorEquipo = corredoresEquipo.subList(0, 3);
        }
        else
        {   // si es menor los añado todos:
            mejoresPorEquipo.addAll(corredoresEquipo);
        }

        return mejoresPorEquipo;
    }

    public String podium(){

        this.ordenarCorredoresPorTiempo();

        String podium = "";

        // sacamos los 3 primeros:
        List<Corredor> ganadores = this.corredores.subList(0, 3);

        // se imprimen con el formato adecuado:
        for (Corredor corredor : ganadores)
        {
            podium+= "Puesto " + (ganadores.indexOf(corredor)+1) + ": " + corredor.toString();
        }

        return podium;
    }

    // GETTERS & SETTERS:
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public String getNombre() {
        return nombre;
    }

}
