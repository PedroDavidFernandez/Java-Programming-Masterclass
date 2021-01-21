package com.company;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(1, 3, 1);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(-1, 1, 1);
        printEqual(1, -1, 1);
        printEqual(1, 1, -1);
    }

    public static void printEqual(int number1, int number2, int number3) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number1 == number2 && number1 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number1 != number3 && number2 != number3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
