package BASES_DATOS;

import java.sql.*;
import java.util.Scanner;
public class CrudEjemplo1 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String dni;
        String consulta;
        String nombre;
        String apellidos;
        String telefono;
        Connection connection;
        System.setProperty("jdbc.drivers", "com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/people";
        //Ojo, establecer las credenciales de la BBDD llamada "BDEjemplo1"
        String user = "administrador";
        String pass = "administrador";
    try{    
        System.out.print("Introduzca el DNI del sujeto : ");
        dni=sc.nextLine();
        connection = DriverManager.getConnection(url ,user, pass);
        System.out.println("Connection success.");
        Statement st = connection.createStatement();
        ResultSet rs;
        
        consulta = "select nombre, apellidos, telefono from people where dni = ";
        consulta = consulta + "'" + dni + "'";
        rs=st.executeQuery(consulta);
        rs.next();
        nombre = rs.getString("nombre");
        apellidos = rs.getString("apellidos");
        telefono = rs.getString("telefono");
        System.out.println("NOMBRE    -> " + nombre);
        System.out.println("APElLIDOS -> " + apellidos);
        System.out.println("TELÉFONO  -> " + telefono);
        connection.close();
        //Caso 2: cambiar el apellido
        //Has leido por terminal el apellido
        System.out.print("Introduzca el Apellido del sujeto : ");
        dni=sc.nextLine();
        consulta = "update people set apellido = '" +apellidos+"'where dni='"+dni+"'";
        System.out.println("Connection closed.");
        } catch (SQLException sqle){
        System.out.println(sqle.getMessage());
        }
        
    }
}
