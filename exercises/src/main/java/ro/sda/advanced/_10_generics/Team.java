package ro.sda.advanced._10_generics;

public class Team<T> implements Comparable<Team<T>>  {
    private String name;
    private int matchesPlayed = 0;
    private int matchesWon = 0;
    private int matchesLost = 0;
    private int matchesTied = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;
        if (ourScore > theirScore) {
            message = "beat";
            matchesWon++;
            opponent.matchesLost++;
        } else if (ourScore == theirScore) {
            message = "drew with";
            matchesTied++;
            opponent.matchesTied++;
        } else {
            message = "lost to";
            matchesLost++;
            opponent.matchesWon++;
        }
        matchesPlayed++;
        System.out.println(this.name + " " + message + " " + opponent.name);
    }

    public int ranking() {
        return matchesWon * 3 + matchesTied;
    }

    @Override
    public int compareTo(Team<T> otherTeam) {
        return Integer.compare(otherTeam.ranking(), this.ranking());
    }
}
