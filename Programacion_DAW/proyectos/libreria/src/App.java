import clase.utiles.LecturaTeclado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Inicio de programa:");

        LecturaTeclado lc = new LecturaTeclado();

        int numeroLeido = lc.leerInteger();

        System.out.println("Numero leído: " + numeroLeido);

        lc.finalizarlectura();

        numeroLeido = lc.leerInteger();

        System.out.println("Numero leído 2: " + numeroLeido);
    }
}
