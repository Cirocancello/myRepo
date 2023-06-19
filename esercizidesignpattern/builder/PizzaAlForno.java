package esercizidesignpattern.builder;

//builder concreto
public class PizzaAlForno implements PizzaBuilder{

    private Pizza pizza;

    public PizzaAlForno() {
        this.pizza = new Pizza();
    }

    @Override
    public void ingredientiPizza() {
        pizza.setIngredienti("Pomodoro, mozzarella, olio, basilico");
    }

    @Override
    public void nomePizza() {
        pizza.setNome("Margherita");
    }

    @Override
    public void prezzoPizza() {
        pizza.setPrezzo(4);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
