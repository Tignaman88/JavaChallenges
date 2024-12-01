public class CarFactory {

    public static Car getCar(String type) {

       return switch (type) {
            case "Fiat" -> new GasPoweredCar(type, 30, 5);
            case "Toyota" -> new HybridCar(type, 25, 3, 2);
            case "Tesla" -> new ElectricCar(type, 50, 10);
            default -> new Car(type);
        };

    }
}
