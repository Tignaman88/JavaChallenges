public class Fanta extends Drink {


    protected double drinkPriceSmall = 1.5;
    protected double drinkPriceRegular = 2.0;
    protected double drinkPriceLarge = 2.5;


    public Fanta(String drinkSize) {
        this.drinkSize = drinkSize;

        switch (drinkSize) {
            case "Small" -> drinkPrice = drinkPriceSmall;
            case "Regular" -> drinkPrice = drinkPriceRegular;
            case "Large" -> drinkPrice = drinkPriceLarge;
//            default -> drinkPrice = drinkPriceRegular;
        }
    }

    public DrinkType getDrinkType() {
        return DrinkType.Fanta;
    }
}
