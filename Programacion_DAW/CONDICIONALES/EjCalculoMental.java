package CONDICIONALES;
import java.util.Scanner;

public class EjCalculoMental {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = (int) (Math.random()*99+1);
        int num2 = (int) (Math.random()*99+1);
        int operacion = (int) (Math.random()*3);

        System.out.println("Numero aleatorio 1: "+num1);
        System.out.println("Numero aleatorio 2: "+num2);

        double resultado = 0;
        String nomOperacion = "";
        
        switch (operacion){
            case 0:
                nomOperacion = "suma";
                resultado = num1 + num2;
                break;
            case 1:
                nomOperacion = "resta";
                resultado = num1 - num2;
                break;
            case 2:
                nomOperacion = "multiplicación";
                resultado = num1 * num2;
                break;
        }
        System.out.println("Operación elegida: " + nomOperacion);

        System.out.println("Introduce tu resultado:");
        double resultadoUsuario = sc.nextDouble();

        if (resultado == resultadoUsuario){
            System.out.println("¡¡Resultado correcto!!");
        }
        else{
            System.out.println("INCORRECTO\n El resultado es "+resultado);
        }

        sc.close();
    }
}
