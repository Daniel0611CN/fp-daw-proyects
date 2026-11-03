package FUNCIONES;

public class PruebaFuncionesBasicas { // ARCHIVO PARA TESTAR FUNCIONES CREADAS EN MI LIBRERIA:
    public static void main(String[] args) {
        
        int base = 2;
        int exponente = 10;
        long resultado = UtilesParaNumeros.potencia(base, exponente);
        System.out.println("potencia: "+resultado);

        System.out.println("-------------------------------");

        int numero = 7;
        boolean primo = UtilesParaNumeros.esPrimo(numero);
        System.out.println("primo: "+primo);

        System.out.println("-------------------------------");

        int numero2 = 10;
        int nextPrimo = UtilesParaNumeros.siguientePrimo(numero2);
        System.out.println("siguiente primo: "+nextPrimo);

        System.out.println("-------------------------------");

        int numero3 = 1234567;
        long numeroDigitos = UtilesParaNumeros.digitos(numero3);
        System.out.println("número digitos: "+numeroDigitos);

        System.out.println("-------------------------------");

        long numero4 = 87498459;
        int posicion = 3;
        long digitoBuscado = UtilesParaNumeros.digitoN(numero4, posicion);
        System.out.println("digito de "+numero4+" en la posicion "+posicion+" es: "+digitoBuscado);

        System.out.println("-------------------------------");

        long numero5 = 987605432;
        int digitoBuscado2 = 3;
        long posicionEncontrada = UtilesParaNumeros.posicionDeDigito(numero5, digitoBuscado2);
        System.out.println("la posicion de "+digitoBuscado2+" en "+numero5+" es: "+posicionEncontrada);

        System.out.println("-------------------------------");

        long numero6 = 987659;
        int quitar = 3;
        long numeroRestante = UtilesParaNumeros.quitaPorDetras(numero6, quitar);
        System.out.println("Si quitas "+quitar+" digitos a "+numero6+" queda: "+numeroRestante);

        System.out.println("-------------------------------");

        long numeroRestante2 = UtilesParaNumeros.quitaPorDelante(numero6, quitar);
        System.out.println("Si quitas por delante "+quitar+" digitos a "+numero6+" queda: "+numeroRestante2);

        System.out.println("-------------------------------");

        int numPegado = 888;
        System.out.println("num a añadir: "+numPegado);
        long resultado1 = UtilesParaNumeros.pegaPorDetras(numero6, numPegado);
        System.out.println("Si pegas por detras "+numPegado+" a "+numero6+" queda: "+resultado1);

        System.out.println("-------------------------------");

        long resultado2 = UtilesParaNumeros.pegaPorDelante(numero6, numPegado);
        System.out.println("Si pegas por delante "+numPegado+" a "+numero6+" queda: "+resultado2);

        System.out.println("-------------------------------");

        long resultado3 = UtilesParaNumeros.trozoDeNumero(numero6, 1, 3);
        System.out.println("Si del numero "+numero6+" sacas el trozo entre posiciones 1 y 3 queda: "+resultado3);

        System.out.println("-------------------------------");


    }
}
