package CLASES_T6.Clases_Herencia.Instituto;

public class UsoInstituto {
    public static void main(String[] args) {
        

        Persona[] asistentes = new Persona[0];

        ProfesorTitular pT1 = new ProfesorTitular("Alfonso", "659-345-543", "programator@daw.es", 2500, "Programacion", true, 5);
        ProfesorTitular pT2 = new ProfesorTitular("Antonio", "644-895-541", "programator2@daw.es", 2000, "Programacion", false, 4);
        ProfesorTitular pT3 = new ProfesorTitular("Lazaro", "677-335-199", "redes@daw.es", 2500, "Programacion", true, 12);

        ProfesorInterino pI4 = new ProfesorInterino("Bea", "648-798-321", "fol@daw.es", 1800, "Fol", false);
        ProfesorInterino pI5 = new ProfesorInterino("Miguel", "699-791-992", "mysql@daw.es", 1800, "Data", false);

        Estudiante E1 = new Estudiante("Hector", "999-999-999", "estudia1@daw.es", 1111, 9);
        Estudiante E2 = new Estudiante("Paco", "999-888-888", "estudia2@daw.es", 2222, 8);
        Estudiante E3 = new Estudiante("Miriam", "111-111-111", "estudia3@daw.es", 3333, 10);
        Estudiante E4 = new Estudiante("Luis", "222-999-999", "estudia4@daw.es", 4444, 8.5);
        Estudiante E5 = new Estudiante("Soraya", "666-999-555", "estudia5@daw.es", 5555, 7.2);

        System.out.println(pT1.toString());
        System.out.println(pT2.toString());
        System.out.println(pT3.toString());
        System.out.println(pI4.toString());
        System.out.println(pI5.toString());


        System.out.println(E1.toString());
        System.out.println(E2.toString());
        System.out.println(E3.toString());
        System.out.println(E4.toString());
        System.out.println(E5.toString());


        addPersona(asistentes, pT1);
        addPersona(asistentes, pT2);
        addPersona(asistentes, pT3);
        addPersona(asistentes, pI4);
        addPersona(asistentes, pI4);
        addPersona(asistentes, pI5);

        addPersona(asistentes, E1);
        addPersona(asistentes, E2);
        addPersona(asistentes, E3);
        addPersona(asistentes, E4);
        addPersona(asistentes, E3);
        addPersona(asistentes, E5);

        int numero = asistentes.length;
        System.out.println(numero);

        System.out.println(mostrar(asistentes));

    }


    // METODOS:

    /**
     * Inserta una persona al final del array
     * @param personas,nueva
     */
    public static void addPersona(Persona[] personas, Persona nueva)
    {
        boolean yaEsta = false;

        // Comprobamos si la persona ya está en el instituto:
        for (int i = 0; i < personas.length; i++)
        {
            if(nueva.equals(personas[i]))
            {
                yaEsta = true;
                System.out.println("ya esta");
            }
        }
        System.out.println(yaEsta);


        if(yaEsta == false)// En caso contrario creamos el nuevo array y añadimos la persona
        {
            Persona[] nuevo = new Persona[personas.length+1];

            for (int i = 0; i < personas.length; i++)
            {
                nuevo[i] = personas[i];
                System.out.println("segundo for");
            }
    
            nuevo[nuevo.length-1] = nueva;
    
            personas = nuevo;
        }
        else
        {
            System.out.println("Esta persona ya está en el instituto");
        }
    }



    public static String mostrar(Persona[] personas)
    {
        String resultado = "\nLISTADO DE PERSONAS:\n";

        for (int i = 0; i < personas.length; i++)
        {
            System.out.println("mostrar");
            resultado+= personas[i].toString();
        }

        return resultado;
    }
}
