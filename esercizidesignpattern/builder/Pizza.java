package esercizidesignpattern.builder;

//classe concreta
public class Pizza {
    private String ingredienti;
    private String nome;
    private int prezzo;

    public Pizza() {
    }

    public Pizza(String ingredienti, String nome, int prezzo) {
        this.ingredienti = ingredienti;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Pizza{" + "ingredienti='" + ingredienti + '\'' + ", nome='" + nome + '\'' + ", prezzo=" + prezzo + '}';
    }
}
