package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer karim = new FootballPlayer("Benzema");
        FootballPlayer grizzman = new FootballPlayer("Antoine");
        BasketballPlayer james = new BasketballPlayer("LeBron");
        BasketballPlayer david = new BasketballPlayer("Antony Davis");
        BasketballPlayer gasol = new BasketballPlayer("Marc Gasol");
        HandballPlayer klauss = new HandballPlayer("Niko");

        Team<FootballPlayer> nationalTeam = new Team("France");
        nationalTeam.addPlayer(karim);
        nationalTeam.addPlayer(grizzman);
        //nationalTeam.addPlayer(james);
        //nationalTeam.addPlayer(klauss);

        System.out.println(nationalTeam.numPlayers());

        Team<BasketballPlayer> lakers = new Team<>("Los Angeles Lakers");
        lakers.addPlayer(james);
        lakers.addPlayer(david);
        lakers.addPlayer(gasol);

        System.out.println(lakers.numPlayers());

        //Team<String> brokenTeam = new Team<>("this wont work");
        //brokenTeam.addPlayer("no one");

    }
}
