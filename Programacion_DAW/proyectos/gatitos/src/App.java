public class App {
    public static void main(String[] args) throws Exception {


        Gato macho = new Gato("Mostri", "Persa", "Macho");
        Gato macho2 = new Gato("Tigre", "Albino", "Macho");
        Gato hembra = new Gato("Lady", "Garfield", "Hembra");

        Gato cria = macho.apareaCon(hembra);
        System.out.println(cria);

        Gato cria2 = macho.apareaCon(macho2);
        System.out.println(cria2);

        Gato cria3 = hembra.apareaCon(macho2);
        System.out.println(cria3);
        
    }
}
