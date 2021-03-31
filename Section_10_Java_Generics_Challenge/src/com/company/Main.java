package com.company;

public class Main {

    public static void main(String[] args) {
	    BasketballTeam lakers = new BasketballTeam("Los Angeles Lakers");
	    BasketballTeam nets = new BasketballTeam("Brooklyn Nets");
	    BasketballTeam pacers = new BasketballTeam("Indiana Pacers");
	    BasketballTeam jazz = new BasketballTeam("Utah Jazz");
	    BasketballTeam suns = new BasketballTeam("Phoenix Suns");
	    BasketballTeam sixers = new BasketballTeam("Philadelphia 76 sixers");
	    BasketballTeam bucks = new BasketballTeam("Milwaukee Bucks");
	    BasketballTeam clippers = new BasketballTeam("Los Angeles Clippers");

	    AmericanFootballTeam broncos = new AmericanFootballTeam("Denver Broncos");
	    AmericanFootballTeam fourtyNiners = new AmericanFootballTeam("San Francisco 49ers");
	    AmericanFootballTeam panthers = new AmericanFootballTeam("Carolina Panthers");

	    FootballTeam dortmund = new FootballTeam("Borussia Dortmund");

	    League nba = new League("NBA");
	    nba.addTeam(lakers);
	    nba.addTeam(nets);
	    nba.addTeam(pacers);
	    nba.addTeam(jazz);
	    nba.addTeam(suns);
	    nba.addTeam(sixers);
	    nba.addTeam(bucks);
	    nba.addTeam(clippers);
	    nba.addTeam(broncos);
	    nba.addTeam(fourtyNiners);
	    nba.addTeam(dortmund);

        System.out.println("Number of teams on " + nba.getName() + " league: " + nba.getNumberOfTeams());
    }
}
