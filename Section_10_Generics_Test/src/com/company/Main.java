package com.company;

public class Main {

    public static void main(String[] args) {
	    BasketballPlayer harden = new BasketballPlayer("James Harden");
	    BasketballPlayer durant = new BasketballPlayer("Kevin Durant");
	    BasketballPlayer aldridge = new BasketballPlayer("LaMarcus Aldridge");

		BasketballPlayer jokic = new BasketballPlayer("Nikola Jokic");
		BasketballPlayer gordon = new BasketballPlayer("Aaron Gordon");
		BasketballPlayer murray = new BasketballPlayer("Jamal Murray");

		BasketballPlayer rose = new BasketballPlayer("Dereck Rose");
		BasketballPlayer randle = new BasketballPlayer("Julius Randle");
		BasketballPlayer quickley = new BasketballPlayer("Immanuel Quickley");

	    AmericanFootballPlayer watt = new AmericanFootballPlayer("JJ Watt");
		Team<AmericanFootballPlayer> broncos = new Team<>("Broncos");
		broncos.addPlayer(watt);

	    Team<BasketballPlayer> nets = new Team<>("Brooklyn Nets");
	    nets.addPlayer(harden);
	    nets.addPlayer(durant);
	    nets.addPlayer(aldridge);
//	    lakers.addPlayer(watt);

		Team<BasketballPlayer> nicks = new Team<>("New York KnickerBockers");
		nets.addPlayer(rose);
		nets.addPlayer(randle);
		nets.addPlayer(quickley);

		Team<BasketballPlayer> nuggets = new Team<>("Denver Nuggets");
		nuggets.addPlayer(jokic);
		nuggets.addPlayer(gordon);
		nuggets.addPlayer(murray);

        System.out.println("Number of players: " + nets.getNumberOfPlayers()
				+ " of team " + nets.getName());
        System.out.println("Number of players: " + nuggets.getNumberOfPlayers()
				+ " of team " + nuggets.getName());

        nets.matchResult(nicks, 117, 104);
        nets.matchResult(nuggets, 103, 98);
        nets.matchResult(nuggets, 97, 100);
        nuggets.matchResult(nets, 120, 90);
        nuggets.matchResult(nets, 134, 125);
        nuggets.matchResult(nets, 103, 94);
//        nuggets.matchResult(broncos, 103, 94);

		System.out.println(nicks.getName() + " ranking " + nicks.ranking());
		System.out.println(nets.getName() + " ranking " + nets.ranking());
		System.out.println(nuggets.getName() + " ranking " + nuggets.ranking());

		System.out.println(nets.compareTo(nuggets));
		System.out.println(nets.compareTo(nicks));
		System.out.println(nicks.compareTo(nuggets));

		League<Team<BasketballPlayer>> nba = new League<>("NBA");
		nba.addTeam(nicks);
		nba.addTeam(nets);
		nba.addTeam(nuggets);
//		nba.addTeam(broncos);
		nba.showLeague();
    }
}
