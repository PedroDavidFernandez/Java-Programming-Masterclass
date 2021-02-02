package com.company;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600L);
        printYearsAndDays(1051200L);
        printYearsAndDays(561600L);
        printYearsAndDays(-561600L);
        printYearsAndDays(1440L);
        printYearsAndDays(1788480L);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long hours = minutes / 60;
        long days = hours / 24;

        long years = days / 365;
        long remainingDays = days - (365 * years);

        if (minutes % 365 == 0) {
            long totalYears = days / 365;
            System.out.println(minutes + " min = " + totalYears + " y and 0 d");
        } else {
            if (years >= 1) {
                System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
            } else {
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }
    }
}
