public class BurgerFactory {

    public static Burger getBurger(String burgerType) {


        switch (burgerType) {

            case "Cheeseburger":
                return new Cheeseburger();
            case "Double Cheeseburger":
                return new DoubleCheeseburger();
            case "Bacon Cheeseburger":
                return new BaconCheeseburger();
            default:
                return null;
        }
    }
}
