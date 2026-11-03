import models.Instituto;

public class App {
    public static void main(String[] args) throws Exception {
        

        Instituto instituto = utils.ManejoFicheros.lee_FromJson("src/resources/profesores-alumnos-notas");

        instituto.alumnosNotaMedia();
        instituto.alumnosConBeca();
        instituto.extraerAlumnosProfesor("Ana Garcia");

    }

}
