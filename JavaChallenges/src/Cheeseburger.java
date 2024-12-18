public class Cheeseburger extends Burger {


    protected double burgerPrice = 9.0;
    protected BurgerTypes burgerType = BurgerTypes.CheeseBurger;

    public double getBurgerPrice() {
        return burgerPrice;
    }

    @Override
    public BurgerTypes getBurgerType() {
        return burgerType;
    }
}
