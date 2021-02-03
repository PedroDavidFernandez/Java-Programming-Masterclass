package com.company;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(45));

    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        int largestPrime = 0;
        if (number == 0 || number == 1) {
            return -1;
        } else {
            for (int i=2; i < number; i++) {
                if (number % i == 0) {
                    largestPrime= number / i;
                    if (largestPrime % i == 0) {
                        if (largestPrime/i % 2 == 0) {
                            return largestPrime/i / 2;
                        } else {
                            return largestPrime/i;
                        }
                    } else {
                        return largestPrime;
                    }
                }
            }
            return number;
        }
    }
}
