package BASES_DATOS;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio_CRUD_Hector {

    static Scanner sc = new Scanner(System.in);


    // FINALS USADOS PARA EL ESTILO DEL PROGRAMA:
    static final String ANSI_GREEN_BG = "\u001B[42m";
    static final String ANSI_WHITE_BG = "\u001B[47m";
    static final String ANSI_RED_BG = "\u001B[41m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {

        // VARIABLES CONEXION CON BASE DE DATOS:
        Connection conexion;
        System.setProperty("jdbc.drivers", "com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/people";
        String user = "admin";
        String pass = "admin";

        
        try
        {
        conexion = DriverManager.getConnection(url ,user, pass);
        System.out.println("Conexión realizada con éxito.");


        // VARIABLES BUCLE:
        boolean salir = false;
        int opcion = 0;

        // BUCLE MENU:
        do
        {
            opcion = menu();

            switch(opcion)
            {
                case 1:
                    consulta(conexion);
                    break;
                case 2:
                    alta(conexion);
                    break;
                case 3:
                    baja(conexion);
                    break;
                case 4:
                    modificaDatos(conexion);
                    break;
                case 0:
                    salir = true;
                    System.out.println(ANSI_WHITE_BG + "\t\tHasta pronto\t\t" + ANSI_RESET);
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelve a intentarlo");
            }
            System.out.println();

        }while(!salir); // FIN BUCLE

        // Cierro la conexión al salir del programa:
        conexion.close();
        System.out.println("Conexión cerrada correctamente.");

        }
        catch (SQLException sqle)
        {
        System.out.println(ANSI_RED_BG + sqle.getErrorCode() + " -> " + sqle.getMessage() + ANSI_RESET);
        }
    }


    /****** FUNCIONES: ********/

    /**
     * Función que muestra el menú de opciones y recoge y devuelve un entero 
     * con la opción que utilizará el switch
     * @return opcion
     */
    static int menu()
    {
        System.out.println("\n\t" + ANSI_GREEN_BG + "BIENVENIDO AL MENÚ CLIENTE DE \'EL CORTE INGLÉS\'" + ANSI_RESET + "\n");
        System.out.println("1 - Consulta de datos");
        System.out.println("2 - Alta nueva");
        System.out.println("3 - Baja de persona");
        System.out.println("4 - Modificar datos");
        System.out.println("0 - Salir");
        System.out.println("---------------------------------------------");
        System.out.println(" Indique una opción:\n");

        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }


    /**
     * Realiza la consulta de un campo de la base de datos por DNI o por teléfono
     * @param conexion
     */
    static void consulta(Connection conexion)
    {
        String dniBuscado = "";
        do {
            String consulta = "select nombre, apellidos, telefono from people where dni = ";
            System.out.println("Inserta el DNI de la persona:");
            dniBuscado = sc.nextLine();
            
            // Compruebo que el dni es válido:
            if(dniEsValido(dniBuscado))
            {
                consulta = consulta + "'" + dniBuscado + "'";
                try
                { 
                    Statement st;
                    st=conexion.createStatement();
                    ResultSet rs;
                    rs=st.executeQuery(consulta);
                    rs.next();
        
                    String nombre = rs.getString("nombre");
                    String apellidos = rs.getString("apellidos");
                    String telefono = rs.getString("telefono");
                    System.out.println("\n" + ANSI_GREEN + "Persona encontrada:" + ANSI_RESET);
                    System.out.println("Nombre -> " + nombre);
                    System.out.println("Apellidos -> " + apellidos);
                    System.out.println("Teléfono -> " + telefono);
                }
                catch (SQLException sqle)
                {
                System.out.println(ANSI_RED_BG + sqle.getErrorCode() + " -> " + sqle.getMessage() + ANSI_RESET);
                }
            }
            else 
            {
                System.out.println(ANSI_RED + "El formato de DNI introducido no es correcto" + ANSI_RESET + "\n");
            }    

        } while (!dniEsValido(dniBuscado));
    }


    /**
     * Da de alta un nuevo registro en la base de datos
     * @param conexion
     */
    static void alta(Connection conexion)
    {
        String dniNuevo = "";
        do {
            String consulta = "insert into people values(";

            System.out.println("\nInserta el DNI de la persona:");
            dniNuevo = sc.nextLine();
            
            // Compruebo que el dni es válido:
            if(dniEsValido(dniNuevo))
            {
                System.out.println("Inserta el nombre de la persona:");
                String nombre = sc.nextLine();

                System.out.println("Inserta el apellido de la persona:");
                String apellido = sc.nextLine();

                System.out.println("Inserta el teléfono de la persona:");
                String telefono = sc.nextLine();

                consulta = consulta + "'" + dniNuevo + "','" + nombre + "','" + apellido + "','" + telefono + "')";
                
                try
                { 
                    Statement st;
                    st=conexion.createStatement();
                    st.executeUpdate(consulta);

                    System.out.println(ANSI_GREEN + "Usuario creado correctamente" + ANSI_RESET);
                }
                catch (SQLException sqle)
                {
                System.out.println(ANSI_RED_BG + sqle.getErrorCode() + " -> " + sqle.getMessage() + ANSI_RESET);
                }
            }
            else 
            {
                System.out.println(ANSI_RED + "El formato de DNI introducido no es correcto" + ANSI_RESET + "\n");
            }    

        } while (!dniEsValido(dniNuevo));
    }


    /**
     * Borra un registro de la base de datos buscando por el DNI
     * @param conexion
     */
    static void baja(Connection conexion)
    {
        String consulta = "delete from people where dni = ";
        System.out.println("Inserta el DNI de la persona:");
        String dniBuscado = sc.nextLine();
        consulta = consulta + "'" + dniBuscado + "'";
        
        try
        { 
            Statement st;
            st=conexion.createStatement();
            st.executeUpdate(consulta);

            System.out.println(ANSI_GREEN + "Usuario borrado correctamente" + ANSI_RESET);
        }
        catch (SQLException sqle)
        {
        System.out.println(ANSI_RED_BG + sqle.getErrorCode() + " -> " + sqle.getMessage() + ANSI_RESET);
        }
    }


    /**
     * Modifica los datos de un registro de la base de datos, guardando antes los campos iniciales para
     * no machacarlos en caso de no ser correctos
     * @param conexion
     */
    static void modificaDatos(Connection conexion)
    {
        String consultaInicial = "select nombre, apellidos, telefono from people where dni = ";
        System.out.println("Inserta el DNI de la persona:");
        String dniBuscado = sc.nextLine();
        consultaInicial = consultaInicial + "'" + dniBuscado + "'";
     
        try
        {
            Statement st;
            st=conexion.createStatement();
            ResultSet rs;
            rs=st.executeQuery(consultaInicial);
            rs.next();

            String nombre = rs.getString("nombre");
            String apellidos = rs.getString("apellidos");
            String telefono = rs.getString("telefono");

            String consulta = "update people set nombre=";
            String consulta2 = "where dni='" + dniBuscado + "'";


            System.out.println("Inserta el nombre de la persona:");
            String nombreNuevo = sc.nextLine();
            if(nombreNuevo.length()==0)
            {
                nombreNuevo = nombre;
            }
    
            System.out.println("Inserta el apellido de la persona:");
            String apellidoNuevo = sc.nextLine();
            if(apellidoNuevo.length()==0)
            {
                apellidoNuevo = apellidos;
            }
    
            System.out.println("Inserta el teléfono de la persona:");
            String telefonoNuevo = sc.nextLine();
            if(telefonoNuevo.length()==0)
            {
                telefonoNuevo = telefono;
            }

            consulta = consulta + "'" + nombreNuevo + "',apellidos='" + apellidoNuevo + "',telefono='" + telefonoNuevo + "'" + consulta2;
            st.executeUpdate(consulta);

            System.out.println(ANSI_GREEN + "Usuario modificado correctamente" + ANSI_RESET);

        }
        catch (SQLException sqle)
        {
        System.out.println(ANSI_RED_BG + sqle.getErrorCode() + " -> " + sqle.getMessage() + ANSI_RESET);
        }
    }


    /**
     * Comprueba que el dni sea válido y devuelve true o false
     * @param dni
     * @return valido
     */
    static boolean dniEsValido(String dni)
    {
        boolean valido = true;

        if(dni.length()==8)
        {
            boolean isDigit = true;
            for (int i = 0; i < dni.length(); i++)
            {
                isDigit = Character.isDigit(dni.charAt(i));

                if(isDigit == false)
                {
                    valido = isDigit;
                }
            }
        }
        else 
        {
            valido = false;
        }
        return valido;
    }
}
