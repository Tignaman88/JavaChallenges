public class BurgerTopping_Bacon extends BurgerTopping {

    protected BurgerToppingType toppingType = BurgerToppingType.Bacon;
    protected double toppingCost = 2.5;

    public BurgerToppingType getToppingType() {
        return toppingType;
    }

    @Override
    public double getToppingCost() {
        return toppingCost;
    }
}
