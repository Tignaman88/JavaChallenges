public class BurgerTopping_Cheese extends BurgerTopping {

    protected String toppingType = "Cheese";
    protected double toppingCost = 2.0;

    public String getToppingType() {
        return toppingType;
    }

    @Override
    public double getToppingCost() {
        return toppingCost;
    }
}
