package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre myOwnTheatre = new Theatre("Olympia", 10, 12);
        if (myOwnTheatre.reserveSeat("B13")) {
            System.out.println("Pay for B13");
        } else {
            System.out.println("Seat already reserved!");
        }

        if (myOwnTheatre.reserveSeat("B13")) {
            System.out.println("Pay for B13");
        } else {
            System.out.println("Seat already reserved!");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(myOwnTheatre.getSeats());
        Collections.reverse(reverseSeats);
        //printList(reverseSeats);

        List<Theatre.Seat> pricesSeat = new ArrayList<>(myOwnTheatre.getSeats());
        pricesSeat.add(myOwnTheatre.new Seat("B5", 13.00));
        pricesSeat.add(myOwnTheatre.new Seat("C7", 13.00));
        Collections.sort(pricesSeat, Theatre.PRICE_ORDER);
        System.out.println("Seats sorted by price");
        printList(pricesSeat);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=======================");
    }


}
