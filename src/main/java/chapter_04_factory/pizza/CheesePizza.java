package chapter_04_factory.pizza;

import chapter_04_factory.PizzaIngredientFactory;
import chapter_04_factory.ingredients.Veggies;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중: " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();

        System.out.print("토핑: ");
        for (Veggies veggie : veggies) {
            System.out.print(veggie.getName() + " ");
        }
        System.out.println();
    }
}
