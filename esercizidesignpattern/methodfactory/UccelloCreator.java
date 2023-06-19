package esercizidesignpattern.methodfactory;

//creator concreto
public class UccelloCreator extends AnimaleCreator {
    @Override
    public Animale creaAnimale() {
        return new Uccello();
    }
}
