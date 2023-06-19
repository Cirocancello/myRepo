package esercizidesignpattern.abstractfactory;

//client code
public class AbstractFactoryMain {

    public static void main(String[] args) {
//        Cane pastore = new Cane();
//        Gatto persiano = new Gatto();
//         Animale gattoA = new Gatto();

        AnimaliFactory gattoFactory = new GattoFactory();
        Animale gattoMicio = gattoFactory.creaAnimale();
        gattoMicio.faiIlVerso();

        System.out.println("\n");

        AnimaliFactory caneFactory = new CaneFactory();
        Animale caneCanino = caneFactory.creaAnimale();
        caneCanino.faiIlVerso();
    }
}
