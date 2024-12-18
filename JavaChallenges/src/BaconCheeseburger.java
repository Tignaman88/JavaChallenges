public class BaconCheeseburger extends Burger {


    protected double burgerPrice = 10.50;
    protected BurgerTypes burgerType = BurgerTypes.BaconCheeseburger;


    public double getBurgerPrice() {
        return burgerPrice;
    }

    @Override
    public BurgerTypes getBurgerType() {
        return burgerType;
    }
}
