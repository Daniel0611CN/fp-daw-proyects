import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        System.out.println(" - - - - - - - Leo con FileReader - - - - ");
        FileReader fr = null;
    
        try 
        {
            fr = new FileReader("src/recursos/fichero1.txt");
            int caracterLeido = fr.read();

            while (caracterLeido != -1)
            {
                System.out.print((char)caracterLeido);
                caracterLeido = fr.read();
            }
        }
        catch (FileNotFoundException e1)
        {
            System.out.println(e1.getMessage());
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        finally
        {
            if(fr != null)
            {
                fr.close();
            }
        }


        System.out.println("\n\n-------------------------------------");
        System.out.println(" - - - - - Leo con BufferReader - - - - -");

        BufferedReader bf = null;

        try 
        {
            bf = new BufferedReader(new FileReader("src/recursos/fichero1.txt"));

            String linea = bf.readLine();

            while(linea!=null)
            {
                System.out.println(linea); // Aquí si ponemos un salto de linea porque el buffer se lo come al leerlo
                linea = bf.readLine();
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally 
        {
            if(bf!=null)
            {
                bf.close();
            }
            if(fr!=null)
            {
                fr.close();
            }
        }


        System.out.println("\n\n-------------------------------------");
        System.out.println(" - - - - - Leo con Scanner - - - - -");

        String numeros = "10 34 6 20";
        Scanner sc = new Scanner(numeros);
        int sumaTotal = 0;

        while(sc.hasNextInt())
        {
            int numeroNuevo = sc.nextInt();
            sumaTotal += numeroNuevo;
        }

        System.out.println("Suma total: " + sumaTotal);

        sc.close();


        sumaTotal = 0;

        // UTILIZANDO STRING:
        String[] trozosNumeros = numeros.split(" ");

        for (int i = 0; i < trozosNumeros.length; i++)
        {
            try 
            {
                int numero = Integer.valueOf(trozosNumeros[i]);
                sumaTotal += numero;

            } 
            catch (NumberFormatException numberFormatException) 
            {
                System.out.println(numberFormatException.getMessage());
            } 
        }
        System.out.println("Suma total 2: " + sumaTotal);


        // FICHERO NUMEROS:
        System.out.println("\n- - L E E R    F I C H E R O    N U M E R O S - -\n");

        BufferedReader bNum = null;
        String lineaNum = null;
        int suma = 0;

        try 
        {
            bNum = new BufferedReader(new FileReader("src/recursos/ficheroNumeros.txt"));
            lineaNum = bNum.readLine();

            int index = 1;
            while(lineaNum!=null)
            {
                
                if(!lineaNum.isEmpty())
                {
                    String[] numerosSueltos = lineaNum.split(" ");
                    
                    for (int i = 0; i < numerosSueltos.length; i++)
                    {
                        try 
                        {
                            int numero = Integer.valueOf(numerosSueltos[i]);
                            suma += numero; 
                        } 
                        catch (NumberFormatException numberException) 
                        {
                            // System.out.println("Linea vacía");
                            /* Esto lo hago en el if antes del bucle para controlar que no llegue al error */
                        } 
                    }

                    System.out.println("Suma de línea " + index + ": " + suma);

                }
                else 
                {
                    System.out.println("Línea " + index + " vacía");
                }


                // actualizo variables:
                lineaNum = bNum.readLine();
                index++;
                suma = 0;
            }
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.out.println(ex.getStackTrace());
        }
        finally 
        {
            if(bf!=null)
            {
                bNum.close();
            }
            if(fr!=null)
            {
                fr.close();
            }
        }
    }
}
