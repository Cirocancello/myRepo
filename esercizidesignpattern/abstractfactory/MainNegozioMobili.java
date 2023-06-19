package esercizidesignpattern.abstractfactory;

public class MainNegozioMobili {

    public static void main(String[] args) {

        MobiliFactory tavoloFactory = new TavoloFactory();
        Mobili tavolo = tavoloFactory.creaMobile();
        tavolo.assembla();
    }
}
