package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
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
        if (this.players.contains(player)) {
            System.out.println(player.getName() + " is already in the team");
            return false;
        }
        this.players.add(player);
        System.out.println(player.getName() + " picked for the team");
        return true;
    }

    public int getNumberOfPlayers() {
        return this.players.size();
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
        if(opponent!=null){
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
