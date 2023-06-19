package esercizidesignpattern.methodfactory;

//metodo/i concreto/i
public class Uccello implements Animale {
    @Override
    public void siMuove() {
        System.out.println("Il piccione vola su piazza san Marco");
    }
}
