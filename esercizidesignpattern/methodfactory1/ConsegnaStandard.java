package esercizidesignpattern.methodfactory1;

public class ConsegnaStandard implements Consegna {
    @Override
    public void spedisci() {
        System.out.println("Consegna lenta poste italiane");
    }
}
