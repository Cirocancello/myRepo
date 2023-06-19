package esercizidesignpattern.methodfactory;

//Client code
public class MethodFactoryMain {
    public static void main(String[] args) {

        AnimaleCreator animaleCreatorPiccione = new UccelloCreator();
        Animale animale = animaleCreatorPiccione.creaAnimale();
        animale.siMuove();

        System.out.println("\n");

        AnimaleCreator animaleCreatorPersiano = new GattoCreator();
        animaleCreatorPersiano.faiQualcosa();
    }
}