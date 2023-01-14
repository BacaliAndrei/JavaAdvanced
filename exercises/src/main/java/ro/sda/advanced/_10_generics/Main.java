package ro.sda.advanced._10_generics;
 /*

        Create a generic class to implement a league table for sport.
        The class should allow teams to be added to the list, and store
        a list of teams that belong to the league.

        Your class should have a method to print out the teams in order,
        with the team at the top of the league printed first.

        Only teams of the same type should be added to any particular
        instance of the league class - the program should fail to compile
        if an attempt is made to add an incompatible team.
        */

public class Main {


    public static void main(String[] args) {


        League<FootballTeam> pl = new League<>("Premier League");

        FootballTeam chelsea = new FootballTeam("Chelsea");
        FootballTeam liverpool = new FootballTeam("Liverpool");
        FootballTeam manCity = new FootballTeam("Manchester City");
        FootballTeam arsenal = new FootballTeam("Arsenal");

        pl.addTeam(chelsea);
        pl.addTeam(liverpool);
        pl.addTeam(manCity);
        pl.addTeam(arsenal);

        chelsea.matchResult(liverpool, 2, 1);
        chelsea.matchResult(arsenal, 3, 2);
        chelsea.matchResult(manCity, 4, 3);
        liverpool.matchResult(chelsea, 0, 0);
        liverpool.matchResult(arsenal, 1, 0);
        liverpool.matchResult(manCity, 2, 0);
        arsenal.matchResult(chelsea, 2, 1);
        arsenal.matchResult(liverpool, 0, 2);
        arsenal.matchResult(manCity, 0, 1);
        manCity.matchResult(chelsea, 2, 1);
        manCity.matchResult(arsenal, 2, 3);
        manCity.matchResult(liverpool, 3, 2);

        pl.showLeagueTable();



    }
}
