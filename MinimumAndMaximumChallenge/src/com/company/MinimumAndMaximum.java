package com.company;

import java.util.Scanner;

public class MinimumAndMaximum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int max = 0;
        int min = 0;
        do {
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
                System.out.println("New max number is " + max);
            } else if (number < max && number != min){
                min = number;
                System.out.println("New min number is " + min);
            }
            System.out.println("Enter number: ");
        } while (scanner.hasNextInt());
    }
}
