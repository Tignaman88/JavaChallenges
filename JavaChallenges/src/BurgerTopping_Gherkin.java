public class BurgerTopping_Gherkin extends BurgerTopping {

    protected String toppingType = "Gherkin";
    protected double toppingCost = 1.0;

    @Override
    public double getToppingCost() {
        return toppingCost;
    }
}
