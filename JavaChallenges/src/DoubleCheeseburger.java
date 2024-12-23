public class DoubleCheeseburger extends Burger {


    protected double burgerPrice = 12.0;
    protected BurgerTypes burgerType = BurgerTypes.DoubleCheeseburger;

    public double getBurgerPrice() {
        return burgerPrice;
    }

    @Override
    public BurgerTypes getBurgerType() {
        return burgerType;
    }

    public void setBurgerPrice(double price){
        this.burgerPrice = price;
    }
}
