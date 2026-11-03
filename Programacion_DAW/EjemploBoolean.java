public class EjemploBoolean 
{
    public static void main(String[] args) 
    {
    
        boolean mayorEdad = true;
        boolean carnetConducir = true;

        // Para poner AND en Java se escribe &&

        boolean puedeConducir = mayorEdad && carnetConducir;

        System.out.println("¿El usuario puede conducir?" + puedeConducir );

        // Ahora trabajamos con OR que se escribe como ||
        
        boolean estudioMucho = false;
        boolean sacoChuleta = true;

        boolean apruebo = estudioMucho || sacoChuleta;

        System.out.println("¿Apruebo?" + apruebo);

        

        // Asignamos dos valores fijos True y False y hacemos todas las operaciones 

        boolean valorTrue = true;
        boolean valorFalse = false;

        boolean resultadoVandV = valorTrue && valorTrue;
        System.out.println("Verdadero AND Verdadero: " + resultadoVandV);
        
        System.out.println("Verdadero AND Falso: " + (valorTrue && valorFalse));

        boolean resultadoFandV = valorFalse && valorTrue;
        System.out.println("Falso AND Verdadero: " + resultadoFandV);

        boolean resultadoFandF = valorFalse && valorFalse;
        System.out.println("Falso AND Falso: " + resultadoFandF);

        // Hasta aquí hemos hecho AND, ahora vamos con OR v o v, v o f, f o v, f o f,

        System.out.println("Verdadero OR Verdadero: " + (valorTrue || valorTrue));

        System.out.println("Verdadero OR Falso: " + (valorTrue || valorFalse));

        System.out.println("Falso OR Verdadero: " + (valorFalse || valorTrue));

        System.out.println("Falso OR Falso: " + (valorFalse || valorFalse));




    }

}