public class Bedroom {

    private String name;
    private WallComposition wall1;
    private WallComposition wall2;
    private WallComposition wall3;
    private WallComposition wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, WallComposition wall1, WallComposition wall2, WallComposition wall3, WallComposition wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }


}
