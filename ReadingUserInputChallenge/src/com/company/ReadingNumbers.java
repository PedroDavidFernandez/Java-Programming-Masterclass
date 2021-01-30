package com.company;

import java.util.Scanner;

public class ReadingNumbers {

    public static void main(String[] args) {
        // Read 10 numbers from the console and print the sum of those numbers
        // use the hasNextInt() method from the scanner to check if the user has entered an Int value
        // if nextInt() returns false, print the message "Invalid number". Continue reading until 10
        // Before the user enters each number, print message "Enter number #x"

        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter number #" + count);
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                int number = scanner.nextInt();
                scanner.nextLine();

                sum += number;
                System.out.println("The sum is: " + sum);
                count++;
            } else {
                System.out.println("Invalid Number!");
                scanner = new Scanner(System.in);
            }
        } while (count <= 10);
        scanner.close();
    }
}
