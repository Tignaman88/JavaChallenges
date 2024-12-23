

public class Main {
    public static void main(String[] args) {

        MealOrder order = MealOrderFactory.createMealOrder(BurgerTypes.CheeseBurger, DrinkType.Fanta, "Regular", "Chips");

        order.getBurger().addTopping(BurgerToppingType.Bacon);

       System.out.println(order.burger.getBurgerPrice());
        order.mealSummary();
    }
}
