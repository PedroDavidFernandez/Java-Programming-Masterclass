package com.company;


import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfIntegers = readInteger();
        int[] array = readElements(numberOfIntegers);
        int value = findMin(array);
        System.out.println("Minimum value is: " + value);
    }

    private static int readInteger() {
        System.out.println("Please enter the number of integers you want to extract minim value:");
        return scanner.nextInt();
    }

    private static int[] readElements(int numberOfIntegers) {
        System.out.println("Please enter " + numberOfIntegers + " numbers.");
        int[] arrayOfIntegers = new int[numberOfIntegers];
        for (int i=0; i < numberOfIntegers; i++) {
            arrayOfIntegers[i] = scanner.nextInt();
        }

        return arrayOfIntegers;
    }

    private static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;

        for (int i=0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
