package esercizidesignpattern.factotymethod;

public abstract class ConsegnaCreator {
    public abstract Consegna creaConsegna();

    public void gestioneConsegne(){
        Consegna consegna = creaConsegna();
        consegna.spedisci();
    }
}
