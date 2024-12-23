public class Drink {

    protected DrinkType drinkType;
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

    public DrinkType getDrinkType() {
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