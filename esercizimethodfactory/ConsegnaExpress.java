package esercizimethodfactory;

public class ConsegnaExpress implements Consegna {
    @Override
    public void spedisci() {
        System.out.println("Consegna velocissima express");
    }
}