package chapter_04_factory;

import chapter_04_factory.pizza.CheesePizza;
import chapter_04_factory.pizza.PepperoniPizza;
import chapter_04_factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals(("cheese"))) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }

        return pizza;
    }
}
