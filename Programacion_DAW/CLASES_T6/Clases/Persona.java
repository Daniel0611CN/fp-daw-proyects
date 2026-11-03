package CLASES_T6.Clases;

public class Persona {
    
        // Atributos de la clase
        String nombre;
        String apellidos;
        int edad;
        int estatura;
        String dni;
        CuentaCorriente cc;

        static boolean vivo = true;



        // Constructores:
        public Persona()
        {
            this.nombre = "Desconocido";
        }

        public Persona(String nombre, int edad)
        {
            this.nombre = nombre;
            this.edad = edad;
        }

        public Persona(String nombre, String apellidos, int edad, int estatura, String dni)
        {
            this(nombre, edad); // tiene que ser lo primero que haga antes de nada porque crea el objeto
            // this.nombre = nombre;
            // this.edad = edad;

            this.apellidos = apellidos;
            this.estatura = estatura;
            this.dni = dni;
        }        


        // Metodos (muestra la informacion de los atributos o los modifica)


        
        void cumplirAños()
        {
            edad = edad+1;
        }

        void cambiarNombre(String nombre)
        {
            this.nombre = nombre;
        }

        void copiarPersona(Persona personaX)
        {
            this.nombre = personaX.nombre;
            this.apellidos = personaX.apellidos;
            this.edad = personaX.edad;
        }

        static String queDiaEs()
        {
            String dia = "Lunes";

            return dia;
        }

        static void matarATodos()
        {
            vivo = false;
        }

        public void crearCuentaCorriente()
        {
            CuentaCorriente nuevaCuenta = new CuentaCorriente("00000000Z", this.nombre);
            this.cc = nuevaCuenta;
        }



}
