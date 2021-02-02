package com.company;

public class SpeedConverter {
    public static final double MILE = 0.6218;

    public static void main(String[] args) {
        toMilesPerHour(1.5d);
        toMilesPerHour(10.25d);
        toMilesPerHour(-5.6d);
        toMilesPerHour(25.42d);
        toMilesPerHour(75.114d);
        toMilesPerHour(95.75d);

        printConversion(1.5d);
        printConversion(10.25d);
        printConversion(-5.6d);
        printConversion(25.42d);
        printConversion(75.114d);
        printConversion(95.75d);
    }

    public static long toMilesPerHour(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            return -1;
        }

        double milesPerHour = kilometresPerHour * MILE;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometresPerHour);
        System.out.println(kilometresPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
