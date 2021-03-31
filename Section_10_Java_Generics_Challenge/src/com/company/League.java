package com.company;

import java.util.ArrayList;

public class League<T extends Team> {
    private String name;
    ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList();
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
        for (int i = 0; i<this.teams.size(); i++) {
            System.out.println((i+1) + ": " + this.teams.get(i).getName());
        }
    }
}
