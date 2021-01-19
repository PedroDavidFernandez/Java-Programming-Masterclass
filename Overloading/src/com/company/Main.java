package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(7, 5));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 0));
        System.out.println(calcFeetAndInchesToCentimeters(0, -1));
        System.out.println(calcFeetAndInchesToCentimeters(0, 9));
        System.out.println(calcFeetAndInchesToCentimeters(0, 13));
        System.out.println(calcFeetAndInchesToCentimeters(1));
        System.out.println(calcFeetAndInchesToCentimeters(5));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }

        return  (feet / 0.0328089) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        return calcFeetAndInchesToCentimeters(0, inches);
    }
}
