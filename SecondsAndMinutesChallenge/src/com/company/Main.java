package com.company;

public class Main {
    public static final int SIXTY = 60;

    public static void main(String[] args) {
        System.out.println("*** call getDurationString(int minutes, int seconds) *** \n");
        System.out.println(getDurationString(180, 59));
        System.out.println(getDurationString(170, 0));
        System.out.println(getDurationString(160, 35));
        System.out.println(getDurationString(150, 25));
        System.out.println(getDurationString(120, 10));
        System.out.println(getDurationString(90, 0));
        System.out.println(getDurationString(60, 0));
        System.out.println(getDurationString(30, 0));
        System.out.println(getDurationString(20, 0));
        System.out.println(getDurationString(5, 5));
        System.out.println(getDurationString(-1, 0));
        System.out.println(getDurationString(0, -1));

        System.out.println("*** call getDurationString(int seconds) *** \n");
        System.out.println(getDurationString(180));
        System.out.println(getDurationString(170));
        System.out.println(getDurationString(150));
        System.out.println(getDurationString(120));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(30));
        System.out.println(getDurationString(20));
        System.out.println(getDurationString(5));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(-1));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || ((seconds < 0) || (seconds > 59))) {
            return "Invalid value";
        }

        int remainingMinutes = minutes % SIXTY;
        int hours = minutes / SIXTY;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int remainingSeconds = seconds % SIXTY;
        int minutes = seconds / SIXTY;

        return getDurationString(minutes, remainingSeconds);
    }
}
