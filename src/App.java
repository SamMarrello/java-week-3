import java.util.ArrayList;

public class App {
    public static void main(String args[]) throws Exception {
        System.out.println("Hello, world!");
        Player player1 = new Player("Sam");
        Player player2 = new Player("John");
        Player player3 = new Player("Mike");

        player2.addSport("Hockey");
        player2.addSport("Soccer");
        player2.addSport("Rugby");

        player1.addSport("Cricket");
        player1.addSport("Lacrosse");
        player1.addSport("Chess");

        player3.addSport("Hockey");
        player3.addSport("Chess");
        player3.addSport("Polo");

        String[] sportsList = {"Soccer", "Polo", "Badminton", "Hockey", "Chess", "Cricket", "Football"};
        ArrayList<Player> players = new ArrayList<>();
        players.add(player3);
        players.add(player1);
        players.add(player2);

        for (String sport: sportsList) {
            for (Player player: players) {
                if (player.sports.contains(sport)) {
                    System.out.println(player.name + " plays " + sport);
                }
            }
        }
    }
}
