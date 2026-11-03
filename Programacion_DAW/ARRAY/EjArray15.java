package ARRAY;

import java.util.Scanner;

public class EjArray15 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] mesas = new int[10];

        // rellenar el array (aleatorios 0-4)
        rellenarMesas(mesas);

        // pintar las mesas
        imprimir(mesas);
        System.out.println("Cantidad comensales en el restaurante: " + comensalesTotales(mesas));

        boolean salir = false;
        // bucle para introducir personas
        do
        {
            // preguntar por la cantidad de personas
            System.out.println("\n¿Cuantos son? (-1 para salir)");
            int cantidad = sc.nextInt();

            if (cantidad == -1)
            {
                salir = true;
            }
            else if (cantidad > 4)
            {
                System.out.println("No puede haber grupos mayores de 4 personas");
            }
            else 
            {
                // introducir personas en el array
                int numeroMesaVacia = buscarPrimeraMesaVacia(mesas);

                if (numeroMesaVacia >= 0)
                {
                    mesas[numeroMesaVacia] = cantidad;
                    System.out.println("Sientense en la mesa: " + (numeroMesaVacia+1));
                }
                else // no hay mesa vacia // COMPARTIR
                {
                    numeroMesaVacia = buscarMesaParaCompartir(mesas, cantidad);

                    if (numeroMesaVacia >= 0)
                    {
                        System.out.println("Tiene que compartir, sientense en la mesa " + (numeroMesaVacia+1));
                        mesas[numeroMesaVacia] = mesas[numeroMesaVacia] + cantidad;
                    }
                    else 
                    {
                        System.out.println("No hay hueco para ustedes, lo siento");
                    }
                }

                // pintar las mesas
                imprimir(mesas);
                System.out.println("Cantidad comensales en el restaurante: " + comensalesTotales(mesas));
            }

        }while(!salir);
    }

    /**
     * Rellena con aleatorios de 0-4
     * @param array
     */
    static void rellenarMesas(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int aleatorio = (int)(Math.random()*5);
            
            array[i]= aleatorio;
        }
    }

    /**
     * Imprimir con indice en forma de tabla
     * @param array
     */
    static void imprimir(int[] array)
    {
        String ocupacion = "";

        for (int i = 0; i < array.length; i++)
        {
            ocupacion = ocupacion + " " + array[i] + "  |" ;
        }

        System.out.println("\n");
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.println("│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │");
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.println("│Ocupación│" + ocupacion);
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
        System.out.println("\n");
    }

    /**
     * Busca la primera mesa vacia
     * @param array
     * @return mesaVacia
     */
    static int buscarPrimeraMesaVacia(int[] array)
    {
        boolean noEncontrada = true;
        int mesaVacia = -1;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0 && noEncontrada)
            {
                mesaVacia = i;
                noEncontrada = false;
            }    
        }

        return mesaVacia;
    }

    /**
     * Busca mesa con hueco para compartir
     * @param array,numPersonas
     * @return mesaParaCompartir
     */
    static int buscarMesaParaCompartir(int[] array, int numPersonas)
    {
        boolean noEncontrada = true;
        int mesaParaCompartir = -1;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] + numPersonas <= 4 && noEncontrada)
            {
                mesaParaCompartir = i;
                noEncontrada = false;
            }    
        }

        return mesaParaCompartir;
    }

    /**
     * Calcula el numero total de personas en el restaurante
     * @param array
     * @return comensalesTotales
     */
    static int comensalesTotales(int[] array)
    {
        int comensalesTotales = 0;

        for (int i = 0; i < array.length; i++)
        {
            comensalesTotales = comensalesTotales + array[i];
        }
        return comensalesTotales;
    }

}
