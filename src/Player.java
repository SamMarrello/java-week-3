import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<String> sports;

    public Player(String _name) {
        name = _name;
        sports = new ArrayList<>();
    }

    public void addSport(String sport) {
        sports.add(sport);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getSports() {
        return sports;
    }

    @Override
    public String toString() {
        return "Player name=" + name + ", sports=" + sports + ".";
    }


}
