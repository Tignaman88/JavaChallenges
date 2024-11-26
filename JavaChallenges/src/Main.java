public class Main {
    public static void main(String[] args) {

        SmartKitchen appliance = new SmartKitchen();


        appliance.getDishWasher().setHasWorkToDo(true);
        appliance.getIceBox().setHasWorkToDo(true);
        appliance.getBrewMaster().setHasWorkToDo(true);
        appliance.getDishWasher().doDishes();
        appliance.getIceBox().orderFood();
        appliance.getBrewMaster().brewCoffee();

        appliance.setKitchenState(true, true, true);
        appliance.doKitchenWork();

    }
}
