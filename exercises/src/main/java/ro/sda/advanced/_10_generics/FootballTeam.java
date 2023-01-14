package ro.sda.advanced._10_generics;

public class FootballTeam extends Team<FootballTeam> {
    public FootballTeam(String name) {
        super(name);
    }
}
