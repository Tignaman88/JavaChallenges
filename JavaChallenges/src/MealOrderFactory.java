public class MealOrderFactory {

    public static MealOrder createMealOrder(BurgerTypes burgerType, DrinkType drinkType, String drinkSize, String sideItem) {

        Burger meal_Burger = BurgerFactory.getBurger(burgerType);
        Drink meal_Drink = DrinkFactory.getDrink(drinkType, drinkSize);
        SideItem meal_SideItem = SideItemFactory.getSideItem(sideItem);
        MealOrder meal = new MealOrder();
        meal.burger = meal_Burger;
        meal.drink = meal_Drink;
        meal.sideItem = meal_SideItem;
        return meal;
    }
}
