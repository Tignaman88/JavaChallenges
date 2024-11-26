public class Main {
    public static void main(String[] args) {

        WallComposition wall1 = new WallComposition("West");
        WallComposition wall2 = new WallComposition("East");
        WallComposition wall3 = new WallComposition("South");
        WallComposition wall4 = new WallComposition("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Alessio", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
