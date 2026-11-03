package CLASES_T6.UsoClases;

import CLASES_T6.Clases.Guitarra;
import CLASES_T6.Clases.Piano;
import CLASES_T6.Clases.Instrumento.Notas;

public class UsoInstrumentos {
 
    public static void main(String[] args) {
        
        Piano piano = new Piano();

        piano.add(Notas.LA);
        piano.add(Notas.LA);
        piano.add(Notas.FA);
        piano.add(Notas.SOL);
        piano.add(Notas.SOL);
        piano.add(Notas.DO);

        piano.interpretar();


        System.out.println("------------------");


        Guitarra guitarra = new Guitarra();

        guitarra.add(Notas.LA);
        guitarra.add(Notas.LA);
        guitarra.add(Notas.FA);
        guitarra.add(Notas.SOL);
        guitarra.add(Notas.SOL);
        guitarra.add(Notas.DO);

        guitarra.interpretar();


    }
}
