package com.company;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1804));
        System.out.println(isLeapYear(1855));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2096));
        System.out.println(isLeapYear(2095));
        System.out.println(isLeapYear(9000));
        System.out.println(isLeapYear(10000));
        System.out.println(isLeapYear(0));

        System.out.println("***");

        System.out.println(getDaysInMonth(1, 2021));
        System.out.println(getDaysInMonth(4, 2021));
        System.out.println(getDaysInMonth(2, 2021));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 10000));
        System.out.println(getDaysInMonth(2, 0));
        System.out.println(getDaysInMonth(0, 2020));
        System.out.println(getDaysInMonth(13, 2020));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
        }

        return 0;
    }
}
