package INTERFACES;

public interface Sonido_I {

    
    public void voz();


    // Comportamiento por defecto:
    default void vozDurmiendo()
    {
        System.out.println("Zzz");
    } 

}
