package com.company;

import java.util.*;

final public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int rowNum, int seatsPerRow) {
        this.theatreName = theatreName;

        int counter = 0;
        int lastRow = 'A' + (rowNum - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                Seat seat = new Seat(row + String.format("%02d", seatNumber));
                seats.add(seat);
            }
        }
    }

    public boolean reserveSeat(String seatNumber) {
        // from java source code
        int low = 0;
        int high = seats.size() - 1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }

        System.out.println("There is no seat number " + seatNumber);
        return false;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat  implements Comparable<Seat>{
        private String seatNumber;
        private boolean reserved;

        private Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean isReserved() {
            return reserved;
        }

        public boolean reserve() {
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
