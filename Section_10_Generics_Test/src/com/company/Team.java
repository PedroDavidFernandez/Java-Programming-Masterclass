package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int won;
    private int tied;
    private int lost;
    private int played;

    private ArrayList<T> teams;

    public Team(String name) {
        this.name = name;
        this.teams = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (this.teams.contains(player)) {
            System.out.println(player.getName() + " already part of the team " + this.name);
            return false;
        }
        this.teams.add(player);
        System.out.println(player.getName() + " picked by team " + this.name);
        return true;
    }

    public int getNumberOfPlayers() {
        return this.teams.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if(ourScore>theirScore) {
            won++;
        } else if (ourScore==theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent!=null) {
            matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
