import java.util.ArrayList;

public class Burger {

    protected String burgerType;
    protected double burgerPrice;
    protected ArrayList<BurgerTopping> burgerToppings = new ArrayList<BurgerTopping>();
    protected int burgerToppingAmount = 3;
    protected int burgerToppingCounter = 0;

    public void addTopping(String toppingName) {

        if (burgerToppingCounter > burgerToppingAmount) return;
        burgerToppingCounter++;
        BurgerTopping chosenTopping = BurgerToppingFactory.getBurgerTopping(toppingName);
        burgerToppings.add(chosenTopping);
        burgerPrice += chosenTopping.toppingCost;

    }


}