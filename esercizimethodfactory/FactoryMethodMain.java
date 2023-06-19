package esercizimethodfactory;

/*Esercizio su Factory Method:
Supponi di dover sviluppare un'applicazione di logistica che gestisce la consegna di pacchi.
 Implementa un Factory Method per la creazione di oggetti "Consegna" in base al tipo di pacchetto da consegnare, come "Standard" e "Express".
  Ciascun tipo di consegna avrà le proprie regole e processi specifici.
  Utilizza il Factory Method per creare istanze di consegne in base al tipo selezionato.*/
public class FactoryMethodMain {

    public static void main(String[] args) {
//        ConsegnaExpress consegnaExpress = new ConsegnaExpress();


        ConsegnaCreator consegnaExpressCreator = new ConsegnaExpressCreator();
        consegnaExpressCreator.gestioneConsegne();

        ConsegnaCreator consegnaStandardCreator = new ConsegnaStandardCreator();
        consegnaStandardCreator.gestioneConsegne();
    }
}
