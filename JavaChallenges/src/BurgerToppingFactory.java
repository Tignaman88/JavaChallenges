public class BurgerToppingFactory {

    public static BurgerTopping getBurgerTopping(BurgerToppingType toppingName) {


        switch (toppingName) {
            case BurgerToppingType.Cheese:
                return new BurgerTopping_Cheese();
            case BurgerToppingType.Gherkin:
                return new BurgerTopping_Gherkin();
            case BurgerToppingType.Bacon:
                return new BurgerTopping_Bacon();
            default:
                return null;
        }
    }
}
