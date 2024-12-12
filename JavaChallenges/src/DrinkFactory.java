public class DrinkFactory {

    public static Drink getDrink(String drinkType, String drinkSize) {


        switch (drinkType) {

            case "Fanta":
                return new Fanta(drinkSize);
            case "Coke":
                return new Coke(drinkSize);
            default:
                return null;
        }

    }
}
