public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void returnClassType() {
        System.out.println("This is a " + this.getClass().getSimpleName());
    }

    public void startEngine() {

    }

    public void drive() {

        System.out.println("Move Forward");
    }

    protected void runEngine() {

        System.out.println("Not Specified - Car Not Initialised");
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Turn the Key");
    }

    @Override
    protected void runEngine() {
        System.out.println("Cylinders Powered");
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
}

class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
