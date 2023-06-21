package myRepo.esercizidesignpattern.singleton;

import java.util.ArrayList;
import java.util.List;

/*Sviluppare un'applicazione in java e implementare un logger per la registrazione di eventi nell'applicazione.
Utilizza il pattern Singleton per creare un'istanza unica della classe Logger, in modo che tutti
i componenti dell'applicazione possano accedere allo stesso logger per registrare eventi.*/
public class LoggerSingleton {

    private static LoggerSingleton instance;

    private static List<String> listaEventi = new ArrayList<>();

    private LoggerSingleton(){

    }

    public static LoggerSingleton getInstance(){
        if(instance == null){
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void aggiungiEvento(String evento){
        listaEventi.add(evento);
        System.out.println("L'evento è stato aggiunto!");
    }

    public List<String> getListaEventi(){
        return listaEventi;
    }


}
