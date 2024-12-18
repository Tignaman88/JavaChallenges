public class BurgerFactory {

    public static Burger getBurger(BurgerTypes burgerType) {


        switch (burgerType) {

            case BurgerTypes.CheeseBurger:
                return new Cheeseburger();
            case BurgerTypes.DoubleCheeseburger:
                return new DoubleCheeseburger();
            case BurgerTypes.BaconCheeseburger:
                return new BaconCheeseburger();
            default:
                return null;
        }
    }
}
