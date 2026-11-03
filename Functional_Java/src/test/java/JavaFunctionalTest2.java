import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaFunctionalTest2 {

    private List<String> listaMutable;
    private List<String> listaInmutable;


    @BeforeEach
    void setUp() {

        //       Creador de lista MUTABLE: asList => la lista creada puede cambiar
        //                          |
        //                          V
        List<String> listaMutable = Arrays.asList("uno", "dos", "tres");


        //       Creador de lista INMUTABLE: of => la lista creada no puede cambiar
        //                          |
        //                          V
        List<String> listaInmutable = List.of("uno", "dos", "tres");

    }

    @Test
    void iterarAntesDeJAVA8() {

        //IMPLEMENTACIÓN CON ÍNDICE (MALA PRÁCTICA)
        for( int i = 0; i < listaMutable.size(); i++ ) {

            String valor = listaMutable.get(i);
            System.out.println(valor);

        }

        //MEJOR UTILIZAR Iterator
        for (Iterator<String> it = listaMutable.iterator(); it.hasNext();) { // EL ITERADOR SIEMPRE ES MEJOR QUE EL ÍNDICE;
            String valor = it.next();
            System.out.println(valor);
        }
        //          ^
        //          |
        //          V
        //MEJOR TODAVÍA foreach el equivalente del código anterior
        for ( String valor : listaMutable) {
            System.out.println(valor);
        }

        Assertions.assertTrue(true);

    }

    // UN CONSUMER ES UN METODO QUE RECIBE INFO, PERO NO DEVUELVE NADA, Y EL SUPPLIER ES LO CONTRARIO;

    @Test
    void iterarDespuesDeJAVA8() {


        //forEach con Clase Anónima Interna de la Interfaz Funcional: Consumer<T>
        //                                                               |
        //                           ------------------------------------
        //                          |
        //                          V
        listaMutable.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //forEach sobre referencia a Clase Anónima Interna de la Interfaz Funcional: Consumer<T>
        //                                                               |
        //                             -----------------------------------
        //                             |
        //                             V
        Consumer<String> consumerStr = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        listaMutable.forEach(consumerStr);

        //Mediante lambda (función anónima) con firma de Consumer<T>
        //          |
        //           ---------------------
        //                                V
        listaMutable.forEach((String valor) -> { System.out.println(valor); }); // AQUI NO ES NECESARIO PONER STRING, YA QUE EL FOR EACH VIENE DEL METODO listaMutable, TIENE EL TIPO DEL VALOR QUE SE VA A INDICAR;

        //Mediante lambda (función anónima) con firma de Consumer<T> con inferencia de tipo y sin cuerpo {...}
        //          |
        //           --------
        //                   V
        listaMutable.forEach((v) -> System.out.println(v) ); // TAMPOCO ES NECESARIO PONER LOS {}, CUANDO EL LAMBDA OCUPA UNA SOLA LINEA;

        //Mediante simplificación de lambda a referencia a método
        //                                      |
        //                              ---------
        //                              V
        listaMutable.forEach(System.out::println);

    }

    @Test
    void transformarColeccion() {

        //La referencia listNueva es efectivamente final, puesto que no se va a cambiar en el bloque de código la ref.
        // SÍ PUEDO CAMBIAR EL ESTADO DEL OBJETO ARRAYLIST, AÑADIR, LO QUE NO PUEDE CAMBIAR ES LA REFERENCIA!!
        /*final*/ List<String> listNueva = new ArrayList<>();
        listaMutable.forEach((v) -> {
                if (v.startsWith("d")) {
                    listNueva.add (v);
                }
            }
        );

        //MEJOR CON STREAMS, FILTROS Y COLLECTORS
        List<String> listNueva2 =  listaMutable.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("d");
            }
        }).collect(Collectors.toList());

        //PERO EN VEZ DE CLASE ANÓNIMA INTERNA UNA LAMBDA SIN CUERPO (POR SER SÓLO UNA EXPRESIÓN)
        List<String> listNueva3 =  listaMutable.stream().filter( (s) -> s.startsWith("d") ).collect(Collectors.toList());

        //SE PUEDE REDUCIR:
        List<String> listNueva4 =  listaMutable.stream().filter( (s) -> s.startsWith("d") ).toList();


    }


}
