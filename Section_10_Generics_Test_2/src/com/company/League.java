package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> leagues = new ArrayList();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (this.leagues.contains(team)) {
            System.out.println(team.getName() + " is already part of the league " + this.name + "\n");
            return false;
        }
        this.leagues.add(team);
        System.out.println(team.getName() + " has been registered on league " + this.name + "\n");
        return true;
    }

    public int getNumberOfTeams() {
        return this.leagues.size();
    }

    public void showLeague() {
        Collections.sort(leagues);
        for (T league : leagues) {
            System.out.println(league.getName() + ": " + league.ranking() + " points.");
        }
    }
}
