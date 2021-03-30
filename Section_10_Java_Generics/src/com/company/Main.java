package com.company;

public class Main {
    public static void main(String[] args) {
        BasketballPlayer lebron = new BasketballPlayer("Lebron James");
        BasketballPlayer drummond = new BasketballPlayer("Andre Drummond");
        BasketballPlayer davis = new BasketballPlayer("Anthony Davis");
        FootballPlayer sergio = new FootballPlayer("Sergio Garcia");

        Team<BasketballPlayer> lakers = new Team("Los Angeles Lakers");
        lakers.addPlayer(lebron);
        lakers.addPlayer(drummond);
        lakers.addPlayer(davis);
//        lakers.addPlayer(sergio);

        System.out.println(lakers.getNumberOfPlayers());

        Team<FootballPlayer> rcde = new Team<>("RCD Espanyol");
        rcde.addPlayer(sergio);

        System.out.println(rcde.getNumberOfPlayers());

//        Team<String> brokenTeam = new Team<String>("Broken Team");
//        brokenTeam.addPlayer(brokenTeam);
    }
}
