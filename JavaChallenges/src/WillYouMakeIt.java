public class WillYouMakeIt {
    // Challenge CodeWars https://www.codewars.com/kata/5861d28f124b35723e00005e

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if(distanceToPump / mpg <= fuelLeft) return true;

        return false;
    }
}
