package com.company;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int count = 0;
        int lastDigit = 0;
        int firstDigit = 0;
        while (number > 0) {
            count++;
            if (count == 1) {
                lastDigit = number % 10;
            }

            if (number / 10 == 0) {
                firstDigit = number;
            }

            number /= 10;
        }

        return firstDigit + lastDigit;
    }
}
