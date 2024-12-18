import java.util.ArrayList;

public class Burger {

    protected BurgerTypes burgerType;
    protected double burgerPrice;
    protected ArrayList<BurgerTopping> burgerToppings = new ArrayList<BurgerTopping>();
    protected int burgerToppingAmount = 3;
    protected int burgerToppingCounter = 0;

    public BurgerTypes getBurgerType() {
        return burgerType;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public void addTopping(BurgerToppingType toppingName) {

        if (burgerToppingCounter > burgerToppingAmount) return;
        burgerToppingCounter++;
        BurgerTopping chosenTopping = BurgerToppingFactory.getBurgerTopping(toppingName);
        burgerToppings.add(chosenTopping);
        burgerPrice += chosenTopping.getToppingCost();

    }


}