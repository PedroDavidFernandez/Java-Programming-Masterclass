package com.company;

public class Main {
    public static void main(String[] args) {
        BasketballPlayer lebron = new BasketballPlayer("Lebron James");
        BasketballPlayer drummond = new BasketballPlayer("Andre Drummond");
        BasketballPlayer davis = new BasketballPlayer("Anthony Davis");
        BasketballPlayer harden = new BasketballPlayer("James Harden");
        BasketballPlayer erving = new BasketballPlayer("Kirie Erving");
        BasketballPlayer durant = new BasketballPlayer("Kevin Durant");

        FootballPlayer sergio = new FootballPlayer("Sergio Garcia");

        Team<BasketballPlayer> lakers = new Team("Los Angeles Lakers");
        lakers.addPlayer(lebron);
        lakers.addPlayer(drummond);
        lakers.addPlayer(davis);
        //lakers.addPlayer(sergio);

        System.out.println(lakers.getNumberOfPlayers());

        Team<FootballPlayer> rcde = new Team<>("RCD Espanyol");
        rcde.addPlayer(sergio);

        System.out.println(rcde.getNumberOfPlayers());

//        Team<String> brokenTeam = new Team<String>("Broken Team");
//        brokenTeam.addPlayer(brokenTeam);

        Team<BasketballPlayer> nets = new Team<>("Brooklyn Nets");
        nets.addPlayer(harden);
        nets.addPlayer(erving);
        nets.addPlayer(durant);

        System.out.println(nets.getNumberOfPlayers());

        lakers.matchResult(nets, 100, 50);
        lakers.matchResult(nets, 50, 70);
//        nets.matchResult(nets, 70, 20);
//        nets.matchResult(nets, 70, 20);
        //lakers.matchResult(rcde,23, 32);
        System.out.println(lakers.getName() + ": " + lakers.ranking());
        System.out.println(nets.getName() + ": " + nets.ranking());

        System.out.println(lakers.compareTo(nets));
        System.out.println(nets.compareTo(lakers));
    }
}
