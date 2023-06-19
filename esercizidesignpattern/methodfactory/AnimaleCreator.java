package esercizidesignpattern.methodfactory;

//creator astratto
public abstract class AnimaleCreator {

    public abstract Animale creaAnimale();

    public void faiQualcosa() {
        Animale animale = creaAnimale();
        animale.siMuove();
    }

}