public class Coke extends Drink {

    protected String drinkType = "Fanta";
    protected double drinkPriceSmall = 1.7;
    protected double drinkPriceRegular = 2.2;
    protected double drinkPriceLarge = 2.7;


    public Coke(String drinkSize) {
        this.drinkSize = drinkSize;

        switch (drinkSize) {
            case "Small" -> drinkPrice = drinkPriceSmall;
            case "Regular" -> drinkPrice = drinkPriceRegular;
            case "Large" -> drinkPrice = drinkPriceLarge;
//            default -> drinkPrice = drinkPriceRegular;
        }
    }

    public DrinkType getDrinkType() {
        return DrinkType.Coke;
    }
}
