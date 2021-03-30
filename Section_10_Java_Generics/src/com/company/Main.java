package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer player = new FootballPlayer("Benzema");
        BasketballPlayer player1 = new BasketballPlayer("LeBron");
        HandballPlayer player2 = new HandballPlayer("Niko");

        Team team1 = new Team("Caledonian Team");
        team1.addPlayer(player);
        team1.addPlayer(player1);
        team1.addPlayer(player2);

        System.out.println(team1.numPlayers());
    }
}
