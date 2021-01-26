package com.company;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1));
        System.out.println(getEvenDigitSum(12));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(216));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int evenNumber = 0;
        int sum = 0;
        while (number > 0) {
            evenNumber = number % 10;
            // System.out.println(evenNumber);
            if (evenNumber % 2 == 0) {
                sum += evenNumber;
                // System.out.println("this is the sum: " + sum);
            }

            number /= 10;
        }

        return sum;
    }
}
