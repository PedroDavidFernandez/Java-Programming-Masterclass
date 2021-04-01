package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private String name;
    ArrayList<T> league;

    public League(String name) {
        this.name = name;
        this.league = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (this.league.contains(team)) {
            System.out.println("Team is already on the league");
            return false;
        }
        this.league.add(team);
        return true;
    }

    public int getNumberOfTeams() {
        return this.league.size();
    }

    public void showLeague() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
