package esercizidesignpattern.abstractfactory1;

public class TavoloFactory implements MobiliFactory{

    @Override
    public Mobili creaMobile() {
        return new Tavolo();
    }
}
