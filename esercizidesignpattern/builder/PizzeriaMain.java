package esercizidesignpattern.builder;

// Client code
public class PizzeriaMain {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaAlForno();
        PizzaDirector pizzaDirector = new PizzaDirector(pizzaBuilder);

        Pizza margherita = pizzaDirector.constructorPizza();
        System.out.println(margherita);
    }
}
