package models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import utils.NoExisteDNIExcepcion;

public class Instituto {
    
    private ArrayList<Profesor> profesores;

    
    public Instituto(){

    }


    @Override
    public String toString() {
        return "Instituto [profesores=" + profesores + "]";
    }


    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }


    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    

    // METHODS:
    public void extraerAlumnosProfesor(String nombre)
    {
        Profesor buscado = buscaProfesor(nombre);
        String nombreFichero = "Alumnos" + nombre.replace(" ", "") + ".json";

        utils.ManejoFicheros.exportaComoJson(buscado.getAlumnos(), nombreFichero);
    }


    public Profesor buscaProfesor(String nombre)
    {
        Profesor buscado = null;

        for (Profesor profesor : profesores)
        {
            if(profesor.getNombre().equals(nombre))
            {
                buscado = profesor;
            }
        }
        return buscado;
    }


    public void alumnosConBeca()
    {
        String salida = "";
        ArrayList<Alumno> listaAlum = this.listadoAlumnos();
        HashMap<String,Double> notasBecas = utils.ManejoFicheros.leerFicheroBecas("becas2023.txt");

        // para cada asignatura:
        for (String asignatura : notasBecas.keySet())
        {
            // recorro todos los alumnos comporbando que tengan esta asignatura y su nota sea para beca:
            salida+= " == " + asignatura + " == \n";

            for (Alumno alumno : listaAlum)
            {
                if(alumno.getNotas().containsKey(asignatura))
                {
                    double notaBeca = notasBecas.get(asignatura);

                    if(alumno.getNotas().get(asignatura) >= notaBeca)
                    {
                        salida+= alumno.getNombre() + " : " + alumno.getNotas().get(asignatura) + "\n";
                    }
                }    
            }
        }
        // saco la salida a un fichero
        try {
            utils.ManejoFicheros.borraFichero("src/output/AlumnosBeca2023.txt");
            utils.ManejoFicheros.escribeEnFichero("AlumnosBeca2023.txt", salida);
            
        } catch (Exception e) {
            System.out.println("Error al escribir fichero de becas");
        }

    }



    public void alumnosNotaMedia()
    {
        String salida = "";

        ArrayList<Alumno> listaAlum = this.listadoAlumnos();

        // Con la lista de alumnos correcta hago la salida:
        for (Alumno alumno : listaAlum)
        {
            Collection<Double> notas = alumno.getNotas().values();
            double notaMedia = 0;

            for (Double nota : notas)
            {
                notaMedia += nota;
            }
            
            notaMedia = (notaMedia/notas.size());
            DecimalFormat df = new DecimalFormat("#.0");

            salida+= alumno.getNombre() + ";" + alumno.getDni() + ";" + df.format(notaMedia) + "\n";

            try {
                utils.ManejoFicheros.borraFichero("src/output/infoAlumnos.csv");
                utils.ManejoFicheros.escribeEnFichero("infoAlumnos.csv", salida);
                
            } catch (Exception e) {
                System.out.println("Error al escribir fichero de notas medias");
            }
        }
    }


    public ArrayList<Alumno> listadoAlumnos()
    {
        ArrayList<Alumno> listaAlum = new ArrayList<>();

        // saco lista de alumnos
        for (Profesor profesor : this.profesores)
        {
            for (Alumno alumno : profesor.getAlumnos())
            {
                if(!listaAlum.contains(alumno))
                {
                    try
                    {
                        if(alumno.getDni().equals(""))
                        {
                            throw new NoExisteDNIExcepcion(alumno.getNombre());
                        }
                        else
                        {

                            listaAlum.add(alumno);
                        }
                    }
                    catch (NoExisteDNIExcepcion e)
                    {
                        System.out.println(e.getMessage());
                    }
                    catch (Exception ex)
                    {
                    
                    }
                }
            }
        }
        if(listaAlum.size()==0)
        {
            return null;
        }
        else 
        {
            return listaAlum;
        }
    }

}
