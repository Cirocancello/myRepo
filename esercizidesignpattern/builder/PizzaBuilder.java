package esercizidesignpattern.builder;

//builder astratto
public interface PizzaBuilder {
    void ingredientiPizza();
    void nomePizza();
    void prezzoPizza();
    Pizza getPizza();
}
