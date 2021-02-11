package com.company.challenge;

public class Room {

    private Door door;
    private Chair chair;
    private Computer computer;

    public Room(Door door, Chair chair, Computer computer) {
        this.door = door;
        this.chair = chair;
        this.computer = computer;
    }

    public void study() {
        this.door.open();
        this.chair.sit();
        this.computer.switchComputer();
        this.computer.getKeyboard().logIn();

        System.out.println("I AM SUPER READY TO A STUDY SESSION");
    }

    public Door getDoor() {
        return door;
    }

    public Chair getChair() {
        return chair;
    }

    public Computer getComputer() {
        return computer;
    }
}
