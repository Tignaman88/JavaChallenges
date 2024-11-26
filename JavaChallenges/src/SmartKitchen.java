public class SmartKitchen {

    CoffeeMaker brewMaster = new CoffeeMaker();
    DishWasher dishWasher = new DishWasher();
    Refrigerator iceBox = new Refrigerator();

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean isBrewing, boolean isLoaded, boolean isCold) {
        brewMaster.setHasWorkToDo(isBrewing);
        dishWasher.setHasWorkToDo(isLoaded);
        iceBox.setHasWorkToDo(isCold);
    }

    public void doKitchenWork() {

        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}
