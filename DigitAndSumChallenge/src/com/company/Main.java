package com.company;

public class Main {

    public static void main(String[] args) {
	// write a method sumDigits with one int parameter called number
    // if parameter is >= 10 then the method should process the number and return sum of all digits
    // the numbers from 0-9 have 1 digit, so don't process those, don't process negative numbers either
    // example: sumDigits(123) should return 8 since 1 + 2 + 3 = 8.
    // sumDigits(-1) should return -1
    // Hint:
    // use n % 10 to extract the least-significant digit
    // use n = n / 10 to discard the least-significant digit

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(-1));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number = number / 10;
        }

        return sum;
    }
}
