package esercizidesignpattern.abstractfactory1;

public class SediaFactory implements MobiliFactory{
    @Override
    public Mobili creaMobile() {
        return new Sedia();
    }
}
