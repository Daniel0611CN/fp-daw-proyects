import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.Coche;
import modelo.Employee;
import modelo.People;
import modelo.Person;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        /* - COCHES - - - - - - - - - - - - - - - - - - - - -  */
        
        // List<Coche> listaCoches = jsonUtils.LeerListCochesFromJsonFile("src/recursos/cochesArray.json");

        // listaCoches.add(jsonUtils.LeerCocheFromJsonFile("src/recursos/coche.json"));

        // jsonUtils.convertCarToJson(listaCoches);




        /* - PEOPLE - - - - - - - - - - - - - - - - - - - - - -  */

        People gente = jsonUtils.LeerPeopleFromJsonFile("src/recursos/people.json");

        System.out.println(gente);

        People personas24 = gente.sacaSoloPersonasDe24();

        System.out.println(personas24);

        jsonUtils.convertPeopleToJson(personas24);


        /* - DNI - - - - - - - - - - - - - - - - - - - - - -  */

        HashMap<String, Person> diccionarioDni = new HashMap<>();

        diccionarioDni = jsonUtils.LeerMapaDniFromJsonFile("src/recursos/mapaDni.json");

        System.out.println(diccionarioDni);





        /* - EMPLOYEE - - - - - - - - - - - - - - - - - - - - -  */

        // //Leer Json que contiene 1 objeto y convertirlo en objeto 
        // jsonUtils.LeerEmpleadoFromJsonFile("src/recursos/employee.txt");

        // System.out.println("==============================================");


        // //Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto> 
        // List<Employee> listaEmpleados = jsonUtils.LeerListEmpleadoFromJsonFile("src/recursos/employeeArray.txt");
        // System.out.println("====== ARRAY EMPLEADOS ========================");

        // for (Employee employee : listaEmpleados) {
        //     System.out.println(employee);
        // }

        // System.out.println("==============================================");

        // //Convertir objeto a Json
        // jsonUtils.convertToJson();
    }
}
