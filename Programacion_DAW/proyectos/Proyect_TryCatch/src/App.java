import utiles.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Try-Catch!");


        Calculadora calc = new Calculadora();

        int resultadoDiv = calc.dividir(10, 2);
        System.out.println(resultadoDiv);

        Integer resultadoDiv2 = calc.dividir(10, 0);

        if(resultadoDiv2 != null)
        {
            System.out.println(resultadoDiv2);
        }
        else 
        {
            System.out.println("No se ha realizado la división");
        }


    }
}
