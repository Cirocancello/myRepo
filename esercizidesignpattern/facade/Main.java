package myRepo.esercizidesignpattern.facade;
/*

Esercizio su Façade:

Sviluppare un'applicazione in java per il controllo e la gestione di un sistema domotico.
 Implementa il pattern Façade per fornire un'interfaccia semplificata per l'interazione con il sistema domotico.
  La Façade dovrebbe raggruppare diverse funzionalità e servizi del sistema, fornendo metodi di alto livello
  per accendere e spegnere le luci, regolare la temperatura, aprire e chiudere le porte, senza dover conoscere
  i dettagli di implementazione specifici di ogni componente del sistema.

 */
public class Main {
    public static void main(String[] args) {
        DomoticaFacade domoticaFacade=new DomoticaFacade();
        domoticaFacade.escoDaCasa();
        System.out.println(" ");
        domoticaFacade.ritornoACasa();
    }

}
