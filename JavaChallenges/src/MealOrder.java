public class MealOrder {

    Burger burger;
    Drink drink;
    SideItem sideItem;


    public void mealSummary() {

        System.out.println("You have selected a " + burger.getBurgerType());
        System.out.println("You have selected a " + drink.getDrinkSize() + " " + drink.getDrinkType());
        System.out.println("You have selected a " + sideItem.getSideItemType() + " as a side");
        System.out.println("The total price is £" + getMealCost());
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public double getMealCost() {

        double mealCost = burger.getBurgerPrice() + drink.getDrinkPrice() + sideItem.getSideItemPrice();
        return mealCost;
    }
}
