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
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            System.out.println(requestedSeat.toString());
            System.out.println(seats.get(foundSeat));
            // return requestedSeat.reserve();
            return seats.get(foundSeat).reserve();
        } else {
            return false;
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat  implements Comparable<Seat>{
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
                System.out.println("Seat number " + this.getSeatNumber() + " reserved");
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.getSeatNumber().compareToIgnoreCase(seat.getSeatNumber());
        }

        @Override
        public String toString() {
            return "Seat{" +
                    "seatNumber='" + seatNumber + '\'' +
                    ", reserved=" + reserved +
                    '}';
        }
    }
}
