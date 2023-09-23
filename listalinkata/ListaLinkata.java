package listalinkata;

public class ListaLinkata implements Lista{
    public class Nodo{
        int valore;
        Nodo next;
        public Nodo(int elem){
            valore = elem;
            next = testa;
        }
    }

    private Nodo testa;

    @Override
    public void aggiungiElemento(int elem) {
        testa = new Nodo(elem);
    }

    @Override
    public void elimineElemento() {
        testa = testa.next;
    }

    @Override
    public int testa() {
        return testa.valore;
    }

    @Override
    public void stampaLista() {
        Nodo curr = testa;

        while(curr != null){
            System.out.print(curr.valore + " ");
            curr = curr.next;
        }
    }
}
