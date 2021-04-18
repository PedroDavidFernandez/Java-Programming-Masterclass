package com.company;

import java.util.*;

final public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

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

    public boolean reserveSeat(String seatNumber) {
        System.out.println(seatNumber);
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            System.out.print(".");
            if (seat.getSeatNumber().equalsIgnoreCase(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        return requestedSeat.reserve();
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
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

        public boolean isReserved() {
            return reserved;
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
