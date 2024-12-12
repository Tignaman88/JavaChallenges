public class BurgerTopping_Bacon extends BurgerTopping {

    protected String toppingType = "Bacon";
    protected double toppingCost = 2.5;

    @Override
    public double getToppingCost() {
        return toppingCost;
    }
}
