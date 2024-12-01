import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ChallengeCar car = new ChallengeCar(8, "Base Car");
        car.startEngine();
        car.accelerate();
        car.braking();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());
        mitsubishi.accelerate();
        mitsubishi.braking();

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.braking());


    }
}
