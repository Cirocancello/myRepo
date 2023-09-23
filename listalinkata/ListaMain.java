package listalinkata;

public class ListaMain {
    public static void main(String[] args) {

        Lista lista = new ListaLinkata();
//        lista.aggiungiElemento(1);
//        lista.aggiungiElemento(2);
//        lista.aggiungiElemento(3);
//        lista.aggiungiElemento(4);
//        lista.aggiungiElemento(5);
//        lista.aggiungiElemento(6);
//

        inserisciElementi(lista);

        System.out.println(lista.testa());
        lista.stampaLista();
       // lista.elimineElemento();
      //  lista.testa();
       // lista.stampaLista();


    }

    public static void inserisciElementi(Lista lista){
        for (int i = 1; i <= 10; i++){
            lista.aggiungiElemento(i);
        }
    }
}
