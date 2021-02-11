package com.company.challenge.room.study;

public class Chair {
    public int legs;
    private int seat;
    private String type;

    public int getLegs() {
        return legs;
    }

    public Chair() {
    }

    public Chair(int legs, int seat, String type) {
        this.legs = legs;
        this.seat = seat;
        this.type = type;
    }

    public void sit() {
        System.out.println("Chair.sit()");
    }
}
