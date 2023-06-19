package esercizidesignpattern.methodfactory1;

public class ConsegnaExpressCreator extends ConsegnaCreator {
    @Override
    public Consegna creaConsegna() {
        return new ConsegnaExpress();
    }
}
