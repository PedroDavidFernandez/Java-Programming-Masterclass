package com.company;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));   // return false
        System.out.println(hasEqualSum(1, 1, 2));   // return true
        System.out.println(hasEqualSum(1, -1, 0));   // return true
    }

    public static boolean hasEqualSum(int number1, int number2, int number3) {
        int result = number1 + number2;

        return result == number3;
    }
}
