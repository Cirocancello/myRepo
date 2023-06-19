package esercizidesignpattern.methodfactory1;

public class ConsegnaStandardCreator extends ConsegnaCreator {
    @Override
    public Consegna creaConsegna() {
        return new ConsegnaStandard();
    }
}
