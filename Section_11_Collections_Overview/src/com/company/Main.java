package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("*************************");
        Theatre myOwnTheatre = new Theatre("Perico's Theatre", 20, 30);
        // myOwnTheatre.getSeats();

        if (myOwnTheatre.reserveSeat("A15")) {
            System.out.println("pay");
        } else {
            System.out.println("This seat has been already reserved");
        }
        if (myOwnTheatre.reserveSeat("A15")) {
            System.out.println("pay");
        } else {
            System.out.println("This seat has been already reserved");
        }
    }
}
