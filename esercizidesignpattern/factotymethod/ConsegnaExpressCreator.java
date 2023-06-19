package esercizidesignpattern.factotymethod;

public class ConsegnaExpressCreator extends ConsegnaCreator {
    @Override
    public Consegna creaConsegna() {
        return new ConsegnaExpress();
    }
}
