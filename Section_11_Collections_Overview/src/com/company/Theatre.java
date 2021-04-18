package com.company;

import java.util.*;

final public class Theatre {
    private final String theatreName;
    private ArrayList<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int rowNum, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (rowNum - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                Seat seat = new Seat(row + String.format("%02d", seatNumber));
                seats.add(seat);
            }
        }
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("Seat with number " + seatNumber + " could not be reserved");
            return false;
        }

        return requestedSeat.reserve();
    }

    private class Seat {
        private String seatNumber;
        private boolean reserved;

        private Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        private String getSeatNumber() {
            return seatNumber;
        }

        private boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                return true;
            } else {
                return false;
            }
        }
    }
}
