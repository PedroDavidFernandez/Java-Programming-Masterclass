package com.company;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(6));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(3373));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(45));

    }

    public static int getLargestPrime(int number) {
        int maxPrime = -1;
        while (number % 2 == 0) {
            maxPrime = 2;

            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                maxPrime = i;
                number = number / i;
            }
        }

        if (number > 2)
            maxPrime = number;

        return maxPrime;
    }
}
