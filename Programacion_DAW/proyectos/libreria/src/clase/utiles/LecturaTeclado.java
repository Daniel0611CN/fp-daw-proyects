package clase.utiles;

import java.util.Scanner;

public class LecturaTeclado {
    
    // ATRIBUTOS:
    private Scanner sc;

    // CONSTRUCTOR:
    public LecturaTeclado()
    {
        sc = new Scanner(System.in);
    }
    
    // METODOS:
    public String leerCadena()
    {
        String cadenaLeida = null;
        
        try
        {
            cadenaLeida = sc.nextLine();
        }
        catch (IllegalStateException e)
        {
            System.out.println("El Scanner está cerrado");
        }
        return cadenaLeida;
    }


    public int leerInteger()
    {
        Integer numero = null;

        boolean entradaOk = false;
        while(!entradaOk)
        {
            try
            {
                String cadenaLeida = sc.nextLine();
                numero = Integer.valueOf(cadenaLeida);
                entradaOk = true;
            }
            catch (IllegalStateException e)
            {
                System.out.println("El Scanner está cerrado");
                numero = 0;
                entradaOk = true;
            }
            catch(NumberFormatException excepcionLeida)
            {
                // System.out.println(excepcionLeida.getMessage());
                System.out.println("Dato no válido….Introduzca un dado válido por favor");
            }
            catch(Exception problemaSc)
            {
                // System.out.println(problemaSc.toString());
                System.out.println("Dato no válido….Introduzca un dado válido por favor");
            }
        }
        return numero;
    }


    public float leerFloat()
    {
        Float numero = null;

        boolean entradaOk = false;
        do
        {
            try
            {
                String cadenaLeida = sc.nextLine();
                numero = Float.valueOf(cadenaLeida);
                entradaOk = true;
            }
            catch (IllegalStateException e)
            {
                System.out.println("El Scanner está cerrado");
                numero = 0f;
                entradaOk = true;
            }
            catch(NumberFormatException excepcionLeida)
            {
                System.out.println("Dato no válido….Introduzca un dado válido por favor");
            }
            catch(Exception problemaSc)
            {
                System.out.println("Dato no válido….Introduzca un dado válido por favor");
            }

        }while(!entradaOk);

        return numero;
    }

    
    public double leerDouble()
    {
        Double numero = null;

        boolean entradaOk = false;
        do
        {
            try
            {
                String cadenaLeida = sc.nextLine();
                numero = Double.valueOf(cadenaLeida);
                entradaOk = true;
            }
            catch (IllegalStateException e)
            {
                System.out.println("El Scanner está cerrado");
                numero = 0.0;
                entradaOk = true;
            }
            catch(NumberFormatException excepcionLeida)
            {
                System.out.println("Dato no válido….Introduzca un dado válido por favor");
            }
            catch(Exception problemaSc)
            {
                System.out.println("Dato no válido….Introduzca un dado válido por favor");
            }

        }while(!entradaOk);

        return numero;
    }

    public void finalizarlectura()
    {
        if(sc != null)
        {
            sc.close();
        }
    }
}
