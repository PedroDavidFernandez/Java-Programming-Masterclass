package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    ArrayList<T> teams = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if(this.teams.contains(team)) {
            System.out.println(team.getName() + " could not be added to the league" + this.name);
            return false;
        }
        this.teams.add(team);
        System.out.println(team.getName() + " has been added to " + this.name + " league");
        return true;
    }

    public int getNumberOfTeams() {
        return this.teams.size();
    }

    public void printListOfTeams() {
        Collections.sort(teams);
        for (T t : teams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
