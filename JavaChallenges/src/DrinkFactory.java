public class DrinkFactory {

    public static Drink getDrink(DrinkType drinkType, String drinkSize) {


        switch (drinkType) {

            case DrinkType.Fanta:
                return new Fanta(drinkSize);
            case DrinkType.Coke:
                return new Coke(drinkSize);
            default:
                return null;
        }

    }
}
