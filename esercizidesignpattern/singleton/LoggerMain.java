package myRepo.esercizidesignpattern.singleton;

public class LoggerMain {

    public static void main(String[] args) {
        LoggerSingleton log = LoggerSingleton.getInstance();
        log.aggiungiEvento("Sono il primo evento");
        System.out.println(log.getListaEventi());

        LoggerSingleton log1 = LoggerSingleton.getInstance();
        log1.aggiungiEvento("Sono il secondo evento");
        System.out.println(log1.getListaEventi());
    }
}
