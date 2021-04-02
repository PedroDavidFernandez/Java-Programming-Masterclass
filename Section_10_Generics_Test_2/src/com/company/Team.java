package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int won;
    private int tied;
    private int lost;
    private int played;

    private ArrayList<T> teams = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (this.teams.contains(player)) {
            System.out.println(player.getName() + " has been already picked by the team!\n");
            return false;
        }
        this.teams.add(player);
        System.out.println(player.getName() + " has been picked by the team\n");
        return true;
    }

    public int getNumberOfPlayers() {
        return this.teams.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore>theirScore) {
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
        return (won * 3) + tied;
    }
}
