public class BurgerTopping_Cheese extends BurgerTopping {

    protected BurgerToppingType toppingType = BurgerToppingType.Cheese;
    protected double toppingCost = 2.0;

    public BurgerToppingType getToppingType() {
        return toppingType;
    }

    @Override
    public double getToppingCost() {
        return toppingCost;
    }
}
