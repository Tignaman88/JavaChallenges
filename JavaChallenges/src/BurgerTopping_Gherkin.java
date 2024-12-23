public class BurgerTopping_Gherkin extends BurgerTopping {

    protected BurgerToppingType toppingType = BurgerToppingType.Gherkin;
    protected double toppingCost = 1.0;

    public BurgerToppingType getToppingType() {
        return toppingType;
    }

    @Override
    public double getToppingCost() {
        return toppingCost;
    }
}
