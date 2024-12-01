public class ChallengeCar {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public ChallengeCar(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public String startEngine() {

        return getClass().getSimpleName() + "'s engine -> Starting";
    }

    public String accelerate() {

        return getClass().getSimpleName() + "'s -> accelerating";
    }

    public String braking() {

        return getClass().getSimpleName() + "'s braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
