package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int won = 0;
    private int tied = 0;
    private int lost = 0;
    private int played = 0;

    ArrayList<T> players = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(this.players.contains(player)) {
            System.out.println(((Player) player).getName() + " is already member of the team " + this.name);
            return false;
        }
        this.players.add(player);
        System.out.println(((Player) player).getName() + " has been picked by team " + this.name);
        return true;
    }

    public int getNumberOfPlayers() {
        return this.players.size();
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
        } else if (this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
