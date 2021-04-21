package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre myOwnTheatre = new Theatre("Perico's Theatre", 20, 30);
        List<Theatre.Seat> seatCopy = new ArrayList<>(myOwnTheatre.seats);
        printList(seatCopy);
        seatCopy.get(1).reserve();

        if (myOwnTheatre.reserveSeat("A02")) {
            System.out.println("Pay for A02");
        } else {
            System.out.println("Seat already reserved!");
        }
        // Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing myOwnTheatre");
        printList(myOwnTheatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=======================");
    }
}
