package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] arrayOfIntegers = readIntegers(5);


        int min = findMin(arrayOfIntegers);
        System.out.println("Min Value is: " + min);
    }

    private static int[] readIntegers(int numberOfIntegers) {
        System.out.println("Please enter 6 numbers: ");
        int[] array = new int[numberOfIntegers];
        for (int i=0; i < numberOfIntegers; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] arrayOfIntegers) {
        int minValue = Integer.MAX_VALUE;
        for (int i=0; i < arrayOfIntegers.length; i++) {
            int value = arrayOfIntegers[i];

            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}
