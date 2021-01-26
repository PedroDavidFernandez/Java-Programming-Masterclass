package com.company;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(705));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-707));
    }

    public static boolean isPalindrome(int number) {
        if (number <= 0) {
            number = Math.abs(number);
        }

        int reverse = 0;
        int parameter = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;

            if (reverse == parameter) {
                return true;
            }
            number = number / 10;
        }

        return false;
    }
}
