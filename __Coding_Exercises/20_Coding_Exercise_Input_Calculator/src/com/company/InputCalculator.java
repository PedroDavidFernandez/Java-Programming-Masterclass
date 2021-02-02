package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        int avg = 0;

        Scanner scanner = new Scanner(System.in);
        boolean isANumber = scanner.hasNextInt();
        if (!isANumber) {
            System.out.println("SUM = 0 AVG = 0");
            return;
        }

        do {
            int number = scanner.nextInt();

            sum += number;
            System.out.println(sum);
            count++;
            avg = (int) (Math.round( (double) sum / count));


        } while (scanner.hasNextInt());
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
