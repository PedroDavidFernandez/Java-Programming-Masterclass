package com.company;

import java.util.ArrayList;

public class Team {
    private String name;
    private int won;
    private int tied;
    private int lost;
    private int played;

    private ArrayList teams = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
