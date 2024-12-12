public class Drink {

    protected String drinkType;
    protected String drinkSize;
    protected double drinkPrice;
    protected double drinkPriceSmall;
    protected double drinkPriceRegular;
    protected double drinkPriceLarge;

    public Drink() {
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public Drink(String drinkSize) {
        this.drinkSize = drinkSize;

        switch (drinkSize) {
            case "Small" -> drinkPrice = drinkPriceSmall;
            case "Regular" -> drinkPrice = drinkPriceRegular;
            case "Large" -> drinkPrice = drinkPriceLarge;
//            default -> drinkPrice = drinkPriceRegular;
        }
    }
}