import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MealOrder order = MealOrderFactory.createMealOrder(BurgerTypes.BaconCheeseburger, DrinkType.Fanta, "Regular", "Chips");

        order.burger.addTopping(BurgerToppingType.Cheese);

        System.out.println(order.drink.getDrinkPrice());
        System.out.println(order.burger.getBurgerPrice());
        order.mealSummary();
    }
}
