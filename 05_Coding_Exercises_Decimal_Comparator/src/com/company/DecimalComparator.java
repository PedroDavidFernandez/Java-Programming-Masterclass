package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.175000, -3.175000); // return true
        areEqualByThreeDecimalPlaces(-3.175000, -3.175900); // return true
        areEqualByThreeDecimalPlaces(-3.175600, -3.175000); // return true
        areEqualByThreeDecimalPlaces(-3.175500, -3.175000); // return true
        areEqualByThreeDecimalPlaces(-3.1756, -3.1755);     // return true
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);     // return true
        areEqualByThreeDecimalPlaces(-3.175, -3.175);       // return true
        areEqualByThreeDecimalPlaces(3.0, 3.0);             // return true
        areEqualByThreeDecimalPlaces(-3.123, -3.123);       // return true
        areEqualByThreeDecimalPlaces(1, 2);                 // return false
        areEqualByThreeDecimalPlaces(-1, -2);               // return false
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        int value1 = (int) (numberOne * 1000);
        int value2 = (int) (numberTwo * 1000);

        return value1 == value2;
    }
}
