import java.util.List;

import models.Carrera;
import models.Ciclista;
import models.Corredor;
import utils.ManejoFicheros;

public class App {
    public static void main(String[] args) throws Exception {


        // CREO LA CARRERA LEYENDO PRIMERO LA LISTA DE INSCRITOS DEL FICHERO:
        List<Ciclista> listaInscritos = ManejoFicheros.leeListaCiclistasFromJson("src/resources/ciclistas.json");
        String nombreCarrera = "Vuelta a Malaga";

        Carrera malaga = new Carrera(listaInscritos, nombreCarrera);

        // AÑADO LOS POSIBLES EQUIPOS DEL FICHERO DE EQUIPOS:
        malaga.añadeEquiposCarrera(ManejoFicheros.leerFicheroEquipos("equipos.csv"));

        // ANTES DE EMPEZAR A ESCRIBIR EN EL FICHERO DE SALIDA TENGO QUE VER SI EXISTE Y BORRARLO PARA NO REPETIR LAS SALIDAS GUARDADAS:
        String nombreFicheroSalida = nombreCarrera.replace(" ", "");
        ManejoFicheros.borraFichero("src/resources/" + nombreFicheroSalida + ".txt");



        // ==== NOMBRE DE LA CARRERA ====
        String salida1 = "\n==== NOMBRE DE LA CARRERA ====\n\n\t" + nombreCarrera;
        ManejoFicheros.escribeEnFichero(nombreFicheroSalida, salida1);



        // ==== CICLISTAS PARTICIPANTES EN LA CARRERA ====
        String salida2 = "\n\n==== CICLISTAS PARTICIPANTES EN LA CARRERA ====\n";

        for (Corredor ciclista : malaga.getCorredores())
        {
            salida2 += ciclista.toString();
        }
        ManejoFicheros.escribeEnFichero(nombreFicheroSalida, salida2);



        // ==== CLASIFICACIÓN FINAL ====
        String salida3 = "\n\n==== CLASIFICACIÓN FINAL ====\n";

        /* Primero tenemos que añadir los tiempos de las 3 etapas: */
        malaga.insertarTiemposEtapa(ManejoFicheros.leeTiemposEtapaFromJson("src/carreraMalaga/etapa1.json"));
        malaga.insertarTiemposEtapa(ManejoFicheros.leeTiemposEtapaFromJson("src/carreraMalaga/etapa2.json"));
        malaga.insertarTiemposEtapa(ManejoFicheros.leeTiemposEtapaFromJson("src/carreraMalaga/etapa3.json"));

        salida3 += malaga.clasificacionCompleta();
        ManejoFicheros.escribeEnFichero(nombreFicheroSalida, salida3);



        // ==== PODIUM ====
        String salida4 = "\n\n=========== PODIUM ====================\n";
        salida4 += malaga.podium();
        ManejoFicheros.escribeEnFichero(nombreFicheroSalida, salida4);



        // ==== CLASIFICACIÓN POR EQUIPOS ====
        String salida5 = "\n\n==== CLASIFICACIÓN POR EQUIPOS ====\n";
        salida5 += malaga.clasificacionPorEquipos();
        ManejoFicheros.escribeEnFichero(nombreFicheroSalida, salida5);



        // ==== POSICIÓN DEL CORREDOR: Wilco Kelderman(BOHA) Dorsal: 22 ==== 
        String salida6 = "\n\n==== POSICIÓN DEL CORREDOR: Wilco Kelderman(BOHA) Dorsal: 22 ====\n\n";

        Corredor buscado = malaga.buscarCorredorPorDorsal(22);
        int posicionCorredor = malaga.posicionCorredor(buscado);

        salida6 += "Corredor con dorsal 22: " + buscado.toString();
        salida6 += "\nPosición final del corredor: " + posicionCorredor;
        ManejoFicheros.escribeEnFichero(nombreFicheroSalida, salida6);

    }
}
