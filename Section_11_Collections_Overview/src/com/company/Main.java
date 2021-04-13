package com.company;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Borràs", 8, 12);
//	    theatre.getSeats();

	    if (theatre.reserveSeat("H11")) {
            System.out.println("Please pau");
        } else {
            System.out.println("sorry, seat is taken");
        }

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("sorry, seat is taken");
        }
    }
}
