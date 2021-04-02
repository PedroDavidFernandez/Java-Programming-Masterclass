package com.company;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer kun = new FootballPlayer("Kun Agüero");
	    FootballPlayer mbappe = new FootballPlayer("Kylian Mbappé");
	    FootballPlayer dybala = new FootballPlayer("Paulo Dybala");

	    FootballPlayer ramos = new FootballPlayer("Sergio Ramos");
	    FootballPlayer modric = new FootballPlayer("Luka Modric");
	    FootballPlayer karim = new FootballPlayer("Karim Benzema");
	    
	    AmericanfootballPlayer rice = new AmericanfootballPlayer("Jerry Rice");
	    AmericanfootballPlayer brady = new AmericanfootballPlayer("Tom Brady");
	    AmericanfootballPlayer mahomes = new AmericanfootballPlayer("Patrick Mahomes");

	    Team<AmericanfootballPlayer> patriots = new Team<>("New England Patriots");
		patriots.addPlayer(rice);
		patriots.addPlayer(brady);
		patriots.addPlayer(mahomes);

	    Team<FootballPlayer> galaxy = new Team<>("LA Galaxy");
	    galaxy.addPlayer(kun);
	    galaxy.addPlayer(kun);
	    galaxy.addPlayer(mbappe);
	    galaxy.addPlayer(dybala);
//	    galaxy.addPlayer(rice);
//	    galaxy.addPlayer(brady);

		Team<FootballPlayer> real = new Team<>("Real Madrid");
		real.addPlayer(ramos);
		real.addPlayer(modric);
		real.addPlayer(karim);

//		System.out.println("Number of players on team "
//				+ galaxy.getName() + " is: " + galaxy.getNumberOfPlayers());

		real.matchResult(galaxy, 3, 1);
		real.matchResult(galaxy, 2, 0);
		real.matchResult(galaxy, 1, 2);
		galaxy.matchResult(real, 2, 1);
		galaxy.matchResult(real, 3, 4);
		galaxy.matchResult(real, 1, 1);

		System.out.println(real.getName() + " Ranking is: " + real.ranking() + "\n");
		System.out.println(galaxy.getName()  + " Ranking is: " + galaxy.ranking() + "\n");
    }
}
