package item02;

import item02.NyPizza.Size;
import item02.Pizza.Topping;

public class Main {

  public static void main(String[] args) {
    NutritionFacts nutritionFacts =
        new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
    System.out.println("nutritionFacts = " + nutritionFacts);

    NyPizza nyPizza =
        NyPizza.builder(Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
    System.out.println("nyPizza = " + nyPizza);

    Calzone calzone = Calzone.builder().addTopping(Topping.HAM).sauceInside().build();
    System.out.println("calzone = " + calzone);
  }
}
