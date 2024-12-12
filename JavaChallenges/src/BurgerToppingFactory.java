public class BurgerToppingFactory {

    public static BurgerTopping getBurgerTopping(String toppingName) {


        switch (toppingName) {
            case "Cheese":
                return new BurgerTopping_Cheese();
            case "Gherkin":
                return new BurgerTopping_Gherkin();
            case "Bacon":
                return new BurgerTopping_Bacon();
            default:
                return null;
        }
    }
}
