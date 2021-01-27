package com.company;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(125, 99, 748));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println("*** *** ***");

        System.out.println(isValid(9));
        System.out.println(isValid(10));
        System.out.println(isValid(11));
        System.out.println(isValid(999));
        System.out.println(isValid(1000));
        System.out.println(isValid(1001));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int number1RightMostDigit = number1 % 10;
        int number2RightMostDigit = number2 % 10;
        int number3RightMostDigit = number3 % 10;

        if (number1RightMostDigit == number2RightMostDigit
            || number1RightMostDigit == number3RightMostDigit
            || number2RightMostDigit == number3RightMostDigit) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
