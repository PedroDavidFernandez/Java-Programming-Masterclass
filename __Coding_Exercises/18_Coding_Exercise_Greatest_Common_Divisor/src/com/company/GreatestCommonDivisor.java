package com.company;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 50));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int minimum = 0;
        int maximum = 0;
        if (first < second) {
            minimum = first;
            maximum = second;
        } else {
            minimum = second;
            maximum = first;
        }

        int parameter = minimum;
        for (int i = 0; i <= parameter; i++) {
            if (minimum == 0) {
                continue;
            }
            System.out.println("parameter: " + parameter);
            System.out.println("minimum: " + minimum);
            System.out.println("second: " + second);
            if (parameter % minimum == 0 && maximum % minimum == 0) {
                return minimum;
            }
            minimum--;
        }
        return 0;
    }
}
