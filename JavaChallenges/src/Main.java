public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Alessio";
//        player.health = 200;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer alessio = new EnhancedPlayer("Alessio", 200, "Sword");
        System.out.println("Initial health is " + alessio.healthRemaining());
    }
}
