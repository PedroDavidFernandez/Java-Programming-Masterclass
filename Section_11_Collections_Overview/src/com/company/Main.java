package com.company;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Borras", 3, 10);
        theatre.getSeats();
        if (theatre.reserveSeat("A01")) {
            System.out.println("pay");
        } else {
            System.out.println("seat already reserved");
        }
        if (theatre.reserveSeat("A01")) {
            System.out.println("pay");
        } else {
            System.out.println("seat already reserved");
        }
        if (theatre.reserveSeat("L14")) {
            System.out.println("pay");
        } else {
            System.out.println("seat already reserved");
        }
    }
}
