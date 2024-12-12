public class BurgerTopping_Cheese extends BurgerTopping {

    protected String toppingType = "Cheese";
    protected double toppingCost = 2.0;

    @Override
    public double getToppingCost() {
        return toppingCost;
    }
}
